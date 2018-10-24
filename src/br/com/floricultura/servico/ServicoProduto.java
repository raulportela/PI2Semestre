/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.servico;

import br.com.floricultura.db.dao.DaoProduto;
import br.com.floricultura.model.produto.Produto;
import br.com.floricultura.model.validador.ValidadorProduto;
import java.util.List;

/**
 *
 * @author Raul de Paula
 */
public class ServicoProduto {

    public static String cadastroProduto(Produto produto) throws Exception {
        String resposta;
        resposta = ValidadorProduto.validar(produto);
        if (resposta == null) {
                DaoProduto.inserir(produto);
        } else {
            return resposta;
        }

        return null;
    }

    public static String atualizarProduto(Produto produto) throws Exception {
        String resposta;
        resposta = ValidadorProduto.validar(produto);
        if (resposta == null) {
                DaoProduto.atualizar(produto);
        }else {
            return resposta;
        }
        return resposta;
    }

    public static void excluirProduto(int idProduto) throws Exception {
        DaoProduto.excluir(idProduto);
    }

    public static Produto procurarProduto(int idProduto) throws Exception {
        List<Produto> listaProduto;
        listaProduto = DaoProduto.procurar(idProduto);
        int contador = 0;
        while (contador < listaProduto.size()){
            Produto produtoLista = listaProduto.get(contador);
            if (produtoLista.getIdProduto() == idProduto){
                return produtoLista;
            }
        }
        return null;
    }

    public static List<Produto> listar() throws Exception {
        List<Produto> listaProduto = DaoProduto.listar();
        return listaProduto;
    }
}
