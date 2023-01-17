
import java.util.Scanner;
import java.util.Arrays;

public class Questao45 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String [] nomes = new String[5];
        int [] idades = new int[5];
        double mediaIdade = 0;
        
        for(int i = 0; i<nomes.length;i++){
            System.out.println("Digite o seu nome: ");
            nomes[i] = entrada.next();

            System.out.println("Digite a sua idade: ");
            idades[i] = entrada.nextInt();
            mediaIdade+= idades[i];
        }
        entrada.close();
        
        int menorIdade= idades[0];
        
        String maisnovo = "";
        
        for(int x = 1; x < nomes.length;x++){
            if(menorIdade > idades[x]){
                menorIdade = idades[x];
                maisnovo = nomes[x];
            }
            
        }
        
        Arrays.sort(idades);

        System.out.println("Maior idade: " + idades[4] + 
        "\nNome da Pessoa mais nova: " + maisnovo + "\nMedia das idades " + (mediaIdade/5) );
        


    }

}
