import java.util.Scanner;
public class Exercicio21 {
    public static void main(String args[]) {
        int ano1,ano2,ano3;
        double velocidade1, velocidade2, velocidade3;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o ano do carro: ");
        ano1= entrada.nextInt();

        System.out.print("Digite a velocidade do carro 1: ");
        velocidade1= entrada.nextDouble();

        System.out.print("Digite o ano do carro 2: ");
        ano2= entrada.nextInt();

        System.out.print("Digite a velocidade do carro 2: ");
        velocidade2= entrada.nextDouble();

        System.out.print("Digite o ano do carro 3: ");
        ano3= entrada.nextInt();

        System.out.print("Digite a velocidade do carro: ");
        velocidade3= entrada.nextDouble();
      
        if ((ano1 > ano2) && (ano1 > ano3)){
            System.out.println("\nAno do carro mais novo: " + ano1);
        }
        else if ((ano2 > ano1) && (ano2 > ano3)){
            System.out.println("\nAno do carro mais novo: " + ano2);
        }
        else if ((ano3 > ano1) && (ano3 > ano2)){
            System.out.println("\nAno do carro mais novo: " + ano3);
        }


        if ((velocidade1 > velocidade2) && (velocidade1 > velocidade3)){
            System.out.println("\nVelocidade do mais rápido: " + velocidade1);
        }
        else if ((velocidade2 > velocidade1) && (velocidade2 > velocidade3)){
            System.out.println("\nVelocidade do mais rápido: " + velocidade2);
        }
        else if ((velocidade3 > velocidade1) && (velocidade3 > velocidade2)){
            System.out.println("\nVelocidade do mais rápido: " + velocidade3);
        }

        entrada.close();

}
}