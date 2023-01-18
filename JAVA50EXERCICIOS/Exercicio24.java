import java.util.Scanner;
public class Exercicio24 {
    public static void main ( String args [] )
	{
		int number,	n1,	n2,	n3,	n4,	n5;			
		
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número com 5 digítos: ");
        number = entrada.nextInt();
		
		
		while ( number > 99999 )
		{
			System.out.println("O NUMERO TEM MAIS DE 5 DIGÍTOS");
			
		
			System.out.print("Digite um número com 5 digítos: ");
            number = entrada.nextInt();
			
			while ( number <= 9999 )
			{
				System.out.println("O NUMERO TEM MENOS DE 5 DIGÍTOS");
				
				
				System.out.print("Digite um número com 5 digítos: ");
            number = entrada.nextInt();
			}
			
		}
		
		while ( number <= 9999 )
		{
			System.out.println("O NUMERO TEM MENOS DE 5 DIGÍTOS");
				
			
				System.out.print("Digite um número com 5 digítos: ");
            number = entrada.nextInt();
			while ( number > 99999 )
			{
				System.out.println("O NUMERO TEM MAIS DE 5 DIGÍTOS");
			
			
			System.out.print("Digite um número com 5 digítos: ");
            number = entrada.nextInt();
			}
			
		}
		
		
		n1 = number / 10000;												
		n2 = (number / 1000) - (n1 * 10); 									
		n3 = (number / 100) - (n1 * 100) - (n2 * 10);						
		n4 = (number / 10) - (n1 * 1000) - (n2 * 100) - (n3 * 10);			
		n5 = number - (n1 * 10000) - (n2 * 1000) - (n3 * 100) - (n4 * 10);	
		
		if (n1 == n5)
		{
			if (n2 == n4)
			{
				System.out.println("S");
			}
			else
			{
				System.out.println("N");
			}
		}
		else
		{
			System.out.println("N");
		}
		
		entrada.close();
	}
}





