package kod.vankish.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


public class Formapagamento
        implements Serializable {
    private Integer idFormaPagamento;
    private String descricao;
    private Set<?> vendas = new HashSet(0);


    public Formapagamento() {
    }


    public Formapagamento(String descricao) {
        this.descricao = descricao;
    }

    public Formapagamento(String descricao, Set<?> vendas) {
        this.descricao = descricao;
        this.vendas = vendas;
    }

    public Integer getIdFormaPagamento() {
        return idFormaPagamento;
    }

    public void setIdFormaPagamento(Integer idFormaPagamento) {
        this.idFormaPagamento = idFormaPagamento;
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
        return getDescricao().equals(((Formapagamento) anObject).getDescricao());
    }
}
