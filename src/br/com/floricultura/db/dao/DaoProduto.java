/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.db.dao;

import br.com.floricultura.db.utils.ConnectionUtils;
import br.com.floricultura.model.produto.Produto;
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
public class DaoProduto {

    static List<Produto> listaProduto;

    static int codigoProduto = 0;

    public static void inserir(Produto produto) throws SQLException, Exception {
        String sql = "INSERT INTO Produto VALUES (0, ?, ?, ?, ?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            System.out.println("1");
            preparedStatement.setBoolean(1, produto.isStatusProduto());
            System.out.println("3");
            preparedStatement.setString(2, produto.getProduto());
            preparedStatement.setString(3, produto.getCategoria());
            preparedStatement.setString(4, produto.getDescricao());
            preparedStatement.setString(5, produto.getCor());
            preparedStatement.setString(6, produto.getValorUnitario());
            preparedStatement.setString(7, produto.getQuantidade());

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

    public static void atualizar(Produto produto)
            throws SQLException, Exception {
        String sql = "UPDATE produto SET StatusProduto=?, Produto=?, Categoria=?, Descricao=?, Cor=?, "
                + "ValorUnitario=?, Quantidade=?"
                + "WHERE (id=?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            
            preparedStatement.setBoolean(1, produto.isStatusProduto());
            preparedStatement.setString(2, produto.getProduto());
            preparedStatement.setString(3, produto.getCategoria());
            preparedStatement.setString(4, produto.getDescricao());
            preparedStatement.setString(5, produto.getCor());
            preparedStatement.setString(6, produto.getValorUnitario());
            preparedStatement.setString(7, produto.getQuantidade());
            
            preparedStatement.setInt(8, produto.getIdProduto());

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

    public static void excluir(Integer id) throws SQLException, Exception {
        String sql = "UPDATE produto SET StatusProduto=? WHERE (id=?)";
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

    public static List<Produto> procurar(int CodProduto)
            throws SQLException, Exception {
            String sql = "SELECT * FROM produto WHERE (id=?)";
        List<Produto> listaProduto = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, CodProduto);

            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaProduto == null) {
                    listaProduto = new ArrayList<Produto>();
                }
                Produto produto = new Produto();
                produto.setIdProduto(result.getInt("Id"));
                produto.setStatusProduto(result.getBoolean("StatusProduto"));
                produto.setProduto(result.getString("Produto"));
                produto.setCategoria(result.getString("Categoria"));
                produto.setDescricao(result.getString("Descricao"));
                produto.setCor(result.getString("Cor"));
                produto.setValorUnitario(result.getString("ValorUnitario"));
                produto.setQuantidade(result.getString("Quantidade"));
                listaProduto.add(produto);
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
        return listaProduto;
    }

    public static List<Produto> listar()
            throws SQLException, Exception {
        String sql = "SELECT * FROM produto WHERE (StatusProduto=?)";
        List<Produto> listaProdutoL = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaProdutoL == null) {
                    listaProdutoL = new ArrayList<Produto>();
                }
                Produto produto = new Produto();
                produto.setIdProduto(result.getInt("Id"));
                produto.setStatusProduto(result.getBoolean("StatusProduto"));
                produto.setProduto(result.getString("Produto"));
                produto.setCategoria(result.getString("Categoria"));
                produto.setDescricao(result.getString("Descricao"));
                produto.setCor(result.getString("Cor"));
                produto.setValorUnitario(result.getString("ValorUnitario"));
                produto.setQuantidade(result.getString("Quantidade"));                
                
                listaProdutoL.add(produto);
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
        return listaProdutoL;
    }

}
