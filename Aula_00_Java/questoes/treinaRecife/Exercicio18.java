package treinaRecife;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio18 {
 public static void main(String[] args) {
	 System.out.println("digite um valor");
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();



     int primeiroNumero = n/1000;
   
     int segundoNumero = (n%1000)/100;
     
     int terceiroNumero = (n%100)/10;
     sc.close();
     int quartoNumero = n%10;
        if(quartoNumero == 0 && terceiroNumero  == 0 && segundoNumero == 0) {
    	 System.out.print(primeiroNumero);
     }
     else if(quartoNumero == 0 && terceiroNumero  == 0) {
    	 System.out.print(segundoNumero);
    	 System.out.print(primeiroNumero);
     }
     else if(quartoNumero == 0) {
    	 System.out.print(terceiroNumero);
         System.out.print(segundoNumero);
         System.out.print(primeiroNumero);
     }
     else {
    	 System.out.print(quartoNumero);
         System.out.print(terceiroNumero);
         System.out.print(segundoNumero);
         System.out.print(primeiroNumero);
    	 
     }
     
     
     
   
}}
