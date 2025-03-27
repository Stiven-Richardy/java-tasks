/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 17: Entrar via teclado com dois valores quaisquer 'X' e 'Y'. Calcular e exibir o calculo XY ('X' elevado a 'Y'). Pesquisar as funcoes Exp e Ln. Lembre-se que uma funcao trigonometrica trabalha em radianos.
*/
import java.util.Scanner;

public class TP01Ex17 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor de X: ");
		double x = ler.nextDouble();
		
		System.out.print("Informe o valor de Y: ");
		double y = ler.nextDouble();
		
		double result = Math.exp(y * Math.log(x));

		System.out.println("O resultado do calculo XY: " + result);
	}
}