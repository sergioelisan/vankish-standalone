package kod.exceptions.util;

import javax.swing.*;

public class ErrorMessage {
    public ErrorMessage() {
    }

    public static void close(String message) {
        JOptionPane.showMessageDialog(null, message, "Falha grave no sistema!", 0);
        System.exit(0);
    }


    public static void advert(String message) {
        JOptionPane.showMessageDialog(null, message, "Erro no sistema!", 0);
    }
}
