import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String vert = in.nextLine();
        String tipo = in.nextLine();
        String tipo2 = in.nextLine();

        in.close();
        
        if(vert.equals("vertebrado")){
            if(tipo.equals("ave")){
                //OBS: algumas entradas com acento estão bugando, então adicionei ¡ no lugar do acento
                if(tipo2.equals("carnívoro") || tipo2.equals("carn¡voro")) System.out.println("águia");
                else System.out.println("pomba");   //é ave e onívoro
            }else{  //é mamífero
                if(tipo2.equals("onívoro") || tipo2.equals("on¡voro")) System.out.println("homem");
                else System.out.println("vaca");    //é mamifero e herbívoro
            }
        }else{ //é invertebrado
            if(tipo.equals("inseto")){
                if(tipo2.equals("hematofago")) System.out.println("pulga");
                else System.out.println("lagarta"); //é inseto e herbívoro
            }else{  //é anelídio
                if(tipo2.equals("hematofago")) System.out.println("sanguessuga");
                else System.out.println("minhoca"); //é anelídio e onívoro
            }
        }
    }
}
