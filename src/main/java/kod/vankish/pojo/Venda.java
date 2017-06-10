package kod.vankish.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Venda
        implements Serializable {
    private Integer idVenda;
    private Funcionario funcionario;
    private Formapagamento formapagamento;
    private Meiopagamento meiopagamento;
    private Cliente cliente;
    private Date data;
    private Date hora;
    private BigDecimal total;
    private Set<?> itemvendidos = new HashSet(0);


    public Venda() {
    }

    public Venda(Formapagamento formapagamento, Meiopagamento meiopagamento, Date data, Date hora, BigDecimal total) {
        this.formapagamento = formapagamento;
        this.meiopagamento = meiopagamento;
        this.data = data;
        this.hora = hora;
        this.total = total;
    }

    public Venda(Funcionario funcionario, Formapagamento formapagamento, Meiopagamento meiopagamento, Cliente cliente, Date data, Date hora, BigDecimal total, Set<?> itemvendidos) {
        this.funcionario = funcionario;
        this.formapagamento = formapagamento;
        this.meiopagamento = meiopagamento;
        this.cliente = cliente;
        this.data = data;
        this.hora = hora;
        this.total = total;
        this.itemvendidos = itemvendidos;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(Integer idVenda) {
        this.idVenda = idVenda;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Formapagamento getFormapagamento() {
        return formapagamento;
    }

    public void setFormapagamento(Formapagamento formapagamento) {
        this.formapagamento = formapagamento;
    }

    public Meiopagamento getMeiopagamento() {
        return meiopagamento;
    }

    public void setMeiopagamento(Meiopagamento meiopagamento) {
        this.meiopagamento = meiopagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Set<?> getItemvendidos() {
        return itemvendidos;
    }

    public void setItemvendidos(Set<?> itemvendidos) {
        this.itemvendidos = itemvendidos;
    }
}
