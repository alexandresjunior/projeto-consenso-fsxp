package de_21_a_30;

import java.util.Locale;
import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		/*
		 * A empresa local de abastecimento de água, a Saneamento Básico da Cidade
(SBC), está promovendo uma campanha de conservação de água, distribuindo
cartilhas e promovendo ações demonstrando a importância da água para a vida e
para o meio ambiente. Para incentivar mais ainda a economia de água, a SBC
alterou os preços de seu fornecimento de forma que, proporcionalmente, aqueles
clientes que consumirem menos água paguem menos pelo metro cúbico.
Todo cliente paga mensalmente uma assinatura de R$ 7, que inclui uma franquia de
10 m3 de água. Isto é, para qualquer consumo entre 0 e 10 m3
, o consumidor paga a
mesma quantia de R$ 7 reais (note que o valor da assinatura deve ser pago mesmo
que o consumidor não tenha consumido água). Acima de 10 m3
, cada metro cúbico
subsequente tem um valor diferente, dependendo da faixa de consumo. A SBC
cobra apenas por quantidades inteiras de metros cúbicos consumidos. A tabela
abaixo especifica o preço por metro cúbico para cada faixa de consumo:

Faixa de Consumo (m3
) Preço (por m3
)
até 10		
11 a 30
31 a 100
100 em diante
incluído na franquia
R$ 1
R$ 2
R$ 5
Assim, por exemplo, se o consumo foi de 120 m3
, o valor da conta é:
● 7 reais da assinatura básica;
● 20 reais pelo consumo no intervalo 11 — 30 m3
;
● 140 reais pelo consumo no intervalo 31 — 100 m3
;
● 400 reais pelo consumo no intervalo 101 — 120 m3
.
Logo, o valor total da conta de água é R$ 267. Tarefa Escreva um programa que,
dado o consumo de em m3
, calcula o valor da conta de água daquela residência
		 * */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("- "); 
		int n = sc.nextInt();
		int i = 0;			
		double gasto = 0;
			
		
		if(n <= 10) {
			gasto = 7;
		} else if (n <= 30) {
			gasto = 7 + (n - 10);
		} else if (n <= 100) {
			gasto = 7 + (n - 20) + (n - 30)*2;
		} else {
			gasto = 7 + (n-20) + (n-30)*2 + (n-100)*3;
		}
		
		System.out.println("Valor em reais = R$ " + gasto);
	}

}
