package kod.vankish.gui;

import kod.utils.GuiUtils;
import kod.vankish.logics.StartUp;
import kod.vankish.pojo.Usuario;

import javax.swing.*;
import java.awt.*;


public final class MainFrame
        extends JFrame
        implements AppFrame {
    private static final String title = "Kod Vankish";
    private static MainFrame instance = new MainFrame();
    private Usuario user;
    private JTabbedPane aba;

    private MainFrame() {
        super("Kod Vankish");


        setDefaultCloseOperation(3);
        getContentPane().setBackground(Color.BLACK);
        setBounds(new GuiUtils().centraliza(1024, 768));
        setLayout(new FlowLayout());
        setExtendedState(6);
        setIconImage(new GuiUtils().createIcon());
        new GuiUtils().setSystemLookAndFeel(this);
    }


    public static MainFrame getInstance() {
        return instance;
    }


    public void init() {
        aba = new JTabbedPane();
        aba.setPreferredSize(new Dimension(980, 680));
        aba.setBackground(Color.BLACK);

        aba.add("Pagina Inicial", new TelaInicial());

        aba.add("Estoque", Estoque.getInstance());

        if (user.isControleclientes()) {
            aba.add("Clientes", Clientes.getInstance());
        }
        if (user.isControlefuncionarios()) {
            aba.add("Funcionarios", Funcionarios.getInstance());
        }
        if (user.isControlefornecedores()) {
            aba.add("Fornecedores", Fornecedores.getInstance());
        }
        Administrativo.getInstance().setUsuario(user);
        aba.add("Administrativo", Administrativo.getInstance());
        Administrativo.getInstance().init();

        getContentPane().add(aba);
        setVisible(true);


        new StartUp().IsThereCaixa();
    }


    JTabbedPane getAba() {
        return aba;
    }


    public Usuario getUser() {
        return user;
    }


    public void setUser(Usuario user) {
        this.user = user;
    }
}
