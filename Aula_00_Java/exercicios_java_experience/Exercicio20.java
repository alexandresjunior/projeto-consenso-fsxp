package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double renda,consumoEnergetico,desconto=0;
		String resposta,bairro;
	
		
		System.out.println("Digite o bairro :");
		resposta = scanner.nextLine();
		System.out.println("Digite a renda :");
		renda = scanner.nextDouble();
		System.out.println("Digite seu consumo energetico em reais :");
		consumoEnergetico = scanner.nextDouble();
		
		
		scanner.close();
		
		

		if(resposta == "S"|| resposta == "s") {
			bairro = "Santa Elena";
			if (renda > 50 && renda <500 ) {
				desconto =	consumoEnergetico - 50;
				
				
			}
			else if (renda >=500 && renda <=100 ) {
				desconto =	consumoEnergetico - 25;
				
			}
		}
		else if (resposta == "i"|| resposta == "I") {
			bairro = "Industriarios";
			if(renda > 240 && renda <1000) {
				desconto =	consumoEnergetico - 240;
				
			}
			else if (renda >= 1000 && renda <=5000) {
				desconto =	consumoEnergetico - 120;
				
			}			
			
		}
		else if (resposta == "T"|| resposta =="t") {
			bairro = "Tabatinga";
			if (renda > 5000 && renda <10000) {
				desconto =	consumoEnergetico - 720;
			}
			else if (renda >= 10000 && renda <=20000) {
				desconto =	consumoEnergetico - 360;
			}
			
		}

		System.out.println("DESCONTO :" +desconto);
		
	    


	    

	}

}
