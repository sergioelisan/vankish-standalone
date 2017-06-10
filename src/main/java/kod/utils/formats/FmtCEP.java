package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;
import kod.utils.StringUtils;


public class FmtCEP {
    private FmtCEP() {
    }

    public static String format(String cep)
            throws CaractereInvalidoException {
        if ((!cep.isEmpty()) && (cep.length() == 9) && (cep.substring(8).contains("-")) &&
                (StringUtils.onlyContain(cep, 4))) {
            return cep;
        }
        throw new CaractereInvalidoException("Dados invalidos no CEP");
    }
}
