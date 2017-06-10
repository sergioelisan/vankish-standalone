package kod.vankish.gui;

import kod.database.utils.Pesquisa;
import kod.exceptions.CaractereInvalidoException;
import kod.exceptions.util.ErrorMessage;
import kod.utils.DataUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Pagamento;
import kod.vankish.pojo.Recebimento;
import kod.vankish.pojo.interfaces.Contas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.util.Date;

public class CadastroContas extends Controle<Contas> {
    private static CadastroContas instance = new CadastroContas();
    private JButton btNovo;
    private JButton btSalvar;
    private ButtonGroup buttonGroup1;
    private JCheckBox cbPago;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JToolBar jToolBar1;
    private JTable jtable;
    private JLabel lbPesquisando;
    private JRadioButton rbPagar;
    private JRadioButton rbReceber;
    private JTextField txtBeneficiario;
    private JTextField txtCode;
    private JTextField txtDesconto;
    private JTextField txtDescricao;
    private JTextField txtDoc;
    private JTextField txtJuros;
    private JTextField txtLancamento;
    private JTextField txtMulta;
    private JTextField txtPagamento;
    private JTextField txtPesquisa;
    private JTextField txtSaldo;
    private JTextField txtTipoDoc;
    private JTextField txtValor;
    private JFormattedTextField txtVencimento;
    private CadastroContas() {
        tabela = new kod.vankish.gui.tabelas.TabelaContas();
        classe = Contas.class;
        initComponents();

        buttonGroup1.add(rbPagar);
        buttonGroup1.add(rbReceber);
        activeComponents(false, false);
    }

    public static CadastroContas getInstance() {
        return instance;
    }

    private void initComponents() {
        buttonGroup1 = new ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable = new JTable();
        jLabel1 = new JLabel();
        txtPesquisa = new JTextField();
        jToolBar1 = new JToolBar();
        btNovo = new JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btSalvar = new JButton();
        jLabel19 = new JLabel();
        lbPesquisando = new JLabel();
        txtMulta = new JTextField();
        txtCode = new JTextField();
        txtJuros = new JTextField();
        jLabel13 = new JLabel();
        jLabel9 = new JLabel();
        txtValor = new JTextField();
        jLabel6 = new JLabel();
        jLabel8 = new JLabel();
        txtTipoDoc = new JTextField();
        jLabel7 = new JLabel();
        txtDoc = new JTextField();
        jLabel5 = new JLabel();
        txtDesconto = new JTextField();
        jLabel10 = new JLabel();
        jLabel4 = new JLabel();
        txtBeneficiario = new JTextField();
        jLabel2 = new JLabel();
        txtDescricao = new JTextField();
        jLabel3 = new JLabel();
        cbPago = new JCheckBox();
        rbReceber = new JRadioButton();
        rbPagar = new JRadioButton();
        txtPagamento = new JTextField();
        jLabel11 = new JLabel();
        txtSaldo = new JTextField();
        jLabel12 = new JLabel();
        txtLancamento = new JTextField();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        jLabel16 = new JLabel();
        jSeparator3 = new JSeparator();
        jSeparator4 = new JSeparator();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        txtVencimento = new JFormattedTextField();

        setBackground(new Color(180, 180, 180));

        jtable.setModel(tabela);
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                CadastroContas.this.jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable);

        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Pesquisa:");

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                CadastroContas.this.txtPesquisaKeyReleased(evt);
            }

        });
        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jToolBar1.setRollover(true);

        btNovo.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/new.png")));
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalTextPosition(4);
        btNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CadastroContas.this.btNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNovo);
        jToolBar1.add(jSeparator1);

        btSalvar.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/save.png")));
        btSalvar.setText("Salvar");
        btSalvar.setFocusable(false);
        btSalvar.setHorizontalTextPosition(4);
        btSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CadastroContas.this.btSalvarActionPerformed(evt);
            }
        });
        jToolBar1.add(btSalvar);

        jLabel19.setHorizontalAlignment(11);
        jLabel19.setText("                 (Para adicionar uma nova conta clique em \"Novo\")");
        jToolBar1.add(jLabel19);

        txtMulta.setNextFocusableComponent(txtDesconto);

        txtCode.setEditable(false);

        txtJuros.setNextFocusableComponent(txtMulta);

        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText("Vencimento");

        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("Multa (%)");

        txtValor.setNextFocusableComponent(txtJuros);

        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("Codigo");

        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Juros (%)");

        txtTipoDoc.setNextFocusableComponent(txtValor);

        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("Valor (R$)");

        txtDoc.setNextFocusableComponent(txtTipoDoc);

        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Tipo Documento");

        txtDesconto.setNextFocusableComponent(txtVencimento);

        jLabel10.setForeground(new Color(255, 255, 255));
        jLabel10.setText("Desconto (R$)");

        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("N Documento");

        txtBeneficiario.setNextFocusableComponent(txtDescricao);

        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Beneficiario");

        txtDescricao.setNextFocusableComponent(txtDoc);

        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Descricao");

        cbPago.setBackground(new Color(180, 180, 180));
        cbPago.setForeground(new Color(255, 255, 255));
        cbPago.setText("Pago ?");

        rbReceber.setBackground(new Color(180, 180, 180));
        rbReceber.setForeground(new Color(255, 255, 255));
        rbReceber.setText("A Receber ");
        rbReceber.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CadastroContas.this.rbReceberActionPerformed(evt);
            }

        });
        rbPagar.setBackground(new Color(180, 180, 180));
        rbPagar.setForeground(new Color(255, 255, 255));
        rbPagar.setText("A Pagar");
        rbPagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                CadastroContas.this.rbPagarActionPerformed(evt);
            }

        });
        txtPagamento.setEditable(false);

        jLabel11.setForeground(new Color(255, 255, 255));
        jLabel11.setText("Saldo (R$)");

        txtSaldo.setEditable(false);

        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText("Lancamento");

        txtLancamento.setEditable(false);

        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText("Pago dia");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel15.setForeground(new Color(255, 255, 255));
        jLabel15.setText("Dados da Conta");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel16.setForeground(new Color(255, 255, 255));
        jLabel16.setText("Propriedades da Conta");

        jLabel17.setForeground(new Color(255, 255, 255));
        jLabel17.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/reload.png")));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                CadastroContas.this.jLabel17MouseClicked(evt);
            }

        });
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel18.setForeground(new Color(255, 255, 255));
        jLabel18.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialContas.png")));
        jLabel18.setText(" Controle de Contas");
        try {
            txtVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        txtVencimento.setNextFocusableComponent(txtValor);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel18)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel1)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txtPesquisa, -2, 190, -2)
                                                                        .addGap(10, 10, 10)
                                                                        .addComponent(lbPesquisando, -2, 271, -2)))
                                                        .addGap(386, 386, 386))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jToolBar1, -1, -1, 32767)
                                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addComponent(jLabel15)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jSeparator3))
                                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addGap(10, 10, 10)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel6))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(txtCode)
                                                                                .addComponent(txtTipoDoc)
                                                                                .addComponent(txtDoc, -1, 136, 32767)
                                                                                .addComponent(txtDescricao)
                                                                                .addComponent(txtBeneficiario, -2, -1, -2))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel7)
                                                                                                .addComponent(jLabel8)
                                                                                                .addComponent(jLabel9)
                                                                                                .addComponent(jLabel10))
                                                                                        .addGap(18, 18, 18)
                                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(txtJuros, -2, -1, -2)
                                                                                                .addComponent(txtValor, -2, 102, -2)
                                                                                                .addComponent(txtMulta, -2, -1, -2)
                                                                                                .addComponent(txtDesconto, -2, -1, -2)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel13)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(txtVencimento, -2, 82, -2)))))
                                                        .addGap(18, 18, 32767)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(rbReceber)
                                                                .addComponent(cbPago)
                                                                .addComponent(rbPagar, -2, 77, -2))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jLabel12)
                                                                                        .addComponent(jLabel14))
                                                                                .addComponent(jLabel11, -2, 44, -2))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addComponent(txtPagamento, -2, -1, -2)
                                                                                .addComponent(txtLancamento, -2, -1, -2)
                                                                                .addComponent(txtSaldo, -1, 127, 32767)))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel16)
                                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addComponent(jSeparator4, -2, 65, -2)))
                                                        .addGap(107, 107, 107)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel17)
                                                        .addComponent(jScrollPane1, -2, 897, -2))
                                                .addContainerGap()))));


        layout.linkSize(0, new Component[]{jLabel2, jLabel3, jLabel4, jLabel5, jLabel6});

        layout.linkSize(0, new Component[]{jLabel10, jLabel13, jLabel7, jLabel8, jLabel9});

        layout.linkSize(0, new Component[]{txtBeneficiario, txtCode, txtDesconto, txtDescricao, txtDoc, txtJuros, txtMulta, txtTipoDoc, txtValor, txtVencimento});

        layout.linkSize(0, new Component[]{jLabel11, jLabel12, jLabel14});

        layout.linkSize(0, new Component[]{txtLancamento, txtPagamento, txtSaldo});

        layout.linkSize(0, new Component[]{rbPagar, rbReceber});

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel18)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(txtPesquisa, -2, -1, -2)))
                                                        .addComponent(lbPesquisando, -2, 20, -2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(-1, 32767)
                                                .addComponent(jLabel17)
                                                .addGap(14, 14, 14)))
                                .addComponent(jScrollPane1, -2, 201, -2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jToolBar1, -2, 40, -2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel16)
                                        .addComponent(jSeparator4, -2, 10, -2)
                                        .addComponent(jSeparator3, -2, 10, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel6)
                                                        .addComponent(txtCode, -2, -1, -2)
                                                        .addComponent(jLabel7)
                                                        .addComponent(txtValor, -2, -1, -2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txtBeneficiario, -2, -1, -2)
                                                        .addComponent(jLabel8)
                                                        .addComponent(txtJuros, -2, -1, -2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtDescricao, -2, -1, -2)
                                                        .addComponent(jLabel9)
                                                        .addComponent(txtMulta, -2, -1, -2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtDoc, -2, -1, -2)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel10)
                                                        .addComponent(txtDesconto, -2, -1, -2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(txtTipoDoc, -2, -1, -2)
                                                        .addComponent(jLabel13)
                                                        .addComponent(txtVencimento, -2, -1, -2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbPagar)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rbReceber)
                                                .addGap(29, 29, 29)
                                                .addComponent(cbPago))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel14, -2, 19, -2)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel12)
                                                        .addGap(29, 29, 29))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtSaldo, -2, -1, -2)
                                                                .addComponent(jLabel11))
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtLancamento, -2, -1, -2)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtPagamento, -2, -1, -2))))
                                .addContainerGap(30, 32767)));
    }

    private void btNovoActionPerformed(ActionEvent evt) {
        clearFields();
        txtBeneficiario.setEditable(true);
        conservData(true);
        activeComponents(true, true);
    }

    private void btSalvarActionPerformed(ActionEvent evt) {
        classe = (rbReceber.isSelected() ? Recebimento.class : rbPagar.isSelected() ? Pagamento.class : null);
        if (classe != null) {
            save();
        } else
            ErrorMessage.advert("Selecione um tipo de Conta!");
        activeComponents(false, false);
    }

    private void jtableMouseClicked(MouseEvent evt) {
        activeComponents(false, true);
        getTableData();
    }

    private void jLabel17MouseClicked(MouseEvent evt) {
        classe = Contas.class;
        updateTable();
    }

    private void txtPesquisaKeyReleased(KeyEvent evt) {
        pesquisa();
    }

    private void rbReceberActionPerformed(ActionEvent evt) {
        txtBeneficiario.setText(getClientName());
        txtBeneficiario.setEditable(false);
    }

    private void rbPagarActionPerformed(ActionEvent evt) {
        txtBeneficiario.setText(null);
        txtBeneficiario.setEditable(true);
    }

    protected void getTableData() {
        int linha = jtable.getSelectedRow();

        txtCode.setText(String.valueOf((Integer) jtable.getValueAt(linha, 0)));
        txtBeneficiario.setText((String) jtable.getValueAt(linha, 2));
        txtDescricao.setText((String) jtable.getValueAt(linha, 3));
        txtDoc.setText((String) jtable.getValueAt(linha, 4));
        txtTipoDoc.setText((String) jtable.getValueAt(linha, 5));
        txtValor.setText((String) jtable.getValueAt(linha, 6));
        txtJuros.setText(String.valueOf(jtable.getValueAt(linha, 7)));
        txtMulta.setText(String.valueOf(jtable.getValueAt(linha, 8)));
        txtDesconto.setText((String) jtable.getValueAt(linha, 9));
        txtVencimento.setText((String) jtable.getValueAt(linha, 10));
        txtSaldo.setText(FmtMoney.toReal(calcSaldo()));

        Contas c;

        if (((String) jtable.getValueAt(linha, 1)).equals("Pagamento")) {
            Contas c = kod.vankish.logics.ContasLogics.get(Pagamento.class, Integer.valueOf(Integer.parseInt(txtCode.getText().trim())));
            rbPagar.setSelected(true);
            txtBeneficiario.setEditable(true);
        } else {
            c = kod.vankish.logics.ContasLogics.get(Recebimento.class, Integer.valueOf(Integer.parseInt(txtCode.getText().trim())));
            rbReceber.setSelected(true);
            txtBeneficiario.setText(getClientName());
            txtBeneficiario.setEditable(false);
        }

        txtLancamento.setText(DataUtils.dateBRShort(c.getLancamento()));
        txtPagamento.setText(c.getPagamento() == null ? null : DataUtils.dateBRShort(c.getPagamento()));
        cbPago.setVisible(c.getPagamento() == null);

        if (cbPago.isVisible()) {
            conservData(true);
        } else {
            conservData(false);
        }
    }


    private String getClientName() {
        java.util.Properties p = kod.utils.PersonaUtils.getPersonalizationBundle();
        return p.getProperty("cliente");
    }


    private void conservData(boolean flag) {
        txtBeneficiario.setEditable(flag);
        txtDescricao.setEditable(flag);
        txtDoc.setEditable(flag);
        txtTipoDoc.setEditable(flag);
        txtValor.setEditable(flag);
        txtJuros.setEditable(flag);
        txtMulta.setEditable(flag);
        txtDesconto.setEditable(flag);
        txtVencimento.setEditable(flag);
        cbPago.setVisible(flag);
    }


    protected Object getObjectFromFields() {
        String beneficiario = null;
        try {
            beneficiario = kod.utils.formats.FmtNome.format(txtBeneficiario.getText().trim(), "beneficiario");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String descricao = null;
        try {
            descricao = kod.utils.formats.FmtNome.format(txtDescricao.getText().trim(), "descricao");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String numDoc = null;
        try {
            numDoc = kod.utils.formats.FmtDocs.format(txtDoc.getText().trim(), "num do documento");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String tipoDoc = null;
        try {
            tipoDoc = kod.utils.formats.FmtNome.format(txtTipoDoc.getText().trim(), "tipo do documento");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        java.math.BigDecimal valor = FmtMoney.toBigDecimal(txtValor.getText().trim());

        java.math.BigDecimal desconto = FmtMoney.toBigDecimal(txtDesconto.getText().isEmpty() ? "0" : txtDesconto.getText());

        double juros = Double.valueOf(txtJuros.getText().trim().replace(",", ".")).doubleValue();

        double multa = Double.valueOf(txtMulta.getText().trim().replace(",", ".")).doubleValue();

        Date vencimento = DataUtils.toStandardDate(txtVencimento.getText().trim());

        Date pagamento =
                txtPagamento.getText().isEmpty() ? null : cbPago.isSelected() ? new Date() : DataUtils.toStandardDate(txtPagamento.getText());

        Date lancamento = new Date();

        Contas p;
        Contas p;
        if (classe.equals(Pagamento.class)) {
            p = new Pagamento(beneficiario, descricao, numDoc, tipoDoc, valor,
                    juros, multa, desconto, lancamento, vencimento, pagamento);
        } else {
            p = new Recebimento(beneficiario, descricao, numDoc, tipoDoc, valor,
                    juros, multa, desconto, lancamento, vencimento, pagamento);
        }
        if (!txtCode.getText().isEmpty()) {
            p.setCodigo(getObjectCode());
        }
        if (!txtLancamento.getText().isEmpty()) {
            p.setLancamento(DataUtils.toStandardDate(txtLancamento.getText()));
        }
        if ((cbPago.isSelected()) && (rbPagar.isSelected()) && (txtPagamento.getText().isEmpty())) {
            registraDebito(p.getDescricao());
        } else if ((cbPago.isSelected()) && (rbReceber.isSelected()) && (txtPagamento.getText().isEmpty())) {
            registraGanho(p.getDescricao());
        }
        return p;
    }


    protected void pesquisa() {
        String item = txtPesquisa.getText().trim();

        if (item.isEmpty()) {
            updateTable();
            lbPesquisando.setText(null);
        } else if (kod.utils.StringUtils.onlyContain(item, 0)) {
            search("descricao", item);
            lbPesquisando.setText("Pesquisando por: Descricao");

        } else if (kod.utils.StringUtils.onlyContain(item, 4)) {
            search("numDoc", item);
            lbPesquisando.setText("Pesquisando por: Numero do Documento");

        } else if (item.equals("Pagamentos")) {
            tabela.loadData(new Pesquisa(Pagamento.class).list());
            lbPesquisando.setText("Pesquisando por: Todas os Pagamentos");

        } else if (item.equals("Recebimentos")) {
            tabela.loadData(new Pesquisa(Recebimento.class).list());
            lbPesquisando.setText("Pesquisando por: Todas os Recebimentos");
        }
    }


    private java.math.BigDecimal calcSaldo() {
        return kod.vankish.logics.ContasLogics.calcSaldo(FmtMoney.toDouble(txtValor.getText()),
                FmtMoney.toDouble(txtJuros.getText()),
                FmtMoney.toDouble(txtMulta.getText()),
                DataUtils.diferenca(DataUtils.toStandardDate(txtVencimento.getText().trim()),
                        new Date()),
                FmtMoney.toDouble(txtDesconto.getText()));
    }


    private void activeComponents(boolean radio, boolean check) {
        rbPagar.setVisible(radio);
        rbReceber.setVisible(radio);
        cbPago.setVisible(check);
    }


    private void registraDebito(String descricao) {
        kod.vankish.logics.CaixaLogics.debita(FmtMoney.toDouble(txtSaldo.getText()), descricao + "pago(a).");
    }


    private void registraGanho(String descricao) {
        kod.vankish.logics.CaixaLogics.credita(FmtMoney.toDouble(txtSaldo.getText()), descricao + "recebido(a).");
    }

    protected Integer getObjectCode() {
        return Integer.valueOf(Integer.parseInt(txtCode.getText()));
    }
}
