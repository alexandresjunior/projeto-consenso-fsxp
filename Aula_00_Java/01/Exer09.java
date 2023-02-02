import java.util.Scanner;

public class Exer09{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int s = entrada.nextInt();
        entrada.close();
        calcHMS(s);
    }
    public static void calcHMS(int s){
        int h = s / 3600;
        int r = s % 3600;
        int m = r / 60;
        int ss = r % 60;
        System.out.println("HH:MM:SS = "+h+":"+m+":"+ss);
    }
}