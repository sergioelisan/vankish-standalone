package kod.vankish.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Meiopagamento
        implements Serializable {
    private Integer idMeioPagamento;
    private String descricao;
    private Set<?> vendas = new HashSet(0);


    public Meiopagamento() {
    }


    public Meiopagamento(String descricao) {
        this.descricao = descricao;
    }

    public Meiopagamento(String descricao, Set<?> vendas) {
        this.descricao = descricao;
        this.vendas = vendas;
    }

    public Integer getIdMeioPagamento() {
        return idMeioPagamento;
    }

    public void setIdMeioPagamento(Integer idMeioPagamento) {
        this.idMeioPagamento = idMeioPagamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Set<?> getVendas() {
        return vendas;
    }

    public void setVendas(Set<?> vendas) {
        this.vendas = vendas;
    }

    public boolean equals(Object anObject) {
        return getDescricao().equals(((Meiopagamento) anObject).getDescricao());
    }
}
