/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import DAO.FornecedorDAO;
import model.modelFornecedor;
import view.validarCampos;
/**
 *
 * @author Leandro Ucuamba
 */
public class viewFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form viewFornecedor
     */
    public viewFornecedor() {
        initComponents();
        
        btnHome.setBackground(new java.awt.Color(0, 0, 0, 0));
        readJTableFornecedor();
    }

    
    public void readJTableFornecedor() {
        DefaultTableModel modelo = (DefaultTableModel) jtFornecedor.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        FornecedorDAO FornDao = new FornecedorDAO();

        // este é o ForEach;
        for (modelFornecedor pesqForn : FornDao.read4()) {
            modelo.addRow(new Object[]{
                pesqForn.getId_fornecedor(),
                pesqForn.getNomeFor(),
                pesqForn.getNifFor(),
                pesqForn.getEnderecoFor(),
                pesqForn.getTelefone()
                
            });
        }

    }
    
    
    public void readJTableFornecedorName(String UX) {
        DefaultTableModel modelo = (DefaultTableModel) jtFornecedor.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        FornecedorDAO FornDao = new FornecedorDAO();

        // este é o ForEach;
        for (modelFornecedor pesqForn : FornDao.readForNome4(UX)) {
            modelo.addRow(new Object[]{
                pesqForn.getId_fornecedor(),
                pesqForn.getNomeFor(),
                pesqForn.getNifFor(),
                pesqForn.getEnderecoFor(),
                pesqForn.getTelefone()
                
            });
        }

    }
    
    
    validarCampos k = new validarCampos();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdFor = new javax.swing.JTextField();
        txtNomeFor = new javax.swing.JTextField();
        txtNifFor = new javax.swing.JTextField();
        txtEnderecoFor = new javax.swing.JTextField();
        txtTelefoneFor = new javax.swing.JTextField();
        btnCancel1 = new javax.swing.JButton();
        btnRemover1 = new javax.swing.JButton();
        btnActualizar1 = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtFornecedor = new javax.swing.JTable();
        lblPrincipal2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 50, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nif:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Endereço:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        txtIdFor.setEnabled(false);
        jPanel1.add(txtIdFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 120, 30));

        txtNomeFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeForActionPerformed(evt);
            }
        });
        txtNomeFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeForKeyTyped(evt);
            }
        });
        jPanel1.add(txtNomeFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 200, 30));

        txtNifFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNifForKeyTyped(evt);
            }
        });
        jPanel1.add(txtNifFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 220, 30));
        jPanel1.add(txtEnderecoFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 180, 30));

        txtTelefoneFor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneForKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefoneFor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 180, 30));

        btnCancel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        btnCancel1.setText("Cancelar");
        btnCancel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, 110, 30));

        btnRemover1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/RemoverN.png"))); // NOI18N
        btnRemover1.setText("Remover");
        btnRemover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemover1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 110, 30));

        btnActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar.png"))); // NOI18N
        btnActualizar1.setText("Actualizar");
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 550, 110, 30));

        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guardar.png"))); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, 120, 30));

        jtFornecedor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Nif", "Endereço", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtFornecedor.setPreferredSize(new java.awt.Dimension(300, 30));
        jtFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtFornecedorKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtFornecedor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 560, 220));

        lblPrincipal2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sub.png"))); // NOI18N
        jPanel1.add(lblPrincipal2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new viewPrincipal().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        // TODO add your handling code here:
        
        if (jtFornecedor.getSelectedRow() != -1) {
            
        modelFornecedor p = new modelFornecedor();
        FornecedorDAO dao = new FornecedorDAO();
        p.setNomeFor(txtNomeFor.getText());
        p.setNifFor(txtNifFor.getText());
        p.setEnderecoFor(txtEnderecoFor.getText());
        p.setTelefone(txtTelefoneFor.getText());
        p.setId_fornecedor((int)jtFornecedor.getValueAt(jtFornecedor.getSelectedRow(), 0));
 
        dao.update(p);
        
        txtIdFor.setText("");
        txtNifFor.setText("");
        txtNomeFor.setText("");
        txtTelefoneFor.setText("");
        txtEnderecoFor.setText("");
        
        readJTableFornecedor();
            
        }
        
        
    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void txtNomeForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeForActionPerformed

    private void btnCancel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel1ActionPerformed
        // TODO add your handling code here:
        
        txtIdFor.setText("");
        txtNifFor.setText("");
        txtNomeFor.setText("");
        txtTelefoneFor.setText("");
        txtEnderecoFor.setText("");
       
        
    }//GEN-LAST:event_btnCancel1ActionPerformed

    private void jtFornecedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtFornecedorKeyPressed
        // TODO add your handling code here:
        
        if(jtFornecedor.getSelectedRow() != -1) {
            
            txtNomeFor.setText(jtFornecedor.getValueAt(jtFornecedor.getSelectedRow(), 1).toString());
            txtNifFor.setText(jtFornecedor.getValueAt(jtFornecedor.getSelectedRow(), 2).toString());
            txtEnderecoFor.setText(jtFornecedor.getValueAt(jtFornecedor.getSelectedRow(), 3).toString());
            txtTelefoneFor.setText(jtFornecedor.getValueAt(jtFornecedor.getSelectedRow(), 4).toString());
            
        }
        
    }//GEN-LAST:event_jtFornecedorKeyPressed

    private void btnRemover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemover1ActionPerformed
        // TODO add your handling code here:
        
        if (jtFornecedor.getSelectedRow() != -1) {
             
            modelFornecedor p = new modelFornecedor();
            FornecedorDAO dao = new FornecedorDAO();
            
            p.setId_fornecedor((int)jtFornecedor.getValueAt(jtFornecedor.getSelectedRow(), 0));
            
            dao.delete(p);
            
            
            txtIdFor.setText("");
            txtNifFor.setText("");
            txtNomeFor.setText("");
            txtTelefoneFor.setText("");
            txtEnderecoFor.setText("");
        
            readJTableFornecedor();
            
            
        }
        
    }//GEN-LAST:event_btnRemover1ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
        
        modelFornecedor p = new modelFornecedor();
        FornecedorDAO dao = new FornecedorDAO();
        p.setNomeFor(txtNomeFor.getText());
        p.setNifFor(txtNifFor.getText());
        p.setEnderecoFor(txtEnderecoFor.getText());
        p.setTelefone(txtTelefoneFor.getText());
 
        dao.create(p);
        
        txtIdFor.setText("");
        txtNifFor.setText("");
        txtNomeFor.setText("");
        txtTelefoneFor.setText("");
        txtEnderecoFor.setText("");
        
        
        readJTableFornecedor();
        
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtNomeForKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeForKeyTyped
        // TODO add your handling code here:
        k.validarNumeros(evt);
    }//GEN-LAST:event_txtNomeForKeyTyped

    private void txtNifForKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNifForKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtNifForKeyTyped

    private void txtTelefoneForKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneForKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtTelefoneForKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnCancel1;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRemover1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtFornecedor;
    private javax.swing.JLabel lblPrincipal2;
    private javax.swing.JTextField txtEnderecoFor;
    private javax.swing.JTextField txtIdFor;
    private javax.swing.JTextField txtNifFor;
    private javax.swing.JTextField txtNomeFor;
    private javax.swing.JTextField txtTelefoneFor;
    // End of variables declaration//GEN-END:variables
}
