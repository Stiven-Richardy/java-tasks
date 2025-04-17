/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 7: Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado na própria matriz, nas posições correspondentes.
*/
import java.util.Scanner;

public class TP02Ex07 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		double[][] matriz = new double[3][4];
		double constMultiplicativa;

		System.out.print("Digite os 12 valores para a matriz 3x4: ");
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ler.nextDouble();
			}
		}

		System.out.print("Digite a constante multiplicativa: ");
		constMultiplicativa = ler.nextDouble();

		System.out.println("Os valores armazenados na matriz multiplicados pela constante: ");
		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] *= constMultiplicativa;
				System.out.print("[" + matriz[i][j] + "] ");
			}
			System.out.println();
		}
	}
}
