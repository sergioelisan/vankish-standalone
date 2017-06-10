package kod.vankish.gui;

import kod.utils.DataUtils;
import kod.vankish.logics.TrocaLogics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;

public class HistoricoTrocaPanel extends JPanel {
    private static HistoricoTrocaPanel instance = new HistoricoTrocaPanel();
    private JTextArea areaHistorico;
    private ButtonGroup btGroup;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private JRadioButton rbDia;
    private JRadioButton rbHoje;
    private JRadioButton rbMes;
    private JRadioButton rbSemana;
    private JFormattedTextField txtDia;

    private HistoricoTrocaPanel() {
        initComponents();

        btGroup.add(rbDia);
        btGroup.add(rbSemana);
        btGroup.add(rbHoje);
        btGroup.add(rbMes);
    }

    public static HistoricoTrocaPanel getInstance() {
        return instance;
    }

    private void initComponents() {
        btGroup = new ButtonGroup();
        jLabel1 = new JLabel();
        jPanel1 = new JPanel();
        rbHoje = new JRadioButton();
        rbSemana = new JRadioButton();
        rbMes = new JRadioButton();
        rbDia = new JRadioButton();
        txtDia = new JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaHistorico = new JTextArea();

        setBackground(new Color(180, 180, 180));
        setForeground(new Color(255, 255, 255));
        setName("Form");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialTroca.png")));
        ResourceBundle bundle = ResourceBundle.getBundle("kod/vankish/gui/Bundle");
        jLabel1.setText(bundle.getString("HistoricoTrocaPanel.jLabel1.text"));
        jLabel1.setName("jLabel1");

        jPanel1.setBackground(new Color(180, 180, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("HistoricoTrocaPanel.jPanel1.border.title"), 0, 0, new java.awt.Font("Tahoma", 0, 11), new Color(255, 255, 255)));
        jPanel1.setForeground(new Color(255, 255, 255));
        jPanel1.setName("jPanel1");

        rbHoje.setBackground(new Color(180, 180, 180));
        rbHoje.setForeground(new Color(255, 255, 255));
        rbHoje.setText(bundle.getString("HistoricoTrocaPanel.rbHoje.text"));
        rbHoje.setName("rbHoje");
        rbHoje.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HistoricoTrocaPanel.this.rbHojeActionPerformed(evt);
            }

        });
        rbSemana.setBackground(new Color(180, 180, 180));
        rbSemana.setForeground(new Color(255, 255, 255));
        rbSemana.setText(bundle.getString("HistoricoTrocaPanel.rbSemana.text"));
        rbSemana.setName("rbSemana");
        rbSemana.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HistoricoTrocaPanel.this.rbSemanaActionPerformed(evt);
            }

        });
        rbMes.setBackground(new Color(180, 180, 180));
        rbMes.setForeground(new Color(255, 255, 255));
        rbMes.setText(bundle.getString("HistoricoTrocaPanel.rbMes.text"));
        rbMes.setName("rbMes");
        rbMes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HistoricoTrocaPanel.this.rbMesActionPerformed(evt);
            }

        });
        rbDia.setBackground(new Color(180, 180, 180));
        rbDia.setForeground(new Color(255, 255, 255));
        rbDia.setText(bundle.getString("HistoricoTrocaPanel.rbDia.text"));
        rbDia.setName("rbDia");
        rbDia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HistoricoTrocaPanel.this.rbDiaActionPerformed(evt);
            }

        });
        txtDia.setEditable(false);
        try {
            txtDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDia.setName("txtDia");
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(KeyEvent evt) {
                HistoricoTrocaPanel.this.txtDiaKeyTyped(evt);
            }

        });
        jScrollPane2.setName("jScrollPane2");

        areaHistorico.setColumns(20);
        areaHistorico.setRows(5);
        areaHistorico.setName("areaHistorico");
        jScrollPane2.setViewportView(areaHistorico);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jScrollPane2, GroupLayout.Alignment.LEADING, -1, 864, 32767)
                                        .addGroup(GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(rbHoje)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbSemana)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbMes)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbDia)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtDia, -2, 72, -2)))
                                .addContainerGap()));


        jPanel1Layout.linkSize(0, new java.awt.Component[]{rbDia, rbHoje, rbMes, rbSemana});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, -1, 383, 32767)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbHoje)
                                        .addComponent(rbSemana)
                                        .addComponent(rbMes)
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
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, -2, 242, -2)
                                                .addGap(664, 664, 664))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel1, -1, -1, 32767)
                                                .addContainerGap()))));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(jPanel1, -2, -1, -2)
                                .addContainerGap()));
    }

    private void rbHojeActionPerformed(ActionEvent evt) {
        TrocaLogics.loadTextArea(new java.util.Date(), areaHistorico);
    }

    private void rbSemanaActionPerformed(ActionEvent evt) {
        TrocaLogics.loadTextArea(DataUtils.lastWeek(), new java.util.Date(), areaHistorico);
    }

    private void rbMesActionPerformed(ActionEvent evt) {
        TrocaLogics.loadTextArea(DataUtils.monthsBeginning(), DataUtils.monthsEnding(), areaHistorico);
    }

    private void rbDiaActionPerformed(ActionEvent evt) {
        txtDia.setEditable(true);
    }

    private void txtDiaKeyTyped(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            TrocaLogics.loadTextArea(DataUtils.toStandardDate(txtDia.getText().trim()), areaHistorico);
            txtDia.setText(null);
            txtDia.setEditable(false);
            rbDia.setSelected(false);
        }
    }
}
