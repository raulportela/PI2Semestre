/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.model.venda;

import br.com.floricultura.model.cliente.Cliente;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author luana
 */
public class Venda {
//Vendas não deveria estar recebendo parametros da classe cliente e 
//produto?

    private int idVenda;
    private String notaFiscal;
    private Date data = new Date();
    private String valorTotal;
    private Cliente cliente;
    private ArrayList<ItemVendido> listaItensVendidos = new ArrayList<ItemVendido>();

    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * @return the notaFiscal
     */
    public String getNotaFiscal() {
        return notaFiscal;
    }

    /**
     * @param notaFiscal the notaFiscal to set
     */
    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }



    /**
     * @return the valorTotal
     */
    public String getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the listaItensVendidos
     */
    public ArrayList<ItemVendido> getListaItensVendidos() {
        return listaItensVendidos;
    }

    /**
     * @param listaItensVendidos the listaItensVendidos to set
     */
    public void setListaItensVendidos(ArrayList<ItemVendido> listaItensVendidos) {
        this.listaItensVendidos = listaItensVendidos;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    
}
