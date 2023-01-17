package exercicios_java_experience;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double rendaHomem,rendaMulher;
		double rc,alio,ir,rl;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a renda do HOMEM :");
		rendaHomem = scanner.nextDouble();
		System.out.println(rendaHomem);
		System.out.println("Digite a renda da MULHER :");
		rendaMulher = scanner.nextDouble();
		System.out.println(rendaMulher);
		rc = rendaHomem + rendaMulher;
		System.out.println(rc);
		scanner.close();
		
		if (rc <=900) {
			alio = 0;
			ir = alio * rc;
			rl = rc - ir;
			System.out.println("ISENTO");
		}
		else if (rc <=1500) {
			alio = 0.1;
			ir = alio * rc;
			rl = rc - ir;
			System.out.println("10%");
		}
		else if (rc <=2500) {
			alio = 0.15;
			ir = alio * rc;
			rl = rc - ir;
			System.out.println("15%");
		}
		else {
			alio = 0.25;
			ir = alio * rc;
			rl = rc - ir;
			System.out.println("25%");
		}
		
		System.out.println("RENDA CONJUNTA :"+ rc);
		System.out.println("ALIQUOTA UTILIZADA :" + (alio*100)+"%");
		System.out.println("IMPOSTO DE RENDA :"+ ir);
		System.out.println("RENDA LIQUIDA :" + rl);
		
		
		
		
		
		

	}

}
