package poo.questao1;

public class Transporte {
    private Integer id;
    private Integer ano;
    private String modelo;
    private Double carga_maxima;
    private Double potencia;

    //considerando o caso de o ID ser AUTO_INCREMENT
    public Transporte(int i, int a, String m, Double c, Double p){
        this.id = i;
        this.ano = a;
        this.modelo = m;
        this.carga_maxima = c;
        this.potencia = p;
    }

    public Double consumo(){
        Double consumo = potencia*carga_maxima*100;
        return consumo;
    }

    //getters and setters
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
    public Double getPotencia() {
        return potencia;
    }
    public void setPotencia(Double potencia) {
        this.potencia = potencia;
    }
     
}
