package treinaRecife;

public class Exercicio35 {
    public static void main(String[] args) {
        double s = 0.0;
        double denominador = 1.0;
        for (int i = 1; i <= 39; i += 2) {
            s += i/denominador;
            denominador *= 2;
        }
        System.out.println("S = " + s);
    }
}
