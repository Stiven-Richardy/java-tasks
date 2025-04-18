/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 10: Entrar com uma matriz de ordem MxM, onde a ordem também será escolhida pelo usuário,
sendo que no máximo será de ordem 10 e quadrática. Após a digitação dos elementos,
calcular e exibir a matriz inversa. Exibir as matrizes na tela, sob a forma matricial (linhas x
colunas).
*/
import java.util.Scanner;

public class TP02Ex10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int m;

        do {
            System.out.print("Digite a ordem da matriz MxM (Max: 10): ");
            m = ler.nextInt();
            if (m < 1 || m > 10) {
                System.out.println("Ordem incorreta! Tente novamente.");
            }
        } while (m < 1 || m > 10);

        double[][] matriz = new double[m][m];
        double[][] matrizIdentidade = new double[m][m];
        double[][] matrizInversa = new double[m][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Digite o valor [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextDouble();
                matrizIdentidade[i][j] = matriz[i][j];
                matrizInversa[i][j] = (i == j) ? 1.0 : 0.0;
            }
        }

        boolean inversaExiste = true;

        for (int i = 0; i < m; i++) {
            if (matrizIdentidade[i][i] == 0) {
                boolean trocou = false;
                for (int j = i + 1; j < m; j++) {
                    if (matrizIdentidade[j][i] != 0) {
                        for (int k = 0; k < m; k++) {
                            double temp = matrizIdentidade[i][k];
                            matrizIdentidade[i][k] = matrizIdentidade[j][k];
                            matrizIdentidade[j][k] = temp;
                            temp = matrizInversa[i][k];
                            matrizInversa[i][k] = matrizInversa[j][k];
                            matrizInversa[j][k] = temp;
                        }
                        trocou = true;
                        break;
                    }
                }
                if (trocou == false) {
                    inversaExiste = false;
                    break;
                }
            }

            double pivo = matrizIdentidade[i][i];
            for (int j = 0; j < m; j++) {
                matrizIdentidade[i][j] /= pivo;
                matrizInversa[i][j] /= pivo;
            }

            for (int k = 0; k < m; k++) {
                if (k != i) {
                    double fator = matrizIdentidade[k][i];
                    for (int j = 0; j < m; j++) {
                        matrizIdentidade[k][j] -= fator * matrizIdentidade[i][j];
                        matrizInversa[k][j] -= fator * matrizInversa[i][j];
                    }
                }
            }
        }

		System.out.println("=========================================");
        System.out.println("Matriz original:");
        for (int i = 0; i < m; i++) {
            System.out.print("| ");
            for (int j = 0; j < m; j++) {
                System.out.printf("[%6.2f] ", matriz[i][j]);
            }
            System.out.println("|");
        }

        if (inversaExiste == true) {
            System.out.println("=========================================");
            System.out.println("Matriz inversa:");
            for (int i = 0; i < m; i++) {
                System.out.print("| ");
                for (int j = 0; j < m; j++) {
                    System.out.printf("[%6.2f] ", matrizInversa[i][j]);
                }
                System.out.println("|");
            }
        } else {
            System.out.println("=========================================");
            System.out.println("A matriz não possui inversa (matriz singular).");
        }
        ler.close();
    }
}