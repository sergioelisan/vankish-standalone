package kod.vankish.gui.tabelas;

import kod.database.utils.Pesquisa;
import kod.utils.DataUtils;
import kod.utils.formats.FmtMoney;
import kod.vankish.pojo.Funcionario;

import java.util.List;


public class TabelaFuncionario
        extends Tabela<Funcionario> {
    public TabelaFuncionario() {
        loadData(new Pesquisa(Funcionario.class).list());
    }


    public void loadData(List<?> lista) {
        linhas.clear();
        for (Funcionario f : lista) {
            Object[] o = new Object[14];
            o[0] = f.getCodigo();
            o[1] = f.getNome();
            o[2] = f.getSexo();
            o[3] = f.getIdade();
            o[4] = f.getEndereco();
            o[5] = f.getCidade();
            o[6] = f.getTelefone();
            o[7] = f.getCelular();
            o[8] = f.getEmail();
            o[9] = f.getCadastroReceita();
            o[10] = f.getPis();
            o[11] = f.getCntps();
            o[12] = FmtMoney.toReal(f.getSalario());
            o[13] = DataUtils.dateBRShort(f.getDataContratacao());
            linhas.add(o);
        }

        fireTableDataChanged();
    }

    protected void criaColunas() {
        colunas = new String[14];
        colunas[0] = "Codigo";
        colunas[1] = "Nome";
        colunas[2] = "Sexo";
        colunas[3] = "Idade";
        colunas[4] = "Endereco";
        colunas[5] = "Cidade";
        colunas[6] = "Telefone";
        colunas[7] = "Celular";
        colunas[8] = "Email";
        colunas[9] = "CPF";
        colunas[10] = "PIS";
        colunas[11] = "CNTPS";
        colunas[12] = "Salario";
        colunas[13] = "Contratacao";
    }
}
