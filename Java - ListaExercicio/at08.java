import java.util.Scanner;

public class at08 {
    
    public static void main(String [] args) {

        Scanner impostoRenda = new Scanner(System.in);
        
        System.out.println("Insira o valor do seu salário:");
        double rendaHomem = impostoRenda.nextDouble();

        System.out.println("Insira o valor do seu salário:");
        double rendaMulher = impostoRenda.nextDouble();

        double rendaConjunta = rendaHomem + rendaMulher;
        double aliquota = 0;


		if (rendaConjunta <= 900.0) {
			aliquota = 0;
		} else if (rendaConjunta >= 900.01 && rendaConjunta <= 1500.0) {
			aliquota = 10;	
		} else if (rendaConjunta >= 1500.01 && rendaConjunta <= 2500.0) {
			aliquota = 15;
		} else if (rendaConjunta >= 2500.01) {
            aliquota = 25;
        }

        double impostoDeRenda =  (rendaConjunta*aliquota)/100;
        double rendaLiquida = rendaConjunta - impostoDeRenda;
		
		System.out.println("Renda Conjunta:" + rendaConjunta);
        System.out.println("Aliquota:" + aliquota + "%");
        System.out.println("Imposto de Renda:" + impostoDeRenda);
        System.out.println("Renda Líquida:" + rendaLiquida);

    
        impostoRenda.close();
	}

}

