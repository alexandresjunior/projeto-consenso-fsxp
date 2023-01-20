import java.util.Scanner;
public class Questao49 {
    public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double peso, altura, imc;

		System.out.println("Insira seu peso: ");
		peso = entrada.nextDouble();

		System.out.println("Insira sua altura: ");
		altura = entrada.nextDouble();

	

		imc = peso / (altura * altura);

		if (imc >= 20 && imc < 25)
			System.out.println("IMC = " + imc + " Peso normal");
		else if (imc >= 25 && imc < 30)
			System.out.println("IMC = " + imc + " Sobrepeso");
		else if (imc >= 30 && imc < 40)
			System.out.println("IMC = " + imc + " Obeso");
		else if (imc > 40)
			System.out.println("IMC = " + imc + " Obeso mórbido");

	}
}
