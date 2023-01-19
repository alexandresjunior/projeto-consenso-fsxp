package javaExercicios;
import java.math.BigInteger; //A classe BigInteger é usada para operações matemáticas que envolvem cálculos de inteiros muito grandes
import java.util.Scanner;

public class Exercicio46 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        BigInteger m, n;
	        while (sc.hasNext()) {
	            m = sc.nextBigInteger();
	            n = sc.nextBigInteger();
	            BigInteger fatorialM = BigInteger.valueOf(1);
	            BigInteger fatorialN = BigInteger.valueOf(1);
	            for (int i = m.intValue(); i > 0; i--) {
	                fatorialM = fatorialM.multiply(BigInteger.valueOf(i));
	            }
	            for (int i = n.intValue(); i > 0; i--) {
	                fatorialN = fatorialN.multiply(BigInteger.valueOf(i));
	            }
	            System.out.println(fatorialM.add(fatorialN));
	        }
	    }
	}
