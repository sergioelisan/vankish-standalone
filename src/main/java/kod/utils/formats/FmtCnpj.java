package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;
import kod.utils.StringUtils;


public class FmtCnpj {
    private FmtCnpj() {
    }

    public static String format(String cnpj)
            throws CaractereInvalidoException {
        if ((!cnpj.isEmpty()) && (cnpj.length() == 18) && (StringUtils.onlyContain(cnpj, 4))) {
            return cnpj;
        }
        throw new CaractereInvalidoException("CNPJ invalido!");
    }
}
