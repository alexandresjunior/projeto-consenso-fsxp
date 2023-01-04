import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        calcDiv(a);
    }
    public static void calcDiv(int a){
            int r = (a / 100);
            System.out.println(r+" notas(s) de R$ 100,00");
            a = a - (r*100);
            r = (a / 50);
            System.out.println(r+" notas(s) de R$ 50,00");
            a = a - (r*50);
            r = (a / 20);
            System.out.println(r+" notas(s) de R$ 20,00");
            a = a - (r*20);
            r = (a / 10);
            System.out.println(r+" notas(s) de R$ 10,00");
            a = a - (r*10);
            r = (a / 5);
            System.out.println(r+" notas(s) de R$ 5,00");
            a = a - (r*5);
            r = (a / 2);
            System.out.println(r+" notas(s) de R$ 2,00");
            a = a - (r*2);
            r = (a / 1);
            System.out.println(r+" notas(s) de R$ 1,00");
    }
}
