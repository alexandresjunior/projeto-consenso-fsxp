
import java.util.Scanner;
public class Questao14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int numero = entrada.nextInt(),x,contador = 0;

        entrada.close();
        x = numero;
        while(contador < 6){
            x++;
            if(x % 2 !=0){
                System.out.println(x);
                contador++;
            }
        }

    }
}
