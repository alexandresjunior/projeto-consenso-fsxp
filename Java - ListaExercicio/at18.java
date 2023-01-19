import java.util.Scanner;

public class at18 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        int inverso = 0;

        System.out.println("Insira um valor:");
        numero = entrada.nextInt();

        while (numero > 0){
            inverso = inverso * 10;
            inverso = inverso + (numero % 10);
            numero = numero / 10;
        }
        System.out.println(inverso);

        entrada.close();
    }
}
