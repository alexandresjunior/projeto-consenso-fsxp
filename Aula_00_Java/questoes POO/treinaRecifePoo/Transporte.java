package treinaRecifePoo;

public class Transporte {
	
	private Integer id;
	private Integer ano;
	private String modelo;
	private double cargaMaxima;
	private double potencia;
	
	public Transporte() {};
	
	public Transporte(Integer _id, Integer _ano, String _modelo, double _cargaMaxima, double _potencia) {
		this.id = _id;
		this.ano = _ano;
		this.modelo = _modelo;
		this.cargaMaxima = _cargaMaxima;
		this.potencia = _potencia;
	};
	
	public double consumo() {
		return this.cargaMaxima*this.potencia;
	}
	public String leiaModelo() {
		return this.modelo;
	}
	public void gravaModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	
}
