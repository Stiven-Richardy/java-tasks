/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES: 
 -> Stiven Richardy Silva Rodrigues
 -> Guilherme Mendes de Sousa
 EXERCICIO 8: Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.
*/
import java.util.Scanner;

public class TP02Ex08 {
	public static void main (String[] args) {
		int lin = 3;
		int col = 4;
		Scanner ler = new Scanner(System.in);

		int[][] matriz = new int[lin][col];
		int[][] matrizMultiplicada = new int[lin][col];

		for (int ii = 0; ii < lin; ii++){
			System.out.println("----------------------------------");
			System.out.println("Linha: " + (ii+1));
			for (int jj = 0; jj < col; jj++){
				System.out.print("Informe o valor de [" + (ii+1) + ", " + (jj+1) + "]: ");
				matriz[ii][jj] =  ler.nextInt();
			}
		}

		System.out.println("----------------------------------");
		System.out.println("Matriz original: ");
		for (int ii = 0; ii < lin; ii++){
			System.out.print("|");
			for (int jj = 0; jj < col; jj++){
				System.out.print(" " + String.format("%4d", matriz[ii][jj]));
			}
			System.out.println(" |");
		}

		System.out.println("Informe o multiplicador da matriz");	
		int mult = ler.nextInt();
		for (int ii = 0; ii < lin; ii++){
			for (int jj = 0; jj < col; jj++){
				matrizMultiplicada[ii][jj] =  matriz[ii][jj] * mult;
			}
		}

		System.out.println("----------------------------------");
		System.out.println("Matriz multiplicada: ");
		for (int ii = 0; ii < lin; ii++){
			System.out.print("|");
			for (int jj = 0; jj < col; jj++){
				System.out.print(" " + String.format("%4d", matrizMultiplicada[ii][jj]));
			}
			System.out.println(" |");
		}
		ler.close();
	}

}