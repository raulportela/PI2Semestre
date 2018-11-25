/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.interfaces;

import br.com.floricultura.model.pessoa.cliente.Cliente;
import br.com.floricultura.model.pessoa.funcionario.Funcionario;
import java.util.List;

/**
 *
 * @author Raul de Paula
 */
public interface CRUD {
    
    public String inserir(Cliente cliente, Funcionario funcionario);
    
    public String atualizar(Cliente cliente, Funcionario funcionario);
    
    public List<Object> listar();
    
    public String excluir(Cliente cliente, Funcionario funcionario);
    
    public String obterUm();
    
    public String listarPorStatus();
    
}
