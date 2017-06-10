package kod.utils;

import kod.exceptions.util.ErrorMessage;

import javax.swing.*;
import java.awt.*;
import java.util.Properties;


public class GuiUtils {
    private String linuxLookAndFell = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
    private String windowsLookAndFell = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";


    public GuiUtils() {
    }

    public Rectangle centraliza(int w, int h) {
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

        int Ox = screen.width - w;
        int Oy = screen.height - h;

        return new Rectangle(Ox / 2, Oy / 2, w, h);
    }


    public void setSystemLookAndFeel(Component c) {
        String os = System.getProperty("os.name");
        String plaf;
        if (os.equals("Linux")) {
            plaf = linuxLookAndFell;
        } else {
            plaf = windowsLookAndFell;
        }
        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(c);
        } catch (Exception e) {
            ErrorMessage.advert("Problema ao definir estilo do sistema!");
        }
    }


    public Image createIcon() {
        return
                Toolkit.getDefaultToolkit().getImage(getClass()
                        .getResource(getPersonalizationBundle().getProperty("icone")));
    }


    public Properties getPersonalizationBundle() {
        return PersonaUtils.getPersonalizationBundle();
    }
}
