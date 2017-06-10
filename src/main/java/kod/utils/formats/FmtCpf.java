package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;
import kod.utils.StringUtils;


public class FmtCpf {
    private FmtCpf() {
    }

    public static String format(String cpf)
            throws CaractereInvalidoException {
        if ((!cpf.isEmpty()) && (cpf.length() == 11) && (StringUtils.onlyContain(cpf, 3))) {
            return cpf;
        }
        throw new CaractereInvalidoException("CPF invalido!");
    }
}
