package TreinaRecifePoo03;

public class Main {
	public static void main(String[] args) {
		
		meioDeTransporte t1 = new meioDeTransporte();
		t1.setCarga_maxima(20);
		t1.setPotencia(10);
		t1.setId(02);
		
		System.out.println(t1.consumo());
	}
}
