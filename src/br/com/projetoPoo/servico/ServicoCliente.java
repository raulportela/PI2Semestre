/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.servico;

import br.com.projetoPoo.db.dao.pessoa.DaoPessoa;
import br.com.projetoPoo.model.pessoa.cliente.Cliente;
import br.com.projetoPoo.model.pessoa.funcionario.Funcionario;
import java.util.List;

/**
 *
 * @author Raul de Paula
 */
public class ServicoCliente {
    
    public static String inserir(Cliente cliente) {
        DaoPessoa.inserir(cliente, null);
        return null;
    }
    
    public static String atualizar (Cliente cliente){
        DaoPessoa.atualizar(cliente, null);
        return null;
    }
    
    public static List<Cliente> listar() {
        List<Cliente> listaClientes = DaoPessoa.listarClientes();
        return listaClientes;
    }

    public static  String excluir(String cpf) {
        DaoPessoa.excluir(true, cpf);
        return null;
    }

    public static Cliente obterUm(String cpf) {
        Cliente cliente = DaoPessoa.obterUmCliente(cpf);
        return cliente;
    }

    public static List<Cliente> listarPorStatus(boolean status) {
        List<Cliente> listaClientes = DaoPessoa.listarClientePorStatus(status);
        return listaClientes;
    }
    
}
