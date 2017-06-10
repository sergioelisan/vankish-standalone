package kod.vankish.logics;

import kod.database.utils.Pesquisa;
import kod.utils.DataUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Formapagamento;
import kod.vankish.pojo.Meiopagamento;
import kod.vankish.pojo.Venda;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class VendaLogger {
    public VendaLogger() {
    }

    public List<Venda> getVendas() {
        return new Pesquisa(Venda.class).eq("data", new Date());
    }


    public List<Venda> getVendas(Date dia) {
        return new Pesquisa(Venda.class).eq("data", dia);
    }


    public List<Venda> getVendas(Date inicio, Date fim) {
        return new Pesquisa(Venda.class).between("data", inicio, fim);
    }


    public void writeInTextArea(JTextArea area) {
        area.setText(getLogPagamentoVendas(getVendas()));
    }


    public void writeInTextArea(Date dia, JTextArea area) {
        area.setText(getLogPagamentoVendas(getVendas(dia)));
    }


    public void writeInTextArea(Date inicio, Date fim, JTextArea area) {
        area.setText(getLogPagamentoVendas(getVendas(inicio, fim)));
    }


    public List<Venda> sortByPagamento(List<Venda> vendas, Meiopagamento meio) {
        List<Venda> lista = new ArrayList();

        for (Venda v : vendas) {
            if (v.getMeiopagamento().equals(meio)) {
                lista.add(v);
            }
        }

        return lista;
    }


    public List<Venda> sortByParcelas(List<Venda> vendas, Formapagamento forma) {
        List<Venda> lista = new ArrayList();

        for (Venda v : vendas) {
            if (v.getFormapagamento().equals(forma)) {
                lista.add(v);
            }
        }

        return lista;
    }


    public double getTotalDasVendas(List<Venda> vendas) {
        double total = 0.0D;

        for (Venda v : vendas) {
            total += v.getTotal().doubleValue();
        }

        return total;
    }


    public String getLogPagamentoVendas(List<Venda> vendas) {
        List<Meiopagamento> meios = new PagamentoLogics().getMeiosPagamento();

        StringBuilder log = new StringBuilder();
        log.append("Total do dia: ").append(DataUtils.dateBRShort(new Date())).append("\n\n");

        for (Meiopagamento m : meios) {
            log.append("=> ").append(m.getDescricao()).append(": ").append(FmtMoney.toReal(getTotalDasVendas(sortByPagamento(vendas, m)))).append("\n");
        }

        log.append("\nTOTAL: ").append(FmtMoney.toReal(getTotalDasVendas(vendas)));

        return new String(log);
    }
}
