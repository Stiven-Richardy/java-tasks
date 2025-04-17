/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES: 
 -> Stiven Richardy Silva Rodrigues
 -> Guilherme Mendes de Sousa
 EXERCICIO 2: Entrar via teclado com dez valores positivos. Consistir a digitação e enviar mensagem de
erro, se necessário. Após a digitação, exibir:
a. O maior valor;
b. A soma dos valores;
c. A média aritmética dos valores.
*/
import java.util.Scanner;

public class TP02Ex02 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int indMaior = 0;
		int soma = 0;
		int[] valores = new int [10];
		
		for (int ii = 0; ii < valores.length; ii++)
		{
		System.out.println("Informe o " + (ii+1) + "o número" );
		valores[ii] = ler.nextInt();
		}
		soma += valores[0];
		for (int ii = 1; ii < valores.length; ii++)
		{
			if(valores[ii] > valores[ii-1]) {
				indMaior = ii;
			}
			soma += valores[ii];
		}
		System.out.println("O maior número é: " + valores[indMaior]);
		double media = soma/valores.length;
		System.out.println("A soma é: " + soma);
		System.out.println("A média é: " + media);		
	}
}