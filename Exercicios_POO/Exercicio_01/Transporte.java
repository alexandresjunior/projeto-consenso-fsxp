package Exercicio_01;

public class Transporte {

	private int id;
	private int ano;
	private String modelo;
	private double carga_maxima;
	private double potencia;

	public Transporte() {
		super();
	}

	public Transporte(int id, int ano, String modelo, double carga_maxima, double potencia) {
		super();
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
		this.potencia = potencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCarga_maxima() {
		return carga_maxima;
	}

	public void setCarga_maxima(double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	public double consumo(double potencia,double carga_maxima) {
		return (this.potencia* this.carga_maxima)*100;
		
	}
	
	public String leiaModelo(){
	return this.modelo;
	}
	
	public void gravaModelo(String modelo) {
		this.modelo = modelo;
	}
	}
	
	
	
	
	
	
	

