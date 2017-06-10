package kod.vankish.pojo;

import java.io.Serializable;


public class Itemvendido
        implements Serializable {
    private ItemvendidoId id;
    private Produto produto;
    private Venda venda;
    private int quantidade;

    public Itemvendido() {
    }

    public Itemvendido(ItemvendidoId id, Produto produto, Venda venda, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.venda = venda;
        this.quantidade = quantidade;
    }

    public ItemvendidoId getId() {
        return id;
    }

    public void setId(ItemvendidoId id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
