import java.util.Scanner;
public class Questao27 {
    /*Escreva um
programa que receba como entrada 4 quatro medições dos valores da taxa de
glicose de Genival, para cada valor informado informe NORMAL ou ALTERADA e ao
final calcule a glicose média observada naquele dia.
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int soma = 0;
        double media = 0;

        for(int i = 0; i < 4; i++){

            System.out.println("Insira o valor da taxa de glicose:");
            int glic = entrada.nextInt();

            if(glic <= 110){
                System.out.println(glic + " NORMAL");
                soma += glic;
            }else if (glic >110 && glic <= 125){
                System.out.println(glic + " ALTERADA");
                soma += glic;
            }if(glic > 125){
                System.out.println(glic + " MUITO ALTERADA");
                soma += glic;
            }
        }media = (soma / 4);
            System.out.println("MÉDIA: " + media);
     }
        
}