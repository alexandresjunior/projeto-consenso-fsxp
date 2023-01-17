
import java.util.Scanner;
import java.util.Arrays;
public class Questao21 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] anoCarro = new int[3];
        double [] velocidadeCarro = new double[3];

        for(int i = 0;i < anoCarro.length;i++){
            System.out.println("Digite o ano dos carros: ");
            anoCarro[i] = entrada.nextInt();

            System.out.println("Digite a velocidade dos carros: ");
            velocidadeCarro[i] = entrada.nextDouble();
        }
        entrada.close();
        Arrays.sort(anoCarro);
        Arrays.sort(velocidadeCarro);

        System.out.println("Ano do carro mais novo: " + anoCarro[2] + "\nVelocidade do mais rapido: " + velocidadeCarro[2]);

    }
}
