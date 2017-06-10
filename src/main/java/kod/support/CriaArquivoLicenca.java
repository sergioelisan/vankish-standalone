package kod.support;

import kod.license.Licenca;
import kod.security.Encrypt;

import javax.swing.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class CriaArquivoLicenca {
    public CriaArquivoLicenca() {
    }

    public static void main(String[] args) {
        String keyFile = "key.conf";
        String keyCrypted = "license";

        File keyconf = new File(keyFile);
        File licenca = new File(keyCrypted);

        Encrypt.keygen();
        create(keyFile);

        Encrypt.crypt(keyconf, licenca, 1);
        keyconf.delete();

        System.out.println(((Licenca) Encrypt.readCryptedObject(licenca)).isValidate());
    }

    public static void create(String filename) {
        File f = new File(filename);
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(f));

            Licenca licenca = new Licenca();
            output.writeObject(licenca);

            output.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        System.out.println("Arquivo criado com sucesso");
    }
}
