package kod.vankish.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Produto
        implements Serializable {
    private Integer codigo;
    private Fornecedor fornecedor;
    private String codBarras;
    private String descricao;
    private String categoria;
    private String unidade;
    private BigDecimal precoCompra;
    private BigDecimal precoVenda;
    private Date dataCompra;
    private Date dataVencimento;
    private int estocado;
    private Set<?> itemvendidos = new HashSet(0);


    public Produto() {
    }

    public Produto(String descricao, String categoria, String unidade, BigDecimal precoCompra, BigDecimal precoVenda, Date dataCompra, Date dataVencimento, int estocado) {
        this.descricao = descricao;
        this.categoria = categoria;
        this.unidade = unidade;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.dataCompra = dataCompra;
        this.dataVencimento = dataVencimento;
        this.estocado = estocado;
    }

    public Produto(Fornecedor fornecedor, String codBarras, String descricao, String categoria, String unidade, BigDecimal precoCompra, BigDecimal precoVenda, Date dataCompra, Date dataVencimento, int estocado, Set<?> itemvendidos) {
        this.fornecedor = fornecedor;
        this.codBarras = codBarras;
        this.descricao = descricao;
        this.categoria = categoria;
        this.unidade = unidade;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.dataCompra = dataCompra;
        this.dataVencimento = dataVencimento;
        this.estocado = estocado;
        this.itemvendidos = itemvendidos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCodBarras() {
        return codBarras;
    }

    public void setCodBarras(String codBarras) {
        this.codBarras = codBarras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public BigDecimal getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(BigDecimal precoCompra) {
        this.precoCompra = precoCompra;
    }

    public BigDecimal getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(BigDecimal precoVenda) {
        this.precoVenda = precoVenda;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public int getEstocado() {
        return estocado;
    }

    public void setEstocado(int estocado) {
        this.estocado = estocado;
    }

    public Set<?> getItemvendidos() {
        return itemvendidos;
    }

    public void setItemvendidos(Set<?> itemvendidos) {
        this.itemvendidos = itemvendidos;
    }
}
