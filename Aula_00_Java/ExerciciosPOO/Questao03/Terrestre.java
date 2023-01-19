package ExerciciosPOO.Questao03;

public class Terrestre extends MeioDeTransporte{

    private int qtdeRoda;
    private double potencia;


    
    public Terrestre(){
        super();
    }
    public Terrestre(int qtdeRoda, double potencia){
        super();
        this.qtdeRoda = qtdeRoda;
        this.potencia = potencia;
    }

    @Override
    public double consumo(){
        return this.potencia * getCargaMaxima() * 100; 
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
    
    
}
