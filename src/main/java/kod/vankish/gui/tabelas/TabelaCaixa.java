package kod.vankish.gui.tabelas;

import kod.database.utils.Pesquisa;
import kod.utils.DataUtils;
import kod.vankish.pojo.Caixa;

import java.util.Collections;
import java.util.List;


public class TabelaCaixa
        extends Tabela<Caixa> {
    public TabelaCaixa() {
        loadData(new Pesquisa(Caixa.class).list());
    }


    public void loadData(List<?> lista) {
        linhas.clear();
        for (Caixa c : lista) {
            Object[] o = new Object[3];
            o[0] = DataUtils.dateBRShort(c.getData());
            o[1] = c.getSaldoAnterior();
            o[2] = c.getSaldo();
            linhas.add(o);
        }
        Collections.reverse(linhas);
        fireTableDataChanged();
    }

    protected void criaColunas() {
        colunas = new String[3];
        colunas[0] = "Data";
        colunas[1] = "Saldo Anterior";
        colunas[2] = "Saldo Atual";
    }
}
