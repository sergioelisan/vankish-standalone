package kod.vankish.gui;

import kod.database.utils.Pesquisa;
import kod.utils.DataUtils;
import kod.vankish.gui.tabelas.TabelaCaixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.Date;

public class Balanco extends JPanel {
    private static Balanco instance = new Balanco();

    private TabelaCaixa tabela = new TabelaCaixa();
    private ButtonGroup buttonGroup1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private JTable jtable;
    private JRadioButton rbMes;
    private JRadioButton rbOntem;
    private JRadioButton rbSemana;
    private JFormattedTextField txtDia;
    private Balanco() {
        initComponents();
        buttonGroup1.add(rbOntem);
        buttonGroup1.add(rbSemana);
        buttonGroup1.add(rbMes);
    }

    public static Balanco getInstance() {
        return instance;
    }

    private void search(Date data) {
        tabela.loadData(new Pesquisa(kod.vankish.pojo.Caixa.class).eq("data", data));
    }

    private void search(Date data, Date dataFinal) {
        tabela.loadData(new Pesquisa(kod.vankish.pojo.Caixa.class).between("data", data, dataFinal));
    }

    private void initComponents() {
        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        rbSemana = new JRadioButton();
        rbMes = new JRadioButton();
        jLabel3 = new JLabel();
        rbOntem = new JRadioButton();
        txtDia = new JFormattedTextField();
        jScrollPane1 = new JScrollPane();
        jtable = new JTable();
        jLabel2 = new JLabel();

        setBackground(new Color(180, 180, 180));

        jPanel1.setBackground(new Color(180, 180, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Periodo", 0, 0, new Font("Tahoma", 0, 11), new Color(255, 255, 255)));

        rbSemana.setBackground(new Color(180, 180, 180));
        rbSemana.setForeground(new Color(255, 255, 255));
        rbSemana.setText("Resultado por semana");
        rbSemana.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Balanco.this.rbSemanaActionPerformed(evt);
            }

        });
        rbMes.setBackground(new Color(180, 180, 180));
        rbMes.setForeground(new Color(255, 255, 255));
        rbMes.setText("Resultado por mes");
        rbMes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Balanco.this.rbMesActionPerformed(evt);
            }

        });
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Dia:");

        rbOntem.setBackground(new Color(180, 180, 180));
        rbOntem.setForeground(new Color(255, 255, 255));
        rbOntem.setText("Resultado de Ontem");
        rbOntem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Balanco.this.rbOntemActionPerformed(evt);
            }
        });
        try {
            txtDia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        txtDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                Balanco.this.txtDiaKeyPressed(evt);
            }

        });
        jtable.setModel(tabela);
        jScrollPane1.setViewportView(jtable);

        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent e) {
                Balanco.this.tableRowSelected();
            }

        });
        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(rbMes)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbSemana)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbOntem)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtDia, -2, 91, -2))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addComponent(jScrollPane1, -2, -1, -2)))
                                .addContainerGap(-1, 32767)));


        jPanel1Layout.linkSize(0, new java.awt.Component[]{rbMes, rbOntem, rbSemana});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, -1, 374, 32767)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(rbMes)
                                        .addComponent(rbSemana)
                                        .addComponent(rbOntem)
                                        .addComponent(jLabel3)
                                        .addComponent(txtDia, -2, -1, -2))
                                .addContainerGap()));


        jPanel1Layout.linkSize(1, new java.awt.Component[]{rbMes, rbOntem, rbSemana});

        jLabel2.setFont(new Font("Tahoma", 1, 18));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialCaixa.png")));
        jLabel2.setText(" Resultado do Movimento do Caixa");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(147, 147, 147)
                                                .addComponent(jPanel1, -2, -1, -2)))
                                .addContainerGap(170, 32767)));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, -1, -1, 32767)
                                .addContainerGap()));
    }

    private void tableRowSelected() {
        int row = jtable.getSelectedRow();
        Date data = DataUtils.toStandardDate((String) jtable.getValueAt(row, 0));
        CaixaLogs caixaLogs = new CaixaLogs(kod.vankish.logics.CaixaLogics.get(data));
        caixaLogs.setVisible(true);
        caixaLogs.setLogAtArea();
    }

    private void rbSemanaActionPerformed(ActionEvent evt) {
        search(DataUtils.lastWeek(), new Date());
    }

    private void rbMesActionPerformed(ActionEvent evt) {
        search(DataUtils.monthsBeginning(), new Date());
    }

    private void rbOntemActionPerformed(ActionEvent evt) {
        search(DataUtils.yesterday());
    }

    private void txtDiaKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            search(DataUtils.toStandardDate(txtDia.getText()));
            txtDia.setText(null);
        }
    }
}
