package Exercicio4;

public class Ferramenta {
    private String categoria;
    private Integer serial;

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

    public void separar() {
        System.out.println("Outros");
    }

    public void separar(String categoria) {
        System.out.println(this.categoria);
    }

    /**
     * @return
     */
    /**@Override
    public int getIdentificador() {
        return this.serial;
    }**/

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
