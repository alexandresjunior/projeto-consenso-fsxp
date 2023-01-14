package Exer04;

public class Ferramenta extends ItemDeLoja{
    private String categoria;
    private Integer serial;

    @Override
    public int getIdentificador() {
        return this.serial;
    }
    public void separar(){
        this.categoria = "Outros";
    }
    public void separar(String valor){

    }
}
