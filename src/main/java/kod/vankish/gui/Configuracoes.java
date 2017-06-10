package kod.vankish.gui;

import kod.vankish.logics.PagamentoLogics;
import kod.vankish.logics.UsuarioLogics;
import kod.vankish.pojo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle;

public class Configuracoes extends javax.swing.JPanel {
    private static Configuracoes instance = new Configuracoes();
    private JButton btAddForma;
    private JButton btAddMeio;
    private JButton btCancelar;
    private JButton btNovo;
    private JButton btOK;
    private JButton btRemove;
    private JButton btRemoveForma;
    private JButton btRemoveMeio;
    private JButton btSave;
    private JCheckBox cbBalanco;
    private JCheckBox cbCaixa;
    private JCheckBox cbClientes;
    private JCheckBox cbContas;
    private JCheckBox cbFornecedores;
    private JCheckBox cbFuncionarios;
    private JCheckBox cbUsuarios;
    private JComboBox comboFormas;
    private JComboBox comboMeio;
    private JComboBox comboUsuarios;
    private JLabel jLabel1;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JSeparator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private JToolBar jToolBar1;
    private javax.swing.JPasswordField passSenha;
    private JTextField txtFormas;
    private JTextField txtID;
    private JTextField txtLogin;
    private JTextField txtLoginNovo;
    private JTextField txtMeio;
    private Configuracoes() {
        initComponents();
        loadCombos();
    }

    public static Configuracoes getInstance() {
        return instance;
    }

    private void loadCombos() {
        getFormasPagamento();
        getMeiosPagamento();
        getUsers();
    }

    private void getUsers() {
        comboUsuarios.removeAllItems();

        for (String u : new UsuarioLogics().getUsers()) {
            comboUsuarios.addItem(u);
        }
    }

    private void getFormasPagamento() {
        comboFormas.removeAllItems();

        for (String s : new PagamentoLogics().getDescricaoFormasPagamento()) {
            comboFormas.addItem(s);
        }
    }

    private void getMeiosPagamento() {
        comboMeio.removeAllItems();

        for (String s : new PagamentoLogics().getDescricaoMeiosPagamento()) {
            comboMeio.addItem(s);
        }
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jSeparator1 = new JSeparator();
        jSeparator2 = new JSeparator();
        jLabel3 = new JLabel();
        comboFormas = new JComboBox();
        txtFormas = new JTextField();
        jLabel5 = new JLabel();
        btAddForma = new JButton();
        btRemoveForma = new JButton();
        jLabel8 = new JLabel();
        jLabel9 = new JLabel();
        txtMeio = new JTextField();
        comboMeio = new JComboBox();
        btRemoveMeio = new JButton();
        btAddMeio = new JButton();
        jLabel6 = new JLabel();
        txtLogin = new JTextField();
        jLabel7 = new JLabel();
        jSeparator3 = new JSeparator();
        cbFuncionarios = new JCheckBox();
        cbFornecedores = new JCheckBox();
        cbClientes = new JCheckBox();
        cbUsuarios = new JCheckBox();
        cbContas = new JCheckBox();
        cbBalanco = new JCheckBox();
        cbCaixa = new JCheckBox();
        btOK = new JButton();
        jSeparator4 = new JSeparator();
        jLabel11 = new JLabel();
        comboUsuarios = new JComboBox();
        jLabel12 = new JLabel();
        jSeparator5 = new JSeparator();
        txtLoginNovo = new JTextField();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jToolBar1 = new JToolBar();
        btNovo = new JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btSave = new JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btRemove = new JButton();
        jLabel15 = new JLabel();
        txtID = new JTextField();
        passSenha = new javax.swing.JPasswordField();
        btCancelar = new JButton();

        setBackground(new Color(180, 180, 180));
        setName("Form");

        jLabel1.setFont(new Font("Segoe UI", 1, 18));
        jLabel1.setForeground(new Color(255, 255, 255));
        ResourceBundle bundle = ResourceBundle.getBundle("kod/vankish/gui/Bundle");
        jLabel1.setText(bundle.getString("Configuracoes.jLabel1.text"));
        jLabel1.setName("jLabel1");

        jLabel2.setFont(new Font("Segoe UI", 1, 18));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText(bundle.getString("Configuracoes.jLabel2.text"));
        jLabel2.setName("jLabel2");

        jSeparator1.setName("jSeparator1");

        jSeparator2.setName("jSeparator2");

        jLabel3.setFont(new Font("Segoe UI", 0, 12));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText(bundle.getString("Configuracoes.jLabel3.text"));
        jLabel3.setName("jLabel3");

        comboFormas.setName("comboFormas");

        txtFormas.setText(bundle.getString("Configuracoes.txtFormas.text"));
        txtFormas.setName("txtFormas");

        jLabel5.setFont(new Font("Segoe UI", 0, 12));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText(bundle.getString("Configuracoes.jLabel5.text"));
        jLabel5.setName("jLabel5");

        btAddForma.setBackground(new Color(102, 102, 102));
        btAddForma.setText(bundle.getString("Configuracoes.btAddForma.text"));
        btAddForma.setName("btAddForma");
        btAddForma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Configuracoes.this.btAddFormaActionPerformed(evt);
            }

        });
        btRemoveForma.setBackground(new Color(102, 102, 102));
        btRemoveForma.setText(bundle.getString("Configuracoes.btRemoveForma.text"));
        btRemoveForma.setName("btRemoveForma");
        btRemoveForma.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Configuracoes.this.btRemoveFormaActionPerformed(evt);
            }

        });
        jLabel8.setFont(new Font("Segoe UI", 0, 12));
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText(bundle.getString("Configuracoes.jLabel8.text"));
        jLabel8.setName("jLabel8");

        jLabel9.setFont(new Font("Segoe UI", 0, 12));
        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText(bundle.getString("Configuracoes.jLabel9.text"));
        jLabel9.setName("jLabel9");

        txtMeio.setText(bundle.getString("Configuracoes.txtMeio.text"));
        txtMeio.setName("txtMeio");

        comboMeio.setName("comboMeio");

        btRemoveMeio.setBackground(new Color(102, 102, 102));
        btRemoveMeio.setText(bundle.getString("Configuracoes.btRemoveMeio.text"));
        btRemoveMeio.setName("btRemoveMeio");
        btRemoveMeio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Configuracoes.this.btRemoveMeioActionPerformed(evt);
            }

        });
        btAddMeio.setBackground(new Color(102, 102, 102));
        btAddMeio.setText(bundle.getString("Configuracoes.btAddMeio.text"));
        btAddMeio.setName("btAddMeio");
        btAddMeio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Configuracoes.this.btAddMeioActionPerformed(evt);
            }

        });
        jLabel6.setFont(new Font("Segoe UI", 0, 12));
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText(bundle.getString("Configuracoes.jLabel6.text"));
        jLabel6.setName("jLabel6");

        txtLogin.setText(bundle.getString("Configuracoes.txtLogin.text"));
        txtLogin.setName("txtLogin");
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Configuracoes.this.txtLoginKeyPressed(evt);
            }

        });
        jLabel7.setFont(new Font("Segoe UI", 0, 12));
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText(bundle.getString("Configuracoes.jLabel7.text"));
        jLabel7.setName("jLabel7");

        jSeparator3.setName("jSeparator3");

        cbFuncionarios.setBackground(new Color(180, 180, 180));
        cbFuncionarios.setForeground(new Color(255, 255, 255));
        cbFuncionarios.setText(bundle.getString("Configuracoes.cbFuncionarios.text"));
        cbFuncionarios.setName("cbFuncionarios");

        cbFornecedores.setBackground(new Color(180, 180, 180));
        cbFornecedores.setForeground(new Color(255, 255, 255));
        cbFornecedores.setText(bundle.getString("Configuracoes.cbFornecedores.text"));
        cbFornecedores.setName("cbFornecedores");

        cbClientes.setBackground(new Color(180, 180, 180));
        cbClientes.setForeground(new Color(255, 255, 255));
        cbClientes.setText(bundle.getString("Configuracoes.cbClientes.text"));
        cbClientes.setName("cbClientes");

        cbUsuarios.setBackground(new Color(180, 180, 180));
        cbUsuarios.setForeground(new Color(153, 0, 0));
        cbUsuarios.setText(bundle.getString("Configuracoes.cbUsuarios.text"));
        cbUsuarios.setName("cbUsuarios");

        cbContas.setBackground(new Color(180, 180, 180));
        cbContas.setForeground(new Color(255, 255, 255));
        cbContas.setText(bundle.getString("Configuracoes.cbContas.text"));
        cbContas.setName("cbContas");

        cbBalanco.setBackground(new Color(180, 180, 180));
        cbBalanco.setForeground(new Color(255, 255, 255));
        cbBalanco.setText(bundle.getString("Configuracoes.cbBalanco.text"));
        cbBalanco.setName("cbBalanco");

        cbCaixa.setBackground(new Color(180, 180, 180));
        cbCaixa.setForeground(new Color(255, 255, 255));
        cbCaixa.setText(bundle.getString("Configuracoes.cbCaixa.text"));
        cbCaixa.setName("cbCaixa");

        btOK.setBackground(new Color(102, 102, 102));
        btOK.setText(bundle.getString("Configuracoes.btOK.text"));
        btOK.setEnabled(false);
        btOK.setName("btOK");
        btOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Configuracoes.this.btOKActionPerformed(evt);
            }

        });
        jSeparator4.setOrientation(1);
        jSeparator4.setName("jSeparator4");

        jLabel11.setFont(new Font("Segoe UI", 0, 12));
        jLabel11.setForeground(new Color(255, 255, 255));
        jLabel11.setText(bundle.getString("Configuracoes.jLabel11.text"));
        jLabel11.setName("jLabel11");

        comboUsuarios.setName("comboUsuarios");
        comboUsuarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Configuracoes.this.comboUsuariosItemStateChanged(evt);
            }

        });
        jLabel12.setFont(new Font("Segoe UI", 0, 12));
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText(bundle.getString("Configuracoes.jLabel12.text"));
        jLabel12.setName("jLabel12");

        jSeparator5.setName("jSeparator5");

        txtLoginNovo.setText(bundle.getString("Configuracoes.txtLoginNovo.text"));
        txtLoginNovo.setName("txtLoginNovo");
        txtLoginNovo.setNextFocusableComponent(passSenha);

        jLabel13.setFont(new Font("Segoe UI", 0, 12));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText(bundle.getString("Configuracoes.jLabel13.text"));
        jLabel13.setName("jLabel13");

        jLabel14.setFont(new Font("Segoe UI", 0, 12));
        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText(bundle.getString("Configuracoes.jLabel14.text"));
        jLabel14.setName("jLabel14");

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jToolBar1.setRollover(true);
        jToolBar1.setName("jToolBar1");

        btNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/new.png")));
        btNovo.setText(bundle.getString("Configuracoes.btNovo.text"));
        btNovo.setFocusable(false);
        btNovo.setHorizontalTextPosition(4);
        btNovo.setName("btNovo");
        btNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Configuracoes.this.btNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNovo);

        jSeparator6.setName("jSeparator6");
        jToolBar1.add(jSeparator6);

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/save.png")));
        btSave.setText(bundle.getString("Configuracoes.btSave.text"));
        btSave.setFocusable(false);
        btSave.setHorizontalTextPosition(4);
        btSave.setName("btSave");
        btSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Configuracoes.this.btSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btSave);

        jSeparator7.setName("jSeparator7");
        jToolBar1.add(jSeparator7);

        btRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/remove.png")));
        btRemove.setText(bundle.getString("Configuracoes.btRemove.text"));
        btRemove.setFocusable(false);
        btRemove.setHorizontalTextPosition(4);
        btRemove.setName("btRemove");
        btRemove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Configuracoes.this.btRemoveActionPerformed(evt);
            }
        });
        jToolBar1.add(btRemove);

        jLabel15.setFont(new Font("Segoe UI", 0, 12));
        jLabel15.setForeground(new Color(255, 255, 255));
        jLabel15.setText(bundle.getString("Configuracoes.jLabel15.text"));
        jLabel15.setName("jLabel15");

        txtID.setEditable(false);
        txtID.setText(bundle.getString("Configuracoes.txtID.text"));
        txtID.setName("txtID");

        passSenha.setText(bundle.getString("Configuracoes.passSenha.text"));
        passSenha.setName("passSenha");
        passSenha.setNextFocusableComponent(btSave);

        btCancelar.setBackground(new Color(102, 102, 102));
        btCancelar.setText(bundle.getString("Configuracoes.btCancelar.text"));
        btCancelar.setEnabled(false);
        btCancelar.setName("btCancelar");
        btCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Configuracoes.this.btCancelarActionPerformed(evt);
            }

        });
        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jSeparator1, -1, 618, 32767))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jSeparator2, -1, 805, 32767)))
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel5))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btRemoveForma)
                                                        .addComponent(comboFormas, 0, 168, 32767)
                                                        .addComponent(btAddForma)
                                                        .addComponent(txtFormas))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 192, 32767)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btRemoveMeio)
                                                        .addComponent(comboMeio, 0, 168, 32767)
                                                        .addComponent(btAddMeio)
                                                        .addComponent(txtMeio))
                                                .addGap(112, 112, 112))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel11)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(comboUsuarios, -2, 168, -2))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel14)
                                                                                .addComponent(jLabel13)
                                                                                .addComponent(jLabel15))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(passSenha)
                                                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                        .addComponent(txtID, -2, 88, -2)
                                                                                        .addGap(80, 80, 80))
                                                                                .addComponent(txtLoginNovo, -2, 168, -2))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel12)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jSeparator5))
                                                        .addComponent(jToolBar1, -2, 387, -2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 55, 32767)
                                                .addComponent(jSeparator4, -2, 16, -2)
                                                .addGap(34, 34, 34)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbUsuarios)
                                                        .addComponent(cbClientes)
                                                        .addComponent(cbFornecedores)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel7)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jSeparator3, -2, 275, -2))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(cbFuncionarios)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(cbContas)
                                                                                .addComponent(cbCaixa)
                                                                                .addComponent(cbBalanco))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(104, 104, 104)
                                                                .addComponent(btOK, -2, 71, -2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btCancelar))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtLogin, -2, 160, -2)))
                                                .addGap(51, 51, 51)))));


        layout.linkSize(0, new java.awt.Component[]{comboFormas, comboMeio});

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator1, -2, 10, -2)
                                        .addComponent(jLabel1))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(comboFormas, -2, -1, -2)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btRemoveForma)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtFormas, -2, -1, -2)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btAddForma))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel9)
                                                        .addComponent(comboMeio, -2, -1, -2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btRemoveMeio)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtMeio, -2, -1, -2)
                                                        .addComponent(jLabel8))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btAddMeio)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jSeparator2, -2, 10, -2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtLogin, -2, -1, -2))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jSeparator3, -2, 10, -2))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbContas)
                                                        .addComponent(cbFuncionarios))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbFornecedores)
                                                        .addComponent(cbBalanco))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbClientes)
                                                        .addComponent(cbCaixa))
                                                .addGap(18, 18, 18)
                                                .addComponent(cbUsuarios)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btCancelar)
                                                        .addComponent(btOK)))
                                        .addComponent(jSeparator4, -2, 287, -2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jSeparator5, -2, 10, -2)
                                                        .addComponent(jLabel12))
                                                .addGap(18, 18, 18)
                                                .addComponent(jToolBar1, -2, -1, -2)
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel11)
                                                        .addComponent(comboUsuarios, -2, -1, -2))
                                                .addGap(28, 28, 28)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel15)
                                                        .addComponent(txtID, -2, -1, -2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtLoginNovo, -2, -1, -2)
                                                        .addComponent(jLabel13))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel14)
                                                        .addComponent(passSenha, -2, -1, -2))))
                                .addContainerGap(-1, 32767)));
    }

    private void btRemoveFormaActionPerformed(ActionEvent evt) {
        removeFormaPagamento();
        loadCombos();
    }

    private void btAddFormaActionPerformed(ActionEvent evt) {
        addFormaPagamento();
        txtFormas.setText("");
        loadCombos();
    }

    private void btRemoveMeioActionPerformed(ActionEvent evt) {
        removeMeioPagamento();
        loadCombos();
    }

    private void btAddMeioActionPerformed(ActionEvent evt) {
        addMeioPagamento();
        txtMeio.setText("");
        loadCombos();
    }

    private void btNovoActionPerformed(ActionEvent evt) {
        clearUsuariosFields();
    }

    private void btRemoveActionPerformed(ActionEvent evt) {
        removeUser(Integer.valueOf(Integer.parseInt(txtID.getText())));
        loadCombos();
        clearUsuariosFields();
    }

    private void btSaveActionPerformed(ActionEvent evt) {
        if (txtID.getText().equals("")) {
            addUser();
        } else {
            updateUser(Integer.valueOf(Integer.parseInt(txtID.getText())));
        }
        txtLoginNovo.setEditable(true);
        loadCombos();
        clearUsuariosFields();
    }

    private void comboUsuariosItemStateChanged(java.awt.event.ItemEvent evt) {
        if (evt.getStateChange() == 1) {
            String usuario = (String) ((JComboBox) evt.getSource()).getSelectedItem();
            if (!usuario.equals(UsuarioLogics.Lista))
                getUserData();
        }
    }

    private void txtLoginKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            setPermissitions(getLogin());
            loadCombos();
            btOK.setEnabled(true);
            btCancelar.setEnabled(true);
        }
    }

    private void btCancelarActionPerformed(ActionEvent evt) {
        clearUsuariosFields();
        loadCombos();
        btOK.setEnabled(false);
        btCancelar.setEnabled(false);
    }

    private void btOKActionPerformed(ActionEvent evt) {
        alterPermissions();
        clearUsuariosFields();
        loadCombos();
        btOK.setEnabled(false);
        btCancelar.setEnabled(false);
    }

    private void removeFormaPagamento() {
        String forma = (String) comboFormas.getSelectedItem();

        if (!forma.equals(PagamentoLogics.Umavez)) {
            new PagamentoLogics().removeFormapagamento(forma);
        }
    }


    private void addFormaPagamento() {
        new PagamentoLogics().addForma(txtFormas.getText().trim());
    }


    private void removeMeioPagamento() {
        String meio = (String) comboMeio.getSelectedItem();

        if (!meio.equals(PagamentoLogics.Avista)) {
            new PagamentoLogics().removeMeiopagamento(meio);
        }
    }


    private void addMeioPagamento() {
        new PagamentoLogics().addMeio(txtMeio.getText().trim());
    }


    private void alterPermissions() {
        Usuario u = getLogin();

        if (u != null) {
            u.setAdminbalanco(cbBalanco.isSelected());
            u.setAdmincaixa(cbCaixa.isSelected());
            u.setAdmincontas(cbContas.isSelected());
            u.setControleclientes(cbClientes.isSelected());
            u.setControlefornecedores(cbFornecedores.isSelected());
            u.setControlefuncionarios(cbFuncionarios.isSelected());
            u.setUsuarios(cbUsuarios.isSelected());

            updateUser(u);
        }
    }


    private Usuario getLogin() {
        String login = txtLogin.getText();

        if (!login.equals("admin")) {
            txtLogin.setEditable(false);
            return new UsuarioLogics().sch(login);
        }

        return null;
    }


    private void setPermissitions(Usuario u) {
        cbBalanco.setSelected(u.isAdminbalanco());
        cbCaixa.setSelected(u.isAdmincaixa());
        cbClientes.setSelected(u.isControleclientes());
        cbContas.setSelected(u.isAdmincontas());
        cbFornecedores.setSelected(u.isControlefornecedores());
        cbFuncionarios.setSelected(u.isControlefuncionarios());
        cbUsuarios.setSelected(u.isUsuarios());
    }


    private void removeUser(Integer id) {
        new UsuarioLogics().rm(id);
    }


    private void addUser() {
        new UsuarioLogics().add(createFromData());
    }


    private void updateUser(Integer id) {
        new UsuarioLogics().up(alterUser(new UsuarioLogics().get(id)));
    }


    private void updateUser(Usuario u) {
        new UsuarioLogics().up(u);
    }


    private Usuario alterUser(Usuario u) {
        Usuario us = createFromData();

        if (us != null) {
            u.setNome(us.getNome());
            u.setSenha(us.getSenha().equals("") ? u.getSenha() : us.getSenha());
            return u;
        }

        return null;
    }


    private void getUserData() {
        Usuario u = new UsuarioLogics().sch((String) comboUsuarios.getSelectedItem());

        if (u.getNome().equals("admin")) {
            txtLoginNovo.setEditable(false);
        }
        txtID.setText(String.valueOf(u.getIdUsuario()));
        txtLoginNovo.setText(u.getNome());
        passSenha.setText(u.getSenha());
    }


    private Usuario createFromData() {
        return new Usuario(txtLoginNovo.getText(),
                new String(passSenha.getPassword()),
                false, false, false, false, false, false, false);
    }


    private void clearUsuariosFields() {
        txtLoginNovo.setText("");
        passSenha.setText("");
        txtLogin.setText("");
        txtID.setText("");
        comboUsuarios.setSelectedIndex(0);
        txtLogin.setEditable(true);
        zeraCheckBoxes();
    }


    private void zeraCheckBoxes() {
        cbBalanco.setSelected(false);
        cbCaixa.setSelected(false);
        cbClientes.setSelected(false);
        cbContas.setSelected(false);
        cbFornecedores.setSelected(false);
        cbFuncionarios.setSelected(false);
        cbUsuarios.setSelected(false);
    }
}
