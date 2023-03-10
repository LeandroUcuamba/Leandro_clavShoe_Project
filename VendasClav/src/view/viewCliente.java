/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.ClienteDAO;
import model.modelCliente;
import javax.swing.table.DefaultTableModel; // importado para da jtCliente;
import javax.swing.table.TableRowSorter; // importado para da jtCliente;
import javax.swing.JOptionPane;
import view.validarCampos;
/**
 *
 * @author Leandro Ucuamba
 */
public class viewCliente extends javax.swing.JFrame {

    /**
     * Creates new form viewCliente
     */
    public viewCliente() { // construtor
        initComponents();
        
        btnHome.setBackground(new java.awt.Color(0,0,0,0));

        readJTable(); // apois inicializar a tela este metodo (construtor) fará com que ele ja apresente resultdo na tela;
    }

    public void readJTable() {
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        ClienteDAO cliDao = new ClienteDAO();

        // este é o ForEach;
        for (modelCliente pesqCli : cliDao.read()) {
            modelo.addRow(new Object[]{
              
                
                pesqCli.getId_cliente(),
                pesqCli.getNomeCliente(),
                pesqCli.getTelefoneCliente(),
                pesqCli.getNifCliente()
            
            
            });
        }

    }
    
    
    
    public void readJTableForNome(String nomeMeu) {
        DefaultTableModel modelo = (DefaultTableModel) jtCliente.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        ClienteDAO cliDao = new ClienteDAO();

        // este é o ForEach;
        for (modelCliente pesqCli : cliDao.readForNome(nomeMeu)) {
            modelo.addRow(new Object[]{
                pesqCli.getId_cliente(),
                pesqCli.getNomeCliente(),
                pesqCli.getTelefoneCliente(),
                pesqCli.getNifCliente()
            });
        }

    }
    
    
    validarCampos k = new validarCampos();
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdCliente = new javax.swing.JTextField();
        txtTelefoneCliente = new javax.swing.JTextField();
        txtNomeCliente = new javax.swing.JTextField();
        txtNifCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCliente = new javax.swing.JTable();
        btnCancelarCli = new javax.swing.JButton();
        btnRemoverCli = new javax.swing.JButton();
        btnSalvarCli = new javax.swing.JButton();
        btnAtualizarCli = new javax.swing.JButton();
        txtPesq = new javax.swing.JTextField();
        btnPesq = new javax.swing.JButton();
        btnTodos = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        imageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("telefone:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("nome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("nif:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        txtIdCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdCliente.setEnabled(false);
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 110, 30));

        txtTelefoneCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTelefoneCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefoneClienteKeyTyped(evt);
            }
        });
        jPanel1.add(txtTelefoneCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, 200, 30));

        txtNomeCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomeClienteKeyTyped(evt);
            }
        });
        jPanel1.add(txtNomeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, 30));

        txtNifCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtNifCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNifClienteKeyTyped(evt);
            }
        });
        jPanel1.add(txtNifCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 200, 30));

        jtCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jtCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "nome", "telefone", "nif"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        jtCliente.setGridColor(new java.awt.Color(51, 51, 51));
        jtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtClienteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtCliente);
        if (jtCliente.getColumnModel().getColumnCount() > 0) {
            jtCliente.getColumnModel().getColumn(0).setMinWidth(25);
            jtCliente.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 560, 260));

        btnCancelarCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        btnCancelarCli.setText("cancelar");
        btnCancelarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 577, -1, 30));

        btnRemoverCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRemoverCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eliCadastro.png"))); // NOI18N
        btnRemoverCli.setText("remover");
        btnRemoverCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoverCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 577, -1, 30));

        btnSalvarCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/guardar.png"))); // NOI18N
        btnSalvarCli.setText("salvar");
        btnSalvarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalvarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(403, 577, 100, 30));

        btnAtualizarCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAtualizarCli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/actualizar.png"))); // NOI18N
        btnAtualizarCli.setText("atualizar");
        btnAtualizarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCliActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtualizarCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 577, -1, 30));

        txtPesq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPesq.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPesqFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPesqFocusLost(evt);
            }
        });
        txtPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesqActionPerformed(evt);
            }
        });
        txtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesqKeyTyped(evt);
            }
        });
        jPanel1.add(txtPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 330, 30));

        btnPesq.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.png"))); // NOI18N
        btnPesq.setText("pesquisar");
        btnPesq.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.png"))); // NOI18N
        btnPesq.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.png"))); // NOI18N
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 224, -1, 30));

        btnTodos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnTodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.png"))); // NOI18N
        btnTodos.setText("todos");
        btnTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTodosActionPerformed(evt);
            }
        });
        jPanel1.add(btnTodos, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 224, 90, 30));

        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, 60, 40));

        imageLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        imageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sub.png"))); // NOI18N
        jPanel1.add(imageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnSalvarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCliActionPerformed
        // TODO add your handling code here:

        modelCliente p = new modelCliente();
        ClienteDAO dao = new ClienteDAO();
        p.setNomeCliente(txtNomeCliente.getText());
        p.setTelefoneCliente(Integer.parseInt(txtTelefoneCliente.getText()));
        p.setNifCliente(txtNifCliente.getText());
        dao.create(p);

        // codigo para limpar campo apois o registro;
        txtIdCliente.setText("");
        txtNifCliente.setText("");
        txtNomeCliente.setText("");
        txtTelefoneCliente.setText("");
        //fecho da limpa nos campos
        readJTable(); // metodo responsavel por apresentar todos cliente ja cadastrados logo a tela inicie;
    }//GEN-LAST:event_btnSalvarCliActionPerformed

    private void jtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtClienteKeyReleased
        // TODO add your handling code here:

        if (jtCliente.getSelectedRow() != -1) {
            txtNomeCliente.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 1).toString());
            txtTelefoneCliente.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 2).toString());
            txtNifCliente.setText(jtCliente.getValueAt(jtCliente.getSelectedRow(), 3).toString());
            
        }

    }//GEN-LAST:event_jtClienteKeyReleased

    
    // Accao do botao actualizar (alterar);
    private void btnAtualizarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCliActionPerformed
        // TODO add your handling code here;
         if (jtCliente.getSelectedRow() != -1) {
             
            modelCliente p = new modelCliente();
            ClienteDAO dao = new ClienteDAO();
            
            p.setNomeCliente(txtNomeCliente.getText());
            p.setTelefoneCliente(Integer.parseInt(txtTelefoneCliente.getText()));
            p.setNifCliente(txtNifCliente.getText());
            p.setId_cliente((int)jtCliente.getValueAt(jtCliente.getSelectedRow(), 0));
            
            dao.update(p);

            // codigo para limpar campo apois o registro;
            txtNifCliente.setText("");
            txtNomeCliente.setText("");
            txtTelefoneCliente.setText("");
            //fecho da limpa nos campos
            readJTable();
        }

    }//GEN-LAST:event_btnAtualizarCliActionPerformed

    private void btnRemoverCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverCliActionPerformed
        // TODO add your handling code here:
        
        // getSeletedRow() -> linha selecionada;
        if (jtCliente.getSelectedRow() != -1) {
             
            modelCliente p = new modelCliente();
            ClienteDAO dao = new ClienteDAO();
            
            p.setId_cliente((int)jtCliente.getValueAt(jtCliente.getSelectedRow(), 0));
            
            dao.delete(p);

            // codigo para limpar campo apois o registro;
            txtNifCliente.setText("");
            txtNomeCliente.setText("");
            txtTelefoneCliente.setText("");
            //fecho da limpa nos campos
            readJTable();
        }
        else{
            JOptionPane.showMessageDialog(null, "selecciona um cliente para excluir");
        }
                      
        
    }//GEN-LAST:event_btnRemoverCliActionPerformed

    private void txtPesqFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesqFocusGained
        // TODO add your handling code here:
        // evento quando txtField é seleccionado;
         if(txtPesq.getText().trim().equals("pesquisar por nome"))
        {
            txtPesq.setText("");
        }
    }//GEN-LAST:event_txtPesqFocusGained

    private void txtPesqFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPesqFocusLost
        // TODO add your handling code here:
        //evento quando txtField é solto e nao ter nada escrito; 
        if(txtPesq.getText().trim().equals(""))
        {
            txtPesq.setText("pesquisar por nome");
        }
    }//GEN-LAST:event_txtPesqFocusLost

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
        // TODO add your handling code here:
       
        readJTableForNome(txtPesq.getText());
        
        
    }//GEN-LAST:event_btnPesqActionPerformed

    private void txtPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesqActionPerformed

    private void btnTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTodosActionPerformed
        // TODO add your handling code here:
        readJTable();
    }//GEN-LAST:event_btnTodosActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:
        new viewCliente().setVisible(false);
        this.dispose();
        new viewPrincipal().setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnCancelarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCliActionPerformed
        // TODO add your handling code here:
        txtIdCliente.setText("");
        txtNomeCliente.setText("");
        txtTelefoneCliente.setText("");
        txtNifCliente.setText("");
    }//GEN-LAST:event_btnCancelarCliActionPerformed

    private void txtTelefoneClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneClienteKeyTyped
        // TODO add your handling code here:
        // O campo só aceitará números;

        k.validarText(evt);
    }//GEN-LAST:event_txtTelefoneClienteKeyTyped

    private void txtNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeClienteKeyTyped
        // TODO add your handling code here:
        
        // O campo só aceitará letras;
        k.validarNumeros(evt);
    }//GEN-LAST:event_txtNomeClienteKeyTyped

    private void txtPesqKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqKeyTyped
        // TODO add your handling code here:
        // O campo só aceitará letras;
        k.validarNumeros(evt);
    }//GEN-LAST:event_txtPesqKeyTyped

    private void txtNifClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNifClienteKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtNifClienteKeyTyped

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
            java.util.logging.Logger.getLogger(viewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizarCli;
    private javax.swing.JButton btnCancelarCli;
    public static javax.swing.JButton btnHome;
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton btnRemoverCli;
    private javax.swing.JButton btnSalvarCli;
    private javax.swing.JButton btnTodos;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtCliente;
    private javax.swing.JTextField txtIdCliente;
    private javax.swing.JTextField txtNifCliente;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextField txtPesq;
    private javax.swing.JTextField txtTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
