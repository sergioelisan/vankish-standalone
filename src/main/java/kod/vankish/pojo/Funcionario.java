package kod.vankish.pojo;

import kod.vankish.pojo.interfaces.Pessoa;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Funcionario
        implements Serializable, Pessoa {
    private Integer idFuncionario;
    private String nome;
    private Character sexo;
    private Integer idade;
    private String cpf;
    private BigDecimal salario;
    private String pis;
    private String cntps;
    private String endereco;
    private String cidade;
    private String telefone;
    private String celular;
    private String email;
    private Date dataContratacao;
    private Set<?> vendas = new HashSet(0);

    public Funcionario() {
    }

    public Funcionario(String nome, Character sexo, Integer idade, String cpf, BigDecimal salario, String pis, String cntps, String endereco, String cidade, String telefone, String celular, String email, Date dataContratacao, Set<?> vendas) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.pis = pis;
        this.cntps = cntps;
        this.endereco = endereco;
        this.cidade = cidade;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
        this.dataContratacao = dataContratacao;
        this.vendas = vendas;
    }

    public Integer getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Integer idFuncionario) {
        this.idFuncionario = idFuncionario;
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

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

    public String getCntps() {
        return cntps;
    }

    public void setCntps(String cntps) {
        this.cntps = cntps;
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

    public Date getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
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
        return idFuncionario;
    }
}
