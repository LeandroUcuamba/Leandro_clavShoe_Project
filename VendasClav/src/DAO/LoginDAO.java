/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.modelLogin;

/**
 *
 * @author Leandro Ucuamba
 */
public class LoginDAO {
    
    // metodo para checar o usuario e a senha na BD;
    public boolean checkLogin(String login, String senha){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            boolean check = false;  
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_funcionario WHERE usuarioLogin = ? and senhaLogin = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
              check = true;   
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return check;              
        }
    
    
}
