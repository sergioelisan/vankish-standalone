package kod.vankish.gui;

import kod.database.utils.Pesquisa;
import kod.exceptions.util.ErrorMessage;
import kod.utils.GuiUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.gui.tabelas.TabelaVendas;
import kod.vankish.logics.ClienteLogics;
import kod.vankish.logics.PagamentoLogics;
import kod.vankish.pojo.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.ResourceBundle;

public final class Caixa extends JPanel {
    private static Caixa instance = new Caixa();
    private TabelaVendas modelo = new TabelaVendas();
    private Usuario user;
    private JComboBox comboForma;
    private JComboBox comboMeio;
    private JFrame doneFrame;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JLabel label;
    private JLabel lbAdd;
    private JLabel lbDone;
    private JLabel lbOK;
    private JLabel lbRemove;
    private JLabel lbUsuario;
    private JPanel panel;
    private JTable tabela;
    private JTextField txtCliente;
    private JTextField txtDesconto;
    private JTextField txtDinheiro;
    private JTextField txtFuncionario;
    private JTextField txtProduto;
    private JTextField txtQnt;
    private JTextField txtTotal;
    private JTextField txtTotalDoneFrame;
    private JTextField txtTroco;
    public Caixa() {
        initComponents();
        init();
    }

    public static Caixa getInstance() {
        return instance;
    }

    private void initComponents() {
        doneFrame = new JFrame();
        jPanel1 = new JPanel();
        jLabel8 = new JLabel();
        jSeparator4 = new JSeparator();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel13 = new JLabel();
        txtDinheiro = new JTextField();
        txtTotalDoneFrame = new JTextField();
        jLabel14 = new JLabel();
        txtTroco = new JTextField();
        lbOK = new JLabel();
        comboForma = new JComboBox();
        comboMeio = new JComboBox();
        txtDesconto = new JTextField();
        jLabel15 = new JLabel();
        panel = new JPanel();
        jLabel1 = new JLabel();
        jLabel3 = new JLabel();
        jSeparator2 = new JSeparator();
        jLabel4 = new JLabel();
        txtProduto = new JTextField();
        jLabel5 = new JLabel();
        txtQnt = new JTextField();
        jLabel6 = new JLabel();
        jSeparator3 = new JSeparator();
        jLabel7 = new JLabel();
        txtCliente = new JTextField();
        lbAdd = new JLabel();
        lbRemove = new JLabel();
        lbDone = new JLabel();
        txtTotal = new JTextField();
        jLabel9 = new JLabel();
        txtFuncionario = new JTextField();
        jLabel16 = new JLabel();
        label = new JLabel();
        lbUsuario = new JLabel();
        jScrollPane1 = new JScrollPane();
        tabela = new JTable();
        jLabel17 = new JLabel();

        doneFrame.setDefaultCloseOperation(2);
        doneFrame.setBounds(new java.awt.Rectangle(200, 200, 340, 300));
        doneFrame.setName("doneFrame");
        doneFrame.setResizable(false);
        doneFrame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                Caixa.this.doneFrameClosing(evt);
            }

        });
        jPanel1.setBackground(new Color(102, 102, 102));
        jPanel1.setName("jPanel1");

        jLabel8.setFont(new Font("Tahoma", 1, 14));
        jLabel8.setForeground(new Color(255, 255, 255));
        ResourceBundle bundle = ResourceBundle.getBundle("kod/vankish/gui/Bundle");
        jLabel8.setText(bundle.getString("Caixa.jLabel8.text"));
        jLabel8.setName("jLabel8");

        jSeparator4.setName("jSeparator4");

        jLabel10.setFont(new Font("Tahoma", 0, 14));
        jLabel10.setForeground(new Color(255, 255, 255));
        jLabel10.setText(bundle.getString("Caixa.jLabel10.text"));
        jLabel10.setName("jLabel10");

        jLabel11.setFont(new Font("Tahoma", 0, 14));
        jLabel11.setForeground(new Color(255, 255, 255));
        jLabel11.setText(bundle.getString("Caixa.jLabel11.text"));
        jLabel11.setName("jLabel11");

        jLabel12.setFont(new Font("Tahoma", 0, 14));
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText(bundle.getString("Caixa.jLabel12.text"));
        jLabel12.setName("jLabel12");

        jLabel13.setFont(new Font("Tahoma", 0, 14));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText(bundle.getString("Caixa.jLabel13.text"));
        jLabel13.setName("jLabel13");

        txtDinheiro.setText(bundle.getString("Caixa.txtDinheiro.text"));
        txtDinheiro.setName("txtDinheiro");
        txtDinheiro.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Caixa.this.txtDinheiroKeyReleased(evt);
            }

        });
        txtTotalDoneFrame.setEditable(false);
        txtTotalDoneFrame.setText(bundle.getString("Caixa.txtTotalDoneFrame.text"));
        txtTotalDoneFrame.setName("txtTotalDoneFrame");

        jLabel14.setFont(new Font("Tahoma", 0, 14));
        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText(bundle.getString("Caixa.jLabel14.text"));
        jLabel14.setName("jLabel14");

        txtTroco.setEditable(false);
        txtTroco.setText(bundle.getString("Caixa.txtTroco.text"));
        txtTroco.setName("txtTroco");

        lbOK.setFont(new Font("Tahoma", 1, 18));
        lbOK.setForeground(new Color(255, 255, 255));
        lbOK.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/setinha.png")));
        lbOK.setText(bundle.getString("Caixa.lbOK.text"));
        lbOK.setName("lbOK");
        lbOK.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Caixa.this.lbOKMouseClicked(evt);
            }

        });
        comboForma.setName("comboForma");

        comboMeio.setName("comboMeio");
        comboMeio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                Caixa.this.comboMeioItemStateChanged(evt);
            }

        });
        txtDesconto.setText(bundle.getString("Caixa.txtDesconto.text"));
        txtDesconto.setName("txtDesconto");
        txtDesconto.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Caixa.this.txtDescontoKeyReleased(evt);
            }

        });
        jLabel15.setFont(new Font("Tahoma", 0, 14));
        jLabel15.setForeground(new Color(255, 255, 255));
        jLabel15.setText(bundle.getString("Caixa.jLabel15.text"));
        jLabel15.setName("jLabel15");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel8)
                                                .addGap(10, 10, 10)
                                                .addComponent(jSeparator4, -1, 231, 32767))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel11, -2, 66, -2)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(212, 212, 212)
                                                                .addComponent(lbOK))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(jLabel15, GroupLayout.Alignment.LEADING, -1, -1, 32767)
                                                                        .addComponent(jLabel14, GroupLayout.Alignment.LEADING, -1, -1, 32767)
                                                                        .addComponent(jLabel13, GroupLayout.Alignment.LEADING, -1, -1, 32767)
                                                                        .addComponent(jLabel12, GroupLayout.Alignment.LEADING, -1, -1, 32767))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtDesconto, -2, 87, -2)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(txtTotalDoneFrame)
                                                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                                        .addComponent(txtTroco)
                                                                                        .addGap(78, 78, 78))
                                                                                .addComponent(txtDinheiro, -1, 174, 32767)
                                                                                .addComponent(comboForma, 0, 132, 32767)
                                                                                .addComponent(comboMeio, 0, 142, 32767))))
                                                        .addComponent(jLabel10, -2, 39, -2))
                                                .addGap(30, 30, 30)))
                                .addContainerGap()));

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator4, -2, 10, -2)
                                        .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(comboMeio, -2, -1, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(comboForma, -2, -1, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel15)
                                        .addComponent(txtDesconto, -2, -1, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 46, 32767)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel12)
                                        .addComponent(txtTotalDoneFrame, -2, -1, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(txtDinheiro, -2, -1, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(txtTroco, -2, -1, -2))
                                .addGap(29, 29, 29)
                                .addComponent(lbOK)
                                .addContainerGap()));


        GroupLayout doneFrameLayout = new GroupLayout(doneFrame.getContentPane());
        doneFrame.getContentPane().setLayout(doneFrameLayout);
        doneFrameLayout.setHorizontalGroup(
                doneFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, -2, -1, -2));

        doneFrameLayout.setVerticalGroup(
                doneFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, -1, -1, 32767));


        setName("Form");

        panel.setBackground(new Color(102, 102, 102));
        panel.setName("panel");

        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialCaixa.png")));
        jLabel1.setText(bundle.getString("Caixa.jLabel1.text"));
        jLabel1.setName("jLabel1");

        jLabel3.setFont(new Font("Tahoma", 1, 12));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText(bundle.getString("Caixa.jLabel3.text"));
        jLabel3.setName("jLabel3");

        jSeparator2.setName("jSeparator2");

        jLabel4.setFont(new Font("Tahoma", 0, 14));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText(bundle.getString("Caixa.jLabel4.text"));
        jLabel4.setName("jLabel4");

        txtProduto.setFont(new Font("Tahoma", 0, 14));
        txtProduto.setText(bundle.getString("Caixa.txtProduto.text"));
        txtProduto.setName("txtProduto");
        txtProduto.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                Caixa.this.txtProdutoKeyPressed(evt);
            }

            public void keyReleased(KeyEvent evt) {
                Caixa.this.txtProdutoKeyReleased(evt);
            }

        });
        jLabel5.setFont(new Font("Tahoma", 0, 14));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText(bundle.getString("Caixa.jLabel5.text"));
        jLabel5.setName("jLabel5");

        txtQnt.setFont(new Font("Tahoma", 0, 14));
        txtQnt.setText(bundle.getString("Caixa.txtQnt.text"));
        txtQnt.setName("txtQnt");
        txtQnt.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                Caixa.this.txtQntKeyPressed(evt);
            }

        });
        jLabel6.setFont(new Font("Tahoma", 1, 12));
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText(bundle.getString("Caixa.jLabel6.text"));
        jLabel6.setName("jLabel6");

        jSeparator3.setName("jSeparator3");

        jLabel7.setFont(new Font("Tahoma", 0, 14));
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText(bundle.getString("Caixa.jLabel7.text"));
        jLabel7.setName("jLabel7");

        txtCliente.setFont(new Font("Tahoma", 0, 14));
        txtCliente.setText(bundle.getString("Caixa.txtCliente.text"));
        txtCliente.setName("txtCliente");

        lbAdd.setFont(new Font("Tahoma", 1, 14));
        lbAdd.setForeground(new Color(255, 255, 255));
        lbAdd.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/add.png")));
        lbAdd.setText(bundle.getString("Caixa.lbAdd.text"));
        lbAdd.setName("lbAdd");
        lbAdd.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Caixa.this.lbAddMouseClicked(evt);
            }

        });
        lbRemove.setFont(new Font("Tahoma", 1, 14));
        lbRemove.setForeground(new Color(255, 255, 255));
        lbRemove.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/remove.png")));
        lbRemove.setText(bundle.getString("Caixa.lbRemove.text"));
        lbRemove.setName("lbRemove");
        lbRemove.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Caixa.this.lbRemoveMouseClicked(evt);
            }

        });
        lbDone.setFont(new Font("Tahoma", 1, 18));
        lbDone.setForeground(new Color(255, 255, 255));
        lbDone.setHorizontalAlignment(0);
        lbDone.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/setinha.png")));
        lbDone.setText(bundle.getString("Caixa.lbDone.text"));
        lbDone.setName("lbDone");
        lbDone.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Caixa.this.lbDoneMouseClicked(evt);
            }

        });
        txtTotal.setEditable(false);
        txtTotal.setFont(new Font("Tahoma", 0, 12));
        txtTotal.setText(bundle.getString("Caixa.txtTotal.text"));
        txtTotal.setName("txtTotal");

        jLabel9.setFont(new Font("Tahoma", 1, 12));
        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText(bundle.getString("Caixa.jLabel9.text"));
        jLabel9.setName("jLabel9");

        txtFuncionario.setFont(new Font("Tahoma", 0, 14));
        txtFuncionario.setText(bundle.getString("Caixa.txtFuncionario.text"));
        txtFuncionario.setName("txtFuncionario");

        jLabel16.setFont(new Font("Tahoma", 0, 14));
        jLabel16.setForeground(new Color(255, 255, 255));
        jLabel16.setText(bundle.getString("Caixa.jLabel16.text"));
        jLabel16.setName("jLabel16");

        label.setFont(new Font("Tahoma", 1, 12));
        label.setForeground(new Color(255, 255, 255));
        label.setHorizontalAlignment(0);
        label.setText(bundle.getString("Caixa.label.text"));
        label.setName("label");

        lbUsuario.setFont(new Font("Segoe UI", 1, 12));
        lbUsuario.setForeground(new Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(4);
        lbUsuario.setText(bundle.getString("Caixa.lbUsuario.text"));
        lbUsuario.setName("lbUsuario");

        jScrollPane1.setName("jScrollPane1");

        tabela.setModel(modelo);
        tabela.setName("tabela");
        jScrollPane1.setViewportView(tabela);

        jLabel17.setFont(new Font("Segoe UI", 0, 24));
        jLabel17.setForeground(new Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(0);
        jLabel17.setText(bundle.getString("Caixa.jLabel17.text"));
        jLabel17.setName("jLabel17");

        GroupLayout panelLayout = new GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
                panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(panelLayout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(panelLayout.createSequentialGroup()
                                                        .addGap(20, 20, 20)
                                                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(panelLayout.createSequentialGroup()
                                                                        .addComponent(jLabel17, -1, 428, 32767)
                                                                        .addGap(80, 80, 80))
                                                                .addGroup(panelLayout.createSequentialGroup()
                                                                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(panelLayout.createSequentialGroup()
                                                                                        .addComponent(jLabel9)
                                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                        .addComponent(txtTotal, -2, 119, -2))
                                                                                .addComponent(jScrollPane1, -2, -1, -2))
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))))
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lbRemove)
                                                .addGap(363, 363, 363)))
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(panelLayout.createSequentialGroup()
                                                        .addComponent(lbUsuario, -2, 329, -2)
                                                        .addGap(25, 25, 25))
                                                .addGroup(GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(panelLayout.createSequentialGroup()
                                                                        .addComponent(jLabel3)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jSeparator2, -2, 260, -2))
                                                                .addGroup(panelLayout.createSequentialGroup()
                                                                        .addComponent(jLabel6)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jSeparator3, -2, 180, -2))
                                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(panelLayout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(30, 30, 30)
                                                                                .addComponent(txtProduto, -2, 252, -2))
                                                                        .addGroup(panelLayout.createSequentialGroup()
                                                                                .addComponent(jLabel5)
                                                                                .addGap(38, 38, 38)
                                                                                .addComponent(txtQnt, -2, 74, -2)
                                                                                .addGap(6, 6, 6)
                                                                                .addComponent(label, -1, -1, 32767))
                                                                        .addGroup(panelLayout.createSequentialGroup()
                                                                                .addGap(80, 80, 80)
                                                                                .addComponent(lbAdd)))
                                                                .addGroup(panelLayout.createSequentialGroup()
                                                                        .addComponent(jLabel7)
                                                                        .addGap(67, 67, 67)
                                                                        .addComponent(txtCliente, -2, 187, -2))
                                                                .addGroup(panelLayout.createSequentialGroup()
                                                                        .addComponent(jLabel16)
                                                                        .addGap(37, 37, 37)
                                                                        .addComponent(txtFuncionario, -2, 187, -2)))
                                                        .addGap(22, 22, 22)))
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbDone, -1, 344, 32767)
                                                .addContainerGap()))));

        panelLayout.setVerticalGroup(
                panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelLayout.createSequentialGroup()
                                                                .addGap(61, 61, 61)
                                                                .addComponent(jLabel17))
                                                        .addGroup(panelLayout.createSequentialGroup()
                                                                .addGap(9, 9, 9)
                                                                .addComponent(lbUsuario, -2, 15, -2))))
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)))
                                .addGap(11, 11, 11)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jSeparator2, -2, 10, -2))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtProduto, -2, 36, -2)
                                                        .addComponent(jLabel4))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtQnt, -2, 36, -2)
                                                                .addComponent(jLabel5))
                                                        .addComponent(label, -2, 36, -2))
                                                .addGap(14, 14, 14)
                                                .addComponent(lbAdd)
                                                .addGap(29, 29, 29)
                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jSeparator3, -2, 10, -2))
                                                .addGap(18, 18, 18)
                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel7))
                                                        .addComponent(txtCliente, -2, 36, -2))
                                                .addGap(14, 14, 14)
                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(panelLayout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel16))
                                                        .addComponent(txtFuncionario, -2, 36, -2))
                                                .addGap(84, 84, 84))
                                        .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, -2, 363, -2))
                                .addGap(1, 1, 1)
                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addGroup(panelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbRemove)
                                                        .addComponent(jLabel9)
                                                        .addComponent(txtTotal, -1, 25, 32767))
                                                .addGap(27, 27, 27))
                                        .addGroup(panelLayout.createSequentialGroup()
                                                .addComponent(lbDone)
                                                .addContainerGap()))));


        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel, -1, -1, 32767));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(panel, -1, -1, 32767));
    }

    private void txtProdutoKeyReleased(KeyEvent evt) {
        try {
            setProdutoDesc();
        } catch (IndexOutOfBoundsException localIndexOutOfBoundsException) {
        }
    }

    private void lbAddMouseClicked(MouseEvent evt) {
        addProduto();
    }

    private void lbRemoveMouseClicked(MouseEvent evt) {
        removeProduto();
    }

    private void lbDoneMouseClicked(MouseEvent evt) {
        isThereVenda();
    }

    private void txtDinheiroKeyReleased(KeyEvent evt) {
        try {
            calculaTroco();
        } catch (NumberFormatException localNumberFormatException) {
        }
    }

    private void lbOKMouseClicked(MouseEvent evt) {
        terminaVenda();
    }

    private void comboMeioItemStateChanged(ItemEvent evt) {
        if (evt.getStateChange() == 1) {
            String forma = (String) ((JComboBox) evt.getSource()).getSelectedItem();

            if (forma.equals(PagamentoLogics.Avista)) {
                txtDinheiro.setEditable(true);
                comboForma.setSelectedItem(PagamentoLogics.Umavez);
                comboForma.setEnabled(false);
            } else {
                txtDinheiro.setEditable(false);
                comboForma.setEnabled(true);
            }
        }
    }

    private void txtDescontoKeyReleased(KeyEvent evt) {
        try {
            calcDesconto();
        } catch (NumberFormatException localNumberFormatException) {
        }
    }

    private void doneFrameClosing(WindowEvent evt) {
        componentsStatus(true);
    }

    private void txtProdutoKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10)
            addProduto();
    }

    private void txtQntKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            addProduto();
        }
    }

    private double getDinheiro() {
        double dinheiro = 0.0D;
        try {
            dinheiro = FmtMoney.toDouble(txtDinheiro.getText().trim().replace(",", "."));
        } catch (Exception localException) {
        }
        return dinheiro;
    }


    private double getTotal() {
        return FmtMoney.toDouble(txtTotalDoneFrame.getText().trim().replace(",", "."));
    }


    private void calcDesconto() {
        String desc = txtDesconto.getText().trim();

        double desconto = Double.parseDouble(desc.equals("") ? "0" : desc) / 100.0D;
        double total = FmtMoney.toDouble(txtTotal.getText());

        double novoTotal = total - total * desconto;

        txtTotalDoneFrame.setText(FmtMoney.toReal(novoTotal));
    }


    private void calculaTroco() {
        if (getTotal() < getDinheiro()) {
            txtTroco.setText(FmtMoney.toReal(getDinheiro() - getTotal()));
        }
    }


    private void addProduto() {
        if (!txtProduto.getText().isEmpty()) {
            int quantidade =
                    Integer.parseInt(txtQnt.getText().isEmpty() ? "1" : txtQnt.getText().trim());

            Produto p = kod.vankish.logics.ProdutoLogics.getProdutoCodBarras(txtProduto.getText().trim());

            if (p != null) {
                modelo.add(p, quantidade);
                atualizaTotal();
                clearField();
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Insira um produto");
            }
        }
    }


    private void removeProduto() {
        modelo.remove(tabela.getSelectedRow());
        atualizaTotal();
        clearField();
    }


    private void atualizaTotal() {
        txtTotal.setText(modelo.getTotal());
    }


    private void done(boolean devendo) {
        Formapagamento fp = null;
        try {
            fp = getFormaPagamento((String) comboForma.getSelectedItem());
        } catch (IndexOutOfBoundsException e) {
            ErrorMessage.advert("Escolha a quantidade de parcelas do pagamento");
            return;
        }

        Meiopagamento mp = null;
        try {
            mp = getMeioPagamento((String) comboMeio.getSelectedItem());
        } catch (IndexOutOfBoundsException e) {
            ErrorMessage.advert("Escolha o Meio de Pagamento");
            return;
        }


        Funcionario f = txtFuncionario.getText().isEmpty() ? null :
                getFuncionario(Integer.valueOf(Integer.parseInt(txtFuncionario.getText())));


        Cliente c = txtCliente.getText().isEmpty() ? null :
                ClienteLogics.get(Integer.valueOf(Integer.parseInt(txtCliente.getText())));


        Date hoje = new Date();
        Timestamp agora = new Timestamp(hoje.getTime());

        Venda v = new Venda(f, fp, mp, c, hoje, agora, FmtMoney.toBigDecimal(modelo.getTotal()), null);

        java.util.List<kod.vankish.pojo.Itemvendido> iv = modelo.done();

        kod.vankish.logics.VendasLogics.done(devendo, v, iv);

        componentsStatus(true);
        doneFrameClear();
        clean();
        doneFrame.setVisible(false);
    }


    private Funcionario getFuncionario(Integer id) {
        return (Funcionario) new Pesquisa(Funcionario.class).get(id);
    }


    private Formapagamento getFormaPagamento(String descricao) {
        return new PagamentoLogics().shcForma(descricao);
    }


    private Meiopagamento getMeioPagamento(String descricao) {
        return new PagamentoLogics().shcMeio(descricao);
    }


    public void componentsStatus(boolean status) {
        for (Component c : panel.getComponents()) {
            c.setEnabled(status);
        }
    }


    public void clean() {
        clearField();
        modelo.clear();
        txtTotal.setText(null);
    }


    private void clearField() {
        txtCliente.setText(null);
        txtFuncionario.setText(null);
        txtProduto.setText(null);
        txtQnt.setText(null);
        label.setText(null);
    }


    private void openDoneFrame() {
        txtTotalDoneFrame.setText(modelo.getTotal());
        componentsStatus(false);

        txtDinheiro.setEditable(true);
        comboForma.setEnabled(true);
        doneFrame.setVisible(true);
    }


    public void init() {
        setVisible(true);
        getFormasPagamento();
        getMeiosPagamento();

        doneFrame.setBounds(new GuiUtils().centraliza(345, 330));
        doneFrame.setIconImage(new GuiUtils().createIcon());
        user = CaixaFrame.getInstance().getUser();
        lbUsuario.setText("Usuario: " + user.getNome());
    }


    private void doneFrameClear() {
        comboForma.setSelectedIndex(0);
        comboMeio.setSelectedIndex(0);
        txtTotalDoneFrame.setText(null);
        txtDinheiro.setText(null);
        txtDesconto.setText(null);
        txtTotal.setText(null);
        txtTroco.setText(null);
        txtDinheiro.setVisible(true);
    }


    private void setProdutoDesc() {
        String conteudo = txtProduto.getText().trim();
        label.setText(kod.vankish.logics.ProdutoLogics.getProdutoCodBarras(conteudo).getDescricao());
    }


    private void terminaVenda() {
        Cliente c = txtCliente.getText().isEmpty() ? null :
                ClienteLogics.get(Integer.valueOf(Integer.parseInt(txtCliente.getText())));

        if (getTotal() <= getDinheiro()) {
            done(false);
        } else if ((getTotal() > getDinheiro()) && (c != null)) {
            done(true);
        } else {
            ErrorMessage.advert("Quantidade insuficiente de dinheiro!");
        }
    }


    private void isThereVenda() {
        if (!txtTotal.getText().isEmpty()) {
            openDoneFrame();
        } else {
            ErrorMessage.advert("Nenhuma venda registrada");
        }
    }


    private void getFormasPagamento() {
        comboForma.removeAllItems();
        for (String s : new PagamentoLogics().getDescricaoFormasPagamento()) {
            comboForma.addItem(s);
        }
    }


    private void getMeiosPagamento() {
        comboMeio.removeAllItems();
        for (String s : new PagamentoLogics().getDescricaoMeiosPagamento()) {
            comboMeio.addItem(s);
        }
    }
}
