import java.util.Scanner;

public class at12 {
    
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira primeira palavra:");
        String dica1 = entrada.nextLine();

        System.out.println("Insira segunda palavra:");
        String dica2 = entrada.nextLine();

        System.out.println("Insira terceira palavra:");
        String dica3 = entrada.nextLine();



       if (dica1.equalsIgnoreCase("vertebrado")) {
			if (dica2.equalsIgnoreCase("ave")) {
				if (dica3.equalsIgnoreCase("carnivoro")) {
						System.out.println("aguia");
				} else {
						System.out.println("pomba");
					}
				} else {
					if (dica3.equalsIgnoreCase("onivoro")) {
						System.out.println("homem");
					} else {
						System.out.println("vaca");
					}
				}
			} else {
				if (dica2.equalsIgnoreCase("inseto")) {
					if (dica3.equalsIgnoreCase("hematofago")) {
						System.out.println("pulga");
					} else {
						System.out.println("lagarta");
					}
				} else {
					if (dica3.equalsIgnoreCase("hematofago")) {
						System.out.println("sanguessuga");
					} else {
						System.out.println("minhoca");
					}			
            }

			entrada.close();
        }
    }
}