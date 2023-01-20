import java.util.Scanner;
public class Questao24 {
    /* palindromo*/
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
	
	System.out.println("Insira um valor de 5 digitos: ");
	int valor = entrada.nextInt();
	
	String a = Integer.toString(valor);
	String b = new StringBuilder(a).reverse().toString();

	if (a.equals(b)) {
		System.out.println("S");
	}else {
		System.out.println("N");
	}

    }	

}
 
