/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 1: Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
*/
import java.util.Scanner;

public class TP01Ex01 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a altura do retangulo: ");
		double altura = ler.nextDouble();
		
		System.out.print("Digite a base do retangulo: ");
		double base = ler.nextDouble();
		
		System.out.println("A area do retangulo: " + (altura*base));
	}
}
