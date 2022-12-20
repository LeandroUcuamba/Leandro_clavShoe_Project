/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.modelLoja;
import DAO.LojaDAO;
import view.validarCampos;

/**
 *
 * @author Leandro Ucuamba
 */
public class viewLoja extends javax.swing.JFrame {

    /**
     * Creates new form viewLoja
     */
    public viewLoja() {
        initComponents();
        
        btnHome.setBackground(new java.awt.Color(0, 0, 0, 0));
        
        readJTableLoja();
    }

    public void readJTableLoja() {
        DefaultTableModel modelo = (DefaultTableModel) jtLoja.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        LojaDAO cliDao = new LojaDAO();

        // este é o ForEach;
        for (modelLoja pesqCli : cliDao.read3()) {
            modelo.addRow(new Object[]{
                pesqCli.getNifLoja(),
                pesqCli.getNomeLoja(),
                pesqCli.getLocalizacao(),
                pesqCli.getBairro(),
                
            });
        }

    }
    
    validarCampos k = new validarCampos();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnif = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtLocalizacao = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnActualiz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtLoja = new javax.swing.JTable();
        lblPrincipal1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 70, 50, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nif:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Localização:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bairro:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        txtnif.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnifKeyTyped(evt);
            }
        });
        jPanel1.add(txtnif, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 30));

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeKeyTyped(evt);
            }
        });
        jPanel1.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 180, 30));

        txtLocalizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalizacaoActionPerformed(evt);
            }
        });
        jPanel1.add(txtLocalizacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 150, 30));
        jPanel1.add(txtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 180, 30));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 530, 100, 30));

        btnActualiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar.png"))); // NOI18N
        btnActualiz.setText("Actualizar");
        btnActualiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 120, 30));

        jtLoja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nif", "Nome da loja", "Localizacao", "Bairro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtLoja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtLojaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtLoja);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 500, 150));

        lblPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sub.png"))); // NOI18N
        jPanel1.add(lblPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtLocalizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalizacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalizacaoActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        
        txtnif.setText("");
        txtNome.setText("");
        txtLocalizacao.setText("");
        txtBairro.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void jtLojaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtLojaKeyPressed
        // TODO add your handling code here:
        
        if (jtLoja.getSelectedRow() != -1) {
            
            txtnif.setText(jtLoja.getValueAt(jtLoja.getSelectedRow(), 0).toString());
            txtNome.setText(jtLoja.getValueAt(jtLoja.getSelectedRow(), 1).toString());
            txtLocalizacao.setText(jtLoja.getValueAt(jtLoja.getSelectedRow(), 2).toString());
            txtBairro.setText(jtLoja.getValueAt(jtLoja.getSelectedRow(), 3).toString());
           
            
        }
        
    }//GEN-LAST:event_jtLojaKeyPressed

    private void btnActualizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizActionPerformed
        // TODO add your handling code here:
        
        if (jtLoja.getSelectedRow() != -1) {
             
            modelLoja p = new modelLoja();
            LojaDAO dao = new LojaDAO();
            
            p.setNifLoja(txtnif.getText());
            p.setNomeLoja(txtNome.getText());
            p.setLocalizacao(txtLocalizacao.getText());
            p.setBairro(txtBairro.getText());
            
            dao.update(p);
            
            txtnif.setText("");
            txtNome.setText("");
            txtLocalizacao.setText("");
            txtBairro.setText("");
            
            readJTableLoja();
            
        }
        
    }//GEN-LAST:event_btnActualizActionPerformed

    private void txtnifKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnifKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtnifKeyTyped

    private void txtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyTyped
        // TODO add your handling code here:
        k.validarNumeros(evt);
    }//GEN-LAST:event_txtNomeKeyTyped

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
            java.util.logging.Logger.getLogger(viewLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLoja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLoja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualiz;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtLoja;
    private javax.swing.JLabel lblPrincipal1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtLocalizacao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtnif;
    // End of variables declaration//GEN-END:variables
}
