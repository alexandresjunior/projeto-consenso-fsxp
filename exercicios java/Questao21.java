import java.util.Scanner;
public class Questao21 {
    /*João e Maria estão querendo obter informações sobre Os carros da sua cidade.
Para isso eles pediram que você escrevesse um programa para ajudá-los. Eles vão
digitar Informações de três diferentes carros. Para cada carro serão lidos o ano e a
velocidade. O programa deve exibir, o ano do carro mais novo e a velocidade do
mais rápido */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Insira o ano do 1° carro:");
        int ano1 = entrada.nextInt();
        System.out.println("Insira a velocidade do 1° carro:");
        double vel1 = entrada.nextDouble();
        System.out.println("Insira o ano do 2° carro:");
        int ano2 = entrada.nextInt();
        System.out.println("Insira a velocidade do 2° carro:");
        double vel2 = entrada.nextDouble();
        System.out.println("Insira o ano do 3° carro:");
        int ano3 = entrada.nextInt();
        System.out.println("Insira a velocidade do 3° carro:");
        double vel3 = entrada.nextDouble();
        
        int Mnovo;
        if(ano1>ano2 && ano1>ano3){
            Mnovo = ano1;
            System.out.println(" O carro mais novo é o: " + ano1);
        }
        else if (ano2>ano1 && ano2>ano3){
            Mnovo = ano2;
            System.out.println(" O carro mais novo é o: " + ano2);
        }else{
            Mnovo = ano3;
            System.out.println(" O carro mais novo é o: " + ano3);
        }

        double Mvel;
        if(vel1>vel2 && vel1>vel3){
            Mvel = vel1;
            System.out.println(" O carro de maior velocidade é o: " + vel1);
        }
        else if (vel2>vel1 && vel2>vel3){
            Mvel = vel2;
            System.out.println(" O carro de maior velocidade é o: " + vel2);
        }else{
            Mvel = vel3;
            System.out.println(" O carro de maior velocidade é o: " + vel3);
        }

    }

}
