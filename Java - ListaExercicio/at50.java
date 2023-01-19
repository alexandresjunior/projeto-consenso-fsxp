import java.util.ArrayList;
import java.util.Scanner;

public class at50 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int numero; 

        ArrayList<Integer> andares = new ArrayList<>(); 

        System.out.println("Insira um numero:");
        numero = entrada.nextInt();

        int atual = 1;
        while (andares.size() != numero) { 

            String ind = Integer.toString(atual);
            if (!ind.contains("4") && !ind.contains("13"))
                andares.add(atual); 
            atual++;
        }
        System.out.println(andares.get(andares.size() - 1));
        entrada.close();
    }

}
