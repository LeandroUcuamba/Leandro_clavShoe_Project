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
public class modelLogin {
    
    private int id_funcionario;
    private String usuarioLogin;
    private String senhaLogin;
    private String cargoFun;
    
    
    public String getCargoFun() {
        return cargoFun;
    }

    public void setCargoFun(String cargoFun) {
        this.cargoFun = cargoFun;
    }
    
    public int getId_funcionario()
    {
        return id_funcionario;
    }
    
    public void setId_funcionario(int id_funcionario)
    {
        this.id_funcionario = id_funcionario;
    }
    
    public String getUsuarioLogin() {
        return usuarioLogin;
    }
    
    public void setUsuarioLogin(String usuarioLogin){
        this.usuarioLogin = usuarioLogin;
    }

    public String getSenhaLogin() {
        return senhaLogin;
    }
    
    
    public void setSenhaLogin(String senhaLogin){
        this.senhaLogin = senhaLogin;
    }
    
}
