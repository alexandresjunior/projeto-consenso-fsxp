package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		
        double nota ,media = 0,total = 0,total2 = 0;
		

		while (total2 != 2) {
			
            System.out.println("Insira a nota:");
            nota =scanner.nextDouble();
			
            if (nota >=0.0 && nota <= 10.0) {
				total += nota;
				total2 += 1;
			}else {
				System.out.print("NOTA INVALIDA\n");
			}
		}
		
		media =(double) total / 2;
		
		System.out.printf("MÉDIA = %.2f\n",media);
		
		}

	}


