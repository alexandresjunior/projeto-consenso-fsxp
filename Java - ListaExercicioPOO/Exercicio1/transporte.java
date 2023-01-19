package Exercicio1;
public class transporte {
    private Integer id;
    private Integer ano;
    private String modelo;
    private Double carga_maxima;
    private Double potencia;


    public transporte(int i, int a, String m, Double c, Double p){
        this.id = i;
        this.ano = a;
        this.modelo = m;
        this.carga_maxima = c;
        this.potencia = p;
    }


    public transporte() {
    }


    public Integer getId() {
        return this.id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getAno() {
        return this.ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    public String getModelo() {
        return this.modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Double getCarga_maxima() {
        return this.carga_maxima;
    }
    public void setCarga_maxima(Double carga_maxima) {
        this.carga_maxima = carga_maxima;
    }
    public Double getPotencia() {
        return this.potencia;
    }
    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }


    public void consumo() {
    }


}