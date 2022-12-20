/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Leandro Ucuamba
 */
public class modelProdutoFornecedor {

    
    
    private int Id_produtoFor;
    private String descricao;
    private int quantidade;
    private String dataHoraFor;
    private int id_fornecedor;
    private String nifLoja;
    private int id_produto;
    
    
    public int getId_produtoFor() {
        return Id_produtoFor;
    }

    public void setId_produtoFor(int Id_produtoFor) {
        this.Id_produtoFor = Id_produtoFor;
    }
    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataHoraFor() {
        return dataHoraFor;
    }

    public void setDataHoraFor(String dataHoraFor) {
        this.dataHoraFor = dataHoraFor;
    }

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNifLoja() {
        return nifLoja;
    }

    public void setNifLoja(String nifLoja) {
        this.nifLoja = nifLoja;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }
    
    
}
