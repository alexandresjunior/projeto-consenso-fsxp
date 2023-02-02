package Exer01;

public class Transporte {
    private Integer id;
    private Integer ano;
    private String modelo;
    private Double carga_maxima;
    private Double potencia;
    public Transporte(){

    }

    public Transporte(Integer id, Integer ano, String modelo, Double carga_maxiam, Double potencia){
        this.ano = ano;
        this.id = id;
        this.modelo = modelo;
        this.carga_maxima = carga_maxiam;
        this.potencia = potencia;
    }

    public double consumo(){
        double x = this.potencia * this.carga_maxima * 100;
        return x;
    }
    public String leiaModelo(){
        return this.modelo;
    }
    public void gravarModelo(String Modelo){
        this.modelo = Modelo;
    }
}
