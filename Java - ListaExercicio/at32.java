import java.util.Scanner;

public class at32 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int X = 0, Alcool = 0, Gasolina = 0, Disel = 0, contador = 0, y = 0;
        int w = 0;
        int z = 0;
        int somaw = 0;
        int somay = 0;
        int somaz = 0;

        while (contador < 5) {
            System.out.println("Tipo de combustível: ");
            X = entrada.nextInt();
            if (X == 1) {
                System.out.println("Quantidade de litros");
                y = entrada.nextInt();
                Alcool += 1;
                somay += y;
            } else if (X == 2) {
                System.out.println("Quantidade de litros");
                w = entrada.nextInt();
                Gasolina += 1;
                somaw += w;

            } else if (X == 3) {
                System.out.println("Quantidade de litros");
                z = entrada.nextInt();
                Disel += 1;
                somaz += z;
            }
            contador++;
        }
        System.out.println("Alcool: " + Alcool + " Quantidade de litros " + somay);
        System.out.println("Gasolina: " + Gasolina + " Quantidade de litros " + somaw);
        System.out.print("Diesel: " + Disel + " Quantidade de litros " + somaz);

        entrada.close();
    }
}
