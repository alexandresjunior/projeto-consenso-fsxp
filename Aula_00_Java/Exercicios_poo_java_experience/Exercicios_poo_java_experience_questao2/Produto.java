package Exercicios_poo_java_experience_questao2;

import java.util.Date;

public class Produto {
	private int id;
	private String nome;
	private String descricao;
	private Date validade;
	
	public int getCod(int id) {
		this.id =id;
		return id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getValidade() {
		return validade;
	}
	public void setValidade(Date validade) {
		this.validade = validade;
	}
}
