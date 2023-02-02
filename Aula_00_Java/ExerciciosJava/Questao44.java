
import java.util.Scanner;
import java.util.Arrays;

public class Questao44 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double [] valores = new double[5];

        for(int i = 0; i < valores.length; i++){
            System.out.println("Digite um valor: ");
            valores[i] = entrada.nextDouble();
        }
        entrada.close();

        Arrays.sort(valores);

        double [] maiorPar = new double [5];
        double mediaIm = 0;
        int contaImpar = 0;

        for(int x = 0; x < valores.length;x++){
            if(valores[x] % 2 != 0){
                mediaIm+=valores[x];
                contaImpar++;
            }else{
                maiorPar[x] =valores[x];
            }
        }
        Arrays.sort(maiorPar);

        System.out.println("Média impares = " + (mediaIm/contaImpar) + "\nMaior número PAR = "
        + (maiorPar[4]) + "\nDiferença = " + (valores[4] - valores[0]));

    }

}
