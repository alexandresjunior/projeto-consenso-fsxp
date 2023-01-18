import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt(); // a logica do programa é como se na entrada fosse recebido um índice de um array, que por sua vez progride e adiciona apenas quando não contem 13 ou 4
        ArrayList<Integer> andares = new ArrayList<>(); //usando um arraylist pra não ser limitado a um tamanho fixo de um array

        int atual = 1; 
        while(andares.size() != numero){        //a ideia aqui é usar o tamanho do arraylist pra limitar o avanço do algoritmo
            String ind = Integer.toString(atual);
            if (!ind.contains("4") && !ind.contains("13"))  andares.add(atual);  //se nao contem, está liberado pra adicionar no arraylist. Se contemm avança sem fazer nada
            atual++;
        }
        System.out.println(andares.get(andares.size()-1));
        in.close();
    }
}
