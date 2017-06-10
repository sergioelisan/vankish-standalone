package kod.vankish.logics;

import kod.database.utils.Pesquisa;
import kod.vankish.pojo.interfaces.Contas;

import java.math.BigDecimal;


public class ContasLogics {
    public ContasLogics() {
    }

    public static Contas get(Class c, Integer id) {
        return (Contas) new Pesquisa(c).get(id);
    }


    public static BigDecimal calcSaldo(double valor, double juros, double multa, long diferenca, double desconto) {
        int meses = (int) (diferenca / 30L);

        System.out.println(meses);

        if (diferenca > 0L) {
            juros = valor * meses * (juros / 100.0D);
            multa = valor * diferenca * (multa / 100.0D);

            return new BigDecimal(valor + juros + multa);
        }
        return new BigDecimal(valor - desconto);
    }
}
