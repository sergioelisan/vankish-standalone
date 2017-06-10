package kod.vankish.gui;

import kod.exceptions.CaractereInvalidoException;
import kod.exceptions.util.ErrorMessage;
import kod.utils.StringUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.logics.ClienteLogics;
import kod.vankish.pojo.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.text.ParseException;

public class Clientes extends Controle<Cliente> {
    private static Clientes instance = new Clientes();
    private JButton btNovo;
    private JButton btRemove;
    private JButton btSave;
    private JCheckBox cbDivida;
    private JComboBox comboSexo;
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
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JScrollPane jScrollPane1;
    private JToolBar.Separator jSeparator1;
    private JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private JToolBar jToolBar1;
    private JTable jtable;
    private JLabel lbPesquisando;
    private JLabel lbReturn;
    private JLabel lbReturn1;
    private JFormattedTextField textCelular;
    private JTextField textCidade;
    private JTextField textClienteDesde;
    private JTextField textCodigo;
    private JFormattedTextField textCpf;
    private JFormattedTextField textEmail;
    private JTextField textEndereco;
    private JFormattedTextField textIdade;
    private JTextField textNome;
    private JTextField textPesquisa;
    private JFormattedTextField textTelefone;
    private JTextField txtSaldo;
    private Clientes() {
        classe = Cliente.class;
        tabela = new kod.vankish.gui.tabelas.TabelaCliente();
        initComponents();

        cbDivida.setVisible(false);
    }

    public static Clientes getInstance() {
        return instance;
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        textPesquisa = new JTextField();
        lbReturn = new JLabel();
        lbPesquisando = new JLabel();
        textIdade = new JFormattedTextField();
        textCodigo = new JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel21 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        lbReturn1 = new JLabel();
        jLabel28 = new JLabel();
        textTelefone = new JFormattedTextField();
        textCelular = new JFormattedTextField();
        jToolBar1 = new JToolBar();
        btNovo = new JButton();
        jSeparator1 = new JToolBar.Separator();
        btSave = new JButton();
        jSeparator2 = new JToolBar.Separator();
        btRemove = new JButton();
        jLabel22 = new JLabel();
        textEmail = new JFormattedTextField();
        jScrollPane1 = new JScrollPane();
        jtable = new JTable();
        comboSexo = new JComboBox();
        jLabel27 = new JLabel();
        jLabel17 = new JLabel();
        jLabel24 = new JLabel();
        jLabel5 = new JLabel();
        jLabel20 = new JLabel();
        textClienteDesde = new JTextField();
        textCidade = new JTextField();
        jLabel25 = new JLabel();
        textNome = new JTextField();
        textCpf = new JFormattedTextField();
        jLabel23 = new JLabel();
        textEndereco = new JTextField();
        jLabel3 = new JLabel();
        txtSaldo = new JTextField();
        cbDivida = new JCheckBox();

        setBackground(new Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new Color(254, 254, 254));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialClientes.png")));
        jLabel1.setText("Clientes");

        jLabel2.setForeground(new Color(254, 254, 254));
        jLabel2.setText("Pesquisa:");

        textPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                Clientes.this.textPesquisaFocusLost(evt);
            }
        });
        textPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Clientes.this.textPesquisaKeyReleased(evt);
            }

        });
        lbReturn.setForeground(new Color(255, 255, 255));
        lbReturn.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/voltar.png")));
        lbReturn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Clientes.this.lbReturnMouseClicked(evt);
            }

        });
        lbPesquisando.setForeground(new Color(255, 255, 255));

        textIdade.setNextFocusableComponent(textEndereco);

        textCodigo.setEditable(false);

        jLabel21.setForeground(new Color(254, 254, 254));
        jLabel21.setText("Endereco");

        jLabel18.setForeground(new Color(254, 254, 254));
        jLabel18.setText("Nome");

        jLabel19.setForeground(new Color(254, 254, 254));
        jLabel19.setText("Sexo");

        lbReturn1.setForeground(new Color(255, 255, 255));
        lbReturn1.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/reload.png")));
        lbReturn1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Clientes.this.lbReturn1MouseClicked(evt);
            }

        });
        jLabel28.setForeground(new Color(254, 254, 254));
        jLabel28.setText("Clien. desde");
        try {
            textTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        textTelefone.setNextFocusableComponent(textCelular);
        try {
            textCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        textCelular.setNextFocusableComponent(textEmail);

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jToolBar1.setRollover(true);

        btNovo.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/new.png")));
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalTextPosition(4);
        btNovo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Clientes.this.btNovoActionPerformed(evt);
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
                Clientes.this.btSaveActionPerformed(evt);
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
                Clientes.this.btRemoveActionPerformed(evt);
            }
        });
        jToolBar1.add(btRemove);

        jLabel22.setForeground(new Color(254, 254, 254));
        jLabel22.setText("Telefone");

        textEmail.setNextFocusableComponent(textCpf);

        jtable.setModel(tabela);
        jtable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Clientes.this.jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable);

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"M", "F"}));
        comboSexo.setNextFocusableComponent(textIdade);

        jLabel27.setForeground(new Color(254, 254, 254));
        jLabel27.setText("CPF");

        jLabel17.setForeground(new Color(254, 254, 254));
        jLabel17.setText("Codigo");

        jLabel24.setForeground(new Color(254, 254, 254));
        jLabel24.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Dados do Cliente");

        jLabel20.setForeground(new Color(254, 254, 254));
        jLabel20.setText("Idade");

        textClienteDesde.setEditable(false);

        textCidade.setNextFocusableComponent(textTelefone);

        jLabel25.setForeground(new Color(254, 254, 254));
        jLabel25.setText("Cidade");

        textNome.setNextFocusableComponent(comboSexo);

        textCpf.setNextFocusableComponent(btSave);

        jLabel23.setForeground(new Color(254, 254, 254));
        jLabel23.setText("Celular");

        textEndereco.setNextFocusableComponent(textCidade);

        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Saldo");

        txtSaldo.setEditable(false);

        cbDivida.setBackground(new Color(102, 102, 102));
        cbDivida.setForeground(new Color(255, 255, 255));
        cbDivida.setText("Pagou a divida?");
        cbDivida.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Clientes.this.cbDividaActionPerformed(evt);
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
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel19, -2, 45, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(comboSexo, -2, 44, -2)
                                                .addGap(162, 162, 162)
                                                .addComponent(jLabel24, -2, 42, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textEmail, -2, 166, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel20, -2, 45, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textIdade, -2, 188, -2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel27, -2, 42, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textCpf, -2, 166, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel21)
                                                .addGap(4, 4, 4)
                                                .addComponent(textEndereco, -2, 188, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel25, -2, 45, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textCidade, -2, 188, -2))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(textPesquisa, -2, 173, -2)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(lbPesquisando, -2, 290, -2))
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 808, 32767)
                                                        .addComponent(lbReturn))
                                                .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, -2, 956, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jLabel18, -2, 45, -2)
                                                                .addGap(4, 4, 4)
                                                                .addComponent(textNome, -2, 188, -2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel23, -2, 42, -2)
                                                                .addGap(4, 4, 4)
                                                                .addComponent(textCelular, -2, 166, -2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
                                                                .addComponent(jLabel3))
                                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(jLabel17, -2, 45, -2)
                                                                .addGap(4, 4, 4)
                                                                .addComponent(textCodigo, -2, 188, -2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel22)
                                                                .addGap(4, 4, 4)
                                                                .addComponent(textTelefone, -2, 166, -2)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel28)))
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtSaldo)
                                                        .addComponent(textClienteDesde, -1, 140, 32767))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cbDivida))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addComponent(jLabel5)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jSeparator4, -1, 576, 32767))
                                                        .addComponent(jToolBar1, -1, 698, 32767))
                                                .addGap(234, 234, 234)
                                                .addComponent(lbReturn1)))
                                .addGap(14, 14, 14)));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(textPesquisa, -2, -1, -2)
                                                        .addComponent(lbPesquisando, -2, 20, -2)))
                                        .addComponent(lbReturn))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, -2, 242, -2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lbReturn1)
                                        .addComponent(jToolBar1, -2, 45, -2))
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jSeparator4, -2, 10, -2)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel17))
                                                        .addComponent(textCodigo, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel22))
                                                        .addComponent(textTelefone, -2, -1, -2))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel18))
                                                        .addComponent(textNome, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel23))
                                                        .addComponent(textCelular, -2, -1, -2))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel19))
                                                        .addComponent(comboSexo, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel24))
                                                        .addComponent(textEmail, -2, -1, -2))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel20))
                                                        .addComponent(textIdade, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel27))
                                                        .addComponent(textCpf, -2, -1, -2))
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
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel28)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txtSaldo, -2, -1, -2)
                                                        .addComponent(cbDivida)))
                                        .addComponent(textClienteDesde, -2, -1, -2))
                                .addGap(58, 58, 58)));
    }

    private void lbReturnMouseClicked(MouseEvent evt) {
        toMainPage();
    }

    private void textPesquisaKeyReleased(KeyEvent evt) {
        pesquisa();
    }

    private void lbReturn1MouseClicked(MouseEvent evt) {
        updateTable();
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

    private void cbDividaActionPerformed(ActionEvent evt) {
        pagouDivida();
    }

    private void textPesquisaFocusLost(FocusEvent evt) {
        lbPesquisando.setText(null);
    }

    protected void getTableData() {
        int linha = jtable.getSelectedRow();

        textCodigo.setText(String.valueOf((Integer) jtable.getValueAt(linha, 0)));
        textNome.setText((String) jtable.getValueAt(linha, 1));
        comboSexo.setSelectedItem(String.valueOf(jtable.getValueAt(linha, 2)));
        textIdade.setText(String.valueOf((Integer) jtable.getValueAt(linha, 3)));
        textCpf.setText((String) jtable.getValueAt(linha, 4));
        textEndereco.setText((String) jtable.getValueAt(linha, 5));
        textCidade.setText((String) jtable.getValueAt(linha, 6));
        textTelefone.setText((String) jtable.getValueAt(linha, 7));
        textCelular.setText((String) jtable.getValueAt(linha, 8));
        textEmail.setText((String) jtable.getValueAt(linha, 9));

        Cliente c = ClienteLogics.get(Integer.valueOf(Integer.parseInt(textCodigo.getText())));


        textClienteDesde.setText(kod.utils.DataUtils.dateBRShort(c.getDataCadastro()));
        txtSaldo.setText(FmtMoney.toReal(c.getSaldo()));

        if (isDevendo()) {
            cbDivida.setVisible(true);
        } else {
            cbDivida.setVisible(false);
        }
    }

    protected Object getObjectFromFields() {
        if ((textNome.getText().isEmpty()) || (textTelefone.getText().isEmpty())) {
            ErrorMessage.advert("Alguns campos ainda precisam ser preenchidos");
        }
        String nome = null;
        try {
            nome = kod.utils.formats.FmtNome.format(textNome.getText().trim(), "nome");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        Character sexo = Character.valueOf(((String) comboSexo.getSelectedItem()).charAt(0));

        Integer idade = Integer.valueOf(18);
        try {
            idade = Integer.valueOf(Integer.parseInt(textIdade.getText().trim()));
        } catch (NumberFormatException e) {
            ErrorMessage.advert("Apenas numeros em idade");
        }
        String cpf = null;
        try {
            cpf = kod.utils.formats.FmtCpf.format(textCpf.getText().trim());
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
            cidade = kod.utils.formats.FmtNome.format(textCidade.getText().trim(), "endereco");
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
        String email = null;
        try {
            email = kod.utils.formats.FmtEmail.format(textEmail.getText().trim());
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        Cliente c = new Cliente(nome, sexo, idade, cpf, endereco, cidade,
                telefone, celular, email, new java.util.Date(), BigDecimal.ZERO, null);

        if (!textClienteDesde.getText().isEmpty()) {
            c.setDataCadastro(kod.utils.DataUtils.toStandardDate(textClienteDesde.getText()));
        }
        if (!textCodigo.getText().isEmpty()) {
            c.setIdCliente(getObjectCode());
        }
        return c;
    }

    protected void pesquisa() {
        String item = textPesquisa.getText();

        if (item.isEmpty()) {
            updateTable();
            lbPesquisando.setText(null);
        } else if ((item.startsWith("(")) && (StringUtils.onlyContain(item, 4))) {
            search("telefone", item);
            lbPesquisando.setText("Pesquisando por: Telefone");

        } else if ((StringUtils.onlyContain(item, 0)) && (item.length() > 1)) {
            search("nome", item);
            lbPesquisando.setText("Pesquisando por: Nome");

        } else if (((item.contains("f")) || (item.contains("m"))) && (item.length() == 1)) {
            search("sexo", item);
            lbPesquisando.setText("Pesquisando por: Sexo");

        } else if ((StringUtils.onlyContain(item, 3)) && (item.length() == 11)) {
            search("cpf", item);
            lbPesquisando.setText("Pesquisando por: CPF");

        } else if ((StringUtils.onlyContain(item, 3)) && (item.length() <= 3)) {
            search("idade", Integer.valueOf(Integer.parseInt(item)));
            lbPesquisando.setText("Pesquisando por: Idade");

        } else if (StringUtils.onlyContain(item, 2)) {
            search("endereco", item);
            lbPesquisando.setText("Pesquisando por: Endereco");
        }
    }


    private boolean isDevendo() {
        return FmtMoney.toDouble(txtSaldo.getText()) < 0.0D;
    }


    private void pagouDivida() {
        double grana = FmtMoney.toDouble(javax.swing.JOptionPane.showInputDialog(null, "Montante pago pelo cliente"));

        if (grana > 0.0D) {
            Cliente c = ClienteLogics.get(getObjectCode());
            c.setSaldo(c.getSaldo().add(new BigDecimal(grana)));

            kod.vankish.logics.CaixaLogics.credita(grana, "Divida paga pelo cliente " + c.getNome());
            ClienteLogics.up(c);

            cbDivida.setSelected(false);
            cbDivida.setVisible(false);
        } else {
            ErrorMessage.advert("Valor invalido!");
        }
    }

    protected Integer getObjectCode() {
        return Integer.valueOf(Integer.parseInt(textCodigo.getText()));
    }
}
