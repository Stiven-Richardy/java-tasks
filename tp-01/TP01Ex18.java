/*
IFSP - CAMPUS CUBATÃO
TURMA: ADS 371 - LINGUAGEM DE PROGRAMAÇÃO
INTEGRANTES:
-> Stiven Richardy Silva Rodrigues
-> Guilherme Mendes de Sousa
EXERCICIO 18: Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido.
*/
import java.util.Scanner;

public class TP01Ex18 {
	public static void main (String [] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o valor do produto 1: ");
		double produto1 = ler.nextDouble();
		
		System.out.print("Informe o valor do produto 2: ");
		double produto2 = ler.nextDouble();
		
		System.out.print("Informe o valor do produto 3: ");
		double produto3 = ler.nextDouble();
		
		System.out.print("Informe o valor do produto 4: ");
		double produto4 = ler.nextDouble();
		
		System.out.print("Informe o valor do produto 5: ");
		double produto5 = ler.nextDouble();
		
		double total = produto1 + produto2 + produto3 + produto4 + produto5;
		
		System.out.print("Informe o valor do pago: ");
		double pagamento = ler.nextDouble();
		
		if (pagamento < total) {
			System.out.print("O pagamento nao pode ser processado, pois o valor pago foi menor que o total dos produtos.");
		} else {
			double troco = pagamento - total;

			System.out.println("Troco: R$ " + troco);
		}
	}
}