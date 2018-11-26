/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.servico;

import br.com.projetoPoo.db.dao.pessoa.DaoPessoa;
import br.com.projetoPoo.model.pessoa.funcionario.Funcionario;
import java.util.List;

/**
 *
 * @author Raul de Paula
 */
public class ServicoFuncionario {

    public static String inserir(Funcionario funcionario) {
        DaoPessoa.inserir(null, funcionario);
        return null;
    }
    
    public static String atualizar (Funcionario funcionario){
        DaoPessoa.atualizar(null, funcionario);
        return null;
    }
    
    public static List<Funcionario> listar() {
        List<Funcionario> listaFuncionarios = DaoPessoa.listarFuncionario();
        return listaFuncionarios;
    }

    public static  String excluir(String cpf) {
        DaoPessoa.excluir(false, cpf);
        return null;
    }

    public static Funcionario obterUm(String cpf) {
        Funcionario funcionario = DaoPessoa.obterUmFuncinario(cpf);
        return funcionario;
    }

    public static List<Funcionario> listarPorStatus(boolean status) {
        List<Funcionario> listaFuncionarios = DaoPessoa.listarFuncionarioPorStatus(status);
        return listaFuncionarios;
    }
    
}
