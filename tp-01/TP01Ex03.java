/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 3: Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.
*/
import java.util.Scanner;

public class TP01Ex03 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor da diagonal do quadrado: ");
		double diagonal = ler.nextDouble();
		
		System.out.println("A area do quadrado: " + (diagonal*diagonal)/2);
	}
}
