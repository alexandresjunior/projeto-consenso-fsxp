package treinaRecife;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero!");
        int n = sc.nextInt();
        sc.close();
        
        int a = 0, b = 1, c;
        if (n > 0) {
            System.out.print(a);
        }
        if (n > 1) {
            System.out.print(" " + b);
        }
        for (int i = 2; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
}}