import java.util.Scanner;

public class Questao15 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int x = entrada.nextInt(),numeroAtual = 1,numeroAnterior = 0, proximoNumero;

        for(int i = 1;i <= x;i++){
            if(i == x){
                System.out.println(numeroAnterior);
            }else{
                System.out.print(numeroAnterior +" ");
            }
            proximoNumero = numeroAtual + numeroAnterior;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
            

        }
        
        entrada.close();
    }

}
