package kod.vankish.gui.tabelas;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public abstract class Tabela<T>
        extends AbstractTableModel {
    protected ArrayList<Object[]> linhas;
    protected String[] colunas;

    public Tabela() {
        linhas = new ArrayList();
        criaColunas();
    }

    public abstract void loadData(List<?> paramList);

    protected abstract void criaColunas();

    public int getRowCount() {
        return linhas.size();
    }

    public int getColumnCount() {
        return colunas.length;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] l = (Object[]) linhas.get(rowIndex);
        return l[columnIndex];
    }

    public String getColumnName(int col) {
        return colunas[col];
    }

    public boolean isCellEditable(int lin, int col) {
        return false;
    }

    public void setValueAt(Object value, int lin, int col) {
        Object[] l = (Object[]) linhas.get(lin);
        l[col] = value;
        fireTableDataChanged();
    }
}
