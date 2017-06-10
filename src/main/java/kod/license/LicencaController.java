package kod.license;

import kod.exceptions.InvalidOSException;
import kod.exceptions.LicencaFailException;
import kod.exceptions.util.ErrorMessage;
import kod.security.Encrypt;

import javax.swing.*;
import java.io.*;


public class LicencaController {
    private String source = "license";
    private String validationMessage = "Kod tm Valida esse software!";
    private String dir = null;


    public LicencaController() {
    }


    public void validation()
            throws LicencaFailException {
        try {
            identifyOS();
            if (!getValidationStatus()) {
                String userCode =
                        JOptionPane.showInputDialog("Insira a Serial do produto:");

                if (getLicenca().equals(userCode)) {
                    registraValidacao(true);
                } else {
                    throw new LicencaFailException("Serial invalida");
                }
            }
            if (!verifySystem()) {
                validation();
            }
        } catch (Exception e) {
            ErrorMessage.close("Erro ao tentar achar os aquivos de licenca");
        }
    }


    private boolean verifySystem() {
        File valFile = new File(dir + "/validation");

        if (!valFile.exists()) {
            try {
                registraValidacao(false);
            } catch (IOException e) {
                ErrorMessage.advert(e.getMessage());
            }
            return false;
        }

        if (((String) Encrypt.readCryptedObject(valFile)).equals(validationMessage)) {
            return true;
        }
        return false;
    }


    private void createValidationFile(String dir)
            throws FileNotFoundException, IOException {
        File temp = new File("temp");
        File valFile = new File(dir + "/validation");

        ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream(temp));

        String validation = validationMessage;
        output.writeObject(validation);
        output.close();

        Encrypt.crypt(temp, valFile, Encrypt.CRYPT);
        temp.delete();
    }


    private boolean getValidationStatus() {
        return getLicenca().isValidate();
    }


    private Licenca getLicenca() {
        return (Licenca) Encrypt.readCryptedObject(new File(source));
    }


    private void registraValidacao(boolean status)
            throws IOException {
        File temp = new File("temp.tmp");
        File licence = new File(source);

        ObjectOutputStream output = new ObjectOutputStream(
                new FileOutputStream(temp));

        Licenca licenca = new Licenca(status);
        output.writeObject(licenca);
        output.close();

        Encrypt.crypt(temp, licence, Encrypt.CRYPT);
        temp.delete();

        if (status) {
            createValidationFile(dir);
        }
    }


    private void identifyOS()
            throws InvalidOSException {
        String os = System.getProperty("os.name");

        if (os.contains("Linux")) {
            dir = System.getProperty("user.home");
        } else if (os.contains("Windows")) {
            dir = "c:/windows";
        } else {
            throw new InvalidOSException("Sistema Operacional nao suportado!");
        }
    }
}
