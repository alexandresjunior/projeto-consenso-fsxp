import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);        
        int n = in.nextInt();
        int[] arr = new int[n];
        in.close();
        
        if(0<n && n<46){
            for(int i = 0; i < n; i++){
                if(i < 2){
                    arr[i] = i;
                }else{
                    arr[i] = arr[i-2]+arr[i-1];
                }
            }
        }

        for(int numero:arr){
            System.out.print(numero + " ");
        }
    }
}
