import java.util.*;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        List numeros = new ArrayList<Integer>(); //usando arraylist para guardar os numeros

        while(cont < 3){
            int entrada = in.nextInt();
            numeros.add(entrada);   //adicionando à lista numeros o numero entrada
            cont++;
        }
        
        in.close();

        Collections.sort(numeros);  //ordenando a lista
        
        //for para percorrer a lista e printar        
        for(int i = 0; i < 3; i++){
            System.out.println(numeros.get(i));
        }
    }
}
