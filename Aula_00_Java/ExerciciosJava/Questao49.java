
import java.util.Scanner;

public class Questao49 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        float peso = entrada.nextFloat();
    
        System.out.println("Digite o sua altura: ");
        float altura = entrada.nextFloat();

        entrada.close();

        double imc = peso / Math.pow(altura, 2);

        if(imc < 20){
            System.out.println("IMC = " + imc + " Abaixo do peso");
        }else if(imc > 20 && imc <=25){
            System.out.println("IMC = " + imc + " peso Normal");
        
        }else if(imc > 25 && imc <=30){
            System.out.println("IMC = " + imc + " sobrepeso");

        }else if(imc > 30 && imc <40){
        System.out.println("IMC = " + imc + " obeso");
        }else{
            System.out.println("IMC = " + imc +" obeso morbido");
        }
    }
    
}
