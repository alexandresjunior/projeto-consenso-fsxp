package ExerciciosPOO.Questao04;

public class Ferramenta extends ItemDeLoja {
    
    private String categoria;
    private Integer serial;

     public Ferramenta(){
        super();
     }

    @Override
    public int getIdentificador(){
        return this.serial;
    }

    public void separar(){
        this.categoria = "outros";
    }

    public String separar(String categoria){
        return this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getSerial() {
        return serial;
    }

    public void setSerial(Integer serial) {
        this.serial = serial;
    }

    

}
