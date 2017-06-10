package kod.vankish.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class Caixa
        implements Serializable {
    private Integer idCaixa;
    private Date data;
    private BigDecimal saldoAnterior;
    private BigDecimal saldo;

    public Caixa() {
    }

    public Caixa(Date data, BigDecimal saldoAnterior, BigDecimal saldo) {
        this.data = data;
        this.saldoAnterior = saldoAnterior;
        this.saldo = saldo;
    }

    public Integer getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(Integer idCaixa) {
        this.idCaixa = idCaixa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(BigDecimal saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
}
