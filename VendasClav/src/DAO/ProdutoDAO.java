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
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
import model.modelProduto;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro Ucuamba
 */
public class ProdutoDAO {
    
    public void create(modelProduto r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("INSERT INTO tbl_produto (marca,modelo,tamanho,preco,categoria)VALUES(?,?,?,?,?)");
            
            stmt.setString(1, r.getMarca());
            stmt.setString(2, r.getModelo());
            stmt.setString(3, r.getTamanho());
            stmt.setDouble(4, r.getPreco());
            stmt.setString(5, r.getCategoria());
        
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
}
    
    
    public void update(modelProduto r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("UPDATE tbl_produto SET marca=?,modelo=?,tamanho=?,preco=?,categoria=? WHERE id_produto=?");
            
            stmt.setString(1, r.getMarca());
            stmt.setString(2, r.getModelo());
            stmt.setString(3, r.getTamanho());
            stmt.setDouble(4, r.getPreco());
            stmt.setString(5, r.getCategoria());
            stmt.setInt(6, r.getId_produto());
        
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto actualizado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
}
    
    
    public void delete(modelProduto r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("DELETE FROM tbl_produto WHERE id_produto=?");
            
            stmt.setInt(1, r.getId_produto());
        
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto removido com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
}
    
    
    
    public List<modelProduto> read(){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelProduto> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_produto");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelProduto prod = new modelProduto();
                prod.setId_produto(rs.getInt("id_produto"));
                prod.setMarca(rs.getString("marca"));
                prod.setModelo(rs.getString("modelo"));
                prod.setTamanho(rs.getString("tamanho"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setCategoria(rs.getString("categoria"));
                
                cl.add(prod);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
    
    
    public List<modelProduto> readForNome2(String kk){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelProduto> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_produto WHERE marca LIKE ?");
            stmt.setString(1, "%"+kk+"%");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelProduto prod = new modelProduto();
                prod.setId_produto(rs.getInt("id_produto"));
                prod.setMarca(rs.getString("marca"));
                prod.setModelo(rs.getString("modelo"));
                prod.setTamanho(rs.getString("tamanho"));
                prod.setPreco(rs.getDouble("preco"));
                prod.setCategoria(rs.getString("categoria"));
                
                cl.add(prod);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
    
    
    
}
