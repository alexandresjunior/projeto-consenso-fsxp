import java.util.Scanner;
public class Questao20 {
    /*O programa deve imprimir uma mensagem de erro caso o bairro
digitado seja inválido. Além disso, caso a renda da pessoa caia fora das faixas da
tabela, não haverá desconto. Se a renda OU o consumo forem valores negativos,
deve ser emitida uma mensagem de erro.
 */

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o código do bairro:");
        String bairro = entrada.next();

        System.out.println("Insira o valor da sua renda:");
        double renda = entrada.nextDouble();

        System.out.println("Insira seu consumo energético em reais:");
        double consumo = entrada.nextDouble();

        if(renda < 0 || consumo < 0) {
            System.out.println(" A renda e o consumo não podem ser negativos!");
        } else if(bairro.equalsIgnoreCase("S")){
            if(renda > 50 && renda <= 500){
                consumo -= 50;
            }else if(renda > 500 && renda <= 1000){
                consumo -= 25;
            }
                System.out.println(consumo);
            
        }else if(bairro.equalsIgnoreCase("I")){
            if(renda > 240 && renda <= 1000 ){
                consumo -= 240;
            }else if(renda > 1000 && renda >= 5000){
                consumo -= 120;
            }
                System.out.println(consumo);
            
        }else if (bairro.equalsIgnoreCase("T")){
            if(renda > 5000 && renda <= 10000){
                consumo -= 720;
            }else if(renda > 10000 && renda <= 20000){
                consumo -= 360;
            }
                System.out.println(consumo);
        }else{
                System.out.println("Valor inválido");
            }
        
    }
    
    }

