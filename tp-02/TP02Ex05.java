/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 5: Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.
*/
public class TP02Ex05 {
	public static void main (String [] args) {
		double[][] matriz = new double[3][2];

		for(int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i * 2 + j * 3;
			}
		}
		System.out.println("Os valores armazenados na matriz: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("| ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("[" + matriz[i][j] + "] ");
			}
			System.out.println("|");
		}
	}
}
