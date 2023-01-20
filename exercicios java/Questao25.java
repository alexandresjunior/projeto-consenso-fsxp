import java.util.Scanner;
public class Questao25 {
    /*Dada a entrada, descubra se o aluno ficou com 0 ou o seu trabalho será avaliado.
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira 0 se o trabalho não possui e 1 se possui.");
        System.out.println("Interfce Gráfica:");
        int IG = entrada.nextInt();
        
        System.out.println("Inteligência Artificial:");
        int IA = entrada.nextInt();

        System.out.println("Encapsulamento:");
        int Enc = entrada.nextInt();
        
        System.out.println("Indentação:");
        int Id = entrada.nextInt();

        System.out.println("Uso de structs:");
        int Stru = entrada.nextInt();
    
        if(IG == 1 || IA == 1){
            if(Enc == 1 && Id == 1){
                if(Stru == 1){
                    System.out.println("Avaliado");
                }else{
                    System.out.println("0 (zero)");
                }        
            }else{
                System.out.println("0 (zero)");
            }
        }else{
            System.out.println("0 (zero)");
        }
    }
}