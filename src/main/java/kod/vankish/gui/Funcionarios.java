package kod.vankish.gui;

import kod.exceptions.CaractereInvalidoException;
import kod.exceptions.util.ErrorMessage;
import kod.utils.StringUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Funcionario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;

public class Funcionarios extends Controle<Funcionario> {
    private static Funcionarios instance = new Funcionarios();
    private JButton btNovo;
    private JButton btRemove;
    private JButton btSave;
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
    private JLabel jLabel26;
    private JLabel jLabel27;
    private JLabel jLabel28;
    private JLabel jLabel29;
    private JLabel jLabel30;
    private JLabel jLabel5;
    private JScrollPane jScrollPane1;
    private JToolBar.Separator jSeparator1;
    private JToolBar.Separator jSeparator2;
    private JSeparator jSeparator4;
    private JToolBar jToolBar1;
    private JTable jtable;
    private JLabel lbPesquisando;
    private JLabel lbReturn;
    private JLabel lbVoltar;
    private JFormattedTextField textCelular;
    private JTextField textCidade;
    private JTextField textCntps;
    private JTextField textCodigo;
    private JFormattedTextField textCpf;
    private JFormattedTextField textEmail;
    private JTextField textEndereco;
    private JTextField textFuncDesde;
    private JFormattedTextField textIdade;
    private JTextField textNome;
    private JTextField textPesquisa;
    private JFormattedTextField textPis;
    private JTextField textSalario;
    private JFormattedTextField textTelefone;
    private Funcionarios() {
        classe = Funcionario.class;
        tabela = new kod.vankish.gui.tabelas.TabelaFuncionario();
        initComponents();
    }

    public static Funcionarios getInstance() {
        return instance;
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        textPesquisa = new JTextField();
        lbVoltar = new JLabel();
        lbPesquisando = new JLabel();
        jLabel5 = new JLabel();
        textFuncDesde = new JTextField();
        jLabel25 = new JLabel();
        jLabel28 = new JLabel();
        lbReturn = new JLabel();
        jLabel19 = new JLabel();
        jLabel18 = new JLabel();
        jLabel21 = new JLabel();
        jLabel26 = new JLabel();
        jLabel17 = new JLabel();
        jLabel22 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jtable = new JTable();
        jToolBar1 = new JToolBar();
        btNovo = new JButton();
        jSeparator1 = new JToolBar.Separator();
        btSave = new JButton();
        jSeparator2 = new JToolBar.Separator();
        btRemove = new JButton();
        jLabel20 = new JLabel();
        textCidade = new JTextField();
        textNome = new JTextField();
        jLabel29 = new JLabel();
        jLabel23 = new JLabel();
        textEndereco = new JTextField();
        jSeparator4 = new JSeparator();
        textCodigo = new JTextField();
        textIdade = new JFormattedTextField();
        textCntps = new JTextField();
        textEmail = new JFormattedTextField();
        textTelefone = new JFormattedTextField();
        textCelular = new JFormattedTextField();
        jLabel24 = new JLabel();
        textSalario = new JTextField();
        comboSexo = new JComboBox();
        jLabel27 = new JLabel();
        textCpf = new JFormattedTextField();
        jLabel30 = new JLabel();
        textPis = new JFormattedTextField();

        setBackground(new Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new Color(254, 254, 254));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialFuncionarios.png")));
        jLabel1.setText("   Funcionarios");

        jLabel2.setForeground(new Color(254, 254, 254));
        jLabel2.setText("Pesquisa:");

        textPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                Funcionarios.this.textPesquisaFocusLost(evt);
            }
        });
        textPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Funcionarios.this.textPesquisaKeyReleased(evt);
            }

        });
        lbVoltar.setForeground(new Color(255, 255, 255));
        lbVoltar.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/voltar.png")));
        lbVoltar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Funcionarios.this.lbVoltarMouseClicked(evt);
            }

        });
        lbPesquisando.setForeground(new Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Dados do Funcionario");

        textFuncDesde.setEditable(false);

        jLabel25.setForeground(new Color(254, 254, 254));
        jLabel25.setText("Cidade");

        jLabel28.setForeground(new Color(254, 254, 254));
        jLabel28.setText("Func. desde");

        lbReturn.setForeground(new Color(255, 255, 255));
        lbReturn.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/reload.png")));
        lbReturn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Funcionarios.this.lbReturnMouseClicked(evt);
            }

        });
        jLabel19.setForeground(new Color(254, 254, 254));
        jLabel19.setText("Sexo");

        jLabel18.setForeground(new Color(254, 254, 254));
        jLabel18.setText("Nome");

        jLabel21.setForeground(new Color(254, 254, 254));
        jLabel21.setText("Endereco");

        jLabel26.setForeground(new Color(254, 254, 254));
        jLabel26.setText("Salario");

        jLabel17.setForeground(new Color(254, 254, 254));
        jLabel17.setText("Codigo");

        jLabel22.setForeground(new Color(254, 254, 254));
        jLabel22.setText("Telefone");

        jtable.setModel(tabela);
        jtable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Funcionarios.this.jtableMouseClicked(evt);
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
                Funcionarios.this.btNovoActionPerformed(evt);
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
                Funcionarios.this.btSaveActionPerformed(evt);
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
                Funcionarios.this.btRemoveActionPerformed(evt);
            }
        });
        jToolBar1.add(btRemove);

        jLabel20.setForeground(new Color(254, 254, 254));
        jLabel20.setText("Idade");

        textCidade.setNextFocusableComponent(textTelefone);

        textNome.setNextFocusableComponent(comboSexo);

        jLabel29.setForeground(new Color(254, 254, 254));
        jLabel29.setText("CNTPS");

        jLabel23.setForeground(new Color(254, 254, 254));
        jLabel23.setText("Celular");

        textEndereco.setNextFocusableComponent(textCidade);

        textCodigo.setEditable(false);

        textIdade.setNextFocusableComponent(textEndereco);

        textCntps.setNextFocusableComponent(btSave);

        textEmail.setNextFocusableComponent(textCpf);
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

        jLabel24.setForeground(new Color(254, 254, 254));
        jLabel24.setText("Email");

        textSalario.setNextFocusableComponent(textCntps);

        comboSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"M", "F"}));
        comboSexo.setNextFocusableComponent(textIdade);

        jLabel27.setForeground(new Color(254, 254, 254));
        jLabel27.setText("CPF");

        textCpf.setNextFocusableComponent(textPis);

        jLabel30.setForeground(new Color(254, 254, 254));
        jLabel30.setText("PIS");

        textPis.setNextFocusableComponent(textSalario);

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textPesquisa, -2, 173, -2)
                                                .addGap(10, 10, 10)
                                                .addComponent(lbPesquisando, -2, 320, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jToolBar1, -2, 698, -2)
                                                .addGap(234, 234, 234)
                                                .addComponent(lbReturn))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jSeparator4, -2, 551, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel17, -2, 45, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textCodigo, -2, 188, -2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel22)
                                                .addGap(4, 4, 4)
                                                .addComponent(textTelefone, -2, 166, -2)
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel26)
                                                .addGap(4, 4, 4)
                                                .addComponent(textSalario, -2, 140, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel18, -2, 45, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textNome, -2, 188, -2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel23, -2, 42, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textCelular, -2, 166, -2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel28)
                                                .addGap(4, 4, 4)
                                                .addComponent(textFuncDesde, -2, 140, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel19, -2, 45, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(comboSexo, -2, 44, -2)
                                                .addGap(162, 162, 162)
                                                .addComponent(jLabel24, -2, 42, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textEmail, -2, 166, -2)
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel29)
                                                .addGap(4, 4, 4)
                                                .addComponent(textCntps, -2, 140, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel20, -2, 45, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textIdade, -2, 188, -2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel27, -2, 42, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textCpf, -2, 166, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel21)
                                                .addGap(4, 4, 4)
                                                .addComponent(textEndereco, -2, 188, -2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel30, -2, 42, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textPis, -2, 166, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addComponent(jLabel25, -2, 45, -2)
                                                .addGap(4, 4, 4)
                                                .addComponent(textCidade, -2, 188, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
                                                                .addComponent(lbVoltar))
                                                        .addComponent(jScrollPane1, GroupLayout.Alignment.LEADING, -2, 956, -2))))
                                .addContainerGap(22, 32767)));

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
                                        .addComponent(lbVoltar))
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, -2, 242, -2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jToolBar1, -2, 45, -2)
                                        .addComponent(lbReturn))
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
                                        .addComponent(textCodigo, -2, -1, -2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel22))
                                        .addComponent(textTelefone, -2, -1, -2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel26))
                                        .addComponent(textSalario, -2, -1, -2))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel18))
                                        .addComponent(textNome, -2, -1, -2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel23))
                                        .addComponent(textCelular, -2, -1, -2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel28))
                                        .addComponent(textFuncDesde, -2, -1, -2))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel19))
                                        .addComponent(comboSexo, -2, -1, -2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel24))
                                        .addComponent(textEmail, -2, -1, -2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel29))
                                        .addComponent(textCntps, -2, -1, -2))
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
                                        .addComponent(textEndereco, -2, -1, -2)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel30))
                                        .addComponent(textPis, -2, -1, -2))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel25))
                                        .addComponent(textCidade, -2, -1, -2))
                                .addContainerGap(54, 32767)));
    }

    private void lbVoltarMouseClicked(MouseEvent evt) {
        toMainPage();
    }

    private void textPesquisaKeyReleased(KeyEvent evt) {
        pesquisa();
    }

    private void lbReturnMouseClicked(MouseEvent evt) {
        updateTable();
    }

    private void jtableMouseClicked(MouseEvent evt) {
        getTableData();
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

    private void textPesquisaFocusLost(FocusEvent evt) {
        lbPesquisando.setText(null);
    }

    protected void getTableData() {
        int linha = jtable.getSelectedRow();

        textCodigo.setText(String.valueOf((Integer) jtable.getValueAt(linha, 0)));
        textNome.setText((String) jtable.getValueAt(linha, 1));
        comboSexo.setSelectedItem(String.valueOf(jtable.getValueAt(linha, 2)));
        textIdade.setText(String.valueOf((Integer) jtable.getValueAt(linha, 3)));
        textEndereco.setText((String) jtable.getValueAt(linha, 4));
        textCidade.setText((String) jtable.getValueAt(linha, 5));
        textTelefone.setText((String) jtable.getValueAt(linha, 6));
        textCelular.setText((String) jtable.getValueAt(linha, 7));
        textEmail.setText((String) jtable.getValueAt(linha, 8));
        textCpf.setText((String) jtable.getValueAt(linha, 9));
        textPis.setText((String) jtable.getValueAt(linha, 10));
        textCntps.setText((String) jtable.getValueAt(linha, 11));
        textSalario.setText((String) jtable.getValueAt(linha, 12));
        textFuncDesde.setText((String) jtable.getValueAt(linha, 13));
    }


    protected Object getObjectFromFields() {
        if ((textNome.getText().isEmpty()) || (textCpf.getText().isEmpty()) ||
                (textCntps.getText().isEmpty()) || (textSalario.getText().isEmpty())) {
            ErrorMessage.advert("Campos importantes nao foram preenchidos");
            return null;
        }

        String nome = null;
        try {
            nome = kod.utils.formats.FmtNome.format(textNome.getText().trim(), "nome");
        } catch (CaractereInvalidoException e) {
            ErrorMessage.advert(e.getMessage());
        }
        Character sexo = Character.valueOf(((String) comboSexo.getSelectedItem()).charAt(0));

        Integer idade = null;
        try {
            idade = Integer.valueOf(Integer.parseInt(textIdade.getText().trim()));
        } catch (NumberFormatException e) {
            ErrorMessage.advert("Apenas numeros no campo idade!");
        }
        String endereco = null;
        try {
            endereco = kod.utils.formats.FmtEndereco.format(textEndereco.getText().trim());
        } catch (CaractereInvalidoException e) {
            ErrorMessage.advert(e.getMessage());
        }
        String cidade = null;
        try {
            cidade = kod.utils.formats.FmtNome.format(textCidade.getText().trim(), "cidade");
        } catch (CaractereInvalidoException e) {
            ErrorMessage.advert(e.getMessage());
        }
        String telefone = null;
        try {
            telefone = kod.utils.formats.FmtFone.format(textTelefone.getText().trim(), "telefone");
        } catch (CaractereInvalidoException e) {
            ErrorMessage.advert(e.getMessage());
        }
        String celular = null;
        try {
            celular = kod.utils.formats.FmtFone.format(textCelular.getText().trim(), "celular");
        } catch (CaractereInvalidoException e) {
            ErrorMessage.advert(e.getMessage());
        }
        String email = null;
        try {
            email = kod.utils.formats.FmtEmail.format(textEmail.getText().trim());
        } catch (CaractereInvalidoException e) {
            ErrorMessage.advert(e.getMessage());
        }
        String cpf = null;
        try {
            cpf = kod.utils.formats.FmtCpf.format(textCpf.getText().trim());
        } catch (CaractereInvalidoException e) {
            ErrorMessage.advert(e.getMessage());
        }
        String pis = null;
        try {
            pis = kod.utils.formats.FmtDocs.format(textPis.getText().trim(), "PIS");
        } catch (CaractereInvalidoException e) {
            ErrorMessage.advert(e.getMessage());
        }
        String cntps = null;
        try {
            cntps = kod.utils.formats.FmtDocs.format(textCntps.getText().trim(), "CNTPS");
        } catch (CaractereInvalidoException e) {
            ErrorMessage.advert(e.getMessage());
        }
        java.math.BigDecimal salario = null;
        try {
            salario = FmtMoney.toBigDecimal(textSalario.getText().trim());
        } catch (Exception e) {
            ErrorMessage.advert("Salario incorreto!");
        }
        Funcionario f = new Funcionario(nome, sexo, idade, cpf, salario, pis, cntps, endereco,
                cidade, telefone, celular, email, new java.util.Date(), null);

        if (!textFuncDesde.getText().isEmpty()) {
            f.setDataContratacao(kod.utils.DataUtils.toStandardDate(textFuncDesde.getText()));
        }

        if (!textCodigo.getText().isEmpty()) {
            f.setIdFuncionario(getObjectCode());
        }
        return f;
    }

    protected Integer getObjectCode() {
        return Integer.valueOf(Integer.parseInt(textCodigo.getText()));
    }

    protected void pesquisa() {
        String item = textPesquisa.getText().trim();

        if (item.isEmpty()) {
            updateTable();
            lbPesquisando.setText(null);
        } else if ((item.startsWith("(")) && (StringUtils.onlyContain(item, 4))) {
            search("telefone", item);
            lbPesquisando.setText("Pesquisando por: Telefone");

        } else if (item.substring(0, 2).contains("R$")) {
            search("salario", FmtMoney.toBigDecimal(item));
            lbPesquisando.setText("Pesquisando por: Salario");

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
        } else {
            search("endereco", item);
            lbPesquisando.setText("Pesquisando por: Endereco");
        }
    }
}
