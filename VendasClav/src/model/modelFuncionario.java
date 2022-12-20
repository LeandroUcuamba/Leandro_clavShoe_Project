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
public class modelFuncionario {
    
    
    private int id_funcionario;
    private String nomeFun;
    private int telefoneFun;
    private String cargoFun;
    private String dataNascimento;
    private String morada;
    private String sexo;
    private String nBI;
    private String usuarioLogin;
    private String senhaLogin;
    private String nifLoja;
    
    
    

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNomeFun() {
        return nomeFun;
    }

    public void setNomeFun(String nomeFun) {
        this.nomeFun = nomeFun;
    }

    public int getTelefoneFun() {
        return telefoneFun;
    }

    public void setTelefoneFun(int telefoneFun) {
        this.telefoneFun = telefoneFun;
    }

    public String getCargoFun() {
        return cargoFun;
    }

    public void setCargoFun(String cargoFun) {
        this.cargoFun = cargoFun;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getnBI() {
        return nBI;
    }

    public void setnBI(String nBI) {
        this.nBI = nBI;
    }

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }

    public void setSenhaLogin(String senhaLogin) {
        this.senhaLogin = senhaLogin;
    }

    public String getNifLoja() {
        return nifLoja;
    }

    public void setNifLoja(String nifLoja) {
        this.nifLoja = nifLoja;
    }
    
    
    public String toString()
    {
        return getNomeFun();
    }
    
    
}
