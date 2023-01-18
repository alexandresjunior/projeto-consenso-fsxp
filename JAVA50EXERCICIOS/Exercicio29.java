public class Exercicio29 {
    public static void main(String[] args)  {
		int i=1, j=7;
		while (i < 10) {
			for (int k = 0; k < 3; k++) {
				System.out.println("I=" + i + " J=" + j);
				j--;
                if (j < 5){
                    j = 7;
                }
			}
			
			i= i * 3;
		}
	}
        





}
