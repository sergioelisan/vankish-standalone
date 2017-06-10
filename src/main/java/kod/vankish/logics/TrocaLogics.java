package kod.vankish.logics;

import kod.database.Dao;
import kod.database.utils.Pesquisa;
import kod.utils.DataUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Cliente;
import kod.vankish.pojo.Produto;
import kod.vankish.pojo.Troca;

import javax.swing.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collections;
import java.util.Date;
import java.util.List;


public class TrocaLogics {
    private TrocaLogics() {
    }

    public static void releaseChange(List<Produto> produtos, List<Produto> trocas, double saldo, Cliente c, boolean difPaga) {
        String mensagem = "Troca concluida com sucesso! ";


        if ((saldo < 0.0D) && (!difPaga)) {
            if (c != null) {
                c.setSaldo(c.getSaldo().add(new BigDecimal(saldo)));
                mensagem = mensagem + "Debitado do Saldo do Cliente";
            } else {
                mensagem = mensagem + "Debitada a diferenca do Caixa";
            }
        } else if ((saldo < 0.0D) && (difPaga)) {
            mensagem = mensagem + "Diferenca paga!";
        } else if (saldo > 0.0D) {
            if (c != null) {
                c.setSaldo(c.getSaldo().add(new BigDecimal(saldo)));
                mensagem = mensagem + "Creditado ao Saldo do Cliente";
            } else {
                mensagem = mensagem + "Creditado ao Caixa";
            }
        }
        StringBuilder prods = new StringBuilder();
        StringBuilder trocs = new StringBuilder();


        for (Produto p : produtos) {
            p.setEstocado(p.getEstocado() + 1);

            if (produtos.iterator().hasNext()) {
                prods.append("'").append(p.getDescricao()).append("' ");
            }
            alteraProduto(p);
        }


        for (Produto p : trocas) {
            p.setEstocado(p.getEstocado() - 1);

            if (trocas.iterator().hasNext()) {
                trocs.append("'").append(p.getDescricao()).append("' ");
            }
            alteraProduto(p);
        }


        if (c != null) {
            Dao<Cliente> dao = new Dao(Cliente.class);
            dao.up(c);
            dao.close();
        }


        Date hoje = new Date();
        Timestamp agora = new Timestamp(hoje.getTime());

        Troca t = new Troca(
                hoje,
                agora,
                changeLog(new String(prods),
                        new String(trocs),
                        FmtMoney.toReal(saldo),
                        agora));

        registraTroca(t);

        JOptionPane.showMessageDialog(null, mensagem);
    }


    private static void alteraProduto(Produto p) {
        ProdutoLogics.alteraProduto(p);
    }


    private static void registraTroca(Troca t) {
        new Dao(Troca.class).add(t);
    }


    public static String getDescricaoProduto(String codigo) {
        return ProdutoLogics.getProdutoCodBarras(codigo).getDescricao();
    }


    private static String changeLog(String produto, String trocado, String total, Timestamp data) {
        String descricao =
                String.format("Produtos:\t%s\nTrocados por:\t%s\nTotal da Troca: %s\nData e Hora:\t%s\n", new Object[]{
                        produto,
                        trocado,
                        total,
                        DataUtils.dateTimeBRShort(data)});
        return descricao;
    }


    public static void loadTextArea(Date periodo, JTextArea area) {
        List<Troca> lista = getTrocas(periodo);

        Collections.reverse(lista);
        for (Troca t : lista) {
            area.append(t.getDescricao() + "\n\n");
        }
    }


    public static void loadTextArea(Date diaInicial, Date diaFinal, JTextArea area) {
        List<Troca> lista = getTrocas(diaInicial, diaFinal);

        Collections.reverse(lista);
        for (Troca t : lista) {
            area.append(t.getDescricao() + "\n\n");
        }
    }


    public static List<Troca> getTrocas(Date periodo) {
        return new Pesquisa(Troca.class).eq("data", periodo);
    }


    public static List<Troca> getTrocas(Date diaInicial, Date diaFinal) {
        return new Pesquisa(Troca.class).between("data", diaInicial, diaFinal);
    }
}
