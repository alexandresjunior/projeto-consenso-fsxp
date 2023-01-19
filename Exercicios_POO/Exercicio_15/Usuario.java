package Exercicio_15;

public class Usuario {

	private String login;
	private String senha;
	private String permissao;

	public void editarPerfil() {
		System.out.println("classe: Usuário, método: editarPerfil()");
	}

	public void alterarSenha() {
		System.out.println("classe: Usuário, método: alterarSenha()");
	}

	public void criarUsuario() {
		System.out.println("classe: Usuário, método: criarUsuario()");
	}

	public void apagarUsuario() {
		System.out.println("classe: Usuário, método: apagarUsuario()");
	}

	// getters e setters
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
