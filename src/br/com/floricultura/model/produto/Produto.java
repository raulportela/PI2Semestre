/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.floricultura.model.produto;

/**
 *
 * @author Jeferson Nolasco
 */
public class Produto {

    private int idProduto;
    private boolean statusProduto;
    private String produto;
    private String categoria;
    private String descricao;
    private String cor;
    private String valorUnitario;
    private String quantidade;

    // GET's
    public int getIdProduto() {
        return idProduto;
    }

    public String getProduto() {
        return produto;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getCor() {
        return cor;
    }

    public String getValorUnitario() {
        return valorUnitario;
    }

    public String getQuantidade() {
        return quantidade;
    }

    // SET's
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setProduto(String Produto) {
        this.produto = Produto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setValorUnitario(String valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isStatusProduto() {
        return statusProduto;
    }

    public void setStatusProduto(boolean statusProduto) {
        this.statusProduto = statusProduto;
    }

    public void isStatusProduto(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
