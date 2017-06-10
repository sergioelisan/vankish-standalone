package kod.vankish.pojo;

import java.io.Serializable;


public class ItemvendidoId
        implements Serializable {
    private int vendaIdVenda;
    private int produtoCodigo;

    public ItemvendidoId() {
    }

    public ItemvendidoId(int vendaIdVenda, int produtoCodigo) {
        this.vendaIdVenda = vendaIdVenda;
        this.produtoCodigo = produtoCodigo;
    }

    public int getVendaIdVenda() {
        return vendaIdVenda;
    }

    public void setVendaIdVenda(int vendaIdVenda) {
        this.vendaIdVenda = vendaIdVenda;
    }

    public int getProdutoCodigo() {
        return produtoCodigo;
    }

    public void setProdutoCodigo(int produtoCodigo) {
        this.produtoCodigo = produtoCodigo;
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null) return false;
        if (!(other instanceof ItemvendidoId)) return false;
        ItemvendidoId castOther = (ItemvendidoId) other;


        return (getVendaIdVenda() == castOther.getVendaIdVenda()) && (getProdutoCodigo() == castOther.getProdutoCodigo());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + getVendaIdVenda();
        result = 37 * result + getProdutoCodigo();
        return result;
    }
}
