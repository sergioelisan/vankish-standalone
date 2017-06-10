package kod.vankish.logics;

import kod.database.Dao;
import kod.database.utils.Pesquisa;
import kod.vankish.pojo.Formapagamento;
import kod.vankish.pojo.Meiopagamento;
import kod.vankish.pojo.Venda;

import java.util.ArrayList;
import java.util.List;


public class PagamentoLogics {
    public static String Avista = "A Vista";
    public static String Forma = "-- Formas Pagamento --";
    public static String Meio = "-- Meios Pagamento --";
    public static String Umavez = "1x";

    private Formapagamento formaNula = (Formapagamento) new Pesquisa(Formapagamento.class).get(Integer.valueOf(0));
    private Meiopagamento meioNulo = (Meiopagamento) new Pesquisa(Meiopagamento.class).get(Integer.valueOf(0));


    public PagamentoLogics() {
    }

    public List<Formapagamento> getFormasPagamento() {
        return new Pesquisa(Formapagamento.class).list();
    }


    public List<Meiopagamento> getMeiosPagamento() {
        return new Pesquisa(Meiopagamento.class).list();
    }


    public List<String> getDescricaoFormasPagamento() {
        List<String> lista = new ArrayList();

        lista.add(Forma);
        try {
            for (Formapagamento f : getFormasPagamento()) {
                if (!f.getDescricao().equals("null"))
                    lista.add(f.getDescricao());
            }
        } catch (IndexOutOfBoundsException e) {
            lista.add("-- --");
        }

        return lista;
    }


    public List<String> getDescricaoMeiosPagamento() {
        List<String> lista = new ArrayList();

        lista.add(Meio);
        try {
            for (Meiopagamento m : getMeiosPagamento()) {
                if (!m.getDescricao().equals("null"))
                    lista.add(m.getDescricao());
            }
        } catch (IndexOutOfBoundsException e) {
            lista.add("-- --");
        }

        return lista;
    }


    public void removeFormapagamento(String descricao) {
        List<Venda> lista = new Pesquisa(Venda.class).eq("formapagamento", descricao);
        for (Venda v : lista) {
            v.setFormapagamento(formaNula);
        }

        Formapagamento f = (Formapagamento) new Pesquisa(Formapagamento.class).eq("descricao", descricao).get(0);
        Formapagamento fo = new Formapagamento(f.getDescricao());
        fo.setIdFormaPagamento(f.getIdFormaPagamento());

        new Dao(Formapagamento.class).rm(fo);
    }


    public void removeMeiopagamento(String descricao) {
        List<Venda> lista = new Pesquisa(Venda.class).eq("meiopagamento", descricao);
        for (Venda v : lista) {
            v.setMeiopagamento(meioNulo);
        }

        Meiopagamento f = (Meiopagamento) new Pesquisa(Meiopagamento.class).eq("descricao", descricao).get(0);
        Meiopagamento fo = new Meiopagamento(f.getDescricao());
        fo.setIdMeioPagamento(f.getIdMeioPagamento());

        new Dao(Meiopagamento.class).rm(fo);
    }


    public void addForma(String descricao) {
        new Dao(Formapagamento.class).add(new Formapagamento(descricao));
    }


    public void addMeio(String descricao) {
        new Dao(Meiopagamento.class).add(new Meiopagamento(descricao));
    }


    public Formapagamento shcForma(String descricao) {
        return (Formapagamento) new Pesquisa(Formapagamento.class).eq("descricao", descricao).get(0);
    }


    public Meiopagamento shcMeio(String descricao) {
        return (Meiopagamento) new Pesquisa(Meiopagamento.class).eq("descricao", descricao).get(0);
    }
}
