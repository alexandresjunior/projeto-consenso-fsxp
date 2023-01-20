package POO.Questao07;

import java.util.Date;

public class Carro extends Item {

    private int anoDeFabricado;
    private String chassi ;
    private String cor;
    private int anoModelo;
    private Date dataEntrada;

    public Carro(){
        super();
    }

    public int getAnoDeFabricado() {
        return anoDeFabricado;
    }

    public void setAnoDeFabricado(int anoDeFabricado) {
        this.anoDeFabricado = anoDeFabricado;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    
}
