package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	      
	        int a, b, c; 
	          System.out.print("Verificador de Triângulo\n");
	    
	    
	        System.out.print("Digite o lado A :");
	        a = scanner.nextInt(); 
	        
	        System.out.print("Digite o lado B :");
	        b = scanner.nextInt(); 
	        
	        System.out.print("Digite o lado C :");
	        c = scanner.nextInt(); 
	    
	        scanner.close();
	    
	        if( a < b + c && b < a + c && c < a + b ){ 
	            if(a==b && b == c){
	                System.out.print("Equilátero.");
	            }else if(a==b || a==c || b==c){ 
	                System.out.print("Isósceles.");
	            }else{ 
	                System.out.print("Escaleno.");
	            }
	        }else{
	            System.out.print("Não formam um triângulo");
	        }

	}

}
