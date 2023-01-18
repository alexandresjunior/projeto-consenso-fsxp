import java.util.Scanner;
public class Exercicio09 {
    public static void main (String[]args) {
        int HH , MM , SS;

        Scanner entrada = new Scanner(System.in) ;
	    System.out.println("Digite o valor de segundos: " );
        SS = entrada.nextInt();
        
        HH = SS/3600;
        SS %= 3600;
        
        MM = SS / 60;
        SS %= 60;
        
        System.out.print("HH:MM:SS= ");

        
        if ((HH <= 9) && (MM <=9) && (SS <= 9)){
            System.out.println("0"+HH+":0"+MM+":0"+SS);
        }
        else if ((HH <= 9) && (MM <=9) && (SS > 9)){
            System.out.println("0"+HH+":0"+MM+":"+SS);
        }
        else if ((HH <= 9) && (MM > 9) && (SS > 9)){
                System.out.println("0"+HH+":"+MM+":"+SS);
        }
        else if ((HH > 9) && (MM > 9) && (SS > 9)){
            System.out.println(HH+":"+MM+":"+SS);
        }
        else if ((HH <= 9) && (MM > 9) && (SS <= 9)){
            System.out.println("0"+HH+":"+MM+":0"+SS);
        }
        else if ((HH > 9) && (MM > 9) && (SS <= 9)){
            System.out.println(HH+":"+MM+":0"+SS);
        }
        else if ((HH > 9) && (MM <= 9) && (SS <= 9)){
            System.out.println(HH+":0"+MM+":0"+SS);
        }
        else if ((HH > 9) && (MM <= 9) && (SS <= 9)){
            System.out.println(HH+":0"+MM+":0"+SS);
        }
        entrada.close();
        
    }
    }
