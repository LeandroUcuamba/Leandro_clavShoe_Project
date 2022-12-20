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
import model.modelProdutoFornecedor;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
 

/**
 *
 * @author Leandro Ucuamba
 */
public class ProdutoFornecedorDAO {
    
    public void create(modelProdutoFornecedor r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("INSERT INTO tbl_produtofornecedor (descricao,quantidade,dataHoraFor,id_fornecedor,nifLoja,id_produto)VALUES(?,?,?,?,?,?)");
            
            stmt.setString(1 , r.getDescricao());
            stmt.setInt(2 , r.getQuantidade());
            stmt.setString(3 , r.getDataHoraFor());
            stmt.setInt(4 , r.getId_fornecedor());
            stmt.setString(5 , r.getNifLoja());
            stmt.setInt(6 , r.getId_produto());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro verifique se: o Id do fornecedor, Nif da loja ou Id do produto foi já existem " + JOptionPane.ERROR_MESSAGE);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
        
    }    
    
    
    public List<modelProdutoFornecedor> read(){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelProdutoFornecedor> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_produtofornecedor");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelProdutoFornecedor Pforn = new modelProdutoFornecedor();
                
                Pforn.setId_produtoFor(rs.getInt("id_produtoFor"));
                Pforn.setDescricao(rs.getString("descricao"));
                Pforn.setQuantidade(rs.getInt("quantidade"));
                Pforn.setDataHoraFor(rs.getString("dataHoraFor"));
                Pforn.setId_fornecedor(rs.getInt("id_fornecedor"));
                Pforn.setNifLoja(rs.getString("nifLoja"));
                Pforn.setId_produto(rs.getInt("id_produto"));
                cl.add(Pforn);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
    
    
    public List<modelProdutoFornecedor> readForId(int pp){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelProdutoFornecedor> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_produtofornecedor WHERE id_produtoFor = ?");
            stmt.setInt(1, pp);
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelProdutoFornecedor Pforn = new modelProdutoFornecedor();
                
                Pforn.setId_produtoFor(rs.getInt("id_produtoFor"));
                Pforn.setDescricao(rs.getString("descricao"));
                Pforn.setQuantidade(rs.getInt("quantidade"));
                Pforn.setDataHoraFor(rs.getString("dataHoraFor"));
                Pforn.setId_fornecedor(rs.getInt("id_fornecedor"));
                Pforn.setNifLoja(rs.getString("nifLoja"));
                Pforn.setId_produto(rs.getInt("id_produto"));
                cl.add(Pforn);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
    
    
        
    public void update(modelProdutoFornecedor r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("UPDATE tbl_produtofornecedor SET descricao=?, quantidade=? ,dataHoraFor=? ,id_fornecedor=? ,nifLoja=? ,id_produto=? WHERE id_produtoFor =?");
            
            stmt.setString(1 , r.getDescricao());
            stmt.setInt(2 , r.getQuantidade());
            stmt.setString(3 , r.getDataHoraFor());
            stmt.setInt(4 , r.getId_fornecedor());
            stmt.setString(5 , r.getNifLoja());
            stmt.setInt(6 , r.getId_produto());
            stmt.setInt(7 , r.getId_produtoFor());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Fornecimento actualizado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
}
    
    
    
    public void delete(modelProdutoFornecedor r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("DELETE FROM tbl_produtofornecedor WHERE id_produtoFor =?");
            stmt.setInt(1 , r.getId_produtoFor());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
}
    
         
    
}
