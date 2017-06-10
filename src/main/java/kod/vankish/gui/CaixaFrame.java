package kod.vankish.gui;

import kod.utils.GuiUtils;
import kod.vankish.pojo.Usuario;

import javax.swing.*;
import java.awt.*;


public class CaixaFrame
        extends JFrame
        implements AppFrame {
    private static CaixaFrame instance = new CaixaFrame();
    private JTabbedPane aba;
    private Usuario user;

    public CaixaFrame() {
        super("Vankish CAIXA");
        new GuiUtils().setSystemLookAndFeel(this);
        setBounds(new GuiUtils().centraliza(900, 600));
        setIconImage(new GuiUtils().createIcon());
        setResizable(false);
        setDefaultCloseOperation(3);
        getContentPane().setBackground(Color.black);
        initComponents();
    }


    public static CaixaFrame getInstance() {
        return instance;
    }


    private void initComponents() {
        aba = new JTabbedPane();
        getContentPane().add(aba);
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public void init() {
        aba.add("-- Caixa --", Caixa.getInstance());
        aba.add("-- Trocas --", TrocaPanel.getInstance());
        aba.add("-- Fechamento --", Fechamento.getInstance());
        setVisible(true);
    }
}
