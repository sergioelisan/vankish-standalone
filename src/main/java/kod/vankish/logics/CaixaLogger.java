package kod.vankish.logics;

import kod.database.Dao;
import kod.database.utils.Pesquisa;
import kod.exceptions.util.ErrorMessage;
import kod.vankish.pojo.Caixa;
import kod.vankish.pojo.Caixalog;

public class CaixaLogger {
    private static Class<Caixalog> classe = Caixalog.class;


    private CaixaLogger() {
    }


    public static void log(Caixalog c_log, String log) {
        if (!c_log.getLog().isEmpty()) {
            c_log.setLog(c_log.getLog() + "\n" + log);
        } else {
            c_log.setLog(log + "\n");
        }
        save(c_log);
    }


    public static String getLog(Caixa caixa) {
        return get(caixa).getLog();
    }


    public static Caixalog get(Caixa caixa) {
        try {
            return (Caixalog) new Pesquisa(classe).eq("caixa", caixa).get(0);
        } catch (IndexOutOfBoundsException e) {
            ErrorMessage.advert("Nenhum log ainda cadastrado para esse caixa");
        }

        return null;
    }


    public static void save(Caixalog caixa) {
        new Dao(classe).up(caixa);
    }
}
