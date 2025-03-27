/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 4: A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
*/
import java.util.Scanner;

public class TP01Ex04 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a base do triangulo: ");
		double base = ler.nextDouble();
		
		System.out.print("Digite a altura do triangulo: ");
		double altura = ler.nextDouble();
		
		System.out.println("A area do quadrado: " + (base*altura)/2);
	}
}
