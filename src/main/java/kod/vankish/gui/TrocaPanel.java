package kod.vankish.gui;

import kod.utils.formats.FmtMoney;
import kod.vankish.gui.tabelas.TabelaProdutoValor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ResourceBundle;

public class TrocaPanel extends JPanel {
    private static TrocaPanel instance = new TrocaPanel();

    private TabelaProdutoValor modeloProduto = new TabelaProdutoValor();
    private TabelaProdutoValor modeloTroca = new TabelaProdutoValor();
    private JButton btChange;
    private JCheckBox cbPago;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane3;
    private JLabel lbCliente;
    private JLabel lbProduto;
    private JLabel lbRmProduto;
    private JLabel lbRmTroca;
    private JLabel lbTroca;
    private JTable tabelaProduto;
    private JTable tabelaTroca;
    private JTextField txtCliente;
    private JTextField txtProduto;
    private JTextField txtSaldo;
    private JTextField txtTotalProduto;
    private JTextField txtTotalTroca;
    private JTextField txtTroca;
    public TrocaPanel() {
        initComponents();
    }

    public static TrocaPanel getInstance() {
        return instance;
    }

    private void initComponents() {
        jPanel1 = new JPanel();
        jPanel3 = new JPanel();
        txtProduto = new JTextField();
        jLabel2 = new JLabel();
        jLabel6 = new JLabel();
        txtTotalProduto = new JTextField();
        jScrollPane1 = new JScrollPane();
        tabelaProduto = new JTable();
        jLabel7 = new JLabel();
        txtTotalTroca = new JTextField();
        jScrollPane3 = new JScrollPane();
        tabelaTroca = new JTable();
        txtTroca = new JTextField();
        jLabel5 = new JLabel();
        lbProduto = new JLabel();
        lbTroca = new JLabel();
        lbRmProduto = new JLabel();
        lbRmTroca = new JLabel();
        jPanel2 = new JPanel();
        jLabel8 = new JLabel();
        btChange = new JButton();
        txtSaldo = new JTextField();
        jLabel9 = new JLabel();
        txtCliente = new JTextField();
        cbPago = new JCheckBox();
        lbCliente = new JLabel();
        jLabel1 = new JLabel();

        setName("Form");

        jPanel1.setBackground(new Color(102, 102, 102));
        jPanel1.setName("jPanel1");

        jPanel3.setBackground(new Color(102, 102, 102));
        ResourceBundle bundle = ResourceBundle.getBundle("kod/vankish/gui/Bundle");
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("TrocaPanel.jPanel3.border.title"), 0, 0, new Font("Tahoma", 0, 11), new Color(255, 255, 255)));
        jPanel3.setName("jPanel3");

        txtProduto.setText(bundle.getString("TrocaPanel.txtProduto.text"));
        txtProduto.setName("txtProduto");
        txtProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                TrocaPanel.this.txtProdutoKeyPressed(evt);
            }

            public void keyReleased(KeyEvent evt) {
                TrocaPanel.this.txtProdutoKeyReleased(evt);
            }

        });
        jLabel2.setFont(new Font("Tahoma", 1, 11));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText(bundle.getString("TrocaPanel.jLabel2.text"));
        jLabel2.setName("jLabel2");

        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText(bundle.getString("TrocaPanel.jLabel6.text"));
        jLabel6.setName("jLabel6");

        txtTotalProduto.setEditable(false);
        txtTotalProduto.setText(bundle.getString("TrocaPanel.txtTotalProduto.text"));
        txtTotalProduto.setName("txtTotalProduto");

        jScrollPane1.setName("jScrollPane1");

        tabelaProduto.setModel(modeloProduto);
        tabelaProduto.setName("tabelaProduto");
        jScrollPane1.setViewportView(tabelaProduto);

        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText(bundle.getString("TrocaPanel.jLabel7.text"));
        jLabel7.setName("jLabel7");

        txtTotalTroca.setEditable(false);
        txtTotalTroca.setText(bundle.getString("TrocaPanel.txtTotalTroca.text"));
        txtTotalTroca.setName("txtTotalTroca");

        jScrollPane3.setName("jScrollPane3");

        tabelaTroca.setModel(modeloTroca);
        tabelaTroca.setName("tabelaTroca");
        jScrollPane3.setViewportView(tabelaTroca);

        txtTroca.setText(bundle.getString("TrocaPanel.txtTroca.text"));
        txtTroca.setName("txtTroca");
        txtTroca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                TrocaPanel.this.txtTrocaKeyPressed(evt);
            }

            public void keyReleased(KeyEvent evt) {
                TrocaPanel.this.txtTrocaKeyReleased(evt);
            }

        });
        jLabel5.setFont(new Font("Tahoma", 1, 11));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText(bundle.getString("TrocaPanel.jLabel5.text"));
        jLabel5.setName("jLabel5");

        lbProduto.setForeground(new Color(255, 255, 255));
        lbProduto.setText(bundle.getString("TrocaPanel.lbProduto.text"));
        lbProduto.setName("lbProduto");

        lbTroca.setForeground(new Color(255, 255, 255));
        lbTroca.setText(bundle.getString("TrocaPanel.lbTroca.text"));
        lbTroca.setName("lbTroca");

        lbRmProduto.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/remove.png")));
        lbRmProduto.setText(bundle.getString("TrocaPanel.lbRmProduto.text"));
        lbRmProduto.setName("lbRmProduto");
        lbRmProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TrocaPanel.this.lbRmProdutoMouseClicked(evt);
            }

        });
        lbRmTroca.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/remove.png")));
        lbRmTroca.setText(bundle.getString("TrocaPanel.lbRmTroca.text"));
        lbRmTroca.setName("lbRmTroca");
        lbRmTroca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TrocaPanel.this.lbRmTrocaMouseClicked(evt);
            }

        });
        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(lbRmProduto)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbProduto, -1, 153, 32767)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTotalProduto, -2, 79, -2))
                                        .addComponent(jScrollPane1, -2, 308, -2)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(13, 13, 13)
                                                .addComponent(txtProduto, -1, 244, 32767)))
                                .addGap(132, 132, 132)
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(lbRmTroca)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbTroca, -1, 153, 32767)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtTotalTroca, -2, 79, -2))
                                        .addComponent(jScrollPane3, -2, 308, -2)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(13, 13, 13)
                                                .addComponent(txtTroca, -1, 257, 32767)))
                                .addContainerGap()));

        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtProduto)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, -2, 85, -2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbRmProduto, -2, 20, 32767)
                                                        .addComponent(lbProduto, -1, 20, 32767)
                                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel6)
                                                                .addComponent(txtTotalProduto))))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtTroca)
                                                        .addComponent(jLabel5))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, -2, 85, -2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbRmTroca, -2, 20, 32767)
                                                        .addComponent(lbTroca, -1, 20, 32767)
                                                        .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtTotalTroca)
                                                                .addComponent(jLabel7)))))
                                .addContainerGap()));


        jPanel2.setBackground(new Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, bundle.getString("TrocaPanel.jPanel2.border.title"), 0, 0, new Font("Tahoma", 0, 11), new Color(255, 255, 255)));
        jPanel2.setName("jPanel2");

        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText(bundle.getString("TrocaPanel.jLabel8.text"));
        jLabel8.setName("jLabel8");

        btChange.setBackground(new Color(189, 188, 188));
        btChange.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/troca.png")));
        btChange.setText(bundle.getString("TrocaPanel.btChange.text"));
        btChange.setName("btChange");
        btChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                TrocaPanel.this.btChangeActionPerformed(evt);
            }

        });
        txtSaldo.setEditable(false);
        txtSaldo.setText(bundle.getString("TrocaPanel.txtSaldo.text"));
        txtSaldo.setName("txtSaldo");

        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText(bundle.getString("TrocaPanel.jLabel9.text"));
        jLabel9.setName("jLabel9");

        txtCliente.setText(bundle.getString("TrocaPanel.txtCliente.text"));
        txtCliente.setName("txtCliente");
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                TrocaPanel.this.txtClienteKeyReleased(evt);
            }

        });
        cbPago.setBackground(new Color(102, 102, 102));
        cbPago.setForeground(new Color(255, 255, 255));
        cbPago.setText(bundle.getString("TrocaPanel.cbPago.text"));
        cbPago.setName("cbPago");

        lbCliente.setForeground(new Color(255, 255, 255));
        lbCliente.setText(bundle.getString("TrocaPanel.lbCliente.text"));
        lbCliente.setName("lbCliente");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(cbPago)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 574, 32767)
                                                .addComponent(btChange))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel8))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtCliente)
                                                        .addComponent(txtSaldo, -1, 114, 32767))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbCliente, -2, 291, -2)))
                                .addContainerGap()));

        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(txtSaldo, -2, -1, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(txtCliente, -2, -1, -2)
                                        .addComponent(lbCliente, -2, 18, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
                                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(btChange)
                                        .addComponent(cbPago))
                                .addContainerGap()));


        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialTroca.png")));
        jLabel1.setText(bundle.getString("TrocaPanel.jLabel1.text"));
        jLabel1.setName("jLabel1");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jPanel2, -1, -1, 32767)
                                                        .addComponent(jPanel3, -1, -1, 32767))))
                                .addContainerGap(61, 32767)));

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addGap(49, 49, 49)
                                .addComponent(jPanel3, -2, -1, -2)
                                .addGap(41, 41, 41)
                                .addComponent(jPanel2, -2, -1, -2)
                                .addContainerGap(84, 32767)));


        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 882, 32767)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, 32767)
                                        .addComponent(jPanel1, -2, -1, -2)
                                        .addGap(0, 0, 32767))));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 570, 32767)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, 32767)
                                        .addComponent(jPanel1, -2, -1, -2)
                                        .addGap(0, 0, 32767))));
    }

    private void txtProdutoKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            addItem(modeloProduto, kod.vankish.logics.ProdutoLogics.getProdutoCodBarras(txtProduto.getText().trim()));
            setTotal(modeloProduto, txtTotalProduto);

            txtProduto.setText(null);
        }
    }

    private void txtProdutoKeyReleased(KeyEvent evt) {
        try {
            lbProduto.setText(kod.vankish.logics.TrocaLogics.getDescricaoProduto(txtProduto.getText().trim()));
        } catch (Exception localException) {
        }
    }

    private void txtTrocaKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            kod.vankish.pojo.Produto p = kod.vankish.logics.ProdutoLogics.getProdutoCodBarras(txtTroca.getText().trim());

            try {
                if (kod.vankish.logics.ProdutoLogics.isThereQuantidadeSuficiente(p, 1)) {
                    addItem(modeloTroca, p);
                    setTotal(modeloTroca, txtTotalTroca);
                    txtTroca.setText(null);
                    saldo();
                }
            } catch (Exception e) {
                kod.exceptions.util.ErrorMessage.advert(e.getMessage());
            }
        }
    }

    private void txtTrocaKeyReleased(KeyEvent evt) {
        try {
            lbTroca.setText(kod.vankish.logics.TrocaLogics.getDescricaoProduto(txtTroca.getText().trim()));
        } catch (Exception localException) {
        }
    }

    private void lbRmProdutoMouseClicked(MouseEvent evt) {
        rmItem(modeloProduto, tabelaProduto.getSelectedRow());
        setTotal(modeloProduto, txtTotalProduto);
    }

    private void lbRmTrocaMouseClicked(MouseEvent evt) {
        rmItem(modeloTroca, tabelaTroca.getSelectedRow());
        setTotal(modeloTroca, txtTotalTroca);
    }

    private void btChangeActionPerformed(ActionEvent evt) {
        release();
    }

    private void txtClienteKeyReleased(KeyEvent evt) {
        setClienteDesc();
    }

    private void addItem(TabelaProdutoValor tabela, kod.vankish.pojo.Produto produto) {
        tabela.add(produto);
    }


    private void rmItem(TabelaProdutoValor tabela, int index) {
        tabela.remove(index);
    }


    private void setTotal(TabelaProdutoValor tabela, JTextField campo) {
        campo.setText(tabela.getTotal());
    }


    private void clearFields() {
        txtCliente.setText(null);
        txtProduto.setText(null);
        txtSaldo.setText(null);
        txtTotalProduto.setText(null);
        txtTotalTroca.setText(null);
        txtTroca.setText(null);
        lbProduto.setText(null);
        lbTroca.setText(null);
        lbCliente.setText(null);
        cbPago.setVisible(false);
    }


    private void saldo() {
        double produtos = FmtMoney.toDouble(txtTotalProduto.getText());
        double trocas = FmtMoney.toDouble(txtTotalTroca.getText());

        double saldo = produtos - trocas;

        if (saldo >= 0.0D) {
            cbPago.setVisible(false);
        } else {
            cbPago.setVisible(true);
        }
        txtSaldo.setText(FmtMoney.toReal(saldo));
    }


    private void eraseTables() {
        modeloProduto.clean();
        modeloTroca.clean();
    }


    private void release() {
        kod.vankish.pojo.Cliente c = txtCliente.getText().isEmpty() ? null :
                kod.vankish.logics.ClienteLogics.get(Integer.valueOf(Integer.parseInt(txtCliente.getText())));

        kod.vankish.logics.TrocaLogics.releaseChange(
                modeloProduto.getProdutos(),
                modeloTroca.getProdutos(),
                FmtMoney.toDouble(txtSaldo.getText()),
                c,
                cbPago.isSelected());

        clearFields();
        eraseTables();
    }


    private void setClienteDesc() {
        kod.vankish.pojo.Cliente c = kod.vankish.logics.ClienteLogics.get(Integer.valueOf(Integer.parseInt(txtCliente.getText())));
        lbCliente.setText(c.getNome());
    }
}
