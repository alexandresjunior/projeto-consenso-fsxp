import java.util.Scanner;
public class Exercicio42 {
 
    public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
	double preço1,preço2,porcentagem;
	
	System.out.println("Preço Antigo: ");
	preço1 = entrada.nextDouble();

    System.out.println("Preço novo: ");
	preço2 = entrada.nextDouble();

    
    porcentagem = (preço2 * 100) / (preço1);
    porcentagem=  porcentagem - 100;

    System.out.println(porcentagem + "%");
    entrada.close();
    }
    
}