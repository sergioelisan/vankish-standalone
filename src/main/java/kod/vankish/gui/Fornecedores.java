package kod.vankish.gui;

import kod.exceptions.CaractereInvalidoException;
import kod.exceptions.util.ErrorMessage;
import kod.utils.StringUtils;
import kod.utils.formats.FmtNome;
import kod.vankish.pojo.Fornecedor;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class Fornecedores extends Controle<Fornecedor> {
    private static Fornecedores instance = new Fornecedores();
    private JButton btNovo;
    private JButton btRemove;
    private JButton btSave;
    private JComboBox comboProdutos;
    private JLabel jLabel1;
    private JLabel jLabel17;
    private JLabel jLabel18;
    private JLabel jLabel19;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel21;
    private JLabel jLabel22;
    private JLabel jLabel23;
    private JLabel jLabel24;
    private JLabel jLabel25;
    private JLabel jLabel26;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel5;
    private JScrollPane jScrollPane1;
    private JToolBar.Separator jSeparator1;
    private JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private JToolBar jToolBar1;
    private JTable jtable;
    private JLabel lbBack;
    private JLabel lbPesquisando;
    private JLabel lbReturn;
    private JFormattedTextField textCelular;
    private JTextField textCidade;
    private JFormattedTextField textCnpj;
    private JTextField textEmail;
    private JTextField textEmpresa;
    private JTextField textEndereco;
    private JFormattedTextField textFax;
    private JTextField textPesquisa;
    private JTextField textRamo;
    private JFormattedTextField textTelefone;
    private JTextField txtCode;
    private JTextField txtDesde;
    private Fornecedores() {
        classe = Fornecedor.class;
        tabela = new kod.vankish.gui.tabelas.TabelaFornecedor();
        initComponents();
    }

    public static Fornecedores getInstance() {
        return instance;
    }

    private void initComponents() {
        jScrollPane1 = new JScrollPane();
        jtable = new JTable();
        jToolBar1 = new JToolBar();
        btNovo = new JButton();
        jSeparator1 = new JToolBar.Separator();
        btSave = new JButton();
        jSeparator2 = new JToolBar.Separator();
        btRemove = new JButton();
        lbReturn = new JLabel();
        lbBack = new JLabel();
        textPesquisa = new JTextField();
        jLabel2 = new JLabel();
        jLabel1 = new JLabel();
        jLabel25 = new JLabel();
        jLabel24 = new JLabel();
        textEndereco = new JTextField();
        textRamo = new JTextField();
        txtCode = new JTextField();
        textEmail = new JTextField();
        textEmpresa = new JTextField();
        textCidade = new JTextField();
        jLabel23 = new JLabel();
        jLabel29 = new JLabel();
        jLabel20 = new JLabel();
        jLabel19 = new JLabel();
        jLabel18 = new JLabel();
        jLabel17 = new JLabel();
        jLabel22 = new JLabel();
        jLabel21 = new JLabel();
        jLabel26 = new JLabel();
        jLabel28 = new JLabel();
        txtDesde = new JTextField();
        comboProdutos = new JComboBox();
        jLabel5 = new JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        lbPesquisando = new JLabel();
        textCnpj = new JFormattedTextField();
        textCelular = new JFormattedTextField();
        textTelefone = new JFormattedTextField();
        textFax = new JFormattedTextField();

        setBackground(new Color(102, 102, 102));

        jtable.setModel(tabela);
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Fornecedores.this.jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable);

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jToolBar1.setRollover(true);

        btNovo.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/new.png")));
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalTextPosition(4);
        btNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Fornecedores.this.btNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNovo);
        jToolBar1.add(jSeparator1);

        btSave.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/save.png")));
        btSave.setText("Salvar");
        btSave.setFocusable(false);
        btSave.setHorizontalTextPosition(4);
        btSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Fornecedores.this.btSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btSave);
        jToolBar1.add(jSeparator2);

        btRemove.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/remove.png")));
        btRemove.setText("Remover");
        btRemove.setFocusable(false);
        btRemove.setHorizontalTextPosition(4);
        btRemove.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Fornecedores.this.btRemoveActionPerformed(evt);
            }
        });
        jToolBar1.add(btRemove);

        lbReturn.setForeground(new Color(255, 255, 255));
        lbReturn.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/reload.png")));
        lbReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Fornecedores.this.lbReturnMouseClicked(evt);
            }

        });
        lbBack.setForeground(new Color(255, 255, 255));
        lbBack.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/voltar.png")));
        lbBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Fornecedores.this.lbBackMouseClicked(evt);
            }

        });
        textPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                Fornecedores.this.textPesquisaFocusLost(evt);
            }
        });
        textPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Fornecedores.this.textPesquisaKeyReleased(evt);
            }

        });
        jLabel2.setForeground(new Color(254, 254, 254));
        jLabel2.setText("Pesquisa:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new Color(254, 254, 254));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialFornecedores.png")));
        jLabel1.setText("Fornecedores");

        jLabel25.setForeground(new Color(254, 254, 254));
        jLabel25.setText("Cidade");

        jLabel24.setForeground(new Color(254, 254, 254));
        jLabel24.setText("Celular");

        textEndereco.setNextFocusableComponent(textCidade);

        textRamo.setNextFocusableComponent(textCnpj);

        txtCode.setEditable(false);

        textEmail.setNextFocusableComponent(btSave);

        textEmpresa.setNextFocusableComponent(textRamo);

        textCidade.setNextFocusableComponent(textTelefone);

        jLabel23.setForeground(new Color(254, 254, 254));
        jLabel23.setText("Fax");

        jLabel29.setForeground(new Color(254, 254, 254));
        jLabel29.setText("E-mail");

        jLabel20.setForeground(new Color(254, 254, 254));
        jLabel20.setText("CNPJ");

        jLabel19.setForeground(new Color(254, 254, 254));
        jLabel19.setText("Ramo");

        jLabel18.setForeground(new Color(254, 254, 254));
        jLabel18.setText("Empresa");

        jLabel17.setForeground(new Color(254, 254, 254));
        jLabel17.setText("Codigo");

        jLabel22.setForeground(new Color(254, 254, 254));
        jLabel22.setText("Telefone");

        jLabel21.setForeground(new Color(254, 254, 254));
        jLabel21.setText("Endereco");

        jLabel26.setForeground(new Color(254, 254, 254));
        jLabel26.setText("Produtos");

        jLabel28.setForeground(new Color(254, 254, 254));
        jLabel28.setText("Forn. desde");

        txtDesde.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Dados do Fornecedor");

        lbPesquisando.setForeground(new Color(255, 255, 255));
        try {
            textCnpj.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("##.###.###/####-##")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        textCnpj.setNextFocusableComponent(textEndereco);
        try {
            textCelular.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##) ####-####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        textCelular.setNextFocusableComponent(textEmail);
        try {
            textTelefone.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##) ####-####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        textTelefone.setNextFocusableComponent(textFax);
        try {
            textFax.setFormatterFactory(new DefaultFormatterFactory(new MaskFormatter("(##) ####-####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        textFax.setNextFocusableComponent(textCelular);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(textPesquisa, -2, 173, -2)
                                .addGap(20, 20, 20)
                                .addComponent(lbPesquisando, -2, 255, -2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jToolBar1, -2, 697, -2)
                                .addGap(225, 225, 225)
                                .addComponent(lbReturn)
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator4, -2, 550, -2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel17, -2, 45, -2)
                                .addGap(4, 4, 4)
                                .addComponent(txtCode, -2, 188, -2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addGap(4, 4, 4)
                                .addComponent(textTelefone, -2, 166, -2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel26, -2, 58, -2)
                                .addGap(4, 4, 4)
                                .addComponent(comboProdutos, -2, 140, -2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel18, -2, 45, -2)
                                .addGap(4, 4, 4)
                                .addComponent(textEmpresa, -2, 188, -2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel23, -2, 42, -2)
                                .addGap(4, 4, 4)
                                .addComponent(textFax, -2, 166, -2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel28)
                                .addGap(4, 4, 4)
                                .addComponent(txtDesde, -2, 140, -2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel19, -2, 45, -2)
                                .addGap(4, 4, 4)
                                .addComponent(textRamo, -2, 188, -2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24, -2, 42, -2)
                                .addGap(4, 4, 4)
                                .addComponent(textCelular, -2, 166, -2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel20, -2, 45, -2)
                                .addGap(4, 4, 4)
                                .addComponent(textCnpj, -2, 188, -2)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29, -2, 42, -2)
                                .addGap(4, 4, 4)
                                .addComponent(textEmail, -2, 166, -2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel21)
                                .addGap(4, 4, 4)
                                .addComponent(textEndereco, -2, 188, -2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel25, -2, 45, -2)
                                .addGap(4, 4, 4)
                                .addComponent(textCidade, -2, 188, -2))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, -1, 946, 32767)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 747, 32767)
                                                .addComponent(lbBack)))
                                .addContainerGap()));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel2))
                                                        .addComponent(textPesquisa, -2, -1, -2)
                                                        .addComponent(lbPesquisando, -2, 20, -2)))
                                        .addComponent(lbBack))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, -2, 242, -2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jToolBar1, -2, 45, -2)
                                                .addGap(11, 11, 11)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(4, 4, 4)
                                                                .addComponent(jSeparator4, -2, 10, -2)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel17))
                                                        .addComponent(txtCode, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel22))
                                                        .addComponent(textTelefone, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel26))
                                                        .addComponent(comboProdutos, -2, -1, -2))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel18))
                                                        .addComponent(textEmpresa, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel23))
                                                        .addComponent(textFax, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel28))
                                                        .addComponent(txtDesde, -2, -1, -2))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel19))
                                                        .addComponent(textRamo, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel24))
                                                        .addComponent(textCelular, -2, -1, -2))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel20))
                                                        .addComponent(textCnpj, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel29))
                                                        .addComponent(textEmail, -2, -1, -2))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel21))
                                                        .addComponent(textEndereco, -2, -1, -2))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel25))
                                                        .addComponent(textCidade, -2, -1, -2)))
                                        .addComponent(lbReturn))
                                .addContainerGap(23, 32767)));
    }

    private void lbReturnMouseClicked(MouseEvent evt) {
        updateTable();
    }

    private void lbBackMouseClicked(MouseEvent evt) {
        toMainPage();
    }

    private void btNovoActionPerformed(ActionEvent evt) {
        clearFields();
    }

    private void btSaveActionPerformed(ActionEvent evt) {
        save();
    }

    private void btRemoveActionPerformed(ActionEvent evt) {
        rm();
    }

    private void jtableMouseClicked(MouseEvent evt) {
        getTableData();
    }

    private void textPesquisaKeyReleased(KeyEvent evt) {
        pesquisa();
    }

    private void textPesquisaFocusLost(FocusEvent evt) {
        lbPesquisando.setText(null);
    }

    protected void getTableData() {
        int linha = jtable.getSelectedRow();

        txtCode.setText(String.valueOf((Integer) jtable.getValueAt(linha, 0)));
        textEmpresa.setText((String) jtable.getValueAt(linha, 1));
        textRamo.setText((String) jtable.getValueAt(linha, 2));
        textCnpj.setText((String) jtable.getValueAt(linha, 3));
        textEndereco.setText((String) jtable.getValueAt(linha, 4));
        textCidade.setText((String) jtable.getValueAt(linha, 5));
        textTelefone.setText((String) jtable.getValueAt(linha, 6));
        textCelular.setText((String) jtable.getValueAt(linha, 7));
        textFax.setText((String) jtable.getValueAt(linha, 8));
        textEmail.setText((String) jtable.getValueAt(linha, 9));


        Fornecedor f = (Fornecedor) new kod.database.utils.Pesquisa(Fornecedor.class).get(Integer.valueOf(Integer.parseInt(txtCode.getText())));

        txtDesde.setText(kod.utils.DataUtils.dateBRShort(f.getDataCadastro()));
        comboProdutos.removeAllItems();
        for (Object p : f.getProdutos()) {
            comboProdutos.addItem(((kod.vankish.pojo.Produto) p).getDescricao());
        }
    }


    protected Object getObjectFromFields() {
        if ((textEmpresa.getText().isEmpty()) || (textRamo.getText().isEmpty())) {
            ErrorMessage.advert("Alguns campos precisam ser preenchidos");
            return null;
        }

        String empresa = null;
        try {
            empresa = FmtNome.format(textEmpresa.getText().trim(), "nome");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String ramo = null;
        try {
            ramo = FmtNome.format(textRamo.getText().trim(), "ramo");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String cnpj = null;
        try {
            cnpj = kod.utils.formats.FmtCnpj.format(textCnpj.getText().trim());
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String endereco = null;
        try {
            endereco = kod.utils.formats.FmtEndereco.format(textEndereco.getText().trim());
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String cidade = null;
        try {
            cidade = FmtNome.format(textCidade.getText().trim(), "cidade");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String telefone = null;
        try {
            telefone = kod.utils.formats.FmtFone.format(textTelefone.getText().trim(), "telefone");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String celular = null;
        try {
            celular = kod.utils.formats.FmtFone.format(textCelular.getText().trim(), "celular");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String fax = null;
        try {
            fax = kod.utils.formats.FmtFone.format(textFax.getText().trim(), "fax");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String email = null;
        try {
            email = kod.utils.formats.FmtEmail.format(textEmail.getText().trim());
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        Fornecedor f = new Fornecedor(empresa, ramo, cnpj, endereco, cidade, null,
                telefone, celular, fax, email, new java.util.Date(), null);

        if (!txtDesde.getText().isEmpty()) {
            f.setDataCadastro(kod.utils.DataUtils.toStandardDate(txtDesde.getText()));
        }
        if (!txtCode.getText().isEmpty()) {
            f.setIdFornecedor(Integer.valueOf(Integer.parseInt(txtCode.getText())));
        }
        return f;
    }

    protected void pesquisa() {
        String item = textPesquisa.getText().trim();

        if (item.isEmpty()) {
            updateTable();
            lbPesquisando.setText(null);
        } else if ((item.startsWith("(")) && (StringUtils.onlyContain(item, 4))) {
            search("telefone", item);
            lbPesquisando.setText("Pesquisando por: Telefone");

        } else if (StringUtils.onlyContain(item, 0)) {
            search("empresa", item);
            lbPesquisando.setText("Pesquisando por: Empresa");

        } else if ((StringUtils.onlyContain(item, 4)) && (item.length() == 18)) {
            search("cnpj", item);
            lbPesquisando.setText("Pesquisando por: CNPJ");
        } else {
            search("endereco", item);
            lbPesquisando.setText("Pesquisando por: Endereco");
        }
    }


    protected void clearFields() {
        super.clearFields();
        comboProdutos.removeAllItems();
    }

    protected Integer getObjectCode() {
        return Integer.valueOf(Integer.parseInt(txtCode.getText()));
    }
}
