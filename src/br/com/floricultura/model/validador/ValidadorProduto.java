/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.model.validador;

import br.com.floricultura.model.produto.Produto;

/**
 *
 * @author Raul de Paula
 */
public class ValidadorProduto {

    public static String validar(Produto produto) {

        String mensagemErroPadrao = "Favor informar os campos: ";
        boolean valido = true;

        if (produto == null) {
            mensagemErroPadrao = "Não foi informado um produto.";
            valido = false;
        }

        if (produto.getProduto() == null || "".equals(produto.getProduto())) {
            mensagemErroPadrao += "\nProduto;";
            valido = false;
        } else if (produto.getProduto().length() > 30) {
            mensagemErroPadrao += "\nProduto não pode ter mais que 30 caracteres.";
            valido = false;
        }

        if ("Selecione...".equals(produto.getCategoria())) {
            mensagemErroPadrao += "\nCategoria;";
            valido = false;
        }

        if ("Selecione...".equals(produto.getCor())) {
            mensagemErroPadrao += "\nCor;";
            valido = false;
        }

        if (produto.getDescricao() == null || "".equals(produto.getDescricao())) {
            mensagemErroPadrao += "\nDescrição do produto;";
            valido = false;
        } else if (produto.getDescricao().length() > 200) {
            mensagemErroPadrao = "\nDescrição do produto não pode ter mais que 200 caracteres.";
            valido = false;
        }

        if (produto.getValorUnitario().equals("") || produto.getValorUnitario() == null) {
            mensagemErroPadrao += "\nValor unitário;";
            valido = false;
        } else {
            float valorUnitarioFloat = Float.parseFloat(produto.getValorUnitario());
            if (valorUnitarioFloat >= 9999.99) {
                mensagemErroPadrao += "\nValor unitário ultrapassa limite máximo.";
                valido = false;
            }
        }

        if (produto.getQuantidade() == null || "".equals(produto.getQuantidade())) {
            mensagemErroPadrao += "\nQuantidade;";
            valido = false;
        } else if (produto.getQuantidade().length() > 4) {
            mensagemErroPadrao += "\nQuantidade ultrapassa o limite máximo.";
            valido = false;
        }

        if (valido == false) {
            return mensagemErroPadrao;
        } else {
            return null;
        }
    }
}
