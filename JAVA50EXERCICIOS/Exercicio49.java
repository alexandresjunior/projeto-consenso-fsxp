import java.util.Scanner;
public class Exercicio49 {
    public static void main (String args[]){
    float peso;
    float altura;
    float imc;

    Scanner entrada = new Scanner(System.in);
    System.out.println("Insira a sua altura: ");
    altura = entrada.nextFloat();
    System.out.println("Insira o seu peso: ");
    peso = entrada.nextFloat();


    imc = peso/(altura * altura);

    if (imc < 20){
       System.out.println("ABAIXO DO PESO");
    }
    else if ((imc >= 20) && (imc < 25)){
        System.out.println(imc + " PESO NORMAL");
     }
     else if ((imc >= 25) && (imc < 30)){
        System.out.println(imc + " SOBREPESO");
     }
     else if ((imc >= 30) && (imc < 40)){
        System.out.println(imc + " OBESO");
     }
     else{
        System.out.println(imc + " OBESO MÓRBIDO");
     }
     entrada.close();
 }
}