import java.util.Scanner;

public class at22 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int consumo;
        int total = 0;

        System.out.println("Total de m3 consumidos: ");
        consumo = entrada.nextInt();

        if(consumo<=10){
            total =7;
        } else if(consumo>=11 && consumo<=30){
            total= 7 + (consumo-10)*1;
        } else if(consumo>=31 && consumo<=100){
            total= 7 + (consumo-10*1) + (consumo-30)*2;
        }else{
            total = 7 + (consumo-10*1 + (consumo-30)*2) + (consumo-100)*3;
        }
        System.out.println(total);

        entrada.close();
    }

}
