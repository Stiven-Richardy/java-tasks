/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 15: Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (RS).
digitados.
*/
import java.util.Scanner;

public class TP01Ex15 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o angulo: ");
		double reais = ler.nextDouble();
		
		System.out.print("Valor em dolar: ");
		double reaisDols = (ler.nextDouble()) * 5.70;
		
		System.out.println("Total em reais " + (reais + reaisDols) + " RS");
	}
}