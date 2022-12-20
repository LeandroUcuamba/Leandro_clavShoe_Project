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
import model.modelFuncionario;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leandro Ucuamba
 */
public class FuncionarioDAO {
    
    
    public void create(modelFuncionario r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("INSERT INTO tbl_funcionario (nomeFun,telefoneFun,cargoFun,dataNascimento,morada,sexo,nBI,usuarioLogin,senhaLogin,nifLoja)VALUES(?,?,?,?,?,?,?,?,?,?)");
            
            stmt.setString(1, r.getNomeFun());
            stmt.setInt(2, r.getTelefoneFun());
            stmt.setString(3, r.getCargoFun());
            stmt.setString(4, r.getDataNascimento());
            stmt.setString(5, r.getMorada());
            stmt.setString(6, r.getSexo());
            stmt.setString(7, r.getnBI());
            stmt.setString(8, r.getUsuarioLogin());
            stmt.setString(9, r.getSenhaLogin());
            stmt.setString(10, r.getNifLoja());
            
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Funcionario salvo com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
        
    }    
        //metodo actualizar Funcionario;
    public void update(modelFuncionario r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("UPDATE tbl_funcionario SET nomeFun=? ,telefoneFun=?, cargoFun=? , dataNascimento=?, morada=?, sexo=?, nBI=?, usuarioLogin=?, senhaLogin=? WHERE id_funcionario =?");
            
            stmt.setString(1, r.getNomeFun());
            stmt.setInt(2, r.getTelefoneFun());
            stmt.setString(3, r.getCargoFun());
            stmt.setString(4, r.getDataNascimento());
            stmt.setString(5, r.getMorada());
            stmt.setString(6, r.getSexo());
            stmt.setString(7, r.getnBI());
            stmt.setString(8, r.getUsuarioLogin());
            stmt.setString(9, r.getSenhaLogin());
            stmt.setInt(10, r.getId_funcionario());
            
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registos dos funcionarios actualizados com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
     }    
    
    // metodo deletar funcionario;
    
    public void delete(modelFuncionario r){
    
    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stmt = null;
    
   
        try {
            stmt = con.prepareStatement("DELETE FROM tbl_funcionario WHERE id_funcionario =?");
            
            stmt.setInt(1, r.getId_funcionario());
            
   
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Funcionarios excluido com sucesso");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro nao consegui conectar a BD " + ex);
        }
        finally{
            ConnectionFactory.closeConnection(con, stmt);
        }        
     }    
    
    
    // Este arrayList ele vai receber os dados da BD na tbl_Cliente e listar todos ja cadastrados;
    public List<modelFuncionario> read1(){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelFuncionario> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_funcionario");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelFuncionario Func = new modelFuncionario();
                Func.setId_funcionario(rs.getInt("id_funcionario"));
                Func.setNomeFun(rs.getString("nomeFun"));
                Func.setMorada(rs.getString("morada"));
                Func.setTelefoneFun(rs.getInt("telefoneFun"));
                Func.setCargoFun(rs.getString("cargoFun"));
                Func.setDataNascimento(rs.getString("dataNascimento"));
                Func.setSexo(rs.getString("sexo"));
                Func.setnBI(rs.getString("nBI"));
                Func.setUsuarioLogin(rs.getString("usuarioLogin"));
                Func.setSenhaLogin(rs.getString("senhaLogin"));
                cl.add(Func);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
    
    
        public void editar(modelFuncionario k )
        {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            
        try {
            
            String sql = "UPDATE tbl_funcionario SET nomeFun=? , telefoneFun=? , cargoFun=?, dataNascimento=? , morada=? , sexo=? , nBI=? , usuarioLogin=? , senhaLogin=? , WHERE id_funcionario=? ";
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, k.getNomeFun());
            stmt.setInt(2, k.getTelefoneFun());
            stmt.setString(3, k.getCargoFun());
            stmt.setString(4, k.getDataNascimento());
            stmt.setString(5, k.getMorada());
            stmt.setString(6, k.getSexo());
            stmt.setString(7, k.getnBI());
            stmt.setString(8, k.getUsuarioLogin());
            stmt.setString(9, k.getSenhaLogin());
            stmt.setInt(10, k.getId_funcionario());
            stmt.execute();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir funcionario");
        }
     
     }
        // Obter os funcionario pelos seus respctivos id's ;
        public modelFuncionario getFuncionario(int o)
        {
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            
            try{
                String sql = "SELECT * FROM tbl_funcionario WHERE id_funcionario=?";
                stmt = con.prepareStatement(sql);
                
                stmt.setInt(1, o);
                ResultSet rs = stmt.executeQuery();
                
                modelFuncionario DD = new modelFuncionario();
                
                rs.first();
                DD.setId_funcionario(o);
                DD.setNomeFun(rs.getString("nomeFun"));
                DD.setTelefoneFun(rs.getInt("telefoneFun"));
                DD.setCargoFun(rs.getString("cargoFun"));
                DD.setDataNascimento(rs.getString("dataNascimento"));
                DD.setMorada(rs.getString("morada"));
                DD.setSexo(rs.getString("sexo"));
                DD.setnBI(rs.getString("nBI"));
                DD.setUsuarioLogin(rs.getString("usuarioLogin"));
                DD.setSenhaLogin(rs.getString("senhaLogin"));
                
              return DD;
                
            }
            catch(Exception ex)
            {
                return null;
            }
            
 
        }
          
    
    
    // Este arrayList ele vai receber os dados da BD na tbl_funcionario e listar por nome;
    public List<modelFuncionario> readForNome1(String k){
            
            Connection con = ConnectionFactory.getConnection();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            
        List<modelFuncionario> cl = new ArrayList();   
            
        try {
            stmt = con.prepareStatement("SELECT * FROM tbl_funcionario WHERE nomeFun LIKE ?");
            stmt.setString(1, "%"+k+"%");
            rs = stmt.executeQuery();
            
            while(rs.next())
            {
                modelFuncionario Func = new modelFuncionario();
                Func.setId_funcionario(rs.getInt("id_funcionario"));
                Func.setNomeFun(rs.getString("nomeFun"));
                Func.setMorada(rs.getString("morada"));
                Func.setTelefoneFun(rs.getInt("telefoneFun"));
                Func.setCargoFun(rs.getString("cargoFun"));
                Func.setDataNascimento(rs.getString("dataNascimento"));
                Func.setSexo(rs.getString("sexo"));
                Func.setnBI(rs.getString("nBI"));
                Func.setUsuarioLogin(rs.getString("usuarioLogin"));
                Func.setSenhaLogin(rs.getString("senhaLogin"));
                cl.add(Func);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            
        }
          ConnectionFactory.closeConnection(con, stmt, rs);
        
         return cl;              
        }
    
    
}
