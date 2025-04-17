/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 11: Entrar com uma matriz de matriz.length MxM, onde a matriz.length também será escolhida pelo usuário,
sendo que no máximo será de matriz.length 10 e quadrática. Após a digitação dos elementos,
calcular e exibir determinante da matriz.
*/
import java.util.Scanner;

public class TP02Ex11 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		int m;

		do {
			System.out.print("Digite a ordem da matriz MxM (Max: 10): ");
			m = ler.nextInt();
			if (m < 1 || m > 10) {
				System.out.print("Ordem incorreta! Tente novamente: ");
				m = ler.nextInt();
			};
		} while(m < 1 || m > 10);
		
		double[][] matriz = new double[m][m];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Digite o valor [" + i + "][" + j + "] da matriz: ");
				matriz[i][j] = ler.nextDouble();
			}
		}

		if (matriz.length == 1) {
			System.out.println("Determinante: " + matriz[0][0]);
		} else if (matriz.length == 2) {
			System.out.println("Determinante: " + (matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0]));
		} else {

		}
	}
}
