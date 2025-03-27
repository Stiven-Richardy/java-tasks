/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 7: Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.
*/
import java.util.Scanner;

public class TP01Ex07 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double v1 = ler.nextDouble();
		System.out.print("Digite o segundo valor: ");
		double v2 = ler.nextDouble();
		
		double media = Math.sqrt(v1*v2);
		
		System.out.println("Media aritmetica dos valores: " + media);
	}
}