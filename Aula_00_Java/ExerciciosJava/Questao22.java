
import java.util.Scanner;

public class Questao22 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int contador = 11,primeiroIntervalo = 0,segundoIntervalo = 0, terceiroIntervalo = 0,conta = 7;
        
        System.err.println("digite o consumo de agua");
        int consumo = entrada.nextInt();
        
        entrada.close();

        
        while(contador<consumo){
            if(contador > 10 && contador <= 30 ){
                primeiroIntervalo++;
            }else if(contador > 30 && contador<=100){
                segundoIntervalo++;
            }else if(contador > 100){
                terceiroIntervalo++;
            }
            contador++;
        }
        /*for(int i = 10; i <= consumo;i++){
            if(i > 10 && i <= 30 ){
                primeiroIntervalo++;
            }else if(i > 30 && i<=100){
                segundoIntervalo++;
            }else if(i > 100){
                terceiroIntervalo++;
            }
        }*/
        if(segundoIntervalo > 0){
            segundoIntervalo --;
        }
        conta += (primeiroIntervalo * 1) + (segundoIntervalo * 2) + (terceiroIntervalo * 5);
        
        System.out.println(conta);

    }

}
