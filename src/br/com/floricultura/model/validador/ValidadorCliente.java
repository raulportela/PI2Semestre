/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.model.validador;

import br.com.floricultura.model.pessoa.cliente.Cliente;

/**
 *
 * @author Raul de Paula
 */
public class ValidadorCliente {

    public static String validadorCliente(Cliente cliente) {
        String mensagensErro = "Informar Campos Obrigatórios: ";
        boolean valido = true;
        
        if (cliente == null) {
            mensagensErro += "Não foi informado um Cliente";
            return mensagensErro;
        }
        //VALIDAÇÃO DOS DADOS PESSOAIS DO CLIENTE
        if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            mensagensErro += "\nNome.";
            valido = false;
        } else if (cliente.getNome().length() > 30) {
            mensagensErro += "\nNome não pode ter mais de 15 caracteres.";
            valido = false;
        }
        if (cliente.getSobrenome() == null || "".equals(cliente.getSobrenome())) {
            mensagensErro += "\nSobrenome.";
            valido = false;
        } else if (cliente.getSobrenome().length() > 50) {
            mensagensErro += "\nSobrenome não pode ter mais de 50 caracteres.";
            valido = false;
        }
        if (cliente.getCpf() == null || "".equals(cliente.getCpf())) {
            mensagensErro += "\nCPF.";
            valido = false;
        } else if (cliente.getCpf().length() > 14) {
            mensagensErro += "\nCPF não pode ter mais de 11 caracteres.";
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
        System.out.println("21");
        if (valido == false) {
            return mensagensErro;
        } else {
            return null;
        }
    }

}
