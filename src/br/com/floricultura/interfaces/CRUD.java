/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.interfaces;

import java.util.List;

/**
 *
 * @author Raul de Paula
 */
public interface CRUD {
    
    public String inserir();
    
    public List<Object> listar();
    
    public String excluir();
    
    public String obterUm();
    
    public String listarPorStatus();
    
}
