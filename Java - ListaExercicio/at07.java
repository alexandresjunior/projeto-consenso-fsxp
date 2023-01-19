import java.util.Scanner;

public class at07 {

    public static void main(String[] args){

        Scanner notasPossiveis = new Scanner(System.in);
        System.out.println("Insira o valor:");
        int cedulasInseridas = notasPossiveis.nextInt();
        int cedulaAtual = cedulasInseridas;
       

        int notas100 = cedulaAtual/100;
        cedulaAtual -= notas100 * 100;

        int notas50 = cedulaAtual/50;
        cedulaAtual -= notas50 * 50;

        int notas20 = cedulaAtual/20;
        cedulaAtual -= notas20 * 20;

        int notas10 = cedulaAtual/10;
        cedulaAtual -= notas10 * 10;

        int notas5 = cedulaAtual/5;
        cedulaAtual -= notas5 * 5;

        int notas2 = cedulaAtual/2;
        cedulaAtual -= notas2 * 2;

        int notas1 = cedulaAtual/1;
        cedulaAtual -= notas1 * 1;


        System.out.println(cedulasInseridas);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");


        notasPossiveis.close();
    }
    
}
