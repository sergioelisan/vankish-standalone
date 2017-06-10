package kod.vankish.gui.tabelas;

import kod.database.utils.Pesquisa;
import kod.utils.DataUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Pagamento;
import kod.vankish.pojo.interfaces.Contas;

import java.util.Collections;
import java.util.List;


public final class TabelaContas
        extends Tabela<Contas> {
    public TabelaContas() {
        loadData(new Pesquisa(Contas.class).list());
    }


    public void loadData(List<?> lista) {
        linhas.clear();
        for (Contas c : lista) {
            Object[] o = new Object[11];
            o[0] = c.getCodigo();
            o[1] = ((c instanceof Pagamento) ? "Pagamento" : "Recebimento");
            o[2] = c.getBeneficiario();
            o[3] = c.getDescricao();
            o[4] = c.getNumDoc();
            o[5] = c.getTipoDoc();
            o[6] = FmtMoney.toReal(c.getValor());
            o[7] = Double.valueOf(c.getJuros());
            o[8] = Double.valueOf(c.getMulta());
            o[9] = FmtMoney.toReal(c.getDesconto());
            o[10] = DataUtils.dateBRShort(c.getVencimento());
            linhas.add(o);
        }
        Collections.reverse(linhas);
        fireTableDataChanged();
    }

    protected void criaColunas() {
        colunas = new String[11];
        colunas[0] = "Codigo";
        colunas[1] = "Natureza";
        colunas[2] = "Beneficiario";
        colunas[3] = "Descricao";
        colunas[4] = "N Doc.";
        colunas[5] = "Tipo Doc.";
        colunas[6] = "Valor";
        colunas[7] = "Juros";
        colunas[8] = "Multa";
        colunas[9] = "Desconto";
        colunas[10] = "Vencimento";
    }
}
