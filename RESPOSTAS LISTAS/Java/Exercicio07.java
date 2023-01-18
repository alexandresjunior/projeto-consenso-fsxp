import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor = in.nextInt();

        int[] divisor = { 100, 50, 20, 10, 5, 2, 1 };
        int[] notas = { 0, 0, 0, 0, 0, 0, 0};
        int i = 0, result = valor;

        in.close();

        System.out.println(valor);

        while (valor >= 1){
            if (valor < divisor[i]) {           //se o valor for menor que a nota atual...
                i++;                            //...pega a proxima nota menor
            } else { 
                result = valor / divisor[i];    //variavel para salvar o numero de notas
                notas[i] = result;              //salvando resultado da divisao para ser mostrada posteriormente
                valor = valor % divisor[i];     //atualiza valor com resto do troco a ser repartido
            }
        }

        int contforeach = 0;  //um contador para conseguir percorrer os indexes do array divisor
        for(int qtd_notas : notas){
            System.out.println(qtd_notas + " nota(s) de R$ " + divisor[contforeach] + ",00");
            contforeach++;
        }
    }
}
