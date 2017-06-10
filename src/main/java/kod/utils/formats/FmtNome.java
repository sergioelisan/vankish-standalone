package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;
import kod.utils.StringUtils;


public class FmtNome {
    private FmtNome() {
    }

    public static String format(String nome, String campo)
            throws CaractereInvalidoException {
        if ((!nome.isEmpty()) && (StringUtils.onlyContain(nome, 0))) {
            return StringUtils.upperFirstLetter(nome);
        }

        throw new CaractereInvalidoException("Nome invalido em " + campo);
    }
}
