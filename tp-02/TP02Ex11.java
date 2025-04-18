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
		} else if (matriz.length == 3){
			double[][] matrizSarrus = new double[3][5];
			for (int ii = 0; ii < 3; ii++){
				for (int jj = 0; jj < 3; jj++) {
					matrizSarrus[ii][jj] = matriz[ii][jj];
				}
			}
			for (int ii = 3, ii2 = 0; ii < 5; ii++, ii2++) {
				for (int jj = 0; jj < 3; jj++){
					matrizSarrus[jj][ii] = matriz[jj][ii2];
				}
			}
			double det = ((matrizSarrus[0][0] * matrizSarrus[1][1] * matrizSarrus[2][2]) +
						 (matrizSarrus[0][1] * matrizSarrus[1][2] * matrizSarrus[2][3])	+
						 (matrizSarrus[0][2] * matrizSarrus[1][3] * matrizSarrus[2][4])) - 
						((matrizSarrus[0][4] * matrizSarrus[1][3] * matrizSarrus[2][2]) +
						 (matrizSarrus[0][3] * matrizSarrus[1][2] * matrizSarrus[2][1]) +
						 (matrizSarrus[0][2] * matrizSarrus[1][1] * matrizSarrus[2][0]));
			System.out.println("Determinante: " + det);
		} else {
			int inicio = 0;
			int ordemNova = m;
			double[][] matrizLaplace = matriz;
			double det = 1;
			while(ordemNova > 3) {
				double dcofator = 0;
				for (int ii = 0; ii < ordemNova; ii++){
					double cofator = Math.pow(-1, ((ii+1)+(0+1))); 	
					dcofator += matrizLaplace[ii][0] * cofator;
				}
				det *= dcofator;
				ordemNova--;
				inicio++;
				matrizLaplace = new double[ordemNova][ordemNova];
				for (int ii = 0, avancoLinha = inicio; ii < ordemNova; ii++, avancoLinha++){
					for (int jj = 0, avancoCol = inicio; jj < ordemNova; jj++, avancoCol++) {
						matrizLaplace[ii][jj] = matriz[avancoLinha][avancoCol];
					}
				}

			}
			double[][] matrizSarrus = new double[3][5];
			for (int ii = 0; ii < 3; ii++){
				for (int jj = 0; jj < 3; jj++) {
					matrizSarrus[ii][jj] = matrizLaplace[ii][jj];
				}
			}
			for (int ii = 3, ii2 = 0; ii < 5; ii++, ii2++) {
				for (int jj = 0; jj < 3; jj++){
					matrizSarrus[jj][ii] = matrizLaplace[jj][ii2];
				}
			}
			det *= ((matrizSarrus[0][0] * matrizSarrus[1][1] * matrizSarrus[2][2]) +
					(matrizSarrus[0][1] * matrizSarrus[1][2] * matrizSarrus[2][3])	+
					(matrizSarrus[0][2] * matrizSarrus[1][3] * matrizSarrus[2][4])) - 
				   ((matrizSarrus[0][4] * matrizSarrus[1][3] * matrizSarrus[2][2]) +
					(matrizSarrus[0][3] * matrizSarrus[1][2] * matrizSarrus[2][1]) +
					(matrizSarrus[0][2] * matrizSarrus[1][1] * matrizSarrus[2][0]));
			System.out.println("Determinante: " + det);
		}
		ler.close();
	}
}
