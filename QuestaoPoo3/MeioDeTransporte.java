package QuestaoPoo3;

public abstract class MeioDeTransporte {
	private Integer id;
	private Integer ano;
	private String modelo;
	private Double carga_maxima;
	
	public MeioDeTransporte() {}

	public MeioDeTransporte(Integer id, Integer ano, String modelo, Double carga_maxima) {
		this.id = id;
		this.ano = ano;
		this.modelo = modelo;
		this.carga_maxima = carga_maxima;
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

	public Double getCarga_maxima() {
		return carga_maxima;
	}

	public void setCarga_maxima(Double carga_maxima) {
		this.carga_maxima = carga_maxima;
	}
	
	public abstract double consumo();
}
