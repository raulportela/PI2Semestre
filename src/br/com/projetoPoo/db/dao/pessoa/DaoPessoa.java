/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.db.dao.pessoa;

import br.com.projetoPoo.db.utils.ConnectionUtils;
import br.com.projetoPoo.model.pessoa.Pessoa;
import br.com.projetoPoo.model.pessoa.cliente.Cliente;
import br.com.projetoPoo.model.pessoa.funcionario.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul de Paula
 */
public class DaoPessoa {

    public List<Funcionario> listarFuncionario() {

        String sql = "SELECT * FROM PESSOA P\n"
                + "JOIN FUNCIONARIO F\n"
                + "ON P.ID = F.IDPESSOA";

        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            result = preparedStatement.executeQuery();

            while (result.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(result.getString("nome"));
                funcionario.setSobrenome(result.getString("sobrenome"));
                funcionario.setCpf(result.getString("cpf"));
                funcionario.setDataNascimento(result.getString("dataNascimeinto"));
                funcionario.setStatus(result.getBoolean("disponivel"));
                funcionario.setCodFuncionario(result.getInt("id"));
                funcionario.setUsuario(result.getString("nomeUsuario"));
                funcionario.setSenha(result.getString("senha"));
                funcionario.setCargo(result.getString("cargo"));

                listaFuncionario.add(funcionario);
            }
            return listaFuncionario;
        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Cliente> listarClientes() {
        String sql = "SELECT * FROM PESSOA P\n"
                + "JOIN CLIENTE C\n"
                + "ON P.ID = C.IDPESSOA";

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            result = preparedStatement.executeQuery();

            while (result.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(result.getString("nome"));
                cliente.setSobrenome(result.getString("sobrenome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setDataNascimento(result.getString("dataNascimeinto"));
                cliente.setStatus(result.getBoolean("disponivel"));
                cliente.setCodCliente(result.getInt("id"));

                listaClientes.add(cliente);
            }
            return listaClientes;
        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public Funcionario obterUmFuncinario(String cpf) {

        String sql = "SELECT * FROM PESSOA P\n"
                + "JOIN FUNCIONARIO F\n"
                + "ON P.ID = F.IDPESSOA\n"
                + "WHERE (P.CPF=?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cpf);

            result = preparedStatement.executeQuery();

            Funcionario funcionario = new Funcionario();
            funcionario.setNome(result.getString("nome"));
            funcionario.setSobrenome(result.getString("sobrenome"));
            funcionario.setCpf(result.getString("cpf"));
            funcionario.setDataNascimento(result.getString("dataNascimeinto"));
            funcionario.setStatus(result.getBoolean("disponivel"));
            funcionario.setCodFuncionario(result.getInt("id"));
            funcionario.setUsuario(result.getString("nomeUsuario"));
            funcionario.setSenha(result.getString("senha"));
            funcionario.setCargo(result.getString("cargo"));

            return funcionario;

        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public Cliente obterUmCliente(String cpf) {

        String sql = "SELECT * FROM PESSOA P\n"
                + "JOIN CLIENTE C\n"
                + "ON P.ID = C.IDPESSOA\n"
                + "WHERE (P.CPF=?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cpf);

            result = preparedStatement.executeQuery();

            Cliente cliente = new Cliente();
            cliente.setNome(result.getString("nome"));
            cliente.setSobrenome(result.getString("sobrenome"));
            cliente.setCpf(result.getString("cpf"));
            cliente.setDataNascimento(result.getString("dataNascimeinto"));
            cliente.setStatus(result.getBoolean("disponivel"));
            cliente.setCodCliente(result.getInt("id"));

            return cliente;

        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public List<Funcionario> listarFuncionarioPorStatus(boolean status) {

        String sql = "SELECT * FROM PESSOA P\n"
                + "JOIN FUNCIONARIO F\n"
                + "ON P.ID = F.IDPESSOA\n"
                + "WHERE (F.DISPONIVEL=?)";

        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, status);

            result = preparedStatement.executeQuery();

            while (result.next()) {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome(result.getString("nome"));
                funcionario.setSobrenome(result.getString("sobrenome"));
                funcionario.setCpf(result.getString("cpf"));
                funcionario.setDataNascimento(result.getString("dataNascimeinto"));
                funcionario.setStatus(result.getBoolean("disponivel"));
                funcionario.setCodFuncionario(result.getInt("id"));
                funcionario.setUsuario(result.getString("nomeUsuario"));
                funcionario.setSenha(result.getString("senha"));
                funcionario.setCargo(result.getString("cargo"));

                listaFuncionario.add(funcionario);
            }
            return listaFuncionario;
        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public List<Cliente> listarClientePorStatus(boolean status) {

        String sql = "SELECT * FROM PESSOA P\n"
                + "JOIN CLIENTE C\n"
                + "ON P.ID = C.IDPESSOA\n"
                + "WHERE (C.DISPONIVEL=?)";

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, status);

            result = preparedStatement.executeQuery();

            while (result.next()) {
                Cliente cliente = new Cliente();
                cliente.setNome(result.getString("nome"));
                cliente.setSobrenome(result.getString("sobrenome"));
                cliente.setCpf(result.getString("cpf"));
                cliente.setDataNascimento(result.getString("dataNascimeinto"));
                cliente.setStatus(result.getBoolean("disponivel"));
                cliente.setCodCliente(result.getInt("id"));

                listaClientes.add(cliente);
            }
            return listaClientes;
        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;

    }

    public String atualizar(Cliente cliente, Funcionario funcionario) {
        boolean isClient = false;
        Pessoa pessoa = null;
        if (cliente != null) {
            pessoa = cliente;
            isClient = true;
        } else if (funcionario != null) {
            pessoa = funcionario;
            isClient = false;
        }

        String sql = "UPDATE Pessoa SET nome=?, sobrenome=?, cpf=?, dataNascimento=?\n"
                + "WHERE (cpf = ?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setString(2, pessoa.getSobrenome());
            preparedStatement.setString(3, pessoa.getCpf());
            preparedStatement.setString(4, pessoa.getDataNascimento());
            preparedStatement.execute();
            if (!preparedStatement.isClosed()) {
                preparedStatement.close();
            }

            if (isClient) {
                String sql2 = "UPDATE Cliente C SET disponivel=?\n"
                        + "WHERE C.idPessoa = (SELECT id FROM Pessoa WHERE cpf=?)";
                preparedStatement = connection.prepareStatement(sql2);

                preparedStatement.setBoolean(1, cliente.isStatus());
                preparedStatement.setString(2, cliente.getCpf());
                preparedStatement.execute();

            } else {
                String sql2 = "UPDATE Funcionario F SET disponivel=?, nomeUsuario=?, senha=?, cargo=?, rg=?\n"
                        + "WHERE F.idPessoa = (SELECT id FROM Pessoa WHERE cpf=?)";
                preparedStatement = connection.prepareStatement(sql2);

                preparedStatement.setBoolean(1, funcionario.isStatus());
                preparedStatement.setString(2, funcionario.getUsuario());
                preparedStatement.setString(3, funcionario.getSenha());
                preparedStatement.setString(4, funcionario.getCargo());
                preparedStatement.setString(5, funcionario.getRg());
                preparedStatement.setString(6, funcionario.getCpf());

                preparedStatement.execute();
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public String inserir(Cliente cliente, Funcionario funcionario) {
        boolean isClient = false;
        Pessoa pessoa = null;
        if (cliente != null) {
            pessoa = cliente;
            isClient = true;
        } else if (funcionario != null) {
            pessoa = funcionario;
            isClient = false;
        }

        String sql = "INSERT INTO Pessoa VALUES (0, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql, preparedStatement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, pessoa.getNome());
            preparedStatement.setString(2, pessoa.getSobrenome());
            preparedStatement.setString(3, pessoa.getCpf());
            preparedStatement.setString(4, pessoa.getDataNascimento());
            preparedStatement.execute();

            int chavePessoa = 0;
            ResultSet chaveGeradaEditora = preparedStatement.getGeneratedKeys();
            if (chaveGeradaEditora.next()) {
                chavePessoa = chaveGeradaEditora.getInt(1);
            }
            if (!preparedStatement.isClosed()) {
                preparedStatement.close();
            }

            if (isClient) {
                String sql2 = "INSERT INTO Cliente VALUES (0, ?, ?)";
                preparedStatement = connection.prepareStatement(sql2);

                preparedStatement.setInt(1, chavePessoa);
                preparedStatement.setBoolean(2, true);
                preparedStatement.execute();

            } else {
                String sql2 = "INSERT INTO Funcionario VALUES (0, ?, ?, ?, ?, ?, ?)";
                preparedStatement = connection.prepareStatement(sql2);

                preparedStatement.setInt(1, chavePessoa);
                preparedStatement.setBoolean(2, true);
                preparedStatement.setString(3, funcionario.getUsuario());
                preparedStatement.setString(4, funcionario.getSenha());
                preparedStatement.setString(5, funcionario.getCargo());
                preparedStatement.setString(6, funcionario.getRg());

                preparedStatement.execute();

            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    public String excluir(boolean isClient, String cpf) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String sql = null;
            if (isClient) {
                sql = "UPDATE Cliente SET disponivel=?\n"
                        + "WHERE (cpf = ?)";
                connection = ConnectionUtils.getConnection();
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setBoolean(1, false);
                preparedStatement.setString(2, cpf);

                preparedStatement.execute();
            } else {
                sql = "UPDATE Funcionario SET disponivel=?\n"
                        + "WHERE (cpf = ?)";
                connection = ConnectionUtils.getConnection();
                preparedStatement = connection.prepareStatement(sql);

                preparedStatement.setBoolean(1, false);
                preparedStatement.setString(2, cpf);

                preparedStatement.execute();
            }

        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
