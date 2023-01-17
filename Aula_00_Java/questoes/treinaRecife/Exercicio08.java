package treinaRecife;
import java.util.Scanner;


public class Exercicio08 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("coloque a renda do homem ");
        double rendaHomem = sc.nextDouble();
        System.out.print("coloque a renda da mulher ");
        double rendaMulher = sc.nextDouble();
        
        double rendaConjunta = rendaHomem + rendaMulher;
        double aliquot = 0;
        double ir = 0;
        sc.close();
        if (rendaConjunta <= 900) {
            aliquot = 0;
        } else if (rendaConjunta > 900 && rendaConjunta <= 1500) {
            aliquot = 0.1;
            ir = (rendaConjunta - (rendaConjunta*aliquot));
        } else if (rendaConjunta > 1500 && rendaConjunta <= 2500) {
            aliquot = 0.15;
            ir = (rendaConjunta - (rendaConjunta*aliquot));
        } else if (rendaConjunta > 2500) {
            aliquot = 0.25;
            ir = (rendaConjunta - (rendaConjunta*aliquot));
        }
        
        double impostoDeRenda = rendaConjunta - ir;
        
        System.out.println("renda conjunta: " + rendaConjunta);
        System.out.println("Aliquota utilizada: " + aliquot*100 + "%");
        System.out.println("imposto de renda: " + impostoDeRenda);
        System.out.println("renda liquida: " + ir);
    }
}
