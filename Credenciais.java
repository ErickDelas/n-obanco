package no.banktest;

public class Credenciais {
    private String login;
    private String senha;
    private String nome;
    private String cpf;
    private String dtNascimento;
    private String nCelular;
    private String email;

    public Credenciais(){
        
    }
    
    void apagarCredenciais(){
        this.cpf = null;
        this.dtNascimento = null;
        this.email = null;
        this.login = null;
        this.nCelular = null;
        this.nome = null;
        this.senha = null;
    }
    
    public Credenciais (String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getnCelular() {
        return nCelular;
    }

    public void setnCelular(String nCelular) {
        this.nCelular = nCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
