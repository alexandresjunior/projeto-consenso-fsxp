import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int d = entrada.nextInt();
        entrada.close();
        calAMD(d);
    }
    public static void calAMD(int d){
        int a = d / 365;
        int ma = d % 365;
        int m = ma / 30;
        int ddm = ma % 30;
        System.out.println(a + " ano (s)\n" + m + " mês (es)\n" + ddm +" dia (s)");
    }

}
