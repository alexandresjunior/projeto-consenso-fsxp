package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		 
        int x, y;
 
      while (((x = scanner.nextInt()) > 0 )&&((y = scanner.nextInt()) > 0 )) {
 
        int soma = 0;
 
        if (x > y) {
            for (y = y; y <= x; y++) {
                soma += y;
                System.out.print(y+" ");
            }
                 System.out.print("Soma = "+soma+"\n");
         }else {
            for (x = x; x <= y; x++) {
                soma += x;
                System.out.print(x+" ");
            }
                System.out.print("Soma = "+soma+"\n");
             }
         }
      

	}

}
