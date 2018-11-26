/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.model.validador;

import br.com.projetoPoo.model.pessoa.cliente.Cliente;

/**
 *
 * @author Raul de Paula
 */
public class ValidadorCliente {

    public static String validadorCliente(Cliente cliente) {
        String mensagensErro = "Informar: ";
        boolean valido = true;
        
        if (cliente == null) {
            mensagensErro = "Não foi informado um Cliente";
            return mensagensErro;
        }
        
        if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            mensagensErro += "\nNome.";
            valido = false;
        }
        
        if (cliente.getSobrenome() == null || "".equals(cliente.getSobrenome())) {
            mensagensErro += "\nSobrenome.";
            valido = false;
        }
        
        if (cliente.getCpf() == null || "".equals(cliente.getCpf())) {
            mensagensErro += "\nCPF.";
            valido = false;
        } else {
            boolean validoCPF;
            String cpf = cliente.getCpf().substring(0, 3)
                    + cliente.getCpf().substring(4, 7)
                    + cliente.getCpf().substring(8, 11)
                    + cliente.getCpf().substring(12, 14);
            validoCPF = ValidadorCPF.validadorCPF(cpf);
            if (!validoCPF) {
                mensagensErro += "CPF Inválido";
                valido = false;
            }
        }
        
        if (valido == false) {
            return mensagensErro;
        } else {
            return null;
        }
    }

}
