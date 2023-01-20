import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Questao21 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int[] ano = new int[3];
		double[] vel = new double[3];
		
		
		for(int i = 0; i < 3; i++) {
			System.out.print("- ");
			ano[i] = sc.nextInt();
			System.out.print("- ");
			vel[i] = sc.nextDouble();
		}
		
		Arrays.sort(ano);
		Arrays.sort(vel);
		
		System.out.println("ano do carro mais novo = " + ano[2]);
		System.out.println("velocidade do mais rapido = " + vel[2]);

        sc.close();
	}

}