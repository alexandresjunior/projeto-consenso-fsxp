import java.util.Scanner;
public class Exercicio45 {

public static void main(String[] args) {
      
    String nome1, nome2, nome3, nome4, nome5;
    float idade1 , idade2, idade3, idade4, idade5;
    

Scanner entrada = new Scanner(System.in);
System.out.println("Insira o seu nome:");
nome1 = entrada.nextLine();

System.out.println("Insira a sua idade:");
idade1 = entrada.nextFloat();

System.out.println("Insira o seu nome:");
nome2 = entrada.next();

System.out.println("Insira a sua idade:");
idade2 = entrada.nextFloat();

System.out.println("Insira o seu nome:");
nome3 = entrada.next();

System.out.println("Insira a sua idade:");
idade3 = entrada.nextFloat();

System.out.println("Insira o seu nome:");
nome4 = entrada.next();

System.out.println("Insira a sua idade:");
idade4 = entrada.nextFloat();

System.out.println("Insira o seu nome:");
nome5 = entrada.next();

System.out.println("Insira a sua idade:");
idade5 = entrada.nextFloat();

    if ((idade1 > idade2) && (idade1 > idade3) && (idade1 > idade4) && (idade1 > idade5))
        System.out.println("MAIOR IDADE: " + idade1);
    
    else if ((idade2 > idade1) && (idade2 > idade3) && (idade2 > idade4) && (idade2 > idade5))
        System.out.println("MAIOR IDADE: " + idade2);
    
    else if ((idade3 > idade1) && (idade3 > idade2) && (idade3 > idade4) && (idade3 > idade5))
    System.out.println("MAIOR IDADE: " + idade3);
    
    else if ((idade4 > idade1) && (idade4 > idade2) && (idade4 > idade3) && (idade4 > idade5))
        System.out.println("MAIOR IDADE: " + idade1);

    else if ((idade5 > idade1) && (idade5 > idade2) && (idade5 > idade3) && (idade5 > idade4))
    System.out.println("MAIOR IDADE: " + idade1);



if ((idade1 < idade2) && (idade1 < idade3) && (idade1 < idade4) && (idade1 < idade5))
    System.out.println("Nome da pessoa mais nova: " + nome1);

else if ((idade2 < idade1) && (idade2 < idade3) && (idade2 < idade4) && (idade2 < idade5))
    System.out.println("Nome da pessoa mais nova: " + nome2);

else if ((idade3 < idade2) && (idade3 < idade1) && (idade3 < idade4) && (idade3 < idade5))
    System.out.println("Nome da pessoa mais nova: " + nome3);

else if ((idade4 < idade2) && (idade4 < idade3) && (idade4 < idade1) && (idade4 < idade5))
    System.out.println("Nome da pessoa mais nova: " + nome4);

else if ((idade5 < idade2) && (idade5 < idade3) && (idade5 < idade4) && (idade5 < idade1)){
    System.out.println("Nome da pessoa mais nova: " + nome5);
}
entrada.close();
}
}
