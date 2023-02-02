import java.util.Scanner;

public class Exer50 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        entrada.close();
        String str1 = Integer.toString(a);
        int b = resultado(str1);
        System.out.println(b);
        }
    static public int resultado(String a){
        boolean r = false;
        int valor = 0;
        if(a.contains("4") || a.contains("13")){
            while(r = false){
                String x = Integer.toString(valor);
                if(a.contains("4") || a.contains("13")){
                    int c = valor;
                    valor++;
                }
                else{
                    r = true;
                }
            }
        }
        return valor;
    }
}

