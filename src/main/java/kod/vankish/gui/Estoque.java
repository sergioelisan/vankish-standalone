package kod.vankish.gui;

import kod.database.utils.Pesquisa;
import kod.exceptions.CaractereInvalidoException;
import kod.exceptions.util.ErrorMessage;
import kod.utils.DataUtils;
import kod.utils.StringUtils;
import kod.vankish.pojo.Fornecedor;
import kod.vankish.pojo.Produto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.ParseException;

public class Estoque extends Controle<Produto> {
    private static Estoque instance = new Estoque();
    private JButton btNovo;
    private JButton btRemove;
    private JButton btSave;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel17;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JScrollPane jScrollPane1;
    private JToolBar.Separator jSeparator1;
    private JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private JToolBar jToolBar1;
    private JTable jtable;
    private JLabel lbFornecedor;
    private JLabel lbPesquisando;
    private JLabel lbReturn;
    private JLabel lbReturn1;
    private JTextField textCategoria;
    private JTextField textCodBarras;
    private JTextField textCodigo;
    private JTextField textDataCompra;
    private JTextField textDescricao;
    private JTextField textEstocado;
    private JTextField textFornecedor;
    private JTextField textPesquisa;
    private JTextField textPrecoCompra;
    private JTextField textPrecoVenda;
    private JTextField textUnidade;
    private JFormattedTextField textVencimento;
    private Estoque() {
        tabela = new kod.vankish.gui.tabelas.TabelaEstoque();
        classe = Produto.class;
        initComponents();
    }

    public static Estoque getInstance() {
        return instance;
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        textPesquisa = new JTextField();
        lbPesquisando = new JLabel();
        jLabel3 = new JLabel();
        jLabel17 = new JLabel();
        textFornecedor = new JTextField();
        textCategoria = new JTextField();
        textUnidade = new JTextField();
        textPrecoCompra = new JTextField();
        jLabel11 = new JLabel();
        textCodigo = new JTextField();
        jLabel6 = new JLabel();
        jLabel5 = new JLabel();
        jLabel8 = new JLabel();
        textDescricao = new JTextField();
        jLabel7 = new JLabel();
        textPrecoVenda = new JTextField();
        jLabel12 = new JLabel();
        textDataCompra = new JTextField();
        jLabel13 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel14 = new JLabel();
        textEstocado = new JTextField();
        lbReturn = new JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lbFornecedor = new JLabel();
        textVencimento = new JFormattedTextField();
        jToolBar1 = new JToolBar();
        btNovo = new JButton();
        jSeparator1 = new JToolBar.Separator();
        btSave = new JButton();
        jSeparator2 = new JToolBar.Separator();
        btRemove = new JButton();
        lbReturn1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        jtable = new JTable();
        textCodBarras = new JTextField();

        setBackground(new Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new Color(254, 254, 254));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialEstoque.png")));
        jLabel1.setText("Estoque");

        jLabel2.setForeground(new Color(254, 254, 254));
        jLabel2.setText("Pesquisa:");

        textPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(FocusEvent evt) {
                Estoque.this.textPesquisaFocusLost(evt);
            }
        });
        textPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Estoque.this.textPesquisaKeyReleased(evt);
            }

        });
        lbPesquisando.setForeground(new Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Dados do Produto");

        jLabel17.setForeground(new Color(254, 254, 254));
        jLabel17.setText("Vencimento");

        textFornecedor.setNextFocusableComponent(textCategoria);
        textFornecedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(KeyEvent evt) {
                Estoque.this.textFornecedorKeyReleased(evt);
            }

        });
        textCategoria.setNextFocusableComponent(textUnidade);

        textUnidade.setNextFocusableComponent(textEstocado);

        textPrecoCompra.setNextFocusableComponent(textPrecoVenda);

        jLabel11.setForeground(new Color(254, 254, 254));
        jLabel11.setText("Preco de venda");

        textCodigo.setEditable(false);

        jLabel6.setForeground(new Color(254, 254, 254));
        jLabel6.setText("Cod. Barras");

        jLabel5.setForeground(new Color(254, 254, 254));
        jLabel5.setText("Codigo");

        jLabel8.setForeground(new Color(254, 254, 254));
        jLabel8.setText("Fornecedor");

        textDescricao.setNextFocusableComponent(textFornecedor);

        jLabel7.setForeground(new Color(254, 254, 254));
        jLabel7.setText("Descricao");

        textPrecoVenda.setNextFocusableComponent(textVencimento);

        jLabel12.setForeground(new Color(254, 254, 254));
        jLabel12.setText("Data de compra");

        textDataCompra.setEditable(false);
        textDataCompra.setNextFocusableComponent(textVencimento);

        jLabel13.setForeground(new Color(254, 254, 254));
        jLabel13.setText("Unidade");

        jLabel9.setForeground(new Color(254, 254, 254));
        jLabel9.setText("Categoria");

        jLabel10.setForeground(new Color(254, 254, 254));
        jLabel10.setText("Preco de compra");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel14.setForeground(new Color(254, 254, 254));
        jLabel14.setText("Quantidade");

        textEstocado.setForeground(new Color(0, 153, 204));
        textEstocado.setNextFocusableComponent(textDataCompra);

        lbReturn.setForeground(new Color(255, 255, 255));
        lbReturn.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/voltar.png")));
        lbReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Estoque.this.lbReturnMouseClicked(evt);
            }

        });
        lbFornecedor.setForeground(new Color(255, 255, 255));
        try {
            textVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        textVencimento.setNextFocusableComponent(textPrecoCompra);

        jToolBar1.setBorder(new javax.swing.border.SoftBevelBorder(0));
        jToolBar1.setRollover(true);

        btNovo.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/new.png")));
        btNovo.setText("Novo");
        btNovo.setFocusable(false);
        btNovo.setHorizontalTextPosition(4);
        btNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Estoque.this.btNovoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNovo);
        jToolBar1.add(jSeparator1);

        btSave.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/save.png")));
        btSave.setText("Salvar");
        btSave.setFocusable(false);
        btSave.setHorizontalTextPosition(4);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Estoque.this.btSaveActionPerformed(evt);
            }
        });
        jToolBar1.add(btSave);
        jToolBar1.add(jSeparator2);

        btRemove.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/remove.png")));
        btRemove.setText("Remover");
        btRemove.setFocusable(false);
        btRemove.setHorizontalTextPosition(4);
        btRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Estoque.this.btRemoveActionPerformed(evt);
            }
        });
        jToolBar1.add(btRemove);

        lbReturn1.setForeground(new Color(255, 255, 255));
        lbReturn1.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/reload.png")));
        lbReturn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Estoque.this.lbReturn1MouseClicked(evt);
            }

        });
        jtable.setModel(tabela);
        jtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Estoque.this.jtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtable);

        textCodBarras.setNextFocusableComponent(textDescricao);

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
                                                .addGap(4, 4, 4)
                                                .addComponent(lbPesquisando, -2, 314, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel3)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jSeparator3))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel5, -2, 57, -2)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(textCodigo, -2, 188, -2))
                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel9, -2, 57, -2)
                                                                                        .addGap(4, 4, 4)
                                                                                        .addComponent(textCategoria, -2, 188, -2))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel13, -2, 57, -2)
                                                                                        .addGap(4, 4, 4)
                                                                                        .addComponent(textUnidade, -2, 188, -2))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(jLabel8, -2, 57, -2)
                                                                                        .addGap(4, 4, 4)
                                                                                        .addComponent(textFornecedor, -2, 49, -2)
                                                                                        .addGap(10, 10, 10)
                                                                                        .addComponent(lbFornecedor, -2, 129, -2))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel7, -2, 57, -2)
                                                                                                .addComponent(jLabel6))
                                                                                        .addGap(4, 4, 4)
                                                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                                .addComponent(textCodBarras)
                                                                                                .addComponent(textDescricao, -1, 188, 32767)))))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel14, -2, 68, -2)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(textEstocado, -2, 88, -2))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel12, -2, 80, -2)
                                                                                        .addComponent(jLabel17))
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(textVencimento, -1, 88, 32767)
                                                                                        .addComponent(textDataCompra, -1, 88, 32767))))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel10)
                                                                                .addGap(4, 4, 4)
                                                                                .addComponent(textPrecoCompra, -2, 125, -2))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel11, -2, 80, -2)
                                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(textPrecoVenda, -2, 125, -2))))))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jLabel1)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767)
                                                        .addComponent(lbReturn))
                                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(jToolBar1, -1, -1, 32767)
                                                                        .addGap(256, 256, 256)
                                                                        .addComponent(lbReturn1))
                                                                .addComponent(jScrollPane1, -2, 956, -2)))))
                                .addGap(14, 14, 14)));


        layout.linkSize(0, new java.awt.Component[]{jLabel12, jLabel14, jLabel17});

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
                                                        .addComponent(lbPesquisando, -2, 19, -2)))
                                        .addComponent(lbReturn))
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane1, -2, 242, -2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lbReturn1)
                                        .addComponent(jToolBar1, -2, 45, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jSeparator3, -2, 10, -2))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel5)
                                                .addComponent(textCodigo, -2, -1, -2))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel10))
                                                        .addComponent(textPrecoCompra, -2, -1, -2))
                                                .addGap(5, 5, 5)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel11)
                                                        .addComponent(textPrecoVenda, -2, -1, -2)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(textCodBarras, -2, -1, -2))
                                                                .addGap(6, 6, 6)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(3, 3, 3)
                                                                                .addComponent(jLabel7))
                                                                        .addComponent(textDescricao, -2, -1, -2))
                                                                .addGap(6, 6, 6)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(3, 3, 3)
                                                                                .addComponent(jLabel8))
                                                                        .addComponent(textFornecedor)
                                                                        .addComponent(lbFornecedor, GroupLayout.Alignment.TRAILING, -2, 20, -2)))
                                                        .addComponent(textEstocado, -2, -1, -2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(3, 3, 3)
                                                                .addComponent(jLabel14)))
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(textDataCompra, -2, -1, -2)
                                                                        .addComponent(jLabel12))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(textVencimento, -2, -1, -2)
                                                                        .addComponent(jLabel17)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(3, 3, 3)
                                                                                .addComponent(jLabel9))
                                                                        .addComponent(textCategoria, -2, -1, -2))
                                                                .addGap(6, 6, 6)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(3, 3, 3)
                                                                                .addComponent(jLabel13))
                                                                        .addComponent(textUnidade, -2, -1, -2))))))
                                .addGap(49, 49, 49)));
    }

    private void lbReturnMouseClicked(MouseEvent evt) {
        toMainPage();
    }

    private void textPesquisaKeyReleased(KeyEvent evt) {
        pesquisa();
    }

    private void textFornecedorKeyReleased(KeyEvent evt) {
        setDescricaoProduto();
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

    private void lbReturn1MouseClicked(MouseEvent evt) {
        updateTable();
    }

    private void jtableMouseClicked(MouseEvent evt) {
        getTableData();
    }

    private void textPesquisaFocusLost(FocusEvent evt) {
        lbPesquisando.setText(null);
    }

    protected void getTableData() {
        int linhas = jtable.getSelectedRow();

        textCodigo.setText(String.valueOf(jtable.getValueAt(linhas, 0)));
        textCodBarras.setText((String) jtable.getValueAt(linhas, 1));
        textDescricao.setText((String) jtable.getValueAt(linhas, 2));

        textFornecedor.setText(String.valueOf(jtable.getValueAt(linhas, 3)));
        setDescricaoProduto();

        textCategoria.setText((String) jtable.getValueAt(linhas, 4));
        textUnidade.setText((String) jtable.getValueAt(linhas, 5));
        textPrecoCompra.setText((String) jtable.getValueAt(linhas, 6));
        textPrecoVenda.setText((String) jtable.getValueAt(linhas, 7));
        textDataCompra.setText((String) jtable.getValueAt(linhas, 8));

        String vencimento = (String) jtable.getValueAt(linhas, 9);
        textVencimento.setText(vencimento.equals("31/12/99") ? null : vencimento);


        textEstocado.setText(String.valueOf(
                kod.vankish.logics.ProdutoLogics.getProduto(Integer.valueOf(Integer.parseInt(textCodigo.getText().trim()))).getEstocado()));
    }

    protected Object getObjectFromFields() {
        if ((textDescricao.getText().isEmpty()) || (textPrecoCompra.getText().isEmpty()) ||
                (textPrecoVenda.getText().isEmpty()) || (textEstocado.getText().isEmpty())) {
            ErrorMessage.advert("Campos importantes nao preenchidos");
            return null;
        }

        String codBarras = null;
        try {
            codBarras = kod.utils.formats.FmtCodBarras.format(textCodBarras.getText().trim());
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String descricao = null;
        try {
            descricao = kod.utils.formats.FmtNome.format(textDescricao.getText().trim(), "descricao");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        Fornecedor fornecedor = textFornecedor.getText().equals("") ? null : (Fornecedor) new Pesquisa(Fornecedor.class).get(Integer.valueOf(Integer.parseInt(textFornecedor.getText().trim())));

        String categoria = null;
        try {
            categoria = kod.utils.formats.FmtNome.format(textCategoria.getText().trim(), "categoria");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        String unidade = "UN";
        try {
            unidade = kod.utils.formats.FmtNome.format(textUnidade.getText().trim(), "unidade");
        } catch (CaractereInvalidoException ex) {
            ErrorMessage.advert(ex.getMessage());
        }
        java.math.BigDecimal precoCompra = kod.utils.formats.FmtMoney.toBigDecimal(textPrecoCompra.getText().trim());
        java.math.BigDecimal precoVenda = kod.utils.formats.FmtMoney.toBigDecimal(textPrecoVenda.getText().trim());

        java.util.Date dataVencimento = textVencimento.getText().equals("  /  /    ") ?
                DataUtils.toStandardDate("31/12/99") :
                DataUtils.toStandardDate(textVencimento.getText().trim());

        Integer estocado = Integer.valueOf(0);
        try {
            estocado = Integer.valueOf(Integer.parseInt(textEstocado.getText().trim()));
        } catch (NumberFormatException e) {
            ErrorMessage.advert(e.getMessage());
        }
        Produto p = new Produto(fornecedor, codBarras, descricao, categoria, unidade,
                precoCompra, precoVenda, new java.util.Date(), dataVencimento, estocado.intValue(), null);

        if (!textCodigo.getText().isEmpty()) {
            p.setCodigo(getObjectCode());
        }
        if (!textDataCompra.getText().isEmpty()) {
            p.setDataCompra(DataUtils.toStandardDate(textDataCompra.getText()));
        }
        return p;
    }

    protected void pesquisa() {
        String item = textPesquisa.getText().trim();

        if (item.isEmpty()) {
            updateTable();
            lbPesquisando.setText(null);
        } else if ((StringUtils.onlyContain(item, 0)) && (item.startsWith("desc "))) {
            search("descricao", item);
            lbPesquisando.setText("Pesquisando por: Descricao");

        } else if ((StringUtils.onlyContain(item, 3)) && (item.length() >= 4)) {
            search("codBarras", item);
            lbPesquisando.setText("Pesquisando por: Codigo de Barras");

        } else if ((StringUtils.onlyContain(item, 0)) && (item.length() <= 3)) {
            search("unidade", item);
            lbPesquisando.setText("Pesquisando por: Unidade");

        } else if ((StringUtils.onlyContain(item, 0)) && (item.startsWith("cat "))) {
            search("categoria", item);
            lbPesquisando.setText("Pesquisando por: Categoria");

        } else if ((StringUtils.onlyContain(item, 3)) && (item.startsWith("forn "))) {
            search("fornecedor", new Pesquisa(Fornecedor.class).get(Integer.valueOf(Integer.parseInt(item))));
            lbPesquisando.setText("Pesquisando por: Fornecedor");
        }
    }


    private void setDescricaoProduto() {
        String id = textFornecedor.getText().trim();

        if (id.isEmpty()) {
            lbFornecedor.setText(null);
        } else {
            lbFornecedor.setText(
                    ((Fornecedor) new Pesquisa(Fornecedor.class).get(Integer.valueOf(Integer.parseInt(id)))).getEmpresa());
        }
    }

    protected void clearFields() {
        super.clearFields();
        lbFornecedor.setText(null);
    }

    protected Integer getObjectCode() {
        return Integer.valueOf(Integer.parseInt(textCodigo.getText()));
    }
}
