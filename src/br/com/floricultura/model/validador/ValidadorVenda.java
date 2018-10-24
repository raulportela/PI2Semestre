/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.model.validador;

import br.com.floricultura.model.cliente.Cliente;
import br.com.floricultura.model.venda.Venda;

/**
 *
 * @author Raul de Paula
 */
public class ValidadorVenda {

    public static String validar(Venda venda) {

        String mensagemErro = "Informar Campos Obrigatórios: ";
        boolean valido = true;
        Cliente cliente = venda.getCliente();
        if (cliente == null){
            mensagemErro += "\nCliente.";
            valido= false;
        }
        if (venda.getListaItensVendidos().isEmpty()) {
            
            mensagemErro += "\nProduto à ser vendido.";
            System.out.println(mensagemErro + 4);
            valido = false;
        } else {
            String respostaItemvendido = ValidadorItemVendido.validar(venda.getListaItensVendidos());
            if (respostaItemvendido != null) {
                mensagemErro += respostaItemvendido;
                valido = false;
            }
        }
        if (valido == false) {
            return mensagemErro;
        } else {
            return null;
        }

    }

}
