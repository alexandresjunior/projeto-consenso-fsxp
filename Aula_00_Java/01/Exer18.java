import java.util.Scanner;

public class Exer18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        entrada.close();
        inverterNum(a);
    }
    public static void inverterNum(int valor){
        int valor1 = valor % 10;
        valor = valor - valor1;
        int valor2 = valor % 100;
        valor = valor - valor2;
        int valor3 = valor % 1000;
        valor = valor - valor3;
        int valor4 = valor / 1000;
        valor = valor - (valor4*1000);
        valor = valor1*1000 + valor2*10 + (valor3/10) + valor4;
        System.out.println(valor);
    }
}
