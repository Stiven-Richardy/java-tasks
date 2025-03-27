/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 14: Calcular e exibir o volume livre de um ambiente que contem uma esfera de raio
r inscrita em um cubo perfeito de aresta a. Os valores de r  e a serão
digitados.
*/
import java.util.Scanner;

public class TP01Ex14 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe a aresta do cubo: ");
		double a = ler.nextDouble();
		double volCubo = Math.pow(a, 3);
		
		System.out.print("Informe o raio da esfera: ");
		double r = ler.nextDouble();
		double volEsfera = 4*Math.PI*Math.pow(r, 3)/3; 
		double volLivre = volCubo - volEsfera;
		
		System.out.println("Volume livre: " + volCubo + "m3 ");
	}
}