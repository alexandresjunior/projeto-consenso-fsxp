package treinaRecife;

import java.util.Scanner;

public class Exercicio16 {
public static void main(String[] args) {
	System.out.println("hello world");
	Scanner sc = new Scanner(System.in);
    double popA = sc.nextDouble();
    double popB = sc.nextDouble();
    sc.close();
    
    int anos = 0;
    double rateA = 0.03;
    double rateB = 0.015;
    while (popA <= popB) {
        popA += popA * rateA;
        popB += popB * rateB;
        anos++;
    }
    System.out.println(anos+"anos");
}}