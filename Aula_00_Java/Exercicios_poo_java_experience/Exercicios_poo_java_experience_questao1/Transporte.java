package Exercicios_poo_java_experience_questao1;

public class Transporte {
	private int id;
	private int idade;
	private String modelo;
	private double carga_Maxima;
	private double potencia;
	
	public Double consumo(double potencia, double carga_Maxima) {
		this.potencia= potencia;
		this.carga_Maxima =carga_Maxima;
		
		return potencia * carga_Maxima * 100;
	}
	
//	public Double consumo() {
//		return potencia * carga_Maxima * 100;
//	}
	public String leiaModelo(String modelo) {
		this.modelo = modelo;
		return modelo;
	}

	public void gravaModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getCarga_Maxima() {
		return carga_Maxima;
	}
	public void setCarga_Maxima(double carga_Maxima) {
		this.carga_Maxima = carga_Maxima;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	
}
