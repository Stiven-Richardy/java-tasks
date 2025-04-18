/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES: 
 -> Stiven Richardy Silva Rodrigues
 -> Guilherme Mendes de Sousa
 EXERCICIO 6: Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.
*/
import java.util.Scanner;

public class TP02Ex06 {
	public static void main (String[] args) {
		int lin = 2;
		int col = 3;
		Scanner ler = new Scanner(System.in);

		String[][] matriz = new String[2][3];

		for (int ii = 0; ii < lin; ii++){
			System.out.println("----------------------------------");
			System.out.println("Linha: " + (ii+1));
			for (int jj = 0; jj < col; jj++){
				System.out.print("Informe o nome de [" + (ii+1) + ", " + (jj+1) + "]: ");
				matriz[ii][jj] =  ler.nextLine();
			}
		}

		for (int ii = 0; ii < lin; ii++){
			System.out.print("|");
			for (int jj = 0; jj < col; jj++){
				System.err.print(" " + String.format("%10s",matriz[ii][jj]));
			}
			System.out.println(" |");
		}
		ler.close();
	}

}