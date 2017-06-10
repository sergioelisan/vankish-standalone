package kod.vankish.gui.tabelas;

import kod.database.utils.Pesquisa;
import kod.vankish.pojo.Fornecedor;

import java.util.List;


public class TabelaFornecedor
        extends Tabela<Fornecedor> {
    public TabelaFornecedor() {
        loadData(new Pesquisa(Fornecedor.class).list());
    }


    public void loadData(List<?> lista) {
        linhas.clear();
        for (Fornecedor f : lista) {
            Object[] o = new Object[10];
            o[0] = f.getCodigo();
            o[1] = f.getNome();
            o[2] = f.getRamo();
            o[3] = f.getCadastroReceita();
            o[4] = f.getEndereco();
            o[5] = f.getCidade();
            o[6] = f.getTelefone();
            o[7] = f.getCelular();
            o[8] = f.getFax();
            o[9] = f.getEmail();
            linhas.add(o);
        }

        fireTableDataChanged();
    }

    protected void criaColunas() {
        colunas = new String[10];
        colunas[0] = "Codigo";
        colunas[1] = "Empresa";
        colunas[2] = "Ramo";
        colunas[3] = "CNPJ";
        colunas[4] = "Endereco";
        colunas[5] = "Cidade";
        colunas[6] = "Telefone";
        colunas[7] = "Celular";
        colunas[8] = "Fax";
        colunas[9] = "Email";
    }
}
