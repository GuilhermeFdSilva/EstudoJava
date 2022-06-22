package controleDesafios;

import java.util.Scanner;

public class MaiorNúmero {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Digite 10 Números para saber qual o MAIOR!");
		int contador = 1;
		double maiorValor = 0;
		double entrada;
		do {
			System.out.printf("%d° Número: ", contador);
			entrada = Double.parseDouble(ent.next().replace(",", "."));
			contador++;
			if (entrada > maiorValor) {
				maiorValor = entrada;
			}
		} while (contador <= 10);
		System.out.println("O maior valor foi: " + maiorValor);
		ent.close();
	}
}
