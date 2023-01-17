package treinaRecife;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("digite um numero");
        int x = sc.nextInt();
        
        sc.close();
        // garante que x é ímpar, caso contrário, incrementa 1
        if (x % 2 == 0) {
            x++;
        }
        
        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x += 2;
        }
    }
}	