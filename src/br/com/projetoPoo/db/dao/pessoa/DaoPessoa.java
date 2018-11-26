/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.db.dao.pessoa;

import br.com.projetoPoo.db.dao.pessoa.cliente.DaoCliente;
import br.com.projetoPoo.db.utils.ConnectionUtils;
import br.com.projetoPoo.interfaces.CRUD;
import br.com.projetoPoo.model.pessoa.Pessoa;
import br.com.projetoPoo.model.pessoa.cliente.Cliente;
import br.com.projetoPoo.model.pessoa.funcionario.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Raul de Paula
 */
public class DaoPessoa implements CRUD {

    
    
    @Override
    public List<Object> listar() {
        return null;
    }

    @Override
    public String obterUm() {
        return null;
    }

    @Override
    public String listarPorStatus() {
        return null;
    }

    @Override
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

    @Override
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

    @Override
    public String excluir(Cliente cliente, Funcionario funcionario) {
        boolean isClient = false;
        Pessoa pessoa = null;

        if (cliente != null) {
            pessoa = cliente;
            isClient = true;
            String sql = "UPDATE Funcionario SET disponivel=?\n"
                    + "WHERE (cpf = ?)";
        } else if (funcionario != null) {
            pessoa = funcionario;
            isClient = false;
        }

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String sql = null;
            if (isClient) {
                sql = "UPDATE Cliente SET disponivel=?\n"
                    + "WHERE (cpf = ?)";
            }else {
                sql = "UPDATE Funcionario SET disponivel=?\n"
                    + "WHERE (cpf = ?)";
            }
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DaoPessoa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
