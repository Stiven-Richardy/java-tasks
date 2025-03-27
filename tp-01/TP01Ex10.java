/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 10: Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
*/
import java.util.Scanner;

public class TP01Ex10 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor da temperatura (em graus Celsius): ");
		double celsius = ler.nextDouble();
		
		double fahrenheit = ((celsius * 9)/5) + 32;
		
		System.out.println("A tempetura em Fahrenheit e: " + fahrenheit);
	}
}