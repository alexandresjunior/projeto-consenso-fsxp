
import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); 
        int nCem = 0,nCinquenta = 0,nVinte = 0,nDez = 0,nDois = 0,nUm = 0,valor,valorAmostra;

        System.out.println("Digite um valor: ");
        valor = entrada.nextInt();
        valorAmostra = valor;
        if(valor > 0 && valor < 1000000){
            while(valor>=100){
                valor-=100;
                nCem++;
            }
            while(valor>=50){
                valor-=50;
                nCinquenta++;
            }
            while(valor>=20){
                valor-=20;
                nVinte++;
            }
            while(valor>=10){
                valor-=10;
                nDez++;
            }
            while(valor>=2){
                valor-=2;
                nDois++;
            }
            while(valor>=1){
                valor-=1;
                nUm++;
            }

        }else{
            System.out.println("Valor invalido!");

        }
        System.out.println("\nValor:"+ valorAmostra +"\n" + nCem + "nota(s) de R$ 100,00\n" + 
        "\n" + nCinquenta + " nota(s) de R$ 50,00" + 
        "\n" + nVinte + " nota(s) de R$ 20,00" + 
        "\n" + nDez + " nota(s) de R$ 10,00" +
        "\n" + nDois + " nota(s) de R$ 2,00" +
        "\n" + nUm + " nota(s) de R$ 1,00");


       entrada.close();
    }
    

}
