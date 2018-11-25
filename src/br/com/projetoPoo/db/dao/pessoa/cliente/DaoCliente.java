/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.db.dao.pessoa.cliente;

import br.com.projetoPoo.db.utils.ConnectionUtils;
import br.com.projetoPoo.interfaces.CRUD;
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
public class DaoCliente implements CRUD {

    @Override
    public String inserir(Cliente cliente, Funcionario Funcionario) {
        String sql = "INSERT INTO cliente VALUES (0, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(2, cliente.getNome());
            preparedStatement.setString(3, cliente.getSobrenome());
            String cpf = "";
            cpf += cliente.getCpf().substring(0, 3)
                    + cliente.getCpf().substring(4, 7)
                    + cliente.getCpf().substring(8, 11)
                    + cliente.getCpf().substring(12, 14);
            preparedStatement.setString(5, cpf);
            preparedStatement.setString(6, cliente.getDataNascimento());

            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public String excluir(Cliente cliente, Funcionario funcionario) {
                String sql = "UPDATE cliente SET statusCliente=? WHERE (id=?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, false);

            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                    try {
                        if (preparedStatement != null && !preparedStatement.isClosed()) {
                            preparedStatement.close();
                        }       } catch (SQLException ex) {
                        Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    try {
                        if (connection != null && !connection.isClosed()) {
                            connection.close();
                        }       } catch (SQLException ex) {
                        Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
        }
        return null;

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
                        
        String sql = "SELECT * FROM cliente WHERE (StatusCliente=?)";
        List<Object> listaClientes = null;
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
                    listaClientes = new ArrayList<Object>();
                }
                Cliente cliente = new Cliente();
                cliente.setStatus(result.getBoolean("StatusCliente"));
                cliente.setNome(result.getString("Nome"));
                cliente.setSobrenome(result.getString("Sobrenome"));
                cliente.setCpf(result.getString("Cpf"));
                cliente.setDataNascimento(result.getString("DataNascimento"));

                listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (result != null && !result.isClosed()) {
                    result.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (preparedStatement != null && !preparedStatement.isClosed()) {
                    preparedStatement.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return listaClientes;

    }

    @Override
    public String atualizar(Cliente cliente, Funcionario funcionario) {
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

            preparedStatement.setBoolean(1, cliente.isStatus());

            preparedStatement.setString(2, cliente.getNome());
            preparedStatement.setString(3, cliente.getSobrenome());
            String cpf = "";
            cpf += cliente.getCpf().substring(0, 3)
                    + cliente.getCpf().substring(4, 7)
                    + cliente.getCpf().substring(8, 11)
                    + cliente.getCpf().substring(12, 14);
            preparedStatement.setString(5, cpf);
            preparedStatement.setString(6, cliente.getDataNascimento());

            preparedStatement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                  try {
                      if (preparedStatement != null && !preparedStatement.isClosed()) {
                          preparedStatement.close();
                      }     } catch (SQLException ex) {
                      Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  try {
                      if (connection != null && !connection.isClosed()) {
                          connection.close();
                      }     } catch (SQLException ex) {
                      Logger.getLogger(DaoCliente.class.getName()).log(Level.SEVERE, null, ex);
                  }
        }
        return null;
    }
}
