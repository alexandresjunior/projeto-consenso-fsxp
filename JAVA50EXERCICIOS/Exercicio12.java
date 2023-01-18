import java.util.Scanner;
public class Exercicio12 {
   
    public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    String palavra1;
    String palavra2;
    String palavra3;

    System.out.println("Digite a primeira palavra: ");
    palavra1 =entrada.nextLine();

    System.out.println("\nDigite a segunda palavra: ");
    palavra2 =entrada.nextLine();

    System.out.println("\nDigite a terceira palavra: ");
    palavra3 =entrada.nextLine();

    entrada.close();
 

    if (palavra1.equalsIgnoreCase("vertebrado")) {
       if (palavra2.equalsIgnoreCase("ave")){
            if  (palavra3.equalsIgnoreCase("carnívoro")){
                System.out.println("águia");
            }
            else if (palavra3.equalsIgnoreCase("onívoro")){
                System.out.println("pomba");
            }
            }
        else if (palavra2.equalsIgnoreCase("mamífero")){
            if  (palavra3.equalsIgnoreCase("onívoro")){
                System.out.println("homem");
            }
            else if (palavra3.equalsIgnoreCase("herbívoro")){
                System.out.println("vaca");
            }
            }
        }
    else if (palavra1.equalsIgnoreCase("invertebrado")) {
        if (palavra2.equalsIgnoreCase("inseto")){
            if  (palavra3.equalsIgnoreCase("hematofogo")){
                System.out.println("pulga");
            }
            else if (palavra3.equalsIgnoreCase("herbívoro")){
                System.out.println("lagarta");
            }
        else if (palavra2.equalsIgnoreCase("anelídeo")){
            if  (palavra3.equalsIgnoreCase("hematofogo")){
                System.out.println("sanguessuga");
            }
            else if (palavra3.equalsIgnoreCase("onívoro")){
                System.out.println("minhoca");
            }
            }
        }
        }
}
}