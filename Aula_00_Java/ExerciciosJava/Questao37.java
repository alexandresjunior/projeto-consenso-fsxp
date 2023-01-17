
import java.util.Scanner;

public class Questao37 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite o primeiro jogador: ");
        String jogador1 = entrada.nextLine();

        System.out.println("Escolha entre par ou impar: ");
        String parImpar1 = entrada.nextLine();

        System.out.println("Escolha seu numero para somar: ");
        int numero1 = entrada.nextInt();
        
        System.out.println("digite o segundo jogador: ");
        String jogador2 = entrada.next();

        System.out.println("Escolha entre par ou impar: ");
        String parImpar2 = entrada.next();

        System.out.println("Escolha seu numero para somar: ");
        int numero2 = entrada.nextInt();

        entrada.close();

        int vencedor = numero1 + numero2;

        if(vencedor % 2 == 0){
            if(parImpar1.equalsIgnoreCase("par")){
                System.out.println(jogador1);
            }else{
                System.out.println(jogador2);
            }
        }else{
            if(parImpar2.equalsIgnoreCase("impar")){
                System.out.println(jogador2);
            }else{
                System.out.println(jogador1);
            }
        }

    }

}
