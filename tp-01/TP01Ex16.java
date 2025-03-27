/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 16: Entrar via teclado com o valor de um angulo em graus, calcular e exibir as
seguintes funcoes trigonométricas: seno, cosseno, tangente e secante deste angulo.
Lembre-se que uma funcao trigonometrica trabalha em radianos.
*/
import java.util.Scanner;

public class TP01Ex16 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o angulo: ");
		double angulo = ler.nextDouble();
		double cosseno = Math.cos(angulo);
		double seno = Math.sin(angulo);
		double tangente = Math.tan(angulo);
		double secante = 1/cosseno;
		
		
		
		System.out.println("Seno: " + seno);
		System.out.println("Cosseno: " + cosseno);
		System.out.println("Tangente: " + tangente);
		System.out.println("Secante: " + secante);
	}
}