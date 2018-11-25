/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.db.dao.pessoa.cliente;

import br.com.floricultura.db.utils.ConnectionUtils;
import br.com.floricultura.interfaces.CRUD;
import br.com.floricultura.model.pessoa.cliente.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Raul de Paula
 */
public class DaoCliente implements CRUD {

    public static void inserir(Cliente cliente) throws SQLException, Exception {
        String sql = "INSERT INTO cliente VALUES (0, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setBoolean(1, cliente.isStatusCliente());

            preparedStatement.setString(2, cliente.getNome());
            preparedStatement.setString(3, cliente.getSobrenome());
            preparedStatement.setString(4, cliente.getRg());
            String cpf = "";
            cpf += cliente.getCpf().substring(0, 3)
                    + cliente.getCpf().substring(4, 7)
                    + cliente.getCpf().substring(8, 11)
                    + cliente.getCpf().substring(12, 14);

            preparedStatement.setString(5, cpf);
            preparedStatement.setString(6, cliente.getDataNascimento());
            preparedStatement.setString(7, cliente.getSexo());
            preparedStatement.setString(8, cliente.getUfNascimento());
            preparedStatement.setString(9, cliente.getEstadoNascimento());
            preparedStatement.setString(10, cliente.getEstadoCivil());

            preparedStatement.setString(11, cliente.getRua());
            preparedStatement.setString(12, cliente.getNumero());
            preparedStatement.setString(13, cliente.getBairro());
            preparedStatement.setString(14, cliente.getCep());
            preparedStatement.setString(15, cliente.getComplemento());
            preparedStatement.setString(16, cliente.getUf());
            preparedStatement.setString(17, cliente.getEstado());

            preparedStatement.setString(18, cliente.getTelefone());
            preparedStatement.setString(19, cliente.getCelular());
            preparedStatement.setString(20, cliente.getOutroContato());
            preparedStatement.setString(21, cliente.getEmail());

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void atualizar(Cliente cliente)
            throws SQLException, Exception {
        String sql = "UPDATE cliente SET statusCliente=?, nome=?, sobrenome=?, rg=?, cpf=?,"
                + "dataNascimento=?, sexo=?, ufNascimento=?, estadoNascimento=?, estadoCivil=?, rua=?, numero=?,"
                + "bairro=?, cep=?, complemento=?, uf=?, estado=?, telefone=?, celular=?,"
                + "outroContato=?, email=? "
                + "WHERE (id=?)";
        
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setBoolean(1, cliente.isStatusCliente());

            preparedStatement.setString(2, cliente.getNome());
            preparedStatement.setString(3, cliente.getSobrenome());
            preparedStatement.setString(4, cliente.getRg());
            String cpf = "";
            cpf += cliente.getCpf().substring(0, 3)
                    + cliente.getCpf().substring(4, 7)
                    + cliente.getCpf().substring(8, 11)
                    + cliente.getCpf().substring(12, 14);
            preparedStatement.setString(5, cpf);
            preparedStatement.setString(6, cliente.getDataNascimento());
            preparedStatement.setString(7, cliente.getSexo());
            preparedStatement.setString(8, cliente.getUfNascimento());
            preparedStatement.setString(9, cliente.getEstadoNascimento());
            preparedStatement.setString(10, cliente.getEstadoCivil());

            preparedStatement.setString(11, cliente.getRua());
            preparedStatement.setString(12, cliente.getNumero());
            preparedStatement.setString(13, cliente.getBairro());
            preparedStatement.setString(14, cliente.getCep());
            preparedStatement.setString(15, cliente.getComplemento());
            preparedStatement.setString(16, cliente.getUf());
            preparedStatement.setString(17, cliente.getEstado());

            preparedStatement.setString(18, cliente.getTelefone());
            preparedStatement.setString(19, cliente.getCelular());
            preparedStatement.setString(20, cliente.getOutroContato());
            preparedStatement.setString(21, cliente.getEmail());

            preparedStatement.setInt(22, cliente.getIdCliente());

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void excluir(int id) throws SQLException, Exception {
        String sql = "UPDATE cliente SET statusCliente=? WHERE (id=?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static List<Cliente> procurar(String CPF)
            throws SQLException, Exception {
        String sql = "SELECT * FROM cliente WHERE (cpf=?)";
        List<Cliente> listaClientes = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, CPF);

            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaClientes == null) {
                    listaClientes = new ArrayList<Cliente>();
                }
                Cliente cliente = new Cliente();
                cliente.setIdCliente(result.getInt("Id"));
                cliente.setStatusCliente(result.getBoolean("StatusCliente"));
                cliente.setNome(result.getString("Nome"));
                cliente.setSobrenome(result.getString("Sobrenome"));
                cliente.setRg(result.getString("Rg"));
                cliente.setCpf(result.getString("Cpf"));
                cliente.setDataNascimento(result.getString("DataNascimento"));
                cliente.setSexo(result.getString("Sexo"));
                cliente.setUfNascimento(result.getString("UfNascimento"));
                cliente.setEstadoNascimento(result.getString("EstadoNascimento"));
                cliente.setEstadoCivil(result.getString("EstadoCivil"));
                cliente.setRua(result.getString("Rua"));
                cliente.setNumero(result.getString("Numero"));
                cliente.setBairro(result.getString("Bairro"));
                cliente.setCep(result.getString("Cep"));
                cliente.setComplemento(result.getString("Complemento"));
                cliente.setUf(result.getString("Uf"));
                cliente.setEstado(result.getString("Estado"));
                cliente.setTelefone(result.getString("Telefone"));
                cliente.setCelular(result.getString("Celular"));
                cliente.setOutroContato(result.getString("OutroContato"));
                cliente.setEmail(result.getString("Email"));

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

    public static List<Cliente> TIRARESSElistar()
            throws SQLException, Exception {
        String sql = "SELECT * FROM cliente WHERE (StatusCliente=?)";
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
                cliente.setIdCliente(result.getInt("Id"));
                cliente.setStatusCliente(result.getBoolean("StatusCliente"));
                cliente.setNome(result.getString("Nome"));
                cliente.setSobrenome(result.getString("Sobrenome"));
                cliente.setRg(result.getString("Rg"));
                cliente.setCpf(result.getString("Cpf"));
                cliente.setDataNascimento(result.getString("DataNascimento"));
                cliente.setSexo(result.getString("Sexo"));
                cliente.setUfNascimento(result.getString("UfNascimento"));
                cliente.setEstadoNascimento(result.getString("EstadoNascimento"));
                cliente.setEstadoCivil(result.getString("EstadoCivil"));
                cliente.setRua(result.getString("Rua"));
                cliente.setNumero(result.getString("Numero"));
                cliente.setBairro(result.getString("Bairro"));
                cliente.setCep(result.getString("Cep"));
                cliente.setComplemento(result.getString("Complemento"));
                cliente.setUf(result.getString("Uf"));
                cliente.setEstado(result.getString("Estado"));
                cliente.setTelefone(result.getString("Telefone"));
                cliente.setCelular(result.getString("Celular"));
                cliente.setOutroContato(result.getString("OutroContato"));
                cliente.setEmail(result.getString("Email"));

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

    @Override
    public String inserir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obterUm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarPorStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
