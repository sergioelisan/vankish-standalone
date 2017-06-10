package kod.vankish.gui;

import kod.utils.DataUtils;
import kod.utils.GuiUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.logics.Calendario;
import kod.vankish.logics.LogPanel;
import kod.vankish.pojo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaInicial extends JPanel implements Runnable {
    private Calendario calendar;
    private Color vermelho = new Color(153, 0, 51);
    private Color verde = new Color(51, 102, 0);
    private JTabbedPane abaCalendario;
    private JFrame aboutFrame;
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
    private JLabel jLabel20;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JPanel jPanel1;
    private JPanel jPanel4;
    private JPanel jPanel5;
    private JScrollPane jScrollPane1;
    private JSeparator jSeparator2;
    private JSeparator jSeparator3;
    private JSeparator jSeparator4;
    private JLabel lbBalanco;
    private JLabel lbClientes;
    private JLabel lbConfig;
    private JLabel lbContas;
    private JLabel lbContas1;
    private JLabel lbEstadoCaixa;
    private JTextPane lbEstadoContas;
    private JLabel lbEstoque;
    private JLabel lbFornecedores;
    private JLabel lbFuncionarios;
    private JLabel lbHoje;
    private JLabel lbSobre;
    private JLabel lbStatus;
    private JLabel lbTroca;
    private JLabel lbUsuario;

    public TelaInicial() {
        initComponents();
        usuarioLogado();
        createCalendar();
        setRodapeData();
        start();
    }

    public Icon setPersonalizatedLogo() {
        return new ImageIcon(getClass().getResource(new GuiUtils().getPersonalizationBundle()
                .getProperty("logo")));
    }

    private Usuario getUsuario() {
        return MainFrame.getInstance().getUser();
    }

    private void setRodapeData() {
        lbHoje.setText(DataUtils.dateBRLong(new java.util.Date()));
    }

    private void usuarioLogado() {
        lbUsuario.setText("Usuario: " + getUsuario().getNome());
    }

    public void run() {
        try {
            for (; ; ) {
                loadCalendar();
                loadWarnings();
                Thread.sleep(5000L);
            }
        } catch (InterruptedException e) {
            javax.swing.JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void start() {
        Thread th = new Thread(this, "Tela Inicial");
        th.start();
    }

    private void initComponents() {
        aboutFrame = new JFrame();
        jPanel1 = new JPanel();
        jLabel4 = new JLabel();
        jLabel8 = new JLabel();
        jLabel7 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel15 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel3 = new JLabel();
        jLabel17 = new JLabel();
        jLabel18 = new JLabel();
        jLabel19 = new JLabel();
        jLabel20 = new JLabel();
        jLabel5 = new JLabel();
        jLabel1 = new JLabel();
        lbSobre = new JLabel();
        jPanel5 = new JPanel();
        lbStatus = new JLabel();
        lbHoje = new JLabel();
        lbUsuario = new JLabel();
        lbBalanco = new JLabel();
        lbContas = new JLabel();
        lbEstoque = new JLabel();
        lbFornecedores = new JLabel();
        lbFuncionarios = new JLabel();
        lbClientes = new JLabel();
        jLabel6 = new JLabel();
        jSeparator2 = new JSeparator();
        lbTroca = new JLabel();
        lbConfig = new JLabel();
        jPanel4 = new JPanel();
        lbEstadoCaixa = new JLabel();
        lbContas1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        lbEstadoContas = new JTextPane();
        abaCalendario = new JTabbedPane();
        jLabel2 = new JLabel();
        jSeparator3 = new JSeparator();
        jLabel16 = new JLabel();
        jSeparator4 = new JSeparator();

        aboutFrame.setDefaultCloseOperation(2);
        aboutFrame.setTitle("Sobre a Kod");
        aboutFrame.setBounds(centraliza());
        aboutFrame.setResizable(false);

        jPanel1.setBackground(new Color(102, 102, 102));

        jLabel4.setFont(new Font("Segoe UI", 0, 18));
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(0);
        jLabel4.setText("Kod Technology ");

        jLabel8.setFont(new Font("Segoe UI", 1, 11));
        jLabel8.setForeground(new Color(255, 255, 255));
        jLabel8.setText("Diretor Financeiro e Telecom");

        jLabel7.setFont(new Font("Segoe UI", 1, 11));
        jLabel7.setForeground(new Color(255, 255, 255));
        jLabel7.setText("CEO e Analista responsavel");

        jLabel11.setFont(new Font("Segoe UI", 0, 11));
        jLabel11.setForeground(new Color(255, 255, 255));
        jLabel11.setText("Marcio Simas");

        jLabel12.setFont(new Font("Segoe UI", 0, 11));
        jLabel12.setForeground(new Color(255, 255, 255));
        jLabel12.setText("contato@kod.com.br");

        jLabel9.setFont(new Font("Segoe UI", 1, 11));
        jLabel9.setForeground(new Color(255, 255, 255));
        jLabel9.setText("Contato:");

        jLabel10.setFont(new Font("Segoe UI", 0, 11));
        jLabel10.setForeground(new Color(255, 255, 255));
        jLabel10.setText("Sergio Eduardo");

        jLabel15.setFont(new Font("Segoe UI", 0, 11));
        jLabel15.setForeground(new Color(255, 255, 255));
        jLabel15.setText("Ivanildo Filho");

        jLabel13.setFont(new Font("Segoe UI", 0, 11));
        jLabel13.setForeground(new Color(255, 255, 255));
        jLabel13.setText("(81) 3093-0182 / (81) 9118-6584 - Suporte Candeias");

        jLabel14.setFont(new Font("Segoe UI", 1, 11));
        jLabel14.setForeground(new Color(255, 255, 255));
        jLabel14.setText("Dir. de Conhecimento");

        jLabel3.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/Kod Mini Icon.png")));

        jLabel17.setFont(new Font("Segoe UI", 0, 11));
        jLabel17.setForeground(new Color(255, 255, 255));
        jLabel17.setText("Alexandre Francisco");

        jLabel18.setFont(new Font("Segoe UI", 1, 11));
        jLabel18.setForeground(new Color(255, 255, 255));
        jLabel18.setText("CIO e Analista-chefe");

        jLabel19.setFont(new Font("Segoe UI", 0, 11));
        jLabel19.setForeground(new Color(255, 255, 255));
        jLabel19.setText("(81) 3082-8099 / (81) 8810-8621 - Suporte IPSEP");

        jLabel20.setFont(new Font("Segoe UI", 1, 11));
        jLabel20.setForeground(new Color(255, 255, 255));
        jLabel20.setText("Staff:");

        jLabel5.setFont(new Font("Tahoma", 0, 8));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("TM");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, -1, 220, 32767))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel14)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel15))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(jLabel8, GroupLayout.Alignment.LEADING, -1, -1, 32767)
                                                                                        .addComponent(jLabel7, GroupLayout.Alignment.LEADING))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jLabel11)
                                                                                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                                .addComponent(jLabel5, -2, 17, -2)
                                                                                                .addComponent(jLabel10))))
                                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addComponent(jLabel18)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel17))))
                                                        .addComponent(jLabel20)
                                                        .addComponent(jLabel9)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel13)
                                                                        .addComponent(jLabel12, -2, 117, -2)
                                                                        .addComponent(jLabel19))))))
                                .addContainerGap(33, -2)));


        jPanel1Layout.linkSize(0, new Component[]{jLabel14, jLabel18, jLabel7, jLabel8});

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel3))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel4))))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED, -1, 32767)
                                .addComponent(jLabel20)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel10))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel11))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel15))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addContainerGap(38, 32767)));


        GroupLayout aboutFrameLayout = new GroupLayout(aboutFrame.getContentPane());
        aboutFrame.getContentPane().setLayout(aboutFrameLayout);
        aboutFrameLayout.setHorizontalGroup(
                aboutFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, -1, -1, 32767));

        aboutFrameLayout.setVerticalGroup(
                aboutFrameLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, -1, -1, 32767));


        setBackground(new Color(102, 102, 102));

        jLabel1.setFont(new Font("Nyala", 3, 48));
        jLabel1.setForeground(new Color(254, 254, 254));
        jLabel1.setHorizontalAlignment(0);
        jLabel1.setIcon(setPersonalizatedLogo());

        lbSobre.setFont(new Font("Segoe UI", 1, 10));
        lbSobre.setForeground(new Color(255, 255, 255));
        lbSobre.setHorizontalAlignment(0);
        lbSobre.setText("Contactar suporte da Kod Technology");
        lbSobre.setVerticalAlignment(3);
        lbSobre.setHorizontalTextPosition(0);
        lbSobre.setVerticalTextPosition(3);
        lbSobre.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbSobreMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbSobreMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbSobreMouseExited(evt);
            }

        });
        jPanel5.setBackground(new Color(60, 60, 60));

        lbStatus.setFont(new Font("Tahoma", 1, 11));
        lbStatus.setForeground(new Color(255, 255, 255));
        lbStatus.setText("Bem-vindo !");

        lbHoje.setFont(new Font("Tahoma", 1, 11));
        lbHoje.setForeground(new Color(255, 255, 255));
        lbHoje.setHorizontalAlignment(4);
        lbHoje.setText("Data do dia!");

        lbUsuario.setFont(new Font("Tahoma", 1, 11));
        lbUsuario.setForeground(new Color(255, 255, 255));
        lbUsuario.setHorizontalAlignment(0);
        lbUsuario.setText("Usuario Atual");

        GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbStatus, -2, 348, -2)
                                .addGap(18, 18, 18)
                                .addComponent(lbUsuario, -2, 206, -2)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 123, 32767)
                                .addComponent(lbHoje, -2, 265, -2)
                                .addContainerGap()));

        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(lbStatus, GroupLayout.Alignment.TRAILING, -1, 25, 32767)
                        .addGroup(jPanel5Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(lbHoje, -1, 25, 32767)
                                .addComponent(lbUsuario, -2, 24, -2)));


        lbBalanco.setBackground(new Color(0, 0, 0));
        lbBalanco.setFont(new Font("Segoe UI", 0, 16));
        lbBalanco.setForeground(new Color(255, 255, 255));
        lbBalanco.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialContas.png")));
        lbBalanco.setText("          Balanco");
        lbBalanco.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbBalancoMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbBalancoMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbBalancoMouseExited(evt);
            }

        });
        lbContas.setBackground(new Color(0, 0, 0));
        lbContas.setFont(new Font("Segoe UI", 0, 16));
        lbContas.setForeground(new Color(255, 255, 255));
        lbContas.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/mail-forward.png")));
        lbContas.setText("        Contas");
        lbContas.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbContasMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbContasMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbContasMouseExited(evt);
            }

        });
        lbEstoque.setBackground(new Color(0, 0, 0));
        lbEstoque.setFont(new Font("Segoe UI", 0, 16));
        lbEstoque.setForeground(new Color(255, 255, 255));
        lbEstoque.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialEstoque.png")));
        lbEstoque.setText("          Estoque");
        lbEstoque.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbEstoqueMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbEstoqueMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbEstoqueMouseExited(evt);
            }

        });
        lbFornecedores.setBackground(new Color(0, 0, 0));
        lbFornecedores.setFont(new Font("Segoe UI", 0, 16));
        lbFornecedores.setForeground(new Color(255, 255, 255));
        lbFornecedores.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialFornecedores.png")));
        lbFornecedores.setText("    Fornecedores");
        lbFornecedores.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbFornecedoresMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbFornecedoresMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbFornecedoresMouseExited(evt);
            }

        });
        lbFuncionarios.setBackground(new Color(0, 0, 0));
        lbFuncionarios.setFont(new Font("Segoe UI", 0, 16));
        lbFuncionarios.setForeground(new Color(255, 255, 255));
        lbFuncionarios.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialFuncionarios.png")));
        lbFuncionarios.setText("    Funcionarios");
        lbFuncionarios.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbFuncionariosMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbFuncionariosMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbFuncionariosMouseExited(evt);
            }

        });
        lbClientes.setBackground(new Color(0, 0, 0));
        lbClientes.setFont(new Font("Segoe UI", 0, 16));
        lbClientes.setForeground(new Color(255, 255, 255));
        lbClientes.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialClientes.png")));
        lbClientes.setText("    Clientes");
        lbClientes.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbClientesMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbClientesMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbClientesMouseExited(evt);
            }

        });
        jLabel6.setBackground(new Color(0, 0, 0));
        jLabel6.setFont(new Font("Segoe UI", 1, 11));
        jLabel6.setForeground(new Color(255, 255, 255));
        jLabel6.setText("Avisos do dia");

        jSeparator2.setForeground(new Color(102, 102, 102));

        lbTroca.setBackground(new Color(0, 0, 0));
        lbTroca.setFont(new Font("Segoe UI", 0, 16));
        lbTroca.setForeground(new Color(255, 255, 255));
        lbTroca.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialTroca.png")));
        lbTroca.setText("        Trocas");
        lbTroca.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbTrocaMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbTrocaMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbTrocaMouseExited(evt);
            }

        });
        lbConfig.setBackground(new Color(0, 0, 0));
        lbConfig.setFont(new Font("Segoe UI", 0, 16));
        lbConfig.setForeground(new Color(255, 255, 255));
        lbConfig.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialConfiguracoes.png")));
        lbConfig.setText("          Opcoes");
        lbConfig.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbConfigMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbConfigMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbConfigMouseExited(evt);
            }

        });
        jPanel4.setBackground(new Color(255, 255, 255));

        lbEstadoCaixa.setFont(new Font("Segoe UI", 1, 18));
        lbEstadoCaixa.setForeground(new Color(153, 0, 51));
        lbEstadoCaixa.setHorizontalAlignment(0);
        lbEstadoCaixa.setText("R$ Caixa");
        lbEstadoCaixa.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbEstadoCaixaMouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbEstadoCaixaMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbEstadoCaixaMouseExited(evt);
            }

        });
        GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbEstadoCaixa, -1, 172, 32767)
                                .addContainerGap()));

        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap(-1, 32767)
                                .addComponent(lbEstadoCaixa, -2, 29, -2)
                                .addContainerGap()));


        lbContas1.setBackground(new Color(0, 0, 0));
        lbContas1.setFont(new Font("Segoe UI", 0, 16));
        lbContas1.setForeground(new Color(255, 255, 255));
        lbContas1.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/telaInicialCaixa.png")));
        lbContas1.setText("        Caixa");
        lbContas1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                TelaInicial.this.lbContas1MouseClicked(evt);
            }

            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbContas1MouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbContas1MouseExited(evt);
            }

        });
        lbEstadoContas.setEditable(false);
        lbEstadoContas.setFont(new Font("Tahoma", 1, 12));
        lbEstadoContas.setForeground(new Color(153, 0, 51));
        lbEstadoContas.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                TelaInicial.this.lbEstadoContasMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                TelaInicial.this.lbEstadoContasMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(lbEstadoContas);

        abaCalendario.setBackground(new Color(255, 255, 255));
        abaCalendario.setMaximumSize(new Dimension(200, 170));
        abaCalendario.setPreferredSize(new Dimension(200, 170));

        jLabel2.setFont(new Font("Segoe UI", 1, 11));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Calendario");

        jLabel16.setBackground(new Color(0, 0, 0));
        jLabel16.setFont(new Font("Segoe UI", 1, 12));
        jLabel16.setForeground(new Color(255, 255, 255));
        jLabel16.setText("Seu Sistema");

        jSeparator4.setForeground(new Color(102, 102, 102));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(lbClientes, -2, 175, -2)
                                                                                .addGap(56, 56, 56)
                                                                                .addComponent(lbEstoque, -2, 175, -2))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lbFuncionarios, -2, 175, -2)
                                                                                        .addComponent(lbFornecedores, -2, 175, -2))
                                                                                .addGap(56, 56, 56)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(lbConfig, -2, 175, -2)
                                                                                        .addComponent(lbBalanco, -2, 175, -2))))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 70, 32767)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lbContas, -2, 175, -2)
                                                                        .addComponent(lbTroca, -2, 175, -2)
                                                                        .addComponent(lbContas1, -2, 175, -2)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel16, -2, 74, -2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(jSeparator4, -1, 567, 32767)))
                                                .addGap(78, 78, 78))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1, -2, 333, -2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jSeparator3))
                                                .addComponent(abaCalendario, -2, 208, -2))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lbSobre, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
                                                .addComponent(jPanel4, GroupLayout.Alignment.TRAILING, -1, -1, 32767)))
                                .addGap(19, 19, 19))
                        .addComponent(jPanel5, GroupLayout.Alignment.TRAILING, -1, -1, 32767)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, GroupLayout.Alignment.TRAILING, -1, 468, 32767)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, -2, 74, -2)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jSeparator2, -1, 384, 32767)))
                                .addGap(269, 269, 269)));


        layout.linkSize(0, new Component[]{lbBalanco, lbClientes, lbConfig, lbContas, lbContas1, lbEstoque, lbFornecedores, lbFuncionarios, lbTroca});

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(lbSobre)
                                                .addGap(16, 16, 16)
                                                .addComponent(jPanel4, -2, -1, -2))
                                        .addComponent(jLabel1, -2, 175, -2))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel16)
                                        .addComponent(jSeparator4, -2, 10, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(lbClientes)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lbEstoque)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(lbBalanco)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lbConfig))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(64, 64, 64)
                                                                .addComponent(lbFuncionarios)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lbFornecedores))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lbTroca)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lbContas1)
                                                                .addGap(20, 20, 20)
                                                                .addComponent(lbContas))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jSeparator3, -2, 10, -2)
                                                                        .addComponent(jLabel2))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(abaCalendario, -2, -1, -2)))))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jSeparator2, -2, 10, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, -1, 134, 32767)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel5, -2, -1, -2)));


        layout.linkSize(1, new Component[]{lbBalanco, lbClientes, lbConfig, lbContas, lbContas1, lbEstoque, lbFornecedores, lbFuncionarios, lbTroca});
    }

    private void createCalendar() {
        abaCalendario.add(DataUtils.actualMonthName(), this.calendar = new Calendario());
    }

    private void loadCalendar() {
        calendar.atualiza();
    }

    private void loadWarnings() {
        String caixa = LogPanel.caixaLog();

        if (FmtMoney.toDouble(caixa) < 0.0D) {
            lbEstadoCaixa.setForeground(vermelho);
        } else {
            lbEstadoCaixa.setForeground(verde);
        }
        lbEstadoCaixa.setText("Caixa: " + caixa);
        lbEstadoContas.setText(LogPanel.pagamentosLog());
    }

    private JTabbedPane aba() {
        return MainFrame.getInstance().getAba();
    }

    private void lbClientesMouseClicked(MouseEvent evt) {
        if (getUsuario().isControleclientes()) {
            aba().setSelectedComponent(Clientes.getInstance());
        } else
            denyAcess("Controle de Clientes");
    }

    private void lbEstoqueMouseClicked(MouseEvent evt) {
        if (getUsuario().isControlefornecedores()) {
            aba().setSelectedComponent(Estoque.getInstance());
        } else
            denyAcess("Estoque");
    }

    private void lbFuncionariosMouseClicked(MouseEvent evt) {
        if (getUsuario().isControlefuncionarios()) {
            aba().setSelectedComponent(Funcionarios.getInstance());
        } else
            denyAcess("Controle de Funcionarios");
    }

    private void lbBalancoMouseClicked(MouseEvent evt) {
        if (getUsuario().isAdminbalanco()) {
            aba().setSelectedComponent(Administrativo.getInstance());
            Administrativo.getInstance().aba().setSelectedComponent(FinancialPanel.getInstance());
            FinancialPanel.getInstance().aba().setSelectedComponent(Balanco.getInstance());
        } else {
            denyAcess("Balanco");
        }
    }

    private void lbFornecedoresMouseClicked(MouseEvent evt) {
        if (getUsuario().isControlefornecedores()) {
            aba().setSelectedComponent(Fornecedores.getInstance());
        } else
            denyAcess("Controle de Fornecedores");
    }

    private void lbContasMouseClicked(MouseEvent evt) {
        if (getUsuario().isAdmincontas()) {
            aba().setSelectedComponent(Administrativo.getInstance());
            Administrativo.getInstance().aba().setSelectedComponent(FinancialPanel.getInstance());
            FinancialPanel.getInstance().aba().setSelectedComponent(CadastroContas.getInstance());
        } else {
            denyAcess("Controle de Contas");
        }
    }

    private void lbTrocaMouseClicked(MouseEvent evt) {
        aba().setSelectedComponent(Administrativo.getInstance());
        Administrativo.getInstance().aba().setSelectedComponent(HistoricoTrocaPanel.getInstance());
    }

    private void lbClientesMouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Cadastro e controle de Clientes");
    }

    private void lbClientesMouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
    }

    private void lbFuncionariosMouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Cadastro e controle de Funcionarios");
    }

    private void lbFuncionariosMouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
    }

    private void lbFornecedoresMouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Cadastro e controle de Fornecedores");
    }

    private void lbFornecedoresMouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
    }

    private void lbEstoqueMouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Cadastro e controle de Estoque");
    }

    private void lbEstoqueMouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
    }

    private void lbBalancoMouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Visualizacao do Movimento do Caixa");
    }

    private void lbBalancoMouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
    }

    private void lbContasMouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Controle de Contas");
    }

    private void lbContasMouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
    }

    private void lbTrocaMouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Historico de Trocas");
    }

    private void lbTrocaMouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
    }

    private void lbConfigMouseClicked(MouseEvent evt) {
        if (getUsuario().isUsuarios()) {
            aba().setSelectedComponent(Administrativo.getInstance());
            Administrativo.getInstance().aba().setSelectedComponent(Configuracoes.getInstance());
        } else {
            denyAcess("Configuracoes");
        }
    }

    private void lbConfigMouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Configuracoes do Sistema");
    }

    private void lbConfigMouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
    }

    private void lbSobreMouseClicked(MouseEvent evt) {
        aboutFrame.setVisible(true);
    }

    private void lbEstadoContasMouseEntered(MouseEvent evt) {
        statusBar("Avisos do Sistema");
    }

    private void lbEstadoContasMouseExited(MouseEvent evt) {
        statusBar();
    }

    private void lbContas1MouseClicked(MouseEvent evt) {
        CaixaFrame.getInstance().setUser(MainFrame.getInstance().getUser());
        CaixaFrame.getInstance().init();
        CaixaFrame.getInstance().setDefaultCloseOperation(2);
    }

    private void lbContas1MouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Operacoes de Venda, Troca e Relatorio de vendas ");
    }

    private void lbContas1MouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
        statusBar();
    }

    private void lbSobreMouseEntered(MouseEvent evt) {
        above((JLabel) evt.getSource());
        statusBar("Clique para saber como Contactar a Kod");
    }

    private void lbSobreMouseExited(MouseEvent evt) {
        out((JLabel) evt.getSource());
        statusBar();
    }

    private void lbEstadoCaixaMouseEntered(MouseEvent evt) {
        statusBar("Abre uma janela para gerenciar o dinheiro do Caixa");
    }

    private void lbEstadoCaixaMouseExited(MouseEvent evt) {
        statusBar();
    }

    private void lbEstadoCaixaMouseClicked(MouseEvent evt) {
        if (getUsuario().isAdmincaixa()) {
            new SaldoCaixa().setVisible(true);
        } else {
            denyAcess("Saldo do Caixa");
        }
    }

    private void above(JLabel label) {
        label.setForeground(Color.DARK_GRAY);
    }

    private void out(JLabel label) {
        label.setForeground(Color.WHITE);
        statusBar();
    }

    private void statusBar(String mensagem) {
        lbStatus.setForeground(Color.white);
        lbStatus.setText(mensagem);
    }

    private void statusBar() {
        lbStatus.setForeground(Color.white);
        lbStatus.setText("");
    }

    private Rectangle centraliza() {
        return new GuiUtils().centraliza(343, 325);
    }


    private void denyAcess(String denied) {
        lbStatus.setForeground(vermelho);
        lbStatus.setText("Acesso negado para: " + denied);
    }
}
