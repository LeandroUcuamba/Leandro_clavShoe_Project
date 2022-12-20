/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.modelProdutoFornecedor;
import DAO.ProdutoFornecedorDAO;
import view.validarCampos;
/**
 *
 * @author Leandro Ucuamba
 */
public class viewProdutoFornecedor extends javax.swing.JFrame {

    /**
     * Creates new form viewProdutoFornecedor
     */
    public viewProdutoFornecedor() {
        initComponents();
        
        btnHome4.setBackground(new java.awt.Color(0, 0, 0, 0));
    }
    
    
    @SuppressWarnings("unchecked")
    
    validarCampos k = new validarCampos();
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdPF = new javax.swing.JTextField();
        txtQuantidadePF = new javax.swing.JTextField();
        txtDataPF = new javax.swing.JTextField();
        txtIdFornecedorPF = new javax.swing.JTextField();
        txtNifLojaPF = new javax.swing.JTextField();
        txtIdProdutoPF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricaoArea = new javax.swing.JTextArea();
        btnCancel5 = new javax.swing.JButton();
        btnGuardar5 = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        btnHome4 = new javax.swing.JButton();
        lblPrincipla4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descrição:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantidade:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id_Fornecedor:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nif_Loja:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id_Produto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        txtIdPF.setEnabled(false);
        txtIdPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPFActionPerformed(evt);
            }
        });
        jPanel1.add(txtIdPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 100, 30));

        txtQuantidadePF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadePFKeyTyped(evt);
            }
        });
        jPanel1.add(txtQuantidadePF, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, 30));

        txtDataPF.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtDataPF.setText("ANO/MES/DIA");
        txtDataPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataPFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataPFFocusLost(evt);
            }
        });
        jPanel1.add(txtDataPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 200, 30));

        txtIdFornecedorPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdFornecedorPFActionPerformed(evt);
            }
        });
        txtIdFornecedorPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdFornecedorPFKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdFornecedorPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 140, 30));

        txtNifLojaPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNifLojaPFKeyTyped(evt);
            }
        });
        jPanel1.add(txtNifLojaPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 170, 30));

        txtIdProdutoPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProdutoPFActionPerformed(evt);
            }
        });
        txtIdProdutoPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdProdutoPFKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdProdutoPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 120, 30));

        txtDescricaoArea.setColumns(20);
        txtDescricaoArea.setRows(5);
        jScrollPane1.setViewportView(txtDescricaoArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 290, 130));

        btnCancel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        btnCancel5.setText("Cancelar");
        btnCancel5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, 100, -1));

        btnGuardar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guardar.png"))); // NOI18N
        btnGuardar5.setText("Guardar");
        btnGuardar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 110, -1));

        btnListar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.png"))); // NOI18N
        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        jPanel1.add(btnListar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 130, 26));

        btnHome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome4, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 70, 50, 30));

        lblPrincipla4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sub.png"))); // NOI18N
        jPanel1.add(lblPrincipla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdFornecedorPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdFornecedorPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdFornecedorPFActionPerformed

    private void txtIdProdutoPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProdutoPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProdutoPFActionPerformed

    private void txtDataPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataPFFocusGained
        // TODO add your handling code here:
        if(txtDataPF.getText().trim().equals("ANO/MES/DIA"))
        {
            txtDataPF.setText("");
        }
    }//GEN-LAST:event_txtDataPFFocusGained

    private void txtDataPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataPFFocusLost
        // TODO add your handling code here:
        if(txtDataPF.getText().trim().equals(""))
        {
            txtDataPF.setText("ANO/MES/DIA");
        }
        
    }//GEN-LAST:event_txtDataPFFocusLost

    private void btnCancel5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel5ActionPerformed
        // TODO add your handling code here:
        
        txtDataPF.setText("");
        txtDescricaoArea.setText("");
        txtNifLojaPF.setText("");
        txtQuantidadePF.setText("");
        txtIdProdutoPF.setText("");
        txtIdFornecedorPF.setText("");
        txtIdPF.setText("");
    }//GEN-LAST:event_btnCancel5ActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new viewProdutoFornecedor1().setVisible(true);
    }//GEN-LAST:event_btnListarActionPerformed

    private void txtIdPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPFActionPerformed

    private void btnGuardar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar5ActionPerformed
        // TODO add your handling code here:
        
        modelProdutoFornecedor p = new modelProdutoFornecedor();
        ProdutoFornecedorDAO dao = new ProdutoFornecedorDAO();
        
        p.setDescricao(txtDescricaoArea.getText());
        p.setDataHoraFor(txtDataPF.getText());
        p.setQuantidade(Integer.parseInt(txtQuantidadePF.getText()));
        p.setNifLoja(txtNifLojaPF.getText());
        p.setId_fornecedor(Integer.parseInt(txtIdFornecedorPF.getText()));
        p.setId_produto(Integer.parseInt(txtIdProdutoPF.getText()));
        dao.create(p);
        
        txtDataPF.setText("");
        txtDescricaoArea.setText("");
        txtNifLojaPF.setText("");
        txtQuantidadePF.setText("");
        txtIdProdutoPF.setText("");
        txtIdFornecedorPF.setText("");
        txtIdPF.setText("");
        
        new viewProdutoFornecedor1().readJTable();
    }//GEN-LAST:event_btnGuardar5ActionPerformed

    private void btnHome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new viewPrincipal().setVisible(true);
    }//GEN-LAST:event_btnHome4ActionPerformed

    private void txtIdProdutoPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProdutoPFKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtIdProdutoPFKeyTyped

    private void txtQuantidadePFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadePFKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtQuantidadePFKeyTyped

    private void txtIdFornecedorPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdFornecedorPFKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtIdFornecedorPFKeyTyped

    private void txtNifLojaPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNifLojaPFKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtNifLojaPFKeyTyped

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
            java.util.logging.Logger.getLogger(viewProdutoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProdutoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProdutoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProdutoFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewProdutoFornecedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel5;
    private javax.swing.JButton btnGuardar5;
    private javax.swing.JButton btnHome4;
    private javax.swing.JButton btnListar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPrincipla4;
    public static javax.swing.JTextField txtDataPF;
    public static javax.swing.JTextArea txtDescricaoArea;
    public static javax.swing.JTextField txtIdFornecedorPF;
    public static javax.swing.JTextField txtIdPF;
    public static javax.swing.JTextField txtIdProdutoPF;
    public static javax.swing.JTextField txtNifLojaPF;
    public static javax.swing.JTextField txtQuantidadePF;
    // End of variables declaration//GEN-END:variables
}
