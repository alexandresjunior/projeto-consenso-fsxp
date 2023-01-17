
import java.util.Scanner;

public class Questao43 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int notas = 0;

        System.out.println("Digite o valor da compra");
        int compra = entrada.nextInt();

        System.out.println("digite o dinheiro dado pelo cliente: ");
        int pago = entrada.nextInt();
        
        entrada.close();
    
        
        pago -= compra;
        while(true){

            if(pago >= 100){
                pago-=100;
                notas++;
            }else if(pago >= 50){
                pago-=50;
                notas++;
            }else if(pago>=20){
                pago-=20;
                notas++;
            }else if(pago>=10){
                pago-=10;
                notas++;
            }else if(pago>=5){
                pago-=5;
                notas++;
            }else if(pago>=2){
                pago-=2;
                notas++;
            }else{
                break;
            }
        }
        if(notas % 2 == 0){
            System.out.println("É POSSIVEL");
        }else{
            System.out.println("É IMPOSSIVEL");
        }


    }

}
