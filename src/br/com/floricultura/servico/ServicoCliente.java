/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.servico;

import br.com.floricultura.db.dao.DaoCliente;
import br.com.floricultura.interfaces.CRUD;
import br.com.floricultura.model.pessoa.cliente.Cliente;
import br.com.floricultura.model.validador.ValidadorCliente;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Raul de Paula
 */
public class ServicoCliente implements CRUD {
    
    public static String cadastrarCliente(Cliente cliente) throws Exception {
        String resposta;
        resposta = ValidadorCliente.validadorCliente(cliente);
        if (resposta == null) {
            try {
                //MockCliente.inserir(ListaCliente);
                DaoCliente.inserir(cliente);
                return null;
                
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Erro na fonte de dados");
            }
        } else {
            return resposta;
        }
        return null;
    }
    
    public static String atualizarCliente(Cliente cliente) {
        String resposta;
        
        resposta = ValidadorCliente.validadorCliente(cliente);
        
        if (resposta == null) {
            try {
                DaoCliente.atualizar(cliente);
                return null;
                
            } catch (Exception e) {
                e.printStackTrace();
                resposta = "Erro na fonte de dados";
            }
        } else {
            return resposta;
        }
        return resposta;
    }
    
    public static String excluirCliente(int idCliente) {
        try {
            DaoCliente.excluir(idCliente);
            return null;
        } catch (Exception e) {
            return "Erro na fonte de dados.";
        }
    }
    
    public static Cliente procurarCliente(String CPF) throws Exception {
        List<Cliente> listaCliente = new ArrayList<Cliente>();
        int contador = 0;
        Cliente cliente = null;
        try {
            listaCliente = DaoCliente.procurar(CPF);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        while (cliente != null | contador < listaCliente.size()) {
            Cliente clienteLista = listaCliente.get(contador);
            
            if(CPF.equals(clienteLista.getCpf())){
                return clienteLista;
            }
        }
        return cliente;
    }
    
    @Override
    public String inserir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String excluir() {
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

    @Override
    public List<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
