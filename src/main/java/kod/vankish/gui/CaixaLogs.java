package kod.vankish.gui;

import kod.utils.GuiUtils;

import javax.swing.*;
import java.util.ResourceBundle;

public class CaixaLogs extends javax.swing.JFrame {
    private kod.vankish.pojo.Caixa x;
    private JTextArea areaLog;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;

    public CaixaLogs(kod.vankish.pojo.Caixa x) {
        initComponents();
        this.x = x;
        areaLog.setEditable(false);
    }

    private java.awt.Rectangle centraliza() {
        return new GuiUtils().centraliza(685, 500);
    }

    private java.awt.Image icone() {
        return new GuiUtils().createIcon();
    }

    public void setLogAtArea() {
        areaLog.setText(kod.vankish.logics.CaixaLogger.getLog(x));
    }


    private void initComponents() {
        jPanel1 = new JPanel();
        jScrollPane1 = new JScrollPane();
        areaLog = new JTextArea();
        jLabel1 = new JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(2);
        ResourceBundle bundle = ResourceBundle.getBundle("kod/vankish/gui/Bundle");
        setTitle(bundle.getString("CaixaLogs.title"));
        setBounds(centraliza());
        setIconImage(icone());
        setName("Form");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setName("jPanel1");

        jScrollPane1.setName("jScrollPane1");

        areaLog.setColumns(20);
        areaLog.setRows(5);
        areaLog.setName("areaLog");
        jScrollPane1.setViewportView(areaLog);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(bundle.getString("CaixaLogs.jLabel1.text"));
        jLabel1.setName("jLabel1");

        jSeparator1.setName("jSeparator1");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, -1, 662, 32767)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jSeparator1, -1, 419, 32767)))
                                .addContainerGap()));

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jSeparator1, -2, 10, -2))
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, -1, 443, 32767)
                                .addContainerGap()));


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
}
