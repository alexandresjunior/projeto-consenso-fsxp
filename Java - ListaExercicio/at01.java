import java.util.Scanner;

public class at01 {

        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            double a = 0;
            double b = 0;
            double media = 0;
            
            System.out.println("Insira a primeira nota: ");
            a = teclado.nextDouble();

            System.out.println("Insira a segunda nota: ");
            b = teclado.nextDouble();

            media = (a*3.5 +b*7.5)/11;

            System.out.println("Media = " + media);
            
            teclado.close();
        }
        
/*Com Java, utilizamos "." não precisamos utilizar necessáriamente a vírgula. */
}