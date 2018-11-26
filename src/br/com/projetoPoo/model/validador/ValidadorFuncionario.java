/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.model.validador;

import br.com.projetoPoo.model.pessoa.funcionario.Funcionario;

/**
 *
 * @author Raul de Paula
 */
public class ValidadorFuncionario {
    public static String validador(Funcionario funcionario){
        if(funcionario == null){
            return "Não foi selecionado um funcionario";
        }
        String msgErro = "Informe: \n";
        boolean valido = true;
        
        if(funcionario.getNome().equals(null) | funcionario.getNome().equals("")){
            msgErro += "Nome \n";
            valido = false;
        }
        
        if(funcionario.getSobrenome().equals(null) | funcionario.getSobrenome().equals("")){
            msgErro += "Sobrenome \n";
            valido = false;
        }
        
        if(funcionario.getCpf().equals(null) | funcionario.getCpf().equals("")){
            msgErro += "Cpf\n";
            valido = false;
        }
        
        if(funcionario.getDataNascimento().equals(null) | funcionario.getDataNascimento().equals("")){
            msgErro += "Data de Nascimento \n";
            valido = false;
        }
        
        if(funcionario.getUsuario().equals(null) | funcionario.getUsuario().equals("")){
            msgErro += "Usuario \n";
            valido = false;
        }
        
        if(funcionario.getSenha().equals(null) | funcionario.getSenha().equals("")){
            msgErro += "Senha \n";
            valido = false;
        }
        
        if(funcionario.getCargo().equals(null) | funcionario.getCargo().equals("")){
            msgErro += "Cargo \n";
            valido = false;
        }
        
        if (valido) {
            return null;
        }else{
            return msgErro;
        }
    }
}
