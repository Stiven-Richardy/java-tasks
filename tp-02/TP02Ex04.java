/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES: 
 -> Stiven Richardy Silva Rodrigues
 -> Guilherme Mendes de Sousa
 EXERCICIO 4: Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.
*/
import java.util.Scanner;

public class TP02Ex04 {
	public static void main (String[] args) {
		int lin = 2;
		int col = 3;
		Scanner ler = new Scanner(System.in);

		int[][] matriz = new int[2][3];

		for (int ii = 0; ii < lin; ii++){
			System.out.println("----------------------------------");
			System.out.println("Linha: " + (ii+1));
			for (int jj = 0; jj < col; jj++){
				System.out.println("Informe o valor de [" + (ii+1) + ", " + (jj+1) + "]");
				matriz[ii][jj] =  ler.nextInt();
			}
		}

		// Exibição da matriz
		for (int ii = 0; ii < lin; ii++){
			System.out.print("|");
			for (int jj = 0; jj < col; jj++){
				System.err.print(" " + matriz[ii][jj]);
			}
			System.out.println(" |");
		}
		
	}

}