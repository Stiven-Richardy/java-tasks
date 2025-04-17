/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 3: Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente “S” ou “N” e encerrar o
programa em função dessa resposta.
*/
import java.util.Scanner;

public class TP02Ex03 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		boolean run = false;
		char resposta;

		do {
			System.out.print("Digite a quantidade de numeros (deve ser positivo e menor que 20): ");
			int n = ler.nextInt();
			double soma = 0;
			double media = 0;
			int positivos = 0;
			int negativos = 0;
	
			while(n <= 0 || n >= 20) {
				System.out.print("Quantidade incorreta! Digite novamente: ");
				n = ler.nextInt();
			}
	
			double[] numeros = new double[n];
	
			for (int i = 0; i < n; i++) {
				System.out.print("Digite o numero " + (i + 1) + ": ");
				numeros[i] = ler.nextDouble();
				soma += numeros[i];

				if (numeros[i] >= 0) {
					positivos++;
				} else {
					negativos++;
				}
			}

			double maior = numeros[0];
			double menor = numeros[0];

			for (int j = 1;j < n; j++) {
				if (numeros[j] > maior) {
					maior = numeros[j];
				}
				if (numeros[j] < menor) {
					menor = numeros[j];
				}
			}

			media = soma / n;
			double porcentagemPositivos = (positivos * 100) / n;
			double porcentagemNegativos = (negativos * 100) / n;

			System.out.println("=========================================");
			System.out.println("Resultados:");
			System.out.println("Maior valor: " + maior);
			System.out.println("Menor valor: " + menor);
			System.out.println("Soma dos valores: " + soma);
			System.out.println("Media aritmetica: " + media);
			System.out.println("Porcentagem de valores positivos: " + porcentagemPositivos + "%");
			System.out.println("Porcentagem de valores negativos: " + porcentagemNegativos + "%");
			System.out.println("=========================================");

			System.out.print("Deseja executar novamente? (S/N): ");
			resposta = ler.next().toUpperCase().charAt(0);

			while (resposta != 'S' && resposta != 'N') {
				System.out.print("Resposta incorreta! Deseja executar novamente? (S/N): ");
				resposta = ler.next().toUpperCase().charAt(0);
			};

			if (resposta == 'N') {
				run = true;
			}
		} while (run == false);
	}
}
