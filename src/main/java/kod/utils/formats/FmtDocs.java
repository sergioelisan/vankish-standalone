package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;
import kod.utils.StringUtils;


public class FmtDocs {
    private FmtDocs() {
    }

    public static String format(String documento, String campo)
            throws CaractereInvalidoException {
        if ((!documento.isEmpty()) && (StringUtils.onlyContain(documento, 4))) {
            return documento;
        }
        throw new CaractereInvalidoException("Dados invalidos em: " + campo);
    }
}
