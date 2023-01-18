package poo.questao3;

public class MeioDeTransporte extends Terrestre {
    private int id;
    private short ano;
    private String modelo;
    private double carga_maxima;

    public MeioDeTransporte(){
        super();
    }

    public double consumo(){
        int pot = getPotencia();
        double consumo = pot * carga_maxima * 100;
        return consumo;
    }

    //getters e setters
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

    
    
}
