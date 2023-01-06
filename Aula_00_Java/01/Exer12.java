import java.util.Scanner;

public class Exer12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String a = entrada.nextLine();
        String b = entrada.nextLine();
        String c = entrada.nextLine();
        entrada.close();
        responder(a, b, c);
    }
    public static void responder(String a, String b, String c){
        switch(a){
            case "vertebrado":
                switch(b){
                    case "ave":
                        switch (c){
                            case "carnivoro": System.out.println("águia"); break;
                            case "onivoro": System.out.println("pomba"); break;
                            default: System.out.println("erro");
                        }
                        break;
                    case "mamifero":
                        switch (c){
                            case "onivoro": System.out.println("home"); break;
                            case "herbivoro": System.out.println("vaca"); break;
                            default: System.out.println("erro");
                        }
                        break;
                    default: System.out.println("erro");
                }
                break;
            
            case "invertebrado":
                switch(b){
                    case "inseto":
                        switch(c){
                            case "hematofago": System.out.println("pulga"); break;
                            case "herbívoro": System.out.println("lagarta"); break;
                            default: System.out.println("erro");
                        }
                        break;
                    case "anelideo":
                        switch(c){
                            case "hematifago": System.out.println("sanguessuga"); break;
                            case "onivoro": System.out.println("minhoca"); break;
                            default: System.out.println("erro");
                        }
                        break;
                    default: System.out.println("erro");
                }
                break;
            default:
                System.out.println("erro");
        }
    }
}