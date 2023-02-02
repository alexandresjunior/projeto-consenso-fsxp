import java.util.Scanner;

public class Questao12 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String opcao;
        System.out.println("digite um opção de animal: ele é vertebrado ou invertebrado?");
        opcao = entrada.nextLine();

        switch(opcao.toLowerCase()){
           case "vertebrado":
                System.out.println("esse animal é uma ave ou mamifero? ");
                opcao = entrada.nextLine();
                if(opcao.equalsIgnoreCase("ave")){
                    System.out.println("esse animal é carnivoro ou onivoro? ");
                    opcao = entrada.nextLine();

                    if(opcao.equalsIgnoreCase("carnivoro")){
                        System.out.println("seu animal é a águia");

                    }else if(opcao.equalsIgnoreCase("onivoro")){
                        System.out.println("seu animal é um pombo");

                    }else{
                        System.out.println("animal invalido");
                    }
                }else if(opcao.equalsIgnoreCase("mamífero")){
                    System.out.println("esse animal é herbívoro ou onivoro? ");
                    opcao = entrada.nextLine();

                    if(opcao.equalsIgnoreCase("onivoro")){
                        System.out.println("seu animal é o homem");

                    }else if(opcao.equalsIgnoreCase("herbivoro")){
                        System.out.println("seu animal é um vaca");

                    }else{
                        System.out.println("animal invalido");
                    }
                }
            break; 

            case "invertebrado":
            System.out.println("esse animal é uma inseto ou anelideo? ");
            opcao = entrada.nextLine();

            if(opcao.equalsIgnoreCase("inseto")){
                System.out.println("esse animal é hematofago ou herbivoro? ");
                opcao = entrada.nextLine();

                if(opcao.equalsIgnoreCase("hematofago")){
                    System.out.println("seu animal é a pulga");

                }else if(opcao.equalsIgnoreCase("herbivoro")){
                    System.out.println("seu animal é um largata");

                }else{
                    System.out.println("animal invalido");
                }

            }else if(opcao.equalsIgnoreCase("analideo")){
                System.out.println("esse animal é hematofago ou onivoro? ");
                opcao = entrada.nextLine();

                if(opcao.equalsIgnoreCase("onivoro")){
                    System.out.println("seu animal é o minhoca");

                }else if(opcao.equalsIgnoreCase("hematofago")){
                    System.out.println("seu animal é um sanguessuga");

                }else{
                    System.out.println("animal invalido");
                }
            }       
            
            break;


        }

        entrada.close();
    }

}
