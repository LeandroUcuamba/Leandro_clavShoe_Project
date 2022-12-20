/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ProdutoDAO;
import model.modelProduto;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import view.validarCampos;

/**
 *
 * @author Leandro Ucuamba
 */
public class viewProduto extends javax.swing.JFrame {

    /**
     * Creates new form viewProduto
     */
    public viewProduto() {
        initComponents();
        
        btnHome2.setBackground(new java.awt.Color(0,0,0,0));
        readJTable2();
    }

    public void readJTable2() {
        DefaultTableModel modelo = (DefaultTableModel) jtProduto.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        ProdutoDAO proDao = new ProdutoDAO();

        // este é o ForEach;
        for (modelProduto pesqProd : proDao.read()) {
            modelo.addRow(new Object[]{
                pesqProd.getId_produto(),
                pesqProd.getMarca(),
                pesqProd.getModelo(),
                pesqProd.getTamanho(),
                pesqProd.getPreco(),
                pesqProd.getCategoria()
            });
        }

    }
    
    
    public void readJTableForNome2(String passNome) {
        DefaultTableModel modelo = (DefaultTableModel) jtProduto.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        ProdutoDAO proDao = new ProdutoDAO();

        // este é o ForEach;
        for (modelProduto pesqProd : proDao.readForNome2(passNome)) {
            modelo.addRow(new Object[]{
                pesqProd.getId_produto(),
                pesqProd.getMarca(),
                pesqProd.getModelo(),
                pesqProd.getTamanho(),
                pesqProd.getPreco(),
                pesqProd.getCategoria()
            });
        }

    }
    
    
    validarCampos k = new validarCampos();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIdProd = new javax.swing.JTextField();
        txtMarcaProd = new javax.swing.JTextField();
        txtModeloProd = new javax.swing.JTextField();
        txtTamanhoProd = new javax.swing.JTextField();
        txtPrecoProd = new javax.swing.JTextField();
        txtCategoriaProd = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProduto = new javax.swing.JTable();
        btnHome2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modelo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tamanho:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Preço:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, -1, -1));

        txtIdProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdProd.setEnabled(false);
        jPanel1.add(txtIdProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 181, 220, 30));

        txtMarcaProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMarcaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaProdActionPerformed(evt);
            }
        });
        jPanel1.add(txtMarcaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 231, 200, 30));

        txtModeloProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtModeloProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 281, 190, 30));

        txtTamanhoProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtTamanhoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 331, 170, 30));

        txtPrecoProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrecoProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecoProdKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecoProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 381, 190, 30));

        txtCategoriaProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCategoriaProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCategoriaProdKeyTyped(evt);
            }
        });
        jPanel1.add(txtCategoriaProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 431, 170, 30));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 100, 30));

        btnGuardar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guardar.png"))); // NOI18N
        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 560, 100, 30));

        btnRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/RemoverN.png"))); // NOI18N
        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, 30));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 560, -1, 30));

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Produto", "Marca", "Modelo", "Tamanho", "Preço", "Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtProdutoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtProduto);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 510, 260));

        btnHome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 70, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sub.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void txtMarcaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaProdActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        txtCategoriaProd.setText("");
        txtIdProd.setText("");
        txtMarcaProd.setText("");
        txtModeloProd.setText("");
        txtPrecoProd.setText("");
        txtTamanhoProd.setText("");
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnHome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new viewPrincipal().setVisible(true);
    }//GEN-LAST:event_btnHome2ActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        // TODO add your handling code here:
        
        modelProduto p = new modelProduto();
        ProdutoDAO dao = new ProdutoDAO();
        
        p.setMarca(txtMarcaProd.getText());
        p.setModelo(txtModeloProd.getText());
        p.setTamanho(txtTamanhoProd.getText());
        p.setCategoria(txtCategoriaProd.getText());
        p.setPreco(Double.parseDouble(txtPrecoProd.getText()));
        
        dao.create(p);
        
        readJTable2();
        // limpar campos;
        txtCategoriaProd.setText("");
        txtIdProd.setText("");
        txtMarcaProd.setText("");
        txtModeloProd.setText("");
        txtPrecoProd.setText("");
        txtTamanhoProd.setText("");
        
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        
        if (jtProduto.getSelectedRow() != -1) {
             
            modelProduto p = new modelProduto();
            ProdutoDAO dao = new ProdutoDAO();
            
            p.setMarca(txtMarcaProd.getText());
            p.setModelo(txtModeloProd.getText());
            p.setTamanho(txtTamanhoProd.getText());
            p.setPreco(Double.parseDouble(txtPrecoProd.getText()));
            p.setCategoria(txtCategoriaProd.getText());
            p.setId_produto((int)jtProduto.getValueAt(jtProduto.getSelectedRow(), 0));
            
            dao.update(p);

            // codigo para limpar campo apois o registro;
            txtCategoriaProd.setText("");
            txtIdProd.setText("");
            txtMarcaProd.setText("");
            txtModeloProd.setText("");
            txtPrecoProd.setText("");
            txtTamanhoProd.setText("");
            
            //fecho da limpa nos campos
            readJTable2();
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void jtProdutoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtProdutoKeyPressed
        // TODO add your handling code here:
        
        if (jtProduto.getSelectedRow() != -1) {
           
            
            txtMarcaProd.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 1).toString());
            txtModeloProd.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 2).toString());
            txtTamanhoProd.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 3).toString());
            txtPrecoProd.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 4).toString());
            txtCategoriaProd.setText(jtProduto.getValueAt(jtProduto.getSelectedRow(), 5).toString());
            
        }
        
    }//GEN-LAST:event_jtProdutoKeyPressed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        
        if (jtProduto.getSelectedRow() != -1) {
             
            modelProduto p = new modelProduto();
            ProdutoDAO dao = new ProdutoDAO();
            
            p.setId_produto((int)jtProduto.getValueAt(jtProduto.getSelectedRow(), 0));
            
            dao.delete(p);

            // codigo para limpar campo apois o registro;
            txtCategoriaProd.setText("");
            txtIdProd.setText("");
            txtMarcaProd.setText("");
            txtModeloProd.setText("");
            txtPrecoProd.setText("");
            txtTamanhoProd.setText("");
            
            //fecho da limpa nos campos
            readJTable2();
        }
        
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtCategoriaProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCategoriaProdKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtCategoriaProdKeyTyped

    private void txtPrecoProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecoProdKeyTyped
        // TODO add your handling code here:
        k.validarNumeros(evt);
    }//GEN-LAST:event_txtPrecoProdKeyTyped

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
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JButton btnHome2;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtProduto;
    private javax.swing.JTextField txtCategoriaProd;
    private javax.swing.JTextField txtIdProd;
    private javax.swing.JTextField txtMarcaProd;
    private javax.swing.JTextField txtModeloProd;
    private javax.swing.JTextField txtPrecoProd;
    private javax.swing.JTextField txtTamanhoProd;
    // End of variables declaration//GEN-END:variables
}
