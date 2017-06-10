package kod.vankish.gui;

import kod.vankish.pojo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Administrativo extends JPanel {
    private static Administrativo instance = new Administrativo();
    private Usuario usuario;
    private JTabbedPane aba;
    private JLabel jLabel1;
    private JLabel jLabel2;


    private Administrativo() {
        initComponents();
    }

    public static Administrativo getInstance() {
        return instance;
    }

    public void init() {
        aba.add("Troca", HistoricoTrocaPanel.getInstance());

        FinancialPanel.getInstance().setUsuario(usuario);
        aba.add("Financas", FinancialPanel.getInstance());
        FinancialPanel.getInstance().init();

        if (usuario.isUsuarios()) {
            aba.add("Configuracoes", Configuracoes.getInstance());
        }
    }

    public JTabbedPane aba() {
        return aba;
    }

    private void initComponents() {
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        aba = new JTabbedPane();

        setBackground(new Color(102, 102, 102));

        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel1.setForeground(new Color(254, 254, 254));
        jLabel1.setText(" Administrativo");

        jLabel2.setForeground(new Color(254, 254, 254));
        jLabel2.setIcon(new ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/voltar.png")));
        jLabel2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                Administrativo.this.jLabel2MouseClicked(evt);
            }

        });
        aba.setPreferredSize(new Dimension(950, 560));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(aba, GroupLayout.Alignment.LEADING, -1, 956, 32767)
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 797, 32767)
                                                .addComponent(jLabel2)))
                                .addContainerGap()));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aba, -1, 586, 32767)
                                .addContainerGap()));
    }

    private void jLabel2MouseClicked(MouseEvent evt) {
        MainFrame.getInstance().getAba().setSelectedIndex(0);
    }

    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
