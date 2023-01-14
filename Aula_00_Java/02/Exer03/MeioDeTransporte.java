package Exer03;

public class MeioDeTransporte extends Terrestre{
    private int id;
    private short ano;
    private String modelo;
    private double carga_maxima;
    public double consumo(){
        double y = getPotencia();
        double x = y * this.carga_maxima * 100;
        return x;
    }
}
