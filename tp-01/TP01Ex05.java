/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 5: Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
*/
import java.util.Scanner;

public class TP01Ex05 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o diametro da esfera: ");
		double diametro = ler.nextDouble();
		double raio = diametro/2;
		
		System.out.println("Volume da esfera: " + (4*Math.PI/3)*Math.pow(3, raio));
	}
}