/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 6: Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
*/
import java.util.Scanner;

public class TP01Ex06 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double v1 = ler.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double v2 = ler.nextDouble();
		System.out.print("Digite o terceiro valor: ");
		double v3 = ler.nextDouble();
		System.out.print("Digite o quarto valor: ");
		double v4 = ler.nextDouble();
		
		double media = (v1 + v2 + v3 + v4)/4;
		
		System.out.println("Media aritmetica dos valores: " + media);
	}
}