import java.util.Scanner;

public class Exer44 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] n = new double[5];
        double sCont = 0, c = 0;
        double varMin = Double.MIN_VALUE;
        double minN = Double.MAX_VALUE, maxN = Double.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            n[i] = entrada.nextDouble();
            if (n[i] % 2 != 0) {
                sCont += n[i];
                c++;
            }
            else if (n[i] >varMin) {
               varMin = n[i];
            }
            minN = Math.min(minN,n[i]);
            maxN = Math.max(maxN,n[i]);
        }
        entrada.close();
        double mediaImpares = sCont / c;
        double diferenca = maxN - minN;

        System.out.printf("Média dos ímpares: %.1f\n", mediaImpares);
        System.out.printf("Maior número PAR: %.1f\n",varMin);
        System.out.printf("Diferença: %.1f\n", diferenca);
    }
}