public class Questao35 {

	public static void main(String[] args) {
		
		double s = 0;
		int i = 1;
		int j = 1;
		System.out.print("S = ");
		while(i <= 39) {
			s += i / j;
			System.out.println(i+"/"+j);
			i += 2;
			j *= 2;
		}
		System.out.println();
		System.out.println("= "+ s);

        
	}

}
