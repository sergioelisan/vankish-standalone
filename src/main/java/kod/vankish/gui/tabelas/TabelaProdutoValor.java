package kod.vankish.gui.tabelas;

import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Produto;
import kod.vankish.pojo.ProdutoValor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class TabelaProdutoValor
        extends Tabela<ProdutoValor> {
    private List<Produto> produtos = new ArrayList();
    private List<ProdutoValor> lista = new ArrayList();
    private double total = 0.0D;


    public TabelaProdutoValor() {
    }


    public void add(Produto p) {
        ProdutoValor pv = new ProdutoValor();
        pv.setDescricao(p.getDescricao());
        pv.setValor(FmtMoney.toReal(p.getPrecoVenda()));

        lista.add(pv);
        produtos.add(p);

        total += p.getPrecoVenda().doubleValue();

        loadData(lista);
    }


    public void remove(int index) {
        total -= FmtMoney.toDouble(((ProdutoValor) lista.get(index)).getValor());

        produtos.remove(index);
        lista.remove(index);
        loadData(lista);
    }


    public String getTotal() {
        return FmtMoney.toReal(new BigDecimal(total));
    }


    public List<Produto> getProdutos() {
        return produtos;
    }


    public void clean() {
        linhas.clear();
        lista.clear();
        fireTableDataChanged();
    }


    public void loadData(List<?> lista) {
        linhas.clear();
        for (ProdutoValor c : lista) {
            Object[] o = new Object[2];
            o[0] = c.getDescricao();
            o[1] = c.getValor();
            linhas.add(o);
        }
        fireTableDataChanged();
    }

    protected void criaColunas() {
        colunas = new String[2];
        colunas[0] = "Produto";
        colunas[1] = "Valor";
    }
}
