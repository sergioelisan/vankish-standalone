package kod.vankish.gui.tabelas;

import kod.database.utils.Pesquisa;
import kod.utils.DataUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Produto;

import java.util.List;


public final class TabelaEstoque
        extends Tabela<Produto> {
    public TabelaEstoque() {
        loadData(new Pesquisa(Produto.class).list());
    }


    public void loadData(List<?> lista) {
        linhas.clear();
        for (Produto p : lista) {
            Object[] o = new Object[10];
            o[0] = p.getCodigo();
            o[1] = p.getCodBarras();
            o[2] = p.getDescricao();
            o[3] = (p.getFornecedor() == null ? "" : p.getFornecedor().getCodigo());
            o[4] = p.getCategoria();
            o[5] = p.getUnidade();
            o[6] = FmtMoney.toReal(p.getPrecoCompra());
            o[7] = FmtMoney.toReal(p.getPrecoVenda());
            o[8] = DataUtils.dateBRShort(p.getDataCompra());
            o[9] = DataUtils.dateBRShort(p.getDataVencimento());
            linhas.add(o);
        }

        fireTableDataChanged();
    }

    protected void criaColunas() {
        colunas = new String[10];
        colunas[0] = "Codigo";
        colunas[1] = "Cod Barras";
        colunas[2] = "Descricao";
        colunas[3] = "Fornecedor";
        colunas[4] = "Categoria";
        colunas[5] = "Unidade";
        colunas[6] = "Custo";
        colunas[7] = "Preco Venda";
        colunas[8] = "Comprado";
        colunas[9] = "Vencimento";
    }
}
