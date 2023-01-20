import java.util.Scanner;
public class Questao40 {
    /* Elabore um programa que receba três números inteiros representando os
tamanhos dos lados de um triângulo. Verifique se os números informados formam
um triângulo, ou seja, cada um dos lados informados tem que ser menor que a soma
dos outros dois. Em caso positivo informar qual tipo de triângulo seria formado:*/
    public static void main(String[] args) {	
        Scanner entrada = new Scanner(System.in);
      
        int a, b, c; 
          System.out.print("Verificador de Triângulo\n");
    
    
        System.out.print("Digite o lado A=");
        a = entrada.nextInt(); 
        
        System.out.print("Digite o lado B=");
        b = entrada.nextInt(); 
        
        System.out.print("Digite o lado C=");
       c = entrada.nextInt(); 
    
    
        if( a < b + c && b < a + c && c < a + b ){ 
            if(a==b && b == c){
                System.out.print("Equilátero.");
            }else if(a==b || a==c || b==c){ 
                System.out.print("Isósceles.");
            }else{ 
                System.out.print("Escaleno.");
            }
        }else{
            System.out.print("Não formam um triângulo");
        }
    
    }
}
