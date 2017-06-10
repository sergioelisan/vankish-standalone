package kod.vankish.gui;

import kod.utils.GuiUtils;

import javax.swing.*;
import java.awt.*;

public class Splash extends JWindow {
    private static Splash inst = new Splash();
    private static JProgressBar progressBar;
    private JLabel splashImage;
    private int n = 0;

    private Splash() {
        new GuiUtils().setSystemLookAndFeel(this);
        setIconImage(new GuiUtils().createIcon());
        criandoComponentes();
        setVisible(true);
    }

    public static Splash getInstance() {
        return inst;
    }

    private void criandoComponentes() {
        ImageIcon imageIcon = criaLabelImagem();
        defineTamanho(imageIcon);
        setBounds(new GuiUtils().centraliza(getSizewidth,
                getSizeheight));
        criaProgressBar(imageIcon);


        getContentPane().setLayout(null);
        getContentPane().add(progressBar);
        getContentPane().add(splashImage);
        pack();
    }


    private ImageIcon criaLabelImagem() {
        splashImage = new JLabel();
        ImageIcon imageIcon = new ImageIcon(getClass()
                .getResource(
                        new GuiUtils().getPersonalizationBundle().getProperty(
                                "splash")));
        splashImage.setIcon(imageIcon);
        return imageIcon;
    }


    private void criaProgressBar(ImageIcon imageIcon) {
        int width = (int) (imageIcon.getIconWidth() * 0.7D);
        int height = (int) (imageIcon.getIconHeight() * 0.07D);
        int x = (imageIcon.getIconWidth() - width) / 2;
        int y = (int) (imageIcon.getIconHeight() * 0.75D);

        progressBar = new JProgressBar();
        progressBar.setForeground(new Color(67, 0, 99));
        progressBar.setBackground(Color.black);
        progressBar.setBounds(x, y, width, height);
        progressBar.setMinimum(0);
        progressBar.setMaximum(4);
        progressBar.setStringPainted(true);
    }


    private void defineTamanho(ImageIcon imageIcon) {
        setMinimumSize(new Dimension(imageIcon.getIconWidth(),
                imageIcon.getIconHeight()));
        splashImage.setBounds(0, 0, imageIcon.getIconWidth(),
                imageIcon.getIconHeight());
    }


    public void upBar(String mensagem) {
        progressBar.setString(mensagem);
        progressBar.setValue(n++);
    }
}
