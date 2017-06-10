package kod.vankish.logics;

import kod.database.utils.Pesquisa;
import kod.exceptions.util.ErrorMessage;
import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Caixa;
import kod.vankish.pojo.Pagamento;

import java.util.Date;
import java.util.List;


public class LogPanel {
    private LogPanel() {
    }

    private static Caixa loadCaixa() {
        Caixa caixa = null;
        try {
            caixa = CaixaLogics.actualCaixa();
        } catch (Exception e) {
            ErrorMessage.advert("Nao existe um Caixa pre-configurado");
        }
        return caixa;
    }


    private static List<Pagamento> loadContas() {
        List<Pagamento> pagamentos = null;
        try {
            pagamentos = new Pesquisa(Pagamento.class).eq("vencimento", new Date());
        } catch (IndexOutOfBoundsException e) {
            ErrorMessage.advert("Nao existem pagamentos com vencimento hoje");
        }
        return pagamentos;
    }


    public static String caixaLog() {
        Caixa c = loadCaixa();

        if (c != null) {
            return FmtMoney.toReal(c.getSaldo());
        }
        return "0,00";
    }


    public static String pagamentosLog() {
        StringBuffer log = new StringBuffer();

        log.append("Vencimentos:\n\n");

        for (Pagamento p : loadContas()) {

            log.append(" - ").append(p.getDescricao()).append("\n");
        }
        return new String(log);
    }
}
