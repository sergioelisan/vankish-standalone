package kod.utils.formats;

import kod.exceptions.CaractereInvalidoException;
import kod.utils.StringUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;


public class FmtMoney {
    private static DecimalFormat fmt = new DecimalFormat("0.##");


    private FmtMoney() {
    }


    public static String valida(String money, String campo)
            throws CaractereInvalidoException {
        if ((!money.isEmpty()) && (StringUtils.onlyContain(money, 4))) {
            return money;
        }
        throw new CaractereInvalidoException("Dinheiro invalido em: " + campo);
    }


    public static String toDefault(String grana) {
        return grana.replace("R$", "").replace(',', '.');
    }


    public static double toDouble(String grana) {
        return Double.parseDouble(toDefault(grana));
    }


    public static BigDecimal toBigDecimal(String grana) {
        return new BigDecimal(toDouble(grana));
    }


    public static String toReal(double grana) {
        return new String(new StringBuilder().append("R$ ").append(fmt.format(grana).replace('.', ',')));
    }


    public static String toReal(BigDecimal grana) {
        return toReal(grana.doubleValue());
    }
}
