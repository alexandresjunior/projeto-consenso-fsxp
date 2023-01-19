import java.util.Scanner;

public class at16 {
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);
    double popa, popb;
    int ano = 0;

    System.out.println("População do país A:");
    popa = entrada.nextDouble();

    System.out.println("População do país B:");
    popb = entrada.nextDouble();

    while(popa<=popb){
        popa = popa + (popa* 3)/100;
        popb = popb + (popb* 1.5)/100;
        ano++;
    }

    System.out.println(ano + " anos");

    entrada.close();
    

}
}
