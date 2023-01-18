package poo.questao3;

public class Main {
    public static void main(String[] args) {
        MeioDeTransporte carro = new MeioDeTransporte();
        carro.setPotencia(110);
        carro.setCarga_maxima(2);
        System.out.println(carro.consumo());
    }
}
