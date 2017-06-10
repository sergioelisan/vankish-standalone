package kod.vankish.gui;

import kod.vankish.logics.VendaLogger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;

public class Fechamento extends JPanel {
    private static Fechamento instance = new Fechamento();
    private JTextArea areaHistorico;
    private JButton btFecharCaixa;
    private ButtonGroup buttonGroup1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane2;
    private JRadioButton rbDia;
    private JRadioButton rbHoje;
    private JFormattedTextField txtDia;

    public Fechamento() {
        initComponents();
        buttonGroup1.add(rbDia);
        buttonGroup1.add(rbHoje);
    }

    public static Fechamento getInstance() {
        return instance;
    }

    private void initComponents() {
        buttonGroup1 = new ButtonGroup();
        jPanel2 = new JPanel();
        btFecharCaixa = new JButton();
        jLabel2 = new JLabel();
        jPanel1 = new JPanel();
        rbHoje = new JRadioButton();
        rbDia = new JRadioButton();
        jScrollPane2 = new JScrollPane();
        areaHistorico = new JTextArea();
        txtDia = new JFormattedTextField();

        setBackground(new Color(102, 102, 102));
        setName("Form");

        jPanel2.setBackground(new Color(102, 102, 102));
        ResourceBundle bundle = ResourceBundle.getBundle("kod/vankish/gui/Bundle");
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("Fechamento.jPanel2.border.title"), 0, 0, new Font("Tahoma", 0, 11), new Color(255, 255, 255)));
        jPanel2.setName("jPanel2");

        btFecharCaixa.setBackground(new Color(189, 188, 188));
        btFecharCaixa.setText(bundle.getString("Fechamento.btFecharCaixa.text"));
        btFecharCaixa.setName("btFecharCaixa");
        btFecharCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Fechamento.this.btFecharCaixaActionPerformed(evt);
            }

        });
        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btFecharCaixa, -1, 113, 32767)
                                .addContainerGap()));

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btFecharCaixa)
                                .addContainerGap(-1, 32767)));


        jLabel2.setBackground(new Color(189, 188, 188));
        jLabel2.setFont(new Font("Tahoma", 1, 18));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialCaixa.png")));
        jLabel2.setText(bundle.getString("Fechamento.jLabel2.text"));
        jLabel2.setName("jLabel2");

        jPanel1.setBackground(new Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("Fechamento.jPanel1.border.title"), 0, 0, new Font("Tahoma", 0, 11), new Color(255, 255, 255)));
        jPanel1.setName("jPanel1");

        rbHoje.setBackground(new Color(102, 102, 102));
        rbHoje.setForeground(new Color(255, 255, 255));
        rbHoje.setText(bundle.getString("Fechamento.rbHoje.text"));
        rbHoje.setName("rbHoje");
        rbHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Fechamento.this.rbHojeActionPerformed(evt);
            }

        });
        rbDia.setBackground(new Color(102, 102, 102));
        rbDia.setForeground(new Color(255, 255, 255));
        rbDia.setText(bundle.getString("Fechamento.rbDia.text"));
        rbDia.setName("rbDia");
        rbDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Fechamento.this.rbDiaActionPerformed(evt);
            }

        });
        jScrollPane2.setName("jScrollPane2");

        areaHistorico.setColumns(20);
        areaHistorico.setRows(5);
        areaHistorico.setName("areaHistorico");
        jScrollPane2.setViewportView(areaHistorico);

        txtDia.setEditable(false);
        try {
            txtDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDia.setName("txtDia");
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                Fechamento.this.txtDiaKeyTyped(evt);
            }

        });
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, GroupLayout.Alignment.LEADING, -1, 835, 32767)
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbHoje)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbDia)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDia, -2, 87, -2)))
                                .addContainerGap()));


        jPanel1Layout.linkSize(0, new java.awt.Component[]{rbDia, rbHoje});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, -1, 305, 32767)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbHoje)
                                        .addComponent(rbDia)
                                        .addComponent(txtDia, -2, -1, -2))
                                .addContainerGap()));


        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jPanel1, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
                                        .addComponent(jPanel2, GroupLayout.Alignment.TRAILING, -2, -1, -2))
                                .addContainerGap()));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, -2, -1, -2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
                                .addComponent(jPanel2, -2, -1, -2)
                                .addContainerGap()));
    }

    private void btFecharCaixaActionPerformed(ActionEvent evt) {
        int input = javax.swing.JOptionPane.showConfirmDialog(
                null, "Fechar o Caixa?", "Fechamento de Caixa", 2);

        if (input == 0)
            kod.vankish.logics.CaixaLogics.close();
    }

    private void rbHojeActionPerformed(ActionEvent evt) {
        new VendaLogger().writeInTextArea(areaHistorico);
    }

    private void rbDiaActionPerformed(ActionEvent evt) {
        txtDia.setEditable(true);
    }

    private void txtDiaKeyTyped(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            new VendaLogger().writeInTextArea(kod.utils.DataUtils.toStandardDate(txtDia.getText()), areaHistorico);
        }
    }
}
