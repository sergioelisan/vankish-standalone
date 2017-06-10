package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;
import kod.utils.StringUtils;


public class FmtEndereco {
    private FmtEndereco() {
    }

    public static String format(String endereco)
            throws CaractereInvalidoException {
        if (!endereco.isEmpty()) {
            return StringUtils.upperFirstLetter(endereco);
        }
        throw new CaractereInvalidoException("Endereco Invalido");
    }
}
