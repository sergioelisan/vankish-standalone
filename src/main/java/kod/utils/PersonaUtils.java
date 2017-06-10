package kod.utils;

import kod.exceptions.util.ErrorMessage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class PersonaUtils {
    public PersonaUtils() {
    }

    public static Properties getPersonalizationBundle() {
        Properties p = new Properties();
        try {
            InputStream in = new FileInputStream("persona.ini");
            p.load(in);
        } catch (IOException e) {
            ErrorMessage.advert("Erro na personalizacao da aplicacao");
        }
        return p;
    }
}
