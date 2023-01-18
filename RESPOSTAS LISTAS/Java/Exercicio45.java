import java.util.Arrays;
import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nomes = new String[5];
        int[] idades = new int[5];
        int menor_atual = 0;
        String menor_idade = ""; 
        double soma = 0;
        
        for(int i = 0; i < idades.length; i++){
            String[] entrada = in.nextLine().split(" ");
            nomes[i] = entrada[0];
            idades[i] = Integer.parseInt(entrada[1]); 
            
            if(i == 0){
                menor_atual = idades[i];
            }
            if(idades[i] < menor_atual){
                menor_atual = idades[i];
                menor_idade = nomes[i];
            }
            soma += idades[i];
        }
        
        in.close();
        Arrays.sort(idades);

        System.out.println("Maior idade = " + idades[4]);
        System.out.println("Nome da pessoa mais nova = " + menor_idade);
        System.out.println("Média das idades = " + soma/5);

    }
}
