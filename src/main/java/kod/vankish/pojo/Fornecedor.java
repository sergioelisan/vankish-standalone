package kod.vankish.pojo;

import kod.vankish.pojo.interfaces.Pessoa;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class Fornecedor
        implements Serializable, Pessoa {
    private Integer idFornecedor;
    private String empresa;
    private String ramo;
    private String cnpj;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String celular;
    private String fax;
    private String email;
    private Date dataCadastro;
    private Set<?> produtos = new HashSet(0);

    public Fornecedor() {
    }

    public Fornecedor(String empresa, String ramo, String cnpj, String endereco, String cidade, String estado, String telefone, String celular, String fax, String email, Date dataCadastro, Set<?> produtos) {
        this.empresa = empresa;
        this.ramo = ramo;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.celular = celular;
        this.fax = fax;
        this.email = email;
        this.dataCadastro = dataCadastro;
        this.produtos = produtos;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public Set<?> getProdutos() {
        return produtos;
    }

    public void setProdutos(Set<?> produtos) {
        this.produtos = produtos;
    }

    public String getNome() {
        return empresa;
    }

    public String getCadastroReceita() {
        return cnpj;
    }

    public Integer getCodigo() {
        return idFornecedor;
    }
}
