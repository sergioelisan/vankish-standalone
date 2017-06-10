package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;
import kod.utils.StringUtils;


public class FmtFone {
    private FmtFone() {
    }

    public static String format(String fone, String campo)
            throws CaractereInvalidoException {
        if ((!fone.isEmpty()) && (StringUtils.onlyContain(fone, 4))) {
            return fone;
        }
        throw new CaractereInvalidoException("Dados invalidos em: " + campo);
    }
}
