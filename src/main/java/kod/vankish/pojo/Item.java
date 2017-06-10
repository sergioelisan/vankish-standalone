package kod.vankish.pojo;


public class Item {
    private String descricao;

    private Integer quantidade;

    private String preco;

    private String total;

    public Item() {
    }

    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public Integer getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }


    public String getPreco() {
        return preco;
    }


    public void setPreco(String preco) {
        this.preco = preco;
    }


    public String getTotal() {
        return total;
    }


    public void setTotal(String total) {
        this.total = total;
    }
}
