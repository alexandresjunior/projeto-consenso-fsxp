import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float alc_tot = 0, gas_tot = 0, die_tot = 0;
        int alc_qtd = 0, gas_qtd = 0, die_qtd = 0;

        int cont = 0;
        while(cont != 5){
            int tipo = in.nextInt();
            float litros = in.nextFloat();
            
            switch (tipo) {
                case 1: //alcool
                    alc_tot += litros;
                    alc_qtd++;
                    break;
            
                case 2: //gasolina
                    gas_tot += litros;
                    gas_qtd++;
                    break;
                
                case 3: //diesel
                    die_tot += litros;
                    die_qtd++;
                    break;
            }
            cont++;
        }
        in.close();
        System.out.println("1. Álcool: " + alc_qtd + " - Qtd Litros: " + alc_tot + "\n2. Gasolina: " + gas_qtd + " - Qtd Litros: " + gas_tot + "\n3. Diesel: " + die_qtd + " - Qtd Litros: " + die_tot);
    }
}