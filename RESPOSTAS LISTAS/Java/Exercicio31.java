import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int nota_valida = 0;
        double media = 0;
        
        while(nota_valida != 2){
            double nota = in.nextDouble();
            if(nota >= 0 && nota <= 10){
                media += nota;
                nota_valida++;
            }else{
                System.out.println("NOTA INVÁLIDA");
            }
        }
        System.out.println("MÉDIA = " + media/2);

        in.close();
    }
}