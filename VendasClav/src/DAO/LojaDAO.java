/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.ResultSet;
import java.sql.Connection;
import conexoes.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.modelLoja;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Leandro Ucuamba
 */
public class LojaDAO {
    
    public List<modelLoja> read3(){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelLoja> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_loja");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelLoja loj = new modelLoja();
                loj.setNifLoja(rs.getString("nifLoja"));
                loj.setNomeLoja(rs.getString("nomeLoja"));
                loj.setLocalizacao(rs.getString("localizacao"));
                loj.setBairro(rs.getString("bairro"));
    
                cl.add(loj);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LojaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
    
    
    
    public void update(modelLoja r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("UPDATE tbl_loja SET nomeLoja =?, localizacao =?, bairro=? WHERE nifLoja =?");
            
            stmt.setString(1, r.getNomeLoja());
            stmt.setString(2, r.getLocalizacao());
            stmt.setString(3, r.getBairro());
            stmt.setString(4, r.getNifLoja());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registo da loja actualizado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
}
    
    
}
