/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.db.dao;

import br.com.floricultura.db.utils.ConnectionUtils;
import br.com.floricultura.model.cliente.Cliente;
import br.com.floricultura.model.venda.ItemVendido;
import br.com.floricultura.model.venda.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Raul de Paula
 */
public class DaoVenda {

    private static ArrayList<Venda> listaVendas = new ArrayList<Venda>();
    
    public static void inserir(Venda venda) throws SQLException, Exception {
        String sql = "INSERT INTO Venda VALUES (0, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, venda.getNotaFiscal());
            if (venda.getData() == null) {
                Calendar hoje = Calendar.getInstance();
                Date dataHoje = hoje.getTime();
                Timestamp t = new Timestamp(dataHoje.getTime());
                preparedStatement.setTimestamp(2, t);
            } else {
                Timestamp t = new Timestamp(venda.getData().getTime());
                preparedStatement.setTimestamp(2, t);
            }

            preparedStatement.setString(3, venda.getValorTotal());
            preparedStatement.setInt(4, venda.getCliente().getIdCliente());

            preparedStatement.execute();
            
            int ultimaChave = 0;
            ResultSet chaveGeradaVenda = preparedStatement.getGeneratedKeys();
            if (chaveGeradaVenda.next()) {
                ultimaChave = chaveGeradaVenda.getInt(1);
            }
            for (ItemVendido item : venda.getListaItensVendidos()) {
                inserirItemVenda(item, ultimaChave);
                decrementarEstoque(item);

            }

        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }

            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void inserirItemVenda(ItemVendido itemVenda, int chaveVenda) throws SQLException, Exception {
        String sql = "INSERT INTO ItemVenda VALUES (?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            System.out.println("1");
            preparedStatement.setInt(1, Integer.parseInt(itemVenda.getProduto().getQuantidade()));
            System.out.println("2");
            preparedStatement.setInt(2, chaveVenda);
            System.out.println("Chave da venda: " + chaveVenda);
            System.out.println("3");
            preparedStatement.setInt(3, itemVenda.getProduto().getIdProduto());
            System.out.println("4");

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.isClosed();
            }
            if (connection != null && !connection.isClosed()) {
                connection.isClosed();
            }
        }
    }

    public static void decrementarEstoque(ItemVendido item) throws SQLException, Exception {
        String sql = "SET UPDATE ";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            //preparedStatement.setInt(1, item.getProduto().getCodigoProduto());

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.isClosed();
            }

            if (connection != null && !connection.isClosed()) {
                connection.isClosed();
            }
        }

    }

    public static List<Cliente> listar() throws SQLException, Exception {
        String sql = "SELECT * FROM cliente WHERE (enabled=?)";
        List<Cliente> listaClientes = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);

            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaClientes == null) {
                    listaClientes = new ArrayList<Cliente>();
                }
                Cliente cliente = new Cliente();
                cliente.setIdCliente(result.getInt("cliente_id"));
                cliente.setNome(result.getString("nome"));
                cliente.setSobrenome(result.getString("sobrenome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setRg(result.getString("rg"));
                cliente.setSexo(result.getString("sexo"));
                cliente.setEstadoCivil(result.getString("estado_civil"));
                cliente.setDataNascimento(result.getString("data_nasc"));
                cliente.setUfNascimento(result.getString("uf"));
                cliente.setEstadoNascimento(result.getString("estado"));
                cliente.setTelefone(result.getString("telefone"));
                cliente.setCelular(result.getString("celular"));
                cliente.setOutroContato(result.getString("outro_contato"));
                cliente.setEmail(result.getString("email"));
                cliente.setCep(result.getString("nome"));
                cliente.setRua(result.getString("rua"));
                cliente.setNumero(result.getString("numero"));
                cliente.setBairro(result.getString("bairro"));
                cliente.setComplemento(result.getString("complemento"));
                cliente.setUf(result.getString("uf_moradia"));
                cliente.setEstado(result.getString("estado_moradia"));
                listaClientes.add(cliente);
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaClientes;
    }
    
    public static String gerarNumeroNota(){
        int contador = listaVendas.size();
        Calendar c = Calendar.getInstance();
        String notaFiscal = "";
        if (contador < 10){
            notaFiscal += "0" + (++contador);
        }else {
            notaFiscal += (++contador);
        }
        notaFiscal += c.get(Calendar.YEAR);
        if (c.get(Calendar.MONTH) < 9) {
            notaFiscal += "0" + (c.get(Calendar.MONTH) + 1);
        } else {
            notaFiscal += c.get((Calendar.MONTH) + 1);
        }
        if (c.get(Calendar.DAY_OF_MONTH) < 10) {
            notaFiscal += "0" + c.get(Calendar.DAY_OF_MONTH);
        } else {
            notaFiscal += c.get(Calendar.DAY_OF_MONTH);
        }
        return notaFiscal;
    }
}
