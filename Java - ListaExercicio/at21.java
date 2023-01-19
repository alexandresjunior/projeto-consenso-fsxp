import java.util.Scanner;

public class at21 {
    

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int[] carro = new int[3];
        double[] velocidade = new double[3];
        
        

        for(int i = 0; i < 3; i++){
            System.out.println("Ano do "+(i+1)+" carro:");
            carro[i] = entrada.nextInt();
            System.out.println("Velocidade do "+(i+1)+" carro:");
            velocidade[i] = entrada.nextDouble();
        }
    

        System.out.println("Ano do carro mais novo: "+carro[2]);
        System.out.println("Velocidade do mais rápido: " + velocidade[2]);

        entrada.close();
    }
}
