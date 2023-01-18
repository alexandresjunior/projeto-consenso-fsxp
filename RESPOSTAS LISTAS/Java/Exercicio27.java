import java.util.Scanner;
public class Exercicio27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double media = 0;

        for(int i = 0; i < 4; i++){
            int nivel = in.nextInt();
            media += nivel;
            if(nivel < 110){
                System.out.println(nivel + " NORMAL");
            }else if(nivel >= 110 && nivel < 125){
                System.out.println(nivel + " ALTERADA");
            }else{
                System.out.println(nivel + " MUITO ALTA");
            }
        }
        System.out.println("MÉDIA DAS LEITURAS = " + media/4);
        in.close();
    }
}