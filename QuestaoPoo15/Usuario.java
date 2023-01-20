package QuestaoPoo15;

public class Usuario extends Colaborador{

    private String login;
    private String senha;
    private String permissao;

    private Colaborador colaborador = new Colaborador();

    public Usuario(){
        super();
    }

    public void editarPerfil(){
        System.out.println("Classe: Usuario\nMetodo: editarPerfil");
    }


    public void alterarSenha(){
        System.out.println("Classe: Usuario\nMetodo: alterarSenha");
    }


    public void criarUsuario(){
        System.out.println("Classe: Usuario\nMetodo: criarUsuario");
    }


    public void apagarUsuario(){
        System.out.println("Classe: Usuario\nMetodo: apagarUsuario");
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


    public String getPermissao() {
        return permissao;
    }


    public void setPermissao(String permissao) {
        this.permissao = permissao;
    }


}