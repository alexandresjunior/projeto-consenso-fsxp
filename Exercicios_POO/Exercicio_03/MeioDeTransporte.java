package Exercicio_03;

public class MeioDeTransporte {
	
	private int id;
	private short ano;
	private String modelo;
	private double carga_maxima;
	private double potencia ;
	
	public MeioDeTransporte() {
		super();
	}

	public MeioDeTransporte(int id, short ano, String modelo, double carga_maxima) {
		super();
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public short getAno() {
		return ano;
	}

	public void setAno(short ano) {
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
	
	public double consumo() {
		return (this.potencia * this.carga_maxima)*100; //como puxar o atributo da classe filha para a classe mãe??
	}													//criei o atributo na classe mãe, verificar se pode
	
	
	
	
	
	

}
