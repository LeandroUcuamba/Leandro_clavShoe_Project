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
import DAO.ProdutoDAO;
import model.modelProduto;
import model.modelVendaProduto;


/**
 *
 * @author Leandro Ucuamba
 */
public class vendaProdutoDAO {
    
     public void create(modelVendaProduto r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("INSERT INTO tbl_vendaproduto (valorProduto,unidadeProduto,valorPagar,valorTotalCompra,valorTroco,id_venda,id_produto)VALUES(?,?,?,?,?,?,?)");
            
            
            stmt.setDouble(1, r.getValorProduto());
            stmt.setInt(2, r.getUnidadeProduto());
            stmt.setDouble(3, r.getValorPagar());
            stmt.setDouble(4, r.getValorTotalCompra());
            stmt.setDouble(5, r.getValorTroco());
            stmt.setInt(6, r.getId_venda());
            stmt.setInt(7, r.getId_produtoFK());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "venda salva com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro verifique se: o Id do cliente ou o id do produto existe no cadastro " + JOptionPane.ERROR_MESSAGE);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
        
     }
        
        public List<modelVendaProduto> read6(){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelVendaProduto> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_vendaproduto");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelVendaProduto VP = new modelVendaProduto();
                
                VP.setId_vendaProduto(rs.getInt("id_vendaProduto"));
                VP.setValorProduto(rs.getDouble("valorProduto"));
                VP.setUnidadeProduto(rs.getInt("unidadeProduto"));
                VP.setValorPagar(rs.getDouble("valorPagar"));
                VP.setValorTotalCompra(rs.getDouble("valorTotalCompra"));
                VP.setValorTroco(rs.getDouble("valorTroco"));
                VP.setId_venda(rs.getInt("id_venda"));
                VP.setId_produtoFK(rs.getInt("id_produto"));
                cl.add(VP);
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(vendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
        
        
        
        public List<modelVendaProduto> readJ(){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelVendaProduto> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT id_produto, unidadeProduto, valorProduto, valorTotalCompra FROM tbl_vendaproduto ");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelVendaProduto VP = new modelVendaProduto();
                
                VP.setId_produtoFK(rs.getInt("id_produto"));
                VP.setUnidadeProduto(rs.getInt("unidadeProduto"));
                VP.setValorProduto(rs.getDouble("valorProduto"));
                VP.setValorTotalCompra(rs.getDouble("valorTotalCompra"));
                cl.add(VP);
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(vendaProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
  
        
}
    
    

