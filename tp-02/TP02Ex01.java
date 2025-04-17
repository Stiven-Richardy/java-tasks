/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 1: Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro. Caso contrário solicitar novamente apenas o segundo valor.
*/
import java.util.Scanner;

public class TP02Ex01 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double n1 = ler.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double n2 = ler.nextDouble();

		while (n2 <= n1) {
			System.out.print("O segundo numero deve ser maior que o primeiro. Digite novamente: ");
			n2 = ler.nextDouble();
		}
		
		System.out.println("Correto! " + n2 + " > " + n1);
	}
}
