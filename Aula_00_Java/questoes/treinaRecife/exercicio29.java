package treinaRecife;

public class exercicio29 {
	public static void main(String[] args) {
        for(int i = 1; i < 9; i+=3){
            if(i <= 3){
                System.out.println("I = 1 J = 7");
                System.out.println("I = 1 J = 6");
                System.out.println("I = 1 J = 5");
            }
            else if(i <= 3*2){
                System.out.println("I = 3 J = 7");
                System.out.println("I = 3 J = 6");
                System.out.println("I = 3 J = 5");
            }
            else if(i <= 3*3){
                System.out.println("I = 9 J = 7");
                System.out.println("I = 9 J = 6");
                System.out.println("I = 9 J = 5");
            }
        }
    }
}
