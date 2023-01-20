package POO.Questao03;



public class MeioDeTransporte {

    private  int id;
    private short ano;
    private String modelo;
    private double cargaMaxima;

    public MeioDeTransporte(){

    }
    public MeioDeTransporte( int id, short ano, String modelo, double cargaMaxima){
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
    }

    public double consumo(){
        return 0;
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

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    
}
