/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.model.validador;

import br.com.floricultura.model.cliente.Cliente;

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
        if (cliente.getRg() == null) {
            mensagensErro += "\nRG.";
            valido = false;
        } else if (cliente.getRg().length() > 20) {
            mensagensErro += "\nRG excede limite. MÁXIMO 20 caracteres.";
            valido = false;
        }
        if (cliente.isSexo() == null) {
            mensagensErro += "\nSexo.";
            valido = false;
        }
        if ("Selecione...".equals(cliente.getUfNascimento())) {
            mensagensErro += "\nUF de Nascimento.";
            valido = false;
        }
        if ("Selecione...".equals(cliente.getEstadoNascimento())) {
            mensagensErro += "\nEstado de Nascimento.";
            valido = false;
        }
        if (cliente.getEstadoCivil() == null || "".equals(cliente.getEstadoNascimento())
                || "Selecione...".equals(cliente.getEstadoCivil())) {
            mensagensErro += "\nEstado Civil.";
            valido = false;
        }
        if (cliente.getDataNascimento() == null || "".equals(cliente.getDataNascimento())) {
            mensagensErro += "\nData de Nascimento.";
            valido = false;
        } else if (cliente.getDataNascimento() != null 
                && (cliente.getDataNascimento().length() != 10)){
            mensagensErro += "\nData de Nascimento com o formato DD/MM/AAAA.";
            valido = false;
        }
        //VALIDAÇÃO DOS CAMPOS DE CONTATO
        if (!cliente.getTelefone().equals("") && cliente.getTelefone().length() < 8) {
            mensagensErro += "\nTelefone Fixo excede limite mínimo. 8 caracteres.";
            valido = false;
        }else if (!cliente.getTelefone().equals("") && cliente.getTelefone().length() > 10){
            mensagensErro += "\nTelefone Fixo excede limite máximo. 10 caracteres.";
            valido = false;
        }
        if (!cliente.getCelular().equals("") && cliente.getCelular().length() < 9) {
            mensagensErro += "\nCelular excede limite mínimo. 9 caracteres.";
            valido = false;
        } else if (!cliente.getCelular().equals("") && cliente.getCelular().length() > 11) {
            mensagensErro += "\nCelular excede limite máximo. 11 caracteres.";
            valido = false;
        }
        if (!cliente.getOutroContato().equals("") && cliente.getOutroContato().length() > 20) {
            mensagensErro += "\nOutro Contato excede limite máximo. 20 caracteres.";
            valido = false;
        }else if (!cliente.getEmail().equals("") && cliente.getEmail().length() > 60) {
            mensagensErro += "\nEmail excede limite máximo. 60 caracteres.";
            valido = false;
        }

        //VALIDAÇÃO DOS CAMPOS DE ENDEREÇO
        if (cliente.getCep() == null || "".equals(cliente.getCep())) {
            mensagensErro += "\nCEP";
            valido = false;
        } else if (cliente.getCep() != null && cliente.getCep().length() < 8) {
            mensagensErro += "CEP deve conter 8 caracteres";
            valido = false;
        }
        if (cliente.getRua() == null || "".equals(cliente.getRua())) {
            mensagensErro += "\nRua";
            valido = false;
        } else if (cliente.getRua() != null && cliente.getRua().length() > 30) {
            mensagensErro += "\nRua Excede limite. MAXIMO 30 Caracteres";
            valido = false;
        }
        if (cliente.getNumero() == null || "".equals(cliente.getNumero())) {
            mensagensErro += "\nNúmero";
            valido = false;
        } else if (cliente.getNumero() != null && cliente.getNumero().length() > 5) {
            mensagensErro += "\nNúmero Excede limite. MAXIMO 5 Caracteres";
            valido = false;
        }
        if (cliente.getBairro() == null || "".equals(cliente.getBairro())) {
            mensagensErro += "\nBairro";
            valido = false;
        } else if (cliente.getBairro() != null && cliente.getBairro().length() > 30) {
            mensagensErro += "\nBairro Excede limite. MAXIMO 30 Caracteres";
            valido = false;
        }
        if (cliente.getComplemento().length() > 50) {
            mensagensErro += "\nBairro Excede limite. MAXIMO 50 Caracteres";
            valido = false;
        }
        if ("Selecione...".equals(cliente.getUf())) {
            mensagensErro += "\nUF";
            valido = false;
        }
        if ("Selecione...".equals(cliente.getEstado())) {
            mensagensErro += "\nEstado";
            valido = false;
        }
        System.out.println("21");
        if (valido == false) {
            return mensagensErro;
        } else {
            return null;
        }
    }

}
