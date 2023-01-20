import java.util.Locale;
import java.util.Scanner;

public class Questao23 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- ");
		int i = sc.nextInt();
		System.out.println("- ");
		int j = sc.nextInt();
		
		if(i > j) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		if(i == j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(i < j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(i != j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(i >= j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
		if(i <= j) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}
	sc.close();
		
	}

}
