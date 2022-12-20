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
public class modelVendaProduto {
    
    
    private int id_vendaProduto;
    private Double valorProduto;
    private int unidadeProduto;
    private Double valorPagar;
    private Double valorTotalCompra;
    private Double valorTroco;
    private int id_venda;
    private int id_produtoFK;
    
    
    public int getId_vendaProduto() {
        return id_vendaProduto;
    }

    public void setId_vendaProduto(int id_vendaProduto) {
        this.id_vendaProduto = id_vendaProduto;
    }

    public Double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(Double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public int getUnidadeProduto() {
        return unidadeProduto;
    }

    public void setUnidadeProduto(int unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }

    public Double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(Double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public Double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(Double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

    public Double getValorTroco() {
        return valorTroco;
    }

    public void setValorTroco(Double valorTroco) {
        this.valorTroco = valorTroco;
    }

    public int getId_venda() {
        return id_venda;
    }

    public void setId_venda(int id_venda) {
        this.id_venda = id_venda;
    }

    public int getId_produtoFK() {
        return id_produtoFK;
    }

    public void setId_produtoFK(int id_produto) {
        this.id_produtoFK = id_produto;
    }
    

    
}
