package kod.vankish.gui;

import kod.database.utils.Pesquisa;
import kod.utils.GuiUtils;
import kod.vankish.logics.StartUp;
import kod.vankish.pojo.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.util.ResourceBundle;

public final class Login extends JFrame implements Runnable {
    private static Login instance = new Login();
    private boolean liberado = false;
    private Usuario usuario;
    private AppFrame appInstance;
    private JButton btLogon;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel label;
    private JLabel lbPrincipal;
    private JTextField txtLogin;
    private JPasswordField txtSenha;


    private Login() {
        Splash.getInstance().upBar("Iniciando aplicacao");
        new StartUp();
        Splash.getInstance().upBar("Concluido!");
        start();
    }

    public static Login getInstance() {
        return instance;
    }

    private void start() {
        Thread t = new Thread(this, "Logando");
        t.start();
    }

    public void run() {
        new GuiUtils().setSystemLookAndFeel(this);
        initComponents();
        setVisible(true);
        Splash.getInstance().setVisible(false);
    }

    private java.awt.Image createIcon() {
        return new GuiUtils().createIcon();
    }

    private java.awt.Rectangle createCoordinates() {
        return new GuiUtils().centraliza(290, 243);
    }

    private void startApp(AppFrame instance) {
        setVisible(false);
        instance.setUser(usuario);
        instance.init();
    }

    private void initComponents() {
        label = new JLabel();
        lbPrincipal = new JLabel();
        jLabel1 = new JLabel();
        txtSenha = new JPasswordField();
        btLogon = new JButton();
        jLabel2 = new JLabel();
        txtLogin = new JTextField();

        setDefaultCloseOperation(3);
        ResourceBundle bundle = ResourceBundle.getBundle("kod/vankish/gui/Bundle");
        setTitle(bundle.getString("Login.title"));
        setBounds(createCoordinates());
        setIconImage(createIcon());
        setName("Form");
        setResizable(false);

        label.setFont(new Font("Tahoma", 1, 11));
        label.setHorizontalAlignment(0);
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kod/vankish/gui/imagens/login.png")));
        label.setText(bundle.getString("Login.label.text"));
        label.setHorizontalTextPosition(0);
        label.setName("label");
        label.setVerticalTextPosition(3);

        lbPrincipal.setFont(new Font("Tahoma", 1, 11));
        lbPrincipal.setHorizontalAlignment(0);
        lbPrincipal.setText(bundle.getString("Login.lbPrincipal.text"));
        lbPrincipal.setName("lbPrincipal");

        jLabel1.setText(bundle.getString("Login.jLabel1.text"));
        jLabel1.setName("jLabel1");

        txtSenha.setText(bundle.getString("Login.txtSenha.text"));
        txtSenha.setName("txtSenha");
        txtSenha.setNextFocusableComponent(btLogon);
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                Login.this.txtSenhaKeyPressed(evt);
            }

        });
        btLogon.setText(bundle.getString("Login.btLogon.text"));
        btLogon.setName("btLogon");
        btLogon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Login.this.btLogonActionPerformed(evt);
            }

        });
        jLabel2.setText(bundle.getString("Login.jLabel2.text"));
        jLabel2.setName("jLabel2");

        txtLogin.setText(bundle.getString("Login.txtLogin.text"));
        txtLogin.setName("txtLogin");
        txtLogin.setNextFocusableComponent(txtSenha);
        txtLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(FocusEvent evt) {
                Login.this.txtLoginFocusGained(evt);
            }

        });
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(label, -1, 245, 32767))
                                        .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbPrincipal, -1, 245, 32767)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(10, 10, 10)
                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(jLabel2, -1, -1, 32767)
                                                                                        .addComponent(jLabel1))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(txtSenha)
                                                                                        .addComponent(txtLogin, -2, 161, -2)))
                                                                        .addComponent(btLogon))))))
                                .addContainerGap()));

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label)
                                .addGap(11, 11, 11)
                                .addComponent(lbPrincipal)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtLogin, -2, -1, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtSenha, -2, -1, -2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btLogon)
                                .addContainerGap(-1, 32767)));


        pack();
    }

    private void btLogonActionPerformed(ActionEvent evt) {
        setLiberado(login());
        if (isLiberado()) {
            setLabelStatus(Color.blue, "Usuario Autenticado!");
            startApp(getAppInstance());
        }
    }

    private void txtLoginFocusGained(FocusEvent evt) {
        setLabelStatus(Color.black, "Login e Senha");
    }

    private void txtSenhaKeyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            btLogonActionPerformed(null);
        }
    }

    private boolean login() {
        setUser();

        if ((validateLogin()) &&
                (validatePassword())) {
            return true;
        }
        setLabelStatus(Color.red, "Usuario ou Senha incorretos!");

        txtLogin.setText(null);
        txtSenha.setText(null);

        return false;
    }


    public boolean isLiberado() {
        return liberado;
    }


    private void setLiberado(boolean flag) {
        liberado = flag;
    }


    private void setUser() {
        try {
            usuario = ((Usuario) new Pesquisa(Usuario.class).eq("nome", getLogin()).get(0));
        } catch (IndexOutOfBoundsException e) {
            usuario = new Usuario();
            usuario.setNome("null");
        }
    }


    private boolean validateLogin() {
        return usuario.getNome().equals(getLogin());
    }


    private boolean validatePassword() {
        return usuario.getSenha().equals(getSenha());
    }


    private String getLogin() {
        return txtLogin.getText().trim();
    }


    private String getSenha() {
        return new String(txtSenha.getPassword());
    }


    public AppFrame getAppInstance() {
        return appInstance;
    }


    public void setAppInstance(AppFrame appInstance) {
        this.appInstance = appInstance;
    }


    private void setLabelStatus(Color cor, String texto) {
        lbPrincipal.setForeground(cor);
        lbPrincipal.setText(texto);
    }
}
