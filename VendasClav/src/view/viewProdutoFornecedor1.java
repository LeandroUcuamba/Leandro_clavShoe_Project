/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import static view.viewProdutoFornecedor.txtDataPF;
import static view.viewProdutoFornecedor.txtDescricaoArea;
import static view.viewProdutoFornecedor.txtIdFornecedorPF;
import static view.viewProdutoFornecedor.txtIdPF;
import static view.viewProdutoFornecedor.txtIdProdutoPF;
import static view.viewProdutoFornecedor.txtNifLojaPF;
import static view.viewProdutoFornecedor.txtQuantidadePF;
import model.modelProdutoFornecedor;
import DAO.ProdutoFornecedorDAO;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
 import javax.swing.JOptionPane;
import view.validarCampos;


public class viewProdutoFornecedor1 extends javax.swing.JFrame {

    /**
     * Creates new form viewProdutoFornecedor1
     */
    public viewProdutoFornecedor1() {
        initComponents();
        
        btnHomeh.setBackground(new java.awt.Color(0, 0, 0, 0));
        readJTable();
    }
    
    
        public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtPF.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        ProdutoFornecedorDAO PFdor = new ProdutoFornecedorDAO();

        // este é o ForEach;
        for (modelProdutoFornecedor pesqPF : PFdor.read()) {
            modelo.addRow(new Object[]{
                pesqPF.getId_produtoFor(),
                pesqPF.getDescricao(),
                pesqPF.getQuantidade(),
                pesqPF.getNifLoja(),
                pesqPF.getDataHoraFor(),
                pesqPF.getId_fornecedor(),
                pesqPF.getId_produto()
                
            });
        }

    }
        
        public void readJTableForId(int k) {
        DefaultTableModel modelo = (DefaultTableModel) jtPF.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        ProdutoFornecedorDAO PFdor = new ProdutoFornecedorDAO();

        // este é o ForEach;
        for (modelProdutoFornecedor pesqPF : PFdor.readForId(k)) {
            modelo.addRow(new Object[]{
                pesqPF.getId_produtoFor(),
                pesqPF.getDescricao(),
                pesqPF.getQuantidade(),
                pesqPF.getNifLoja(),
                pesqPF.getDataHoraFor(),
                pesqPF.getId_fornecedor(),
                pesqPF.getId_produto()
                
            });
        }

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRemover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPF = new javax.swing.JTable();
        btnHomeh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/RemoverN.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemover, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 110, 30));

        jtPF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id:", "Descrição", "Quantidade", "Data", "Id do fornecedor", "Nif da Loja", "Id do produto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtPFKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jtPF);
        if (jtPF.getColumnModel().getColumnCount() > 0) {
            jtPF.getColumnModel().getColumn(0).setMinWidth(10);
            jtPF.getColumnModel().getColumn(0).setMaxWidth(70);
            jtPF.getColumnModel().getColumn(2).setMaxWidth(90);
            jtPF.getColumnModel().getColumn(4).setPreferredWidth(120);
            jtPF.getColumnModel().getColumn(4).setMaxWidth(180);
            jtPF.getColumnModel().getColumn(5).setPreferredWidth(120);
            jtPF.getColumnModel().getColumn(5).setMaxWidth(180);
            jtPF.getColumnModel().getColumn(6).setPreferredWidth(120);
            jtPF.getColumnModel().getColumn(6).setMaxWidth(180);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 930, 210));

        btnHomeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomehActionPerformed(evt);
            }
        });
        jPanel1.add(btnHomeh, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 50, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sub.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 1060, 660));

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

    private void btnHomehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomehActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.dispose();
        new viewPrincipal().setVisible(true);
    }//GEN-LAST:event_btnHomehActionPerformed

    private void jtPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPFKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jtPFKeyPressed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
        
        // getSeletedRow() -> linha selecionada;
        if (jtPF.getSelectedRow() != -1) {
             
            modelProdutoFornecedor p = new modelProdutoFornecedor();
            ProdutoFornecedorDAO dao = new ProdutoFornecedorDAO();
            
            p.setId_produtoFor((int)jtPF.getValueAt(jtPF.getSelectedRow(), 0));
            
            dao.delete(p);

            // codigo para limpar campo apois o registro;
        txtDataPF.setText("");
        txtDescricaoArea.setText("");
        txtNifLojaPF.setText("");
        txtQuantidadePF.setText("");
        txtIdProdutoPF.setText("");
        txtIdFornecedorPF.setText("");
        txtIdPF.setText("");
            //fecho da limpa nos campos
            readJTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "selecciona um linha para excluir");
        }
        
    }//GEN-LAST:event_btnRemoverActionPerformed

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
            java.util.logging.Logger.getLogger(viewProdutoFornecedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProdutoFornecedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProdutoFornecedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProdutoFornecedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewProdutoFornecedor1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHomeh;
    private javax.swing.JButton btnRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jtPF;
    // End of variables declaration//GEN-END:variables
}
