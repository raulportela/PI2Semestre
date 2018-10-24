/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.model.validador;

import br.com.floricultura.model.produto.Produto;
import br.com.floricultura.model.venda.ItemVendido;
import java.util.ArrayList;

/**
 *
 * @author Jeferson nolasco
 */
public class ValidadorItemVendido {

    public static String validar(ArrayList<ItemVendido> listaItemVendido) {
        
        String mensgemErro = null;
        int contador = 0;
        ItemVendido itemVendido;
        Produto produto;
        while (contador < listaItemVendido.size()) {

            itemVendido = listaItemVendido.get(contador);
            if (itemVendido.getProduto() == null) {
                mensgemErro += "\nÉ necessario selecionar um item para efetuar uma venda";
            }
            if (itemVendido.getQtd() == 0) {
                produto = itemVendido.getProduto();
                mensgemErro += "\nÉ necessário informar a quantidade do produto: "+produto.getProduto();
            }
            contador++;
        }

        return mensgemErro;
    }

}
