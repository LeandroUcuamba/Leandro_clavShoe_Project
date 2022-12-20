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
public class modelFornecedor {
    
    
    private int id_fornecedor;
    private String nomeFor;
    private String nifFor;
    private String enderecoFor;
    private String telefone;

    
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    

    public int getId_fornecedor() {
        return id_fornecedor;
    }

    public void setId_fornecedor(int id_fornecedor) {
        this.id_fornecedor = id_fornecedor;
    }

    public String getNomeFor() {
        return nomeFor;
    }

    public void setNomeFor(String nomeFor) {
        this.nomeFor = nomeFor;
    }

    public String getNifFor() {
        return nifFor;
    }

    public void setNifFor(String nifFor) {
        this.nifFor = nifFor;
    }

    public String getEnderecoFor() {
        return enderecoFor;
    }

    public void setEnderecoFor(String enderecoFor) {
        this.enderecoFor = enderecoFor;
    }
      
    
}
