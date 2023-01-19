package Exercicios_java;
import java.util.Scanner;


public class Exercicio_08 {public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	double ir=0;
	double rh=0;
	double rm=0;
	double rc=0;
	int ali=0;
	double rl=0;
	
	
	System.out.println("Renda do homem: ");
	rh=teclado.nextDouble();
	
	System.out.println("Renda da mulher: ");
	rm=teclado.nextDouble();
	
	teclado.close();
	
	rc=(rh+rm);
	
	if (rc<=900) {
		ali=0;
	}else if (rc>900 && rc<=1500) {
		ali=10;
	}else if (rc>1500 && rc<=2500) {
		ali=15;
	}else {
		ali=25;
	}
	
	ir=((rc*ali)/100);
	rl=(rc-ir);
	
	System.out.println("RENDA CONJUNTA "+rc);
	System.out.println("ALÍQUOTA UTILIZADA "+ali+"%");
	System.out.println("IMPOSTO DE RENDA "+ir);
	System.out.println("RENDA LÍQUIDA " +rl);
	
	
	
		
	}
	
	
	
	
}
	
