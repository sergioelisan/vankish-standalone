package kod.security;

import kod.exceptions.util.ErrorMessage;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.*;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;


public class Encrypt {
    public static int CRYPT = 1;
    public static int DECRYPT = 2;
    private static String secureFile = "key";
    private static String secureAlgorithm = "DES";


    public Encrypt() {
    }


    public static void crypt(File entrada, File saida, int modo) {
        Cipher cipher = null;
        byte[] outBytes = (byte[]) null;
        byte[] inBytes = (byte[]) null;
        try {
            InputStream in = new FileInputStream(entrada);
            OutputStream out = new FileOutputStream(saida);

            cipher = Cipher.getInstance(secureAlgorithm);
            cipher.init(modo, getKey());

            int blockSize = cipher.getBlockSize();
            int outputSize = cipher.getOutputSize(blockSize);

            inBytes = new byte[blockSize];
            outBytes = new byte[outputSize];

            int inLength = 0;
            boolean more = true;

            while (more) {
                inLength = in.read(inBytes);
                if (inLength == blockSize) {
                    int outLength = cipher.update(inBytes, 0, blockSize,
                            outBytes);
                    out.write(outBytes, 0, outLength);
                } else {
                    more = false;
                }
            }
            if (inLength > 0) {
                outBytes = cipher.doFinal(inBytes, 0, inLength);
            } else {
                outBytes = cipher.doFinal();
            }
            out.write(outBytes);

            in.close();
            out.close();
        } catch (GeneralSecurityException e) {
            ErrorMessage.close(
                    "Falha de seguranca: Problema ao encriptar o arquivo.\n" + e.getMessage());
        } catch (IOException e) {
            ErrorMessage.close(
                    "Falha de seguranca: Erro de leitura do arquivo '" + entrada.getName() + "'");
        }

        if (modo == CRYPT) {
            System.out.println("Encriptado com sucesso!");
        } else {
            System.out.println("Decriptado com sucesso!");
        }
    }


    public static Object readCryptedObject(File arquivoEncriptado) {
        File temp = new File("temp.tmp");
        Object obj = null;

        crypt(arquivoEncriptado, temp, 2);
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                    temp));
            obj = in.readObject();
            in.close();
        } catch (Exception e) {
            ErrorMessage.advert("Falha ao ler arquivo encriptado");
        }

        temp.delete();

        return obj;
    }


    private static Key getKey() {
        Key key = null;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(
                    secureFile));
            key = (Key) in.readObject();
            in.close();

            return key;
        } catch (FileNotFoundException e) {
            ErrorMessage.close(
                    "Falha de seguranca: '" + secureFile + "' nao encontrado");
        } catch (IOException e) {
            ErrorMessage.close(
                    "Falha de seguranca: Falha grave ao ler '" + secureFile + "'");
        } catch (ClassNotFoundException e) {
            ErrorMessage.close("Falha de seguranca: Classe 'Key' nao encontrada no arquivo");
        }

        return key;
    }


    public static void keygen() {
        KeyGenerator keygen = null;
        try {
            keygen = KeyGenerator.getInstance(secureAlgorithm);
        } catch (NoSuchAlgorithmException e) {
            ErrorMessage.close("Falha de seguranca: Algoritmo de encriptacao inexistente");
        }

        SecureRandom secure = new SecureRandom();
        keygen.init(secure);
        SecretKey key = keygen.generateKey();
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(secureFile));
            out.writeObject(key);
            out.close();
        } catch (FileNotFoundException e) {
            ErrorMessage.close(
                    "Falha de seguranca: '" + secureFile + "' nao encontrado");
        } catch (IOException e) {
            ErrorMessage.close(
                    "Falha de seguranca: Falha grave ao escrever '" + secureFile + "'");
        }
    }
}
