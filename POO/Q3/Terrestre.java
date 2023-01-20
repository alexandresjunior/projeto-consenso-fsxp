package POO.Q3;

public class Terrestre extends MeioDeTransporte{
	private int qtdeRoda;
	private double potencia;
	
	public Terrestre() {}

	public Terrestre(Integer id, Integer ano, String modelo, Double carga_maxima, int qtdeRoda, double potencia) {
		super(id, ano, modelo, carga_maxima);
		this.qtdeRoda = qtdeRoda;
		this.potencia = potencia;
	}

	public int getQtdeRoda() {
		return qtdeRoda;
	}

	public void setQtdeRoda(int qtdeRoda) {
		this.qtdeRoda = qtdeRoda;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public double consumo() {
		return potencia * getCarga_maxima() * 100;
	}
	
	
	
	

}
