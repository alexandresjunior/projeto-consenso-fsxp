import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int x = in.nextInt();
        int y = in.nextInt();
       
        int cont = 1;
        for(int i = 1; i <= y; i++){ // cont = 4  / i = 5
            if(cont == x){
                System.out.println(i); //4
                cont = 1;
            }else if(i == y){ //pra tirar o espaço no final da ultima linha
                System.out.print(i);
            }else{
                System.out.print(i + " "); // 1 2 3 
                cont++;
            }
        }
        in.close();
    }
}
