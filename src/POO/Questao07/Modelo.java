package POO.Questao07;

public class Modelo extends Item {

    private int codigo;
    private String marca;
    private String nome;
    private double motor;
    private int serie;

    public Modelo(){
        super();
    } 

    public Modelo(int codigo,String marca,String nome,double motor,int serie){
        super();
        this.marca = marca;
        this.codigo = codigo;
        this.nome = nome;
        this.motor = motor;
        this.serie=serie;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
    
}
