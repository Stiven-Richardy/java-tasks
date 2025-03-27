/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 11: A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
*/
import java.util.Scanner;

public class TP01Ex11 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor do diametro do circulo: ");
		double diametro = ler.nextDouble();
		
		double circulo = Math.PI*(Math.pow((diametro/2), 2));
		
		System.out.println("A area do circulo e: " + circulo);
	}
}