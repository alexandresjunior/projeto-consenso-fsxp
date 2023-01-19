package javaExercicios;
import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        if(x%2 == 0) x++; 
        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x += 2;
        }
		
	}

}
