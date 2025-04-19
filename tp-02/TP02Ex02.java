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
			while (valores[ii] <= 0) {
				System.out.print("Informe o numero " + (ii+1) + ": ");
				valores[ii] = ler.nextInt();

				if (valores[ii] <= 0) {
					System.out.println("Valor invalido, digite um numero positivo.");
				}
			}
		}
		
		soma += valores[0];

		for (int ii = 1; ii < valores.length; ii++)
		{
			if(valores[ii] > valores[indMaior]) {
				indMaior = ii;
			}
			soma += valores[ii];
		}

		System.out.println("O maior numero e: " + valores[indMaior]);
		double media = soma/valores.length;
		System.out.println("A soma e: " + soma);
		System.out.println("A media e: " + media);		
		ler.close();
	}
}