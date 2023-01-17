
import java.util.Scanner;

public class Questao20 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o bairro do cliente: [S] Santa ana [I] Industriarios [T] Tabatinga");
        String bairro = entrada.nextLine();

        double renda,conta;
        switch(bairro.toLowerCase()){
            case "s":
                System.out.println("Digite a renda do usuario: ");
                renda = entrada.nextDouble();
                System.out.println("digite o valor da conta do usuario: ");
                conta = entrada.nextDouble();

                if(renda < 0 || conta <0){
                    System.out.println("Erro na operação, por favor digitar de novo");

                }else if(renda >= 50 && renda <= 500){
                    conta -= 50;
                    System.out.println(conta);

                }else if(renda > 500 && renda <= 1000){
                    conta -= 25;
                    System.out.println(conta);

                }else {
                    System.out.println(conta);
                }
            break;

            case "i":
                System.out.println("Digite a renda do usuario: ");
                renda = entrada.nextDouble();
                System.out.println("digite o valor da conta do usuario: ");
                conta = entrada.nextDouble();

                if(renda < 0 || conta <0){
                    System.out.println("Erro na operação, por favor digitar de novo");

                }else if(renda >= 240 && renda <= 1000){
                    conta -= 240;
                    System.out.println(conta);

                }else if(renda > 1000 && renda <= 5000){
                    conta -= 120;
                    System.out.println(conta);

                }else {
                    System.out.println(conta);
                }
            break;
            case "t":
                System.out.println("Digite a renda do usuario: ");
                renda = entrada.nextDouble();
                System.out.println("digite o valor da conta do usuario: ");
                conta = entrada.nextDouble();

                if(renda < 0 || conta < 0){
                    System.out.println("Erro na operação, renda ou conta não pode ser negativos,por favor digitar de novo");

                }else if(renda >= 5000 && renda <= 10000){
                    conta -= 720;
                    System.out.println(conta);

                }else if(renda > 10000 && renda <= 20000){
                    conta -= 360;
                    System.out.println(conta);

                }else {
                    System.out.println(conta);
                }
            break;

            default:
                System.out.println("Bairro invalido");
            break;
        }

        entrada.close();
    }

}
