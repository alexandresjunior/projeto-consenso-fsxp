import java.util.Scanner;
public class Exercicio37 {
    public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int x, y;
		String j1, j2, e1, e2;

		System.out.println("Nome do 1º jogador:");
		j1 = entrada.nextLine();
        while (j1.length() > 10){
            System.out.println("NOME INVÁLIDO! DIGITE NOVAMENTE! ");
            System.out.println("Insira o seu nome: ");
            j1 = entrada.nextLine();
            
        }
		System.out.println("Escolha do 1º jogador:");
		e1 = entrada.nextLine();
		System.out.println("Número do 1º jogador:");
		x = entrada.nextInt();


		System.out.println("Nome do 2° jogador:");
		j2 = entrada.next();
        while (j2.length() > 10){
            System.out.println("NOME INVÁLIDO! DIGITE NOVAMENTE! ");
            System.out.println("Insira o seu nome: ");
            j2 = entrada.next();

        }
        System.out.println("Escolha do 2º jogador:");
		e2 = entrada.next();
		System.out.println("Número do 2º jogador:");
		y = entrada.nextInt();

        entrada.close();

        if ((x + y) % 2 == 0) {
			if (e1.equals("Par"))
				System.out.println(j1);
		} else {
			System.out.println(j2);
		}

		if (x + y % 2 != 0) {
			if (e1.equals("Ímpar"))
				System.out.println(j1);
		} else {
			System.out.println(j2);
		}
        }
      

	}

