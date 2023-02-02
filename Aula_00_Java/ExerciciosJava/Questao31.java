
import java.util.Scanner;

public class Questao31 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        double nota1,nota2;

        while(true){
            System.out.println("Digite a primeira nota do aluno: ");
            nota1 = entrada.nextDouble();
            if(nota1 <= 10 && nota1>=0){
                break;
            }else{
                System.out.println("nota invalida");
            }
        }  
        while(true){
            System.out.println("Digite a segunda nota do aluno: ");
            nota2 = entrada.nextDouble();
            if(nota2 <= 10 && nota2>=0){
                break;
            }else{
                System.out.println("nota invalida");
            }
        }
        entrada.close();
        System.out.println("MEDIA = " +(nota1 + nota2)/2);
        
    }
    
}
