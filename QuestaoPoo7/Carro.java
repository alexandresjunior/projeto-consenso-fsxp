package QuestaoPoo7;

import java.util.Date;

public class Carro extends Modelo{
	private String chassi;
	private String cor;
	private int anoFrabicacao;
	private int anoModelo;
	private Date dataEntrada;
	
	public Carro() {}

	public Carro(int codigo, String nome, String descricao, int codigo2, String marca, String nome2, double motor,
			int serie, String chassi, String cor, int anoFrabicacao, int anoModelo, Date dataEntrada) {
		super(codigo, nome, descricao, codigo2, marca, nome2, motor, serie);
		this.chassi = chassi;
		this.cor = cor;
		this.anoFrabicacao = anoFrabicacao;
		this.anoModelo = anoModelo;
		this.dataEntrada = dataEntrada;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAnoFrabicacao() {
		return anoFrabicacao;
	}

	public void setAnoFrabicacao(int anoFrabicacao) {
		this.anoFrabicacao = anoFrabicacao;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Date getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	
	
}
