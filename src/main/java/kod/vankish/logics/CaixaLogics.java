package kod.vankish.logics;

import kod.database.Dao;
import kod.database.utils.Pesquisa;
import kod.exceptions.util.ErrorMessage;
import kod.utils.DataUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Caixa;
import kod.vankish.pojo.Caixalog;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class CaixaLogics {
    public CaixaLogics() {
    }

    public static Caixa actualCaixa() {
        List<Caixa> lista = new Pesquisa(Caixa.class).list();
        return lista.isEmpty() ? null : (Caixa) lista.get(lista.size() - 1);
    }


    public static void debita(double quantidade, String descricao) {
        Caixa c = actualCaixa();

        BigDecimal novoSaldo = null;

        if (quantidade > 0.0D) {
            novoSaldo = c.getSaldo().subtract(new BigDecimal(quantidade));
        } else {
            novoSaldo = c.getSaldo().add(new BigDecimal(quantidade));
        }

        c.setSaldo(novoSaldo);
        save(c);
        log("Debitado", quantidade, descricao, c);
    }


    public static void credita(double quantidade, String descricao) {
        Caixa c = actualCaixa();
        BigDecimal novoSaldo = c.getSaldo().add(new BigDecimal(quantidade));
        c.setSaldo(novoSaldo);

        save(c);
        log("Creditado", quantidade, descricao, c);
    }


    public static void close() {
        Caixa cx_atual = actualCaixa();

        if (DataUtils.diferenca(cx_atual.getData(), new Date()) != 0L) {
            create(DataUtils.tomorrow(), cx_atual.getSaldo(),
                    cx_atual.getSaldo());
            JOptionPane.showMessageDialog(null,
                    "Caixa fechado com sucesso! Verifique o relatorio");

            log("FECHANDO CAIXA!", actualCaixa().getSaldo().doubleValue(), "", actualCaixa());
        } else {
            ErrorMessage.advert("Voce nao pode fechar o caixa duas vezes ao mesmo dia!");
        }
    }


    public static void create(Date dia, BigDecimal saldoAnt, BigDecimal saldo) {
        Caixa x = new Caixa(dia, saldoAnt, saldo);
        save(x);

        CaixaLogger.save(new Caixalog(x, "Novo caixa! --------- " +
                DataUtils.dateBRLong(new Date())));
    }


    public static Caixa get(Date data) {
        return (Caixa) new Pesquisa(Caixa.class).eq("data", data).get(0);
    }


    public static void save(Caixa c) {
        new Dao(Caixa.class).up(c);
    }


    private static void log(String operacao, double quantidade, String descricao, Caixa c) {
        String emReais = FmtMoney.toReal(quantidade);
        String dataHora = DataUtils.dateTimeBRShort(new Date());

        String desc = dataHora + " " + operacao + " " + emReais + ". " +
                descricao;
        CaixaLogger.log(CaixaLogger.get(c), desc);
    }
}
