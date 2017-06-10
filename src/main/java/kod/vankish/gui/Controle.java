package kod.vankish.gui;

import kod.database.Dao;
import kod.database.utils.Pesquisa;
import kod.exceptions.util.ErrorMessage;
import kod.vankish.gui.tabelas.Tabela;

import javax.swing.*;
import java.awt.*;


public abstract class Controle<T>
        extends JPanel {
    protected Tabela<?> tabela;
    protected Class<?> classe;

    public Controle() {
    }

    protected void rm() {
        if (getObjectCode() != null)
            try {
                new Dao().rm(new Pesquisa(classe).get(getObjectCode()));
            } catch (Exception e) {
                ErrorMessage.advert("Erro ao remover Objeto");
            }
        updateTable();
    }


    protected void save() {
        T u = getObjectFromFields();
        if (u != null)
            try {
                new Dao().up(u);
            } catch (Exception e) {
                ErrorMessage.advert("Erro ao salvar Objeto");
            }
        updateTable();
    }


    protected void search(String campo, Object data) {
        tabela.loadData(new Pesquisa(classe).eq(campo, data));
    }


    protected void updateTable() {
        tabela.loadData(new Pesquisa(classe).list());
        clearFields();
    }


    protected void toMainPage() {
        MainFrame.getInstance().getAba().setSelectedIndex(0);
    }


    protected void clearFields() {
        for (Component c : getComponents()) {
            if ((c instanceof JTextField)) {
                ((JTextField) c).setText(null);
            }
        }
    }

    protected abstract void getTableData();

    protected abstract Integer getObjectCode();

    protected abstract Object getObjectFromFields();

    protected abstract void pesquisa();
}
