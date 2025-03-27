/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 9: Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
*/
import java.util.Scanner;

public class TP01Ex09 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor da resistencia: ");
		double resistencia = ler.nextDouble();
		
		System.out.print("Digite o valor da corrente eletrica: ");
		double correnteEletrica = ler.nextDouble();
		
		double tensao = correnteEletrica * resistencia;
		
		System.out.println("A tensao no circuito e: " + tensao);
	}
}