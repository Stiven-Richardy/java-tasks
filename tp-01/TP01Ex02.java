/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 2: Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
*/
import java.util.Scanner;

public class TP01Ex02 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor da aresta do quadrado: ");
		double aresta = ler.nextDouble();
		
		System.out.println("A area do quadrado: " + (aresta*aresta));
	}
}
