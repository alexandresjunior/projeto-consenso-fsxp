package Exercicios_java;

import java.util.Scanner;

public class Exercicio_01 {public static void main(String[] args) {
	
 Scanner teclado = new Scanner(System.in);
 
 double n1 = 0;
 double n2 =0;
 double media=0;
 
 System.out.println("Digite a primeira nota: ");
 n1= teclado.nextDouble();
 
 System.out.println("Digite a seguda nota: ");
 n2= teclado.nextDouble();
 
 teclado.close();
 
 media=(n1*3.5+n2*7.5)/11;
 
 System.out.println("MEDIA = "+media);
		
	
	
	
	
	
	
	
	
	
	
	
	
}

}
