package kod.vankish.pojo;

import kod.vankish.pojo.interfaces.Pessoa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Cliente
        implements Serializable, Pessoa {
    private Integer idCliente;
    private String nome;
    private Character sexo;
    private Integer idade;
    private String cpf;
    private String endereco;
    private String cidade;
    private String telefone;
    private String celular;
    private String email;
    private Date dataCadastro;
    private BigDecimal saldo;
    private Set<?> vendas = new HashSet(0);

    public Cliente() {
    }

    public Cliente(String nome, Character sexo, Integer idade, String cpf, String endereco, String cidade, String telefone, String celular, String email, Date dataCadastro, BigDecimal saldo, Set<?> vendas) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.saldo = saldo;
        this.vendas = vendas;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public Set<?> getVendas() {
        return vendas;
    }

    public void setVendas(Set<?> vendas) {
        this.vendas = vendas;
    }

    public String getCadastroReceita() {
        return cpf;
    }

    public Integer getCodigo() {
        return idCliente;
    }
}
