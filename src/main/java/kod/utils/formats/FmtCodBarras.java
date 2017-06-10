package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;
import kod.utils.StringUtils;


public class FmtCodBarras {
    private FmtCodBarras() {
    }

    public static String format(String codBarras)
            throws CaractereInvalidoException {
        if ((!codBarras.isEmpty()) && (StringUtils.onlyContain(codBarras, 3))) {
            return codBarras;
        }
        throw new CaractereInvalidoException("Codigo de Barras invalido");
    }
}
