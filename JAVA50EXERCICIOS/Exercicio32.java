import java.util.Scanner;
public class Exercicio32 {

    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int tipo;
        int alcool = 0, gasolina = 0, diesel = 0, cont=0; 
		int qtd1,qtd2,qtd3;
		int somaqtd1 = 0, somaqtd2 = 0, somaqtd3 = 0;
		
		
		while (cont<5) {
			System.out.println("Tipo de combustível: ");
			tipo = entrada.nextInt();
			if (tipo == 1) {
				System.out.println("Quantidade de litros");
				qtd1 = entrada.nextInt();
				alcool = alcool + 1;
				somaqtd1 = somaqtd1 + qtd1;
			}else if (tipo == 2) {
				System.out.println("Quantidade de litros");
				qtd2 = entrada.nextInt();
				gasolina = gasolina + 1;
				somaqtd2 = somaqtd2 + qtd2;
				
			}else if (tipo == 3) {
				System.out.println("Quantidade de litros");
				qtd3 = entrada.nextInt();
				diesel = diesel + 1;
				somaqtd3 = somaqtd3 + qtd3;
			}
			cont++;
		}

		System.out.println("1.Alcool: "+alcool+" - Quantidade de litros: "+somaqtd1);
		System.out.println("2.Gasolina: "+gasolina+" - Quantidade de litros: "+somaqtd2);
		System.out.println("3.Diesel: "+diesel+" - Quantidade de litros: "+somaqtd3);
        entrada.close();
    }
}