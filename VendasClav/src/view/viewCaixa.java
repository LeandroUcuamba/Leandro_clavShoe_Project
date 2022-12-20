/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.modelCliente;
import DAO.ClienteDAO;
import java.util.List;
import java.util.ArrayList;
import model.modelProduto;
import DAO.ProdutoDAO;
import model.modelFuncionario;
import DAO.FuncionarioDAO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import DAO.vendaProdutoDAO;
import model.modelVendaProduto;
import DAO.vendaDAO;
import model.modelVenda;
import java.text.DecimalFormat;
import view.validarCampos;
import DAO.verificarUserDAO;
import model.modelLogin;
import static view.viewLogin.txtUsuarioLogin;
import static view.viewLogin.txtSenhaLogin;

/**
 *
 * @author Leandro Ucuamba
 */
public class viewCaixa extends javax.swing.JFrame {

    validarCampos k = new validarCampos();
    
    private void ValorTotal()
    {
        
        double valorTotal1 = 0;
        valorTotal1 = Double.parseDouble(txtUnidade.getText());
        double valorTotal2 = Double.parseDouble(txtValorProd.getText());
        double valorCal = valorTotal1 * valorTotal2;
        
        txtValorTotal.setText(String.valueOf(valorCal));
        
    }    
    
    private void valorTroco()
    {
        
        double valorTotal1 = 0;
        valorTotal1 = Double.parseDouble(txtValorTotal.getText());
        double valorTotal2 = Double.parseDouble(txtValorPagar.getText());
        double valorTroco = valorTotal2 - valorTotal1;
        
        txtTroco.setText(String.valueOf(valorTroco));
        
    }  
    
    
    
    private void Calcular()
    {
            
    
        float soma = 0;
        for(int i=0; i<jtVP1.getRowCount(); i++)
        {
            float Receb;
            Receb = Float.parseFloat(jtVP1.getValueAt(i, 3).toString());
            
            soma = soma + Receb;
            
         
            
        }
          
        DecimalFormat formateador = new DecimalFormat();
        formateador.setMaximumFractionDigits(2);
       
        lblTrocoVar.setText(String.valueOf(txtTroco.getText()));
      
    }
    
    
    /**
     * Creates new form viewCaixa
     */
    public viewCaixa() {
        initComponents();
        btnHome60.setBackground(new java.awt.Color(0,0,0,0));
        txtDataVenda.setBackground(new java.awt.Color(0,0,0,0));

               
        ClienteDAO TB = new ClienteDAO();
        for(modelCliente h: TB.read())
        {
            jcbClie.addItem(h);
        }
        
        ProdutoDAO KF = new ProdutoDAO();
            for(modelProduto h: KF.read())
        {
            jcbProd.addItem(h);
        }
        
            
        FuncionarioDAO JP = new FuncionarioDAO();
        for(modelFuncionario L: JP.read1())
        {
            jcbFun.addItem(L);
        }
        
        
        readJTable4();
        jtVP1.removeAll();
        
        
    }
    
    
    // instancia para usar abaixo;
    List<modelCliente> objListCliente = new ArrayList<>() ;
    ClienteDAO objClienteDao = new ClienteDAO();
    modelCliente objModelCliente = new modelCliente();
    
    List<modelProduto> objListProduto = new ArrayList<>() ;
    ProdutoDAO objProdutoDao = new ProdutoDAO();
    modelProduto objModelProduto = new modelProduto();
    
    List<modelFuncionario> objListFuncionario = new ArrayList<>();
    FuncionarioDAO objFuncionarioDao = new FuncionarioDAO();
    modelFuncionario objModelFuncionario = new modelFuncionario();
    
    List<modelVendaProduto> objListVendaProduto = new ArrayList<>() ;
    vendaProdutoDAO objVendaProdutoDao = new vendaProdutoDAO();
    modelVendaProduto objModelVendaProduto = new modelVendaProduto();
    
    
    
        public void readJTable4() {
        DefaultTableModel modelo = (DefaultTableModel) jtVenda.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        vendaDAO VenDao = new vendaDAO();

        // este é o ForEach;
        for (modelVenda pesqVen : VenDao.read()) {
            modelo.addRow(new Object[]{
                
                pesqVen.getId_venda(),
                pesqVen.getDataVenda(),
                pesqVen.getId_cliente(),
                pesqVen.getId_funcionario()                      
                
            });
        }

    }
        
        
        public void readJTableMM() {
        DefaultTableModel modelo = (DefaultTableModel) jtVP1.getModel();
        modelo.setNumRows(0); // para quando apresentar na JTable apois um cadastro não duplicar valores;

        vendaProdutoDAO VenProdDAO = new vendaProdutoDAO();

        // este é o ForEach;
        for (modelVendaProduto pesqVen : VenProdDAO.readJ()) {
            modelo.addRow(new Object[]{
                
                pesqVen.getId_produtoFK(),
                pesqVen.getUnidadeProduto(),
                pesqVen.getValorProduto(),
                pesqVen.getValorTotalCompra()
                
            });
        }

    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnHome60 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdClie1 = new javax.swing.JTextField();
        txtIdVenda = new javax.swing.JTextField();
        txtIdFun1 = new javax.swing.JTextField();
        txtDataVenda = new javax.swing.JTextField();
        jcbClie = new javax.swing.JComboBox();
        jcbFun = new javax.swing.JComboBox();
        btnConfirm = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtIdProd1 = new javax.swing.JTextField();
        jcbProd = new javax.swing.JComboBox();
        btnQtd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtVenda = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtVendaProduto = new javax.swing.JTextField();
        txtValorProd = new javax.swing.JTextField();
        txtUnidade = new javax.swing.JTextField();
        txtValorTotal = new javax.swing.JTextField();
        txtValorPagar = new javax.swing.JTextField();
        txtTroco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        btnConfirm1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtIdVenda2 = new javax.swing.JTextField();
        lblValorTot = new javax.swing.JLabel();
        lblTrocoVar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtVP1 = new javax.swing.JTable();
        btnVerC = new javax.swing.JButton();
        lblPrincipalP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome60ActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome60, new org.netbeans.lib.awtextra.AbsoluteConstraints(963, 63, 50, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Id_produto:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id do cliente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("id do funcionario:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("id da vendas:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Data da Vendas:");

        txtIdClie1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdClie1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdClie1KeyTyped(evt);
            }
        });

        txtIdVenda.setEnabled(false);

        txtIdFun1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtIdFun1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdFun1KeyTyped(evt);
            }
        });

        txtDataVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDataVenda.setText(" ANO/MES/DIA");
        txtDataVenda.setBorder(null);
        txtDataVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDataVendaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataVendaFocusLost(evt);
            }
        });

        jcbClie.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecciona o cliente" }));
        jcbClie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClieActionPerformed(evt);
            }
        });

        jcbFun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleciona o funcionario" }));
        jcbFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFunActionPerformed(evt);
            }
        });

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/img_aceitar.jpg"))); // NOI18N
        btnConfirm.setText("Confirmar");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdClie1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdFun1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcbFun, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbClie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDataVenda))))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtIdClie1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbClie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdFun1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 520, 200));

        txtIdProd1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdProd1KeyTyped(evt);
            }
        });
        jPanel1.add(txtIdProd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 160, 30));

        jcbProd.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleciona o produto" }));
        jcbProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProdActionPerformed(evt);
            }
        });
        jPanel1.add(jcbProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 160, 30));

        btnQtd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/img_add.jpg"))); // NOI18N
        btnQtd.setEnabled(false);
        btnQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQtdActionPerformed(evt);
            }
        });
        jPanel1.add(btnQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 30, 30));

        jtVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id da venda", "data da venda", "id do cliente", "id do funcionario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
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
        jtVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtVendaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jtVenda);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 500, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id_venda_Produto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Valor do Produto:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Unidade:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("valor Total:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("valor a pagar:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Troco:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, -1, -1));

        txtVendaProduto.setEnabled(false);
        jPanel1.add(txtVendaProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 140, 160, 30));

        txtValorProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorProd.setEnabled(false);
        jPanel1.add(txtValorProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 190, 160, 30));

        txtUnidade.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUnidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnidadeFocusLost(evt);
            }
        });
        txtUnidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUnidadeKeyTyped(evt);
            }
        });
        jPanel1.add(txtUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 60, 30));

        txtValorTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorTotal.setEnabled(false);
        txtValorTotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorTotalKeyTyped(evt);
            }
        });
        jPanel1.add(txtValorTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 290, 160, 30));

        txtValorPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtValorPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtValorPagarMouseExited(evt);
            }
        });
        txtValorPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorPagarKeyTyped(evt);
            }
        });
        jPanel1.add(txtValorPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, 160, 30));

        txtTroco.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTroco.setEnabled(false);
        txtTroco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrocoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 390, 160, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Valor Total compra:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 180, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("TROCO:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 520, 80, 30));

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cancel.png"))); // NOI18N
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 110, 30));

        btnConfirm1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/img_aceitar.jpg"))); // NOI18N
        btnConfirm1.setText("Confirmar venda");
        btnConfirm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirm1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, 170, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Id_venda:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, -1));

        txtIdVenda2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdVenda2KeyTyped(evt);
            }
        });
        jPanel1.add(txtIdVenda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 240, 70, 30));

        lblValorTot.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblValorTot.setForeground(new java.awt.Color(51, 255, 204));
        jPanel1.add(lblValorTot, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 480, 70, 30));

        lblTrocoVar.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lblTrocoVar.setForeground(new java.awt.Color(102, 255, 255));
        jPanel1.add(lblTrocoVar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 520, 70, 30));

        jtVP1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id do produto", "unidade", "valor fixo", "valor total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class
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
        jScrollPane1.setViewportView(jtVP1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 500, 90));

        btnVerC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lupa.png"))); // NOI18N
        btnVerC.setText("Ver compra");
        btnVerC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerCActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerC, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 160, 30));

        lblPrincipalP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sub.png"))); // NOI18N
        jPanel1.add(lblPrincipalP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnHome60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome60ActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        this.dispose();
        new viewPrincipal().setVisible(true);
        
    }//GEN-LAST:event_btnHome60ActionPerformed

    private void btnConfirm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirm1ActionPerformed
        // TODO add your handling code here:
        
      //  Calcular();
        
       // lblValorTot.setText(String.valueOf(txtValorTotal.getText()));
       // lblTrocoVar.setText(String.valueOf(txtTroco.getText()));
        
        try{
            
        modelVendaProduto p = new modelVendaProduto();
        vendaProdutoDAO J = new vendaProdutoDAO();
       
        
        p.setId_produtoFK(Integer.parseInt(txtIdProd1.getText()));
        p.setId_venda(Integer.parseInt(txtIdVenda2.getText()));
        p.setUnidadeProduto(Integer.parseInt(txtUnidade.getText()));
        p.setValorTotalCompra(Double.parseDouble(txtValorTotal.getText()));
        p.setValorProduto(Double.parseDouble(txtValorProd.getText()));
        p.setValorPagar(Double.parseDouble(txtValorPagar.getText()));  
        p.setValorTroco(Double.parseDouble(txtTroco.getText())); 
        J.create(p);
            
        readJTableMM();
        Calcular();
        
        }catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(rootPane, "Continua");
        }
        
        jcbProd.setSelectedIndex(0);
        txtIdProd1.setText("");
        txtIdVenda2.setText("");
        txtUnidade.setText("");
        txtValorPagar.setText("");
        txtValorProd.setText("");
        txtValorTotal.setText("");
        txtTroco.setText("");
        
    }//GEN-LAST:event_btnConfirm1ActionPerformed

    private void txtDataVendaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataVendaFocusGained
        // TODO add your handling code here:
        if(txtDataVenda.getText().trim().equals("ANO/MES/DIA"))
        {
            txtDataVenda.setText("");
        }
        
    }//GEN-LAST:event_txtDataVendaFocusGained

    private void txtDataVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataVendaFocusLost
        // TODO add your handling code here:
        if(txtDataVenda.getText().trim().equals(""))
        {
            txtDataVenda.setText("ANO/MES/DIA");
        }
    }//GEN-LAST:event_txtDataVendaFocusLost

    private void jcbClieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClieActionPerformed
   
        
         // Fazer com que quando selecionar o nome do cliente e o id preenche automaticamente;
        modelCliente po = (modelCliente) jcbClie.getSelectedItem();
        txtIdClie1.setText(String.valueOf(po.getId_cliente()));
    }//GEN-LAST:event_jcbClieActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

  
        modelVenda p = new modelVenda();
        vendaDAO J = new vendaDAO();
        p.setDataVenda(txtDataVenda.getText());
        p.setId_cliente(Integer.parseInt(txtIdClie1.getText()));
        p.setId_funcionario(Integer.parseInt(txtIdFun1.getText()));
        
        verificarUserDAO dao = new verificarUserDAO();
        
        if(dao.checkLogin(txtUsuarioLogin.getText(), txtSenhaLogin.getText(), Integer.parseInt(txtIdFun1.getText())))
        {
            J.create(p);
            readJTable4();
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"nao pode digitar id de outra pessoa");
     
        }
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQtdActionPerformed
        // TODO add your handling code here:
   
    }//GEN-LAST:event_btnQtdActionPerformed

    private void jcbFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFunActionPerformed
        // TODO add your handling code here:
        
          modelFuncionario TJ = (modelFuncionario) jcbFun.getSelectedItem();
          txtIdFun1.setText(String.valueOf(TJ.getId_funcionario()));
       
        
    }//GEN-LAST:event_jcbFunActionPerformed

    private void jcbProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProdActionPerformed
        // TODO add your handling code here:
        
        modelProduto TR = (modelProduto) jcbProd.getSelectedItem();
        txtIdProd1.setText(String.valueOf(TR.getId_produto()));
        txtValorProd.setText(String.valueOf(TR.getPreco()));
    }//GEN-LAST:event_jcbProdActionPerformed

    private void jtVendaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtVendaKeyPressed
        // TODO add your handling code here:
        
        if(jtVenda.getSelectedRow() != -1) {
            
            txtDataVenda.setText(jtVenda.getValueAt(jtVenda.getSelectedRow(), 1).toString());
            txtIdClie1.setText(jtVenda.getValueAt(jtVenda.getSelectedRow(), 2).toString());
            txtIdFun1.setText(jtVenda.getValueAt(jtVenda.getSelectedRow(), 3).toString());
        }
        
        
    }//GEN-LAST:event_jtVendaKeyPressed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // Comando para limpar os textos dos campos;
        jcbClie.setSelectedIndex(0);
        jcbFun.setSelectedIndex(0);
        jcbProd.setSelectedIndex(0);
        txtIdVenda.setText("");
        txtIdClie1.setText("");
        txtIdFun1.setText("");
        txtIdVenda2.setText("");
        txtTroco.setText("");
        txtUnidade.setText("");
        txtValorPagar.setText("");
        txtValorProd.setText("");
        txtValorTotal.setText("");
        txtVendaProduto.setText("");
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtUnidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnidadeFocusLost
        // TODO add your handling code here:
        
      ValorTotal();
      lblValorTot.setText(String.valueOf(txtValorTotal.getText()));
        
    }//GEN-LAST:event_txtUnidadeFocusLost

    private void txtValorPagarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtValorPagarMouseExited
        // TODO add your handling code here:
      valorTroco();
      lblTrocoVar.setText(String.valueOf(txtTroco.getText()));
    }//GEN-LAST:event_txtValorPagarMouseExited

    private void txtIdClie1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClie1KeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtIdClie1KeyTyped

    private void txtIdFun1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdFun1KeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtIdFun1KeyTyped

    private void txtIdProd1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProd1KeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtIdProd1KeyTyped

    private void txtUnidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadeKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtUnidadeKeyTyped

    private void txtIdVenda2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdVenda2KeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtIdVenda2KeyTyped

    private void txtValorPagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorPagarKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtValorPagarKeyTyped

    private void txtValorTotalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorTotalKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtValorTotalKeyTyped

    private void txtTrocoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrocoKeyTyped
        // TODO add your handling code here:
        k.validarText(evt);
    }//GEN-LAST:event_txtTrocoKeyTyped

    private void btnVerCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerCActionPerformed
        // TODO add your handling code here:
        
        new viewVerVendas().setVisible(true);
        
    }//GEN-LAST:event_btnVerCActionPerformed
 
    
    
    
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
            java.util.logging.Logger.getLogger(viewCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCaixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnConfirm1;
    private javax.swing.JButton btnHome60;
    private javax.swing.JButton btnQtd;
    private javax.swing.JButton btnVerC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox jcbClie;
    private javax.swing.JComboBox jcbFun;
    private javax.swing.JComboBox jcbProd;
    private javax.swing.JTable jtVP1;
    private javax.swing.JTable jtVenda;
    private javax.swing.JLabel lblPrincipalP;
    private javax.swing.JLabel lblTrocoVar;
    private javax.swing.JLabel lblValorTot;
    private javax.swing.JTextField txtDataVenda;
    private javax.swing.JTextField txtIdClie1;
    private javax.swing.JTextField txtIdFun1;
    private javax.swing.JTextField txtIdProd1;
    private javax.swing.JTextField txtIdVenda;
    private javax.swing.JTextField txtIdVenda2;
    private javax.swing.JTextField txtTroco;
    private javax.swing.JTextField txtUnidade;
    private javax.swing.JTextField txtValorPagar;
    private javax.swing.JTextField txtValorProd;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtVendaProduto;
    // End of variables declaration//GEN-END:variables
}
