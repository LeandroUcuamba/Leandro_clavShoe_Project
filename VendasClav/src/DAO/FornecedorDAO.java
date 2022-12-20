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
import model.modelFornecedor;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Leandro Ucuamba
 */
public class FornecedorDAO {
    
    public void create(modelFornecedor r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("INSERT INTO tbl_fornecedor (nomeFor,nifFor,enderecoFor,telefone)VALUES(?,?,?,?)");
            
            stmt.setString(1, r.getNomeFor());
            stmt.setString(2, r.getNifFor());
            stmt.setString(3, r.getEnderecoFor());
            stmt.setString(4, r.getTelefone());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro naoconsegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
        
        
         public List<modelFornecedor> read4(){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelFornecedor> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_fornecedor");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelFornecedor Forn = new modelFornecedor();
                Forn.setId_fornecedor(rs.getInt("id_fornecedor"));
                Forn.setNomeFor(rs.getString("nomeFor"));
                Forn.setNifFor(rs.getString("nifFor"));
                Forn.setEnderecoFor(rs.getString("enderecoFor"));
                Forn.setTelefone(rs.getString("telefone"));
                cl.add(Forn);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
     }
         
         
         public List<modelFornecedor> readForNome4(String SL){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelFornecedor> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT FROM tbl_fornecedor WHERE nomeFor LIKE ?");
            stmt.setString(1, "%"+SL+"%");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelFornecedor Forn = new modelFornecedor();
                Forn.setId_fornecedor(rs.getInt("id_fornecedor"));
                Forn.setNomeFor(rs.getString("nomeFor"));
                Forn.setNifFor(rs.getString("nifFor"));
                Forn.setEnderecoFor(rs.getString("enderecoFor"));
                Forn.setTelefone(rs.getString("telefone"));
                cl.add(Forn);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
     }
        
        
    public void update(modelFornecedor r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("UPDATE tbl_fornecedor SET nomeFor=? ,nifFor=? ,enderecoFor=? ,telefone=? WHERE id_fornecedor =?");
            
            stmt.setString(1, r.getNomeFor());
            stmt.setString(2, r.getNifFor());
            stmt.setString(3, r.getEnderecoFor());
            stmt.setString(4, r.getTelefone());
            stmt.setInt(5, r.getId_fornecedor());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor actualizado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro naoconsegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    
    
    
    public void delete(modelFornecedor r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("DELETE FROM tbl_fornecedor WHERE id_fornecedor =?");
            stmt.setInt(1, r.getId_fornecedor());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecedor excluido com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro naoconsegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    }
    
    
    
}
