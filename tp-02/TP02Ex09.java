/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 9: Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.
*/
import java.util.Scanner;

public class TP02Ex09 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int m, n;

		System.out.print("Digite a quantidade de linhas da matriz (Max: 10): ");
		m = ler.nextInt();
		while (m < 1 || m > 10) {
			System.out.print("Valor incorreto! Tente novamente: ");
			m = ler.nextInt();
		};

		System.out.print("Digite a quantidade de colunas da matriz (Max: 10): ");
		n = ler.nextInt();
		while (n < 1 || n > 10) {
			System.out.print("Valor incorreto! Tente novamente: ");
			n = ler.nextInt();
		};

		double[][] matriz = new double[m][n];
		double[][] matrizTransposta = new double[n][m];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o valor [" + i + "][" + j + "] da matriz: ");
				matriz[i][j] = ler.nextDouble();
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matrizTransposta[j][i] = matriz[i][j];
			}
		}

		System.out.println("=========================================");
		System.out.println("Matriz original: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "] ");
			}
			System.out.println("|");
		}

		System.out.println("=========================================");
		System.out.println("Matriz transposta: ");
		for (int i = 0; i < matrizTransposta.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matrizTransposta[i].length; j++) {
				System.out.print("[" + matrizTransposta[i][j] + "] ");
			}
			System.out.println("|");
		}
		ler.close();
	}
}
