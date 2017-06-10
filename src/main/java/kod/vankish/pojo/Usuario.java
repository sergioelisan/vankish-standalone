package kod.vankish.pojo;

import java.io.Serializable;


public class Usuario
        implements Serializable {
    private Integer idUsuario;
    private String nome;
    private String senha;
    private boolean controlefuncionarios;
    private boolean controlefornecedores;
    private boolean controleclientes;
    private boolean admincontas;
    private boolean admincaixa;
    private boolean adminbalanco;
    private boolean usuarios;

    public Usuario() {
    }

    public Usuario(String nome, String senha, boolean controlefuncionarios, boolean controlefornecedores, boolean controleclientes, boolean admincontas, boolean admincaixa, boolean adminbalanco, boolean usuarios) {
        this.nome = nome;
        this.senha = senha;
        this.controlefuncionarios = controlefuncionarios;
        this.controlefornecedores = controlefornecedores;
        this.controleclientes = controleclientes;
        this.admincontas = admincontas;
        this.admincaixa = admincaixa;
        this.adminbalanco = adminbalanco;
        this.usuarios = usuarios;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isControlefuncionarios() {
        return controlefuncionarios;
    }

    public void setControlefuncionarios(boolean controlefuncionarios) {
        this.controlefuncionarios = controlefuncionarios;
    }

    public boolean isControlefornecedores() {
        return controlefornecedores;
    }

    public void setControlefornecedores(boolean controlefornecedores) {
        this.controlefornecedores = controlefornecedores;
    }

    public boolean isControleclientes() {
        return controleclientes;
    }

    public void setControleclientes(boolean controleclientes) {
        this.controleclientes = controleclientes;
    }

    public boolean isAdmincontas() {
        return admincontas;
    }

    public void setAdmincontas(boolean admincontas) {
        this.admincontas = admincontas;
    }

    public boolean isAdmincaixa() {
        return admincaixa;
    }

    public void setAdmincaixa(boolean admincaixa) {
        this.admincaixa = admincaixa;
    }

    public boolean isAdminbalanco() {
        return adminbalanco;
    }

    public void setAdminbalanco(boolean adminbalanco) {
        this.adminbalanco = adminbalanco;
    }

    public boolean isUsuarios() {
        return usuarios;
    }

    public void setUsuarios(boolean usuarios) {
        this.usuarios = usuarios;
    }
}
