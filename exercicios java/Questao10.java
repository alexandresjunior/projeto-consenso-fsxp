import java.util.Scanner;
public class Questao10 {
    /* Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a
em anos, meses e dias. Obs: Apenas para facilitar o cálculo, considere todo ano
com 365 dias e todo mês com 30 dias.
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int anos, meses, dias;

        System.out.println("insira a idade em dias:");
        int D = entrada.nextInt();

        anos = D/365;
        meses = (D % 365) /30;
        dias = (D % 365) % 30;

        System.out.println(anos + " Ano (s)");
        System.out.println(meses + " Mês (es)");
        System.out.println(dias + " Dia (s)");
    }
}
