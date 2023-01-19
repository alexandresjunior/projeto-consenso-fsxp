import java.util.Scanner;


public class at15 {
    public static void main(String[] args){   

    Scanner entrada = new Scanner(System.in);
		int proximo, anterior = 0, atual = 1; 
        int N;

		System.out.println("Digite um valor: ");
		N = entrada.nextInt();

		    
        for (int i = 1; i <= N; i++) {
			if (i == N)
				System.out.println(anterior);
			else
				System.out.print(anterior + " ");
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;

        entrada.close();    
} 
}
}  
