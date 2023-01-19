import java.util.Scanner;

public class at49 {

    public static void main(String[] args) {
        

		Scanner entrada = new Scanner(System.in);
		double peso, altura, imc;

		System.out.println("Digite seu peso: ");
		peso = entrada.nextDouble();

		System.out.println("Digite a altura: ");
		altura = entrada.nextDouble();

		entrada.close();

		imc = peso / (altura * altura);

		if (imc >= 20 && imc < 25)
			System.out.println("IMC = " + imc + "- Peso normal");
		else if (imc >= 25 && imc < 30)
			System.out.println("IMC = " + imc + "- Sobrepeso");
		else if (imc >= 30 && imc < 40)
			System.out.println("IMC = " + imc + "- Obeso");
		else if (imc > 40)
			System.out.println("IMC = " + imc + "- Obeso mórbido");

        entrada.close();    
	}


}
    

