import java.util.Scanner;

public class Exer45 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sa = 0;
        double ma = Double.MIN_VALUE;
        String maNome = "";
        String minaNome = "";
        double midade = Double.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            String name = entrada.next();
            double age = entrada.nextDouble();

            if (age > ma) {
                ma = age;
                maNome = name;
            }
            if(age < midade){
                midade = age;
                minaNome = name;
            }
            sa += age;
        }
        entrada.close();
        double d = sa / 5;

        System.out.printf("Maior idade: %.1f\n", ma);
        System.out.println("Nome da pessoa mais nova: " + minaNome);
        System.out.printf("Média das idades: %.1f\n", d);
    }
}
