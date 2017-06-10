package kod.vankish.gui;

import kod.utils.GuiUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.logics.CaixaLogics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;

public final class SaldoCaixa extends javax.swing.JFrame {
    private Color vermelho = new Color(153, 0, 51);
    private Color verde = new Color(51, 102, 0);
    private ButtonGroup btgroup;
    private JRadioButton cbCreditar;
    private JRadioButton cbDebitar;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel4;
    private JSeparator jSeparator1;
    private JSeparator jSeparator2;
    private JLabel lbEstadoCaixa;
    private JFormattedTextField txtCreditar;
    private JFormattedTextField txtDebitar;

    public SaldoCaixa() {
        super("Controle do Saldo do Caixa");
        initComponents();
        btgroup.add(cbDebitar);
        btgroup.add(cbCreditar);
        setBounds(new GuiUtils().centraliza(480, 180));
        setIconImage(new GuiUtils().createIcon());
        new GuiUtils().setSystemLookAndFeel(this);
        setEstadoCaixa();
        setResizable(false);
    }

    private void setEstadoCaixa() {
        String caixa = FmtMoney.toReal(CaixaLogics.actualCaixa().getSaldo());

        if (FmtMoney.toDouble(caixa) < 0.0D) {
            lbEstadoCaixa.setForeground(vermelho);
        } else {
            lbEstadoCaixa.setForeground(verde);
        }
        lbEstadoCaixa.setText("Caixa: " + caixa);
    }

    private void initComponents() {
        btgroup = new ButtonGroup();
        jPanel1 = new JPanel();
        jPanel4 = new JPanel();
        lbEstadoCaixa = new JLabel();
        cbCreditar = new JRadioButton();
        cbDebitar = new JRadioButton();
        txtCreditar = new JFormattedTextField();
        txtDebitar = new JFormattedTextField();
        jLabel1 = new JLabel();
        jSeparator1 = new JSeparator();
        jLabel2 = new JLabel();
        jSeparator2 = new JSeparator();

        setDefaultCloseOperation(2);
        setName("Form");

        jPanel1.setBackground(new Color(102, 102, 102));
        jPanel1.setName("jPanel1");

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setName("jPanel4");

        lbEstadoCaixa.setFont(new java.awt.Font("Segoe UI", 1, 18));
        lbEstadoCaixa.setForeground(new Color(153, 0, 51));
        lbEstadoCaixa.setHorizontalAlignment(0);
        ResourceBundle bundle = ResourceBundle.getBundle("kod/vankish/gui/Bundle");
        lbEstadoCaixa.setText(bundle.getString("SaldoCaixa.lbEstadoCaixa.text"));
        lbEstadoCaixa.setName("lbEstadoCaixa");

        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbEstadoCaixa, -1, 181, 32767)
                                .addContainerGap()));

        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(-1, 32767)
                                .addComponent(lbEstadoCaixa, -2, 29, -2)
                                .addContainerGap()));


        cbCreditar.setBackground(new Color(102, 102, 102));
        cbCreditar.setForeground(new Color(255, 255, 255));
        cbCreditar.setText(bundle.getString("SaldoCaixa.cbCreditar.text"));
        cbCreditar.setName("cbCreditar");
        cbCreditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SaldoCaixa.this.cbCreditarActionPerformed(evt);
            }

        });
        cbDebitar.setBackground(new Color(102, 102, 102));
        cbDebitar.setForeground(new Color(255, 255, 255));
        cbDebitar.setText(bundle.getString("SaldoCaixa.cbDebitar.text"));
        cbDebitar.setName("cbDebitar");
        cbDebitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                SaldoCaixa.this.cbDebitarActionPerformed(evt);
            }

        });
        txtCreditar.setEditable(false);
        txtCreditar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtCreditar.setText(bundle.getString("SaldoCaixa.txtCreditar.text"));
        txtCreditar.setName("txtCreditar");
        txtCreditar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                SaldoCaixa.this.txtCreditarKeyPressed(evt);
            }

        });
        txtDebitar.setEditable(false);
        txtDebitar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        txtDebitar.setText(bundle.getString("SaldoCaixa.txtDebitar.text"));
        txtDebitar.setName("txtDebitar");
        txtDebitar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                SaldoCaixa.this.txtDebitarKeyPressed(evt);
            }

        });
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText(bundle.getString("SaldoCaixa.jLabel1.text"));
        jLabel1.setName("jLabel1");

        jSeparator1.setName("jSeparator1");

        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText(bundle.getString("SaldoCaixa.jLabel2.text"));
        jLabel2.setName("jLabel2");

        jSeparator2.setName("jSeparator2");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jSeparator1, -2, 140, -2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbCreditar)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtCreditar, -2, 114, -2))
                                        .addComponent(jPanel4, GroupLayout.Alignment.TRAILING, -1, -1, 32767))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jSeparator2, -2, 144, -2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbDebitar)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtDebitar, -2, 114, -2)))
                                .addContainerGap()));


        jPanel1Layout.linkSize(0, new java.awt.Component[]{cbCreditar, cbDebitar});

        jPanel1Layout.linkSize(0, new java.awt.Component[]{txtCreditar, txtDebitar});

        jPanel1Layout.linkSize(0, new java.awt.Component[]{jSeparator1, jSeparator2});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jSeparator2, -2, 10, -2)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbDebitar)
                                                        .addComponent(txtDebitar, -2, -1, -2)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel4, -2, -1, -2)
                                                .addGap(15, 15, 15)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jSeparator1, -2, 10, -2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbCreditar)
                                                        .addComponent(txtCreditar, -2, -1, -2))))
                                .addContainerGap(20, 32767)));


        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, -1, -1, 32767));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, -1, -1, 32767));


        pack();
    }

    private void cbCreditarActionPerformed(ActionEvent evt) {
        txtCreditar.setEditable(true);
        txtCreditar.requestFocus();
    }

    private void cbDebitarActionPerformed(ActionEvent evt) {
        txtDebitar.setEditable(true);
        txtDebitar.requestFocus();
    }

    private void txtDebitarKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            CaixaLogics.debita(FmtMoney.toDouble(txtDebitar.getText()),
                    "Debitado pelo usuario: " + MainFrame.getInstance().getUser().getNome());
            txtDebitar.setText(null);
            txtDebitar.setEditable(false);
            cbDebitar.setSelected(false);
            cbDebitar.requestFocus();
            setEstadoCaixa();
        }
    }

    private void txtCreditarKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            CaixaLogics.credita(FmtMoney.toDouble(txtCreditar.getText()),
                    "Creditado pelo usuario: " + MainFrame.getInstance().getUser().getNome());
            txtCreditar.setText(null);
            txtCreditar.setEditable(false);
            cbCreditar.setSelected(false);
            cbCreditar.requestFocus();
            setEstadoCaixa();
        }
    }
}
