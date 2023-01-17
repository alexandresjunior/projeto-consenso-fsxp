package Exer15;

public class Usuario {
    private String login, senha, permissao;
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

    public String getPermissao() {
        return permissao;
    }

    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }
    public void editarPerfil(){}
    public void alterarSenha(){}
    public void criarUsuario(){}
    public void apagarUsuario(){}
    private Colaborador colaborador = new Colaborador();
}
