package kod.vankish.gui.tabelas;

import kod.utils.formats.FmtMoney;
import kod.vankish.logics.VendasLogics;
import kod.vankish.pojo.Item;
import kod.vankish.pojo.Itemvendido;
import kod.vankish.pojo.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class TabelaVendas
        extends Tabela<Item> {
    private List<Item> lista = new ArrayList();
    private List<Itemvendido> produtos = new ArrayList();
    private double total = 0.0D;


    public TabelaVendas() {
    }


    public void add(Produto p, int quantidade) {
        p = VendasLogics.alteraQuantidadeProduto(p, quantidade);

        if (p != null) {
            Item item = null;

            boolean existe = false;

            for (Item i : lista) {
                if (i.getDescricao().equals(p.getDescricao())) {
                    existe = true;
                    item = i;
                    break;
                }
            }
            if (existe) {
                int index = lista.indexOf(item);
                item.setQuantidade(Integer.valueOf(item.getQuantidade().intValue() + quantidade));

                BigDecimal t = FmtMoney.toBigDecimal(item.getTotal());
                item.setTotal(FmtMoney.toReal(t.add(p.getPrecoVenda().multiply(new BigDecimal(quantidade)))));

                lista.set(index, item);

            } else {
                item = new Item();
                item.setDescricao(p.getDescricao());
                item.setQuantidade(Integer.valueOf(quantidade));
                item.setPreco(FmtMoney.toReal(p.getPrecoVenda()));
                item.setTotal(FmtMoney.toReal(p.getPrecoVenda().multiply(new BigDecimal(quantidade))));

                lista.add(item);
                Itemvendido iv = new Itemvendido(null, p, null, quantidade);
                produtos.add(iv);
            }

            total += FmtMoney.toDouble(item.getTotal());
            loadData(lista);
        }
    }


    public void remove(int linha) {
        total -= FmtMoney.toDouble(((Item) lista.get(linha)).getTotal());
        lista.remove(linha);
        produtos.remove(linha);

        loadData(lista);
    }


    public void clear() {
        lista.clear();
        produtos.clear();
        loadData(lista);
    }


    public String getTotal() {
        return FmtMoney.toReal(new BigDecimal(total));
    }


    public List<Itemvendido> done() {
        return produtos;
    }


    public void loadData(List<?> lista) {
        linhas.clear();
        for (Item c : lista) {
            Object[] o = new Object[4];
            o[0] = c.getDescricao();
            o[1] = c.getQuantidade();
            o[2] = c.getPreco();
            o[3] = c.getTotal();
            linhas.add(o);
        }
        fireTableDataChanged();
    }

    protected void criaColunas() {
        colunas = new String[4];
        colunas[0] = "Descricao";
        colunas[1] = "Quantidade";
        colunas[2] = "Preco Un.";
        colunas[3] = "Total";
    }
}
