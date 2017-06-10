package kod.vankish.pojo;

import java.io.Serializable;


public class Caixalog
        implements Serializable {
    private Integer id;
    private Caixa caixa;
    private String log;

    public Caixalog() {
    }

    public Caixalog(Caixa caixa) {
        this.caixa = caixa;
    }

    public Caixalog(Caixa caixa, String log) {
        this.caixa = caixa;
        this.log = log;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }
}
