/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 13: Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso (em s) que serão digitados.
*/
import java.util.Scanner;

public class TP01Ex13 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a velocidade inicial: ");
		double v0 = ler.nextDouble();
		
		System.out.print("Informe a aceleracao: ");
		double a = ler.nextDouble();
		
		System.out.print("Informe o tempo: ");
		double t = ler.nextDouble();
		
		double vf = (v0 + a*t)/3.6;
		
		System.out.println("Velocidade final: " + vf + "km/h");
	}
}