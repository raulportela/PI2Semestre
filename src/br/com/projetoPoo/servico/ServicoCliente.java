/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoPoo.servico;

import br.com.projetoPoo.db.dao.pessoa.cliente.DaoCliente;
import br.com.projetoPoo.interfaces.CRUD;
import br.com.projetoPoo.model.pessoa.cliente.Cliente;
import br.com.projetoPoo.model.pessoa.funcionario.Funcionario;
import br.com.projetoPoo.model.validador.ValidadorCliente;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul de Paula
 */
public class ServicoCliente implements CRUD {
    
   
    
    public String inserir(Cliente cliente, Funcionario funcionario) {
        
    }

    @Override
    public String atualizar(Cliente cliente, Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir(Cliente cliente, Funcionario funcionario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obterUm() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarPorStatus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
