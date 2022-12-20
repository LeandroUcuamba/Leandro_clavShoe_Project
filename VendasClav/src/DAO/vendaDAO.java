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
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import model.modelVenda;

/**
 *
 * @author Leandro Ucuamba
 */
public class vendaDAO {
    
    
    public void create(modelVenda r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("INSERT INTO tbl_venda (dataVenda,id_funcionario,id_cliente)VALUES(?,?,?)");
            
            stmt.setString(1, r.getDataVenda());
            stmt.setInt(2, r.getId_funcionario());
            stmt.setInt(3, r.getId_cliente());
            
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, " Confirmado" );
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro verifique se: o Id do funcionario ou Id do cliente foi já existem " + JOptionPane.ERROR_MESSAGE);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
    }
    
    
     public List<modelVenda> read(){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelVenda> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_venda");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelVenda VP = new modelVenda();
                
                VP.setId_venda(rs.getInt("id_venda"));
                VP.setDataVenda(rs.getString("dataVenda"));
                VP.setId_funcionario(rs.getInt("id_funcionario"));
                VP.setId_cliente(rs.getInt("id_cliente"));
                cl.add(VP);
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(vendaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
    
    
}
