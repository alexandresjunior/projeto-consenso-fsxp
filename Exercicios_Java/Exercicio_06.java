package Exercicios_java;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio_06 {public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("###.###");
	df.setRoundingMode(RoundingMode.UP);
	
	int distancia=0;
	double combustivel=0;
	double consumo=0;
	
	System.out.println("Distância percorrida: ");
	distancia=teclado.nextInt();
	
	System.out.println("Total combustível gasto: ");
	combustivel=teclado.nextDouble();
	
	teclado.close();
	
	consumo=(distancia/combustivel);
	
	System.out.println("CONSUMO MEDIO: "+df.format(consumo)+" KM/L");
	
	
	
	
	
	
	
}

}
