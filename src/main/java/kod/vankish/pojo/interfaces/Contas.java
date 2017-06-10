package kod.vankish.pojo.interfaces;

import java.math.BigDecimal;
import java.util.Date;

public abstract interface Contas {
    public abstract Integer getCodigo();

    public abstract void setCodigo(Integer paramInteger);

    public abstract String getBeneficiario();

    public abstract void setBeneficiario(String paramString);

    public abstract String getDescricao();

    public abstract void setDescricao(String paramString);

    public abstract String getNumDoc();

    public abstract void setNumDoc(String paramString);

    public abstract String getTipoDoc();

    public abstract void setTipoDoc(String paramString);

    public abstract BigDecimal getValor();

    public abstract void setValor(BigDecimal paramBigDecimal);

    public abstract double getJuros();

    public abstract void setJuros(double paramDouble);

    public abstract double getMulta();

    public abstract void setMulta(double paramDouble);

    public abstract BigDecimal getDesconto();

    public abstract void setDesconto(BigDecimal paramBigDecimal);

    public abstract Date getVencimento();

    public abstract void setVencimento(Date paramDate);

    public abstract Date getLancamento();

    public abstract void setLancamento(Date paramDate);

    public abstract Date getPagamento();

    public abstract void setPagamento(Date paramDate);
}
