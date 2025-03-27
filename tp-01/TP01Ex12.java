/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 12: Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.
*/
import java.util.Scanner;

public class TP01Ex12 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a altura do cone: ");
		double altura = ler.nextDouble();
		
		System.out.print("Digite o raio da base do cone: ");
		double raio = ler.nextDouble();
		
		double volume = (altura * Math.PI * Math.pow(raio, 2))/3;
		
		System.out.println("O volume do cone e: " + volume);
	}
}