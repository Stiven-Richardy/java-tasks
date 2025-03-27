/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 8: Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e dois metros e que um quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.
*/
import java.util.Scanner;

public class TP01Ex08 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite as milhas maritimas para conversao: ");
		double milhasMaritimas = ler.nextDouble();
		
		double km = milhasMaritimas * 1.852;
		
		System.out.println("Convertido para KM: " + km);
	}
}