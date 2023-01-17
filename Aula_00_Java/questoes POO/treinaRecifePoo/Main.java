package treinaRecifePoo;

public class Main {
	public static void main(String[] args) {
		Transporte t1 = new Transporte(01, 1900, "cax",10, 1);
		
		System.out.println(t1.consumo());
		System.out.println(t1.leiaModelo());
		Transporte t2 = new Transporte();
		System.out.println(t2);
	}
}
