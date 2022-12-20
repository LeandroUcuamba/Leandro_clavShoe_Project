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
public class modelCliente {
    
    
    private int id_cliente;
    private String nomeCliente;
    private int telefoneCliente;
    private String nifCliente;

    /**
     
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return the telefoneCliente
     */
    public int getTelefoneCliente() {
        return telefoneCliente;
    }

    /**
     * @param telefoneCliente the telefoneCliente to set
     */
    public void setTelefoneCliente(int telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    /**
     * @return the nifCliente
     */
    public String getNifCliente() {
        return nifCliente;
    }

    /**
     * @param nifCliente the nifCliente to set
     */
    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }
    
    
    
    
    public String toString()
    {
        return getNomeCliente();
    }
    
    
}
