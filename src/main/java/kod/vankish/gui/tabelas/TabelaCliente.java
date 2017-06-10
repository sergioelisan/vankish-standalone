package kod.vankish.gui.tabelas;

import kod.database.utils.Pesquisa;
import kod.vankish.pojo.Cliente;

import java.util.List;


public class TabelaCliente
        extends Tabela<Cliente> {
    public TabelaCliente() {
        loadData(new Pesquisa(Cliente.class).list());
    }


    public void loadData(List<?> lista) {
        linhas.clear();
        for (Cliente c : lista) {
            Object[] o = new Object[10];
            o[0] = c.getCodigo();
            o[1] = c.getNome();
            o[2] = c.getSexo();
            o[3] = c.getIdade();
            o[4] = c.getCadastroReceita();
            o[5] = c.getEndereco();
            o[6] = c.getCidade();
            o[7] = c.getTelefone();
            o[8] = c.getCelular();
            o[9] = c.getEmail();
            linhas.add(o);
        }
        fireTableDataChanged();
    }

    protected void criaColunas() {
        colunas = new String[10];
        colunas[0] = "Codigo";
        colunas[1] = "Nome";
        colunas[2] = "Sexo";
        colunas[3] = "Idade";
        colunas[4] = "CPF";
        colunas[5] = "Endereco";
        colunas[6] = "Cidade";
        colunas[7] = "Telefone";
        colunas[8] = "Celular";
        colunas[9] = "Email";
    }
}
