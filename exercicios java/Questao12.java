import java.util.Scanner;
public class Questao12 {
    /*Neste problema, você deverá ler 3 palavras que definem o tipo de animal
possível segundo o esquema abaixo, da esquerda para a direita. Em seguida
conclua qual dos animais seguintes foi escolhido, através das três palavras
fornecidas. */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println(" Insira a 1° palavra:");
        String p1 = entrada.next();

        System.out.println(" Insira a 2° palavra:");
        String p2 = entrada.next();

        System.out.println(" Insira a 3° palavra:");
        String p3 = entrada.next();

        if (p1.equalsIgnoreCase("vertebrado")){
            if(p2.equalsIgnoreCase("ave")){
                if(p3.equalsIgnoreCase("carnivoro")){
                    System.out.println("aguia");
                }else{
                    System.out.println("pomba");
                }
            }else{
                if(p3.equalsIgnoreCase("onivoro")){
                    System.out.println("homem");
                }else{
                    System.out.println("vaca");
                }
            }
        }else{
            if(p2.equalsIgnoreCase("inseto")){
                if(p3.equalsIgnoreCase("hematofago")){
                    System.out.println("pulga");
                }else{
                    System.out.println("lagarta");
                }
            }else{
                if(p3.equalsIgnoreCase("hematofago")){
                    System.out.println("sanguessuga");
                }else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}
