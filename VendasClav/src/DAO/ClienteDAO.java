
package DAO;
import java.sql.ResultSet;
import java.sql.Connection;
import conexoes.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.modelCliente;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;
 

public class ClienteDAO {
    
    // metodo para cadastrar na BD tabela_cliente;
    public void create(modelCliente r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("INSERT INTO tbl_cliente (nomeCliente,telefoneCliente,nifCliente)VALUES(?,?,?)");
            
            stmt.setString(1, r.getNomeCliente());
            stmt.setInt(2, r.getTelefoneCliente());
            stmt.setString(3, r.getNifCliente());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro naoconsegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
}
    
    // Este arrayList ele vai receber os dados da BD na tbl_Cliente e listar todos ja cadastrados;
    public List<modelCliente> read(){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelCliente> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_cliente");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelCliente clien = new modelCliente();
                clien.setId_cliente(rs.getInt("id_cliente"));
                clien.setTelefoneCliente(rs.getInt("telefoneCliente"));
                clien.setNomeCliente(rs.getString("nomeCliente"));
                clien.setNifCliente(rs.getString("nifCliente"));
                cl.add(clien);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
      
 // Este arrayList ele vai receber os dados da BD na tbl_Cliente e listar por nome;   
    
    public List<modelCliente> readForNome(String nomeMeu){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelCliente> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_cliente WHERE nomeCliente LIKE ?");
            stmt.setString(1, "%"+nomeMeu+"%");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelCliente clien = new modelCliente();
                clien.setId_cliente(rs.getInt("id_cliente"));
                clien.setTelefoneCliente(rs.getInt("telefoneCliente"));
                clien.setNomeCliente(rs.getString("nomeCliente"));
                clien.setNifCliente(rs.getString("nifCliente"));
                cl.add(clien);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
    
    
    
    
    // metodo para actualizar cliente;
    
    public void update(modelCliente r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("UPDATE tbl_cliente SET nomeCliente =?, telefoneCliente =?, nifCliente =? WHERE id_cliente =?");
            
            stmt.setString(1, r.getNomeCliente());
            stmt.setInt(2, r.getTelefoneCliente());
            stmt.setString(3, r.getNifCliente());
            stmt.setInt(4, r.getId_cliente());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "actualizado com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
}
    
    
    
    
 //metodo para deletar cliente;   
    
    public void delete(modelCliente r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("DELETE FROM tbl_cliente WHERE id_cliente =?");
            stmt.setInt(1, r.getId_cliente());
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro ao excluir " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
    
   }
    
      
} // fimClasse;
