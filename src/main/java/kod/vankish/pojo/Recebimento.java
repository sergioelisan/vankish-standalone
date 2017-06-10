package kod.vankish.pojo;

import kod.vankish.pojo.interfaces.Contas;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class Recebimento
        implements Serializable, Contas {
    private Integer idRecebimento;
    private String beneficiario;
    private String descricao;
    private String numDoc;
    private String tipoDoc;
    private BigDecimal valor;
    private double juros;
    private double multa;
    private BigDecimal desconto;
    private Date lancamento;
    private Date vencimento;
    private Date pagamento;

    public Recebimento() {
    }

    public Recebimento(String descricao, BigDecimal valor, double juros, double multa, BigDecimal desconto, Date lancamento, Date vencimento) {
        this.descricao = descricao;
        this.valor = valor;
        this.juros = juros;
        this.multa = multa;
        this.desconto = desconto;
        this.lancamento = lancamento;
        this.vencimento = vencimento;
    }

    public Recebimento(String beneficiario, String descricao, String numDoc, String tipoDoc, BigDecimal valor, double juros, double multa, BigDecimal desconto, Date lancamento, Date vencimento, Date pagamento) {
        this.beneficiario = beneficiario;
        this.descricao = descricao;
        this.numDoc = numDoc;
        this.tipoDoc = tipoDoc;
        this.valor = valor;
        this.juros = juros;
        this.multa = multa;
        this.desconto = desconto;
        this.lancamento = lancamento;
        this.vencimento = vencimento;
        this.pagamento = pagamento;
    }

    public Integer getIdRecebimento() {
        return idRecebimento;
    }

    public void setIdRecebimento(Integer idRecebimento) {
        this.idRecebimento = idRecebimento;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(String numDoc) {
        this.numDoc = numDoc;
    }

    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Date getPagamento() {
        return pagamento;
    }

    public void setPagamento(Date pagamento) {
        this.pagamento = pagamento;
    }

    public Integer getCodigo() {
        return idRecebimento;
    }


    public void setCodigo(Integer id) {
        idRecebimento = id;
    }
}
