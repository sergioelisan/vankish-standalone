package kod.vankish.pojo;

import java.io.Serializable;
import java.util.Date;


public class Troca
        implements Serializable {
    private Integer idTroca;
    private Date data;
    private Date hora;
    private String descricao;

    public Troca() {
    }

    public Troca(Date data, Date hora, String descricao) {
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }

    public Integer getIdTroca() {
        return idTroca;
    }

    public void setIdTroca(Integer idTroca) {
        this.idTroca = idTroca;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
