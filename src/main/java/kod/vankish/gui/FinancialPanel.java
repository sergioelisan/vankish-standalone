package kod.vankish.gui;

import kod.vankish.pojo.Usuario;

import javax.swing.*;
import java.awt.*;


public class FinancialPanel
        extends JPanel {
    private static FinancialPanel instance = new FinancialPanel();
    private Usuario usuario;
    private JTabbedPane aba;

    private FinancialPanel() {
        initComponents();
    }

    public static FinancialPanel getInstance() {
        return instance;
    }

    public void init() {
        if (usuario.isAdminbalanco()) {
            aba.add("Balanco", Balanco.getInstance());
        }
        if (usuario.isAdmincontas())
            aba.add("Registro de Contas", CadastroContas.getInstance());
    }

    public JTabbedPane aba() {
        return aba;
    }

    private void initComponents() {
        aba = new JTabbedPane();

        setBackground(new Color(102, 102, 102));

        aba.setMinimumSize(new Dimension(930, 535));
        aba.setPreferredSize(new Dimension(920, 515));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(aba, -2, 896, 32767)
                                .addContainerGap()));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(aba, -1, 536, 32767)
                                .addContainerGap()));
    }


    public Usuario getUsuario() {
        return usuario;
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
