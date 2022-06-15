package desafiosControle;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double soma = 0;
		double entrada = 0;
		System.out.println("Vamos começar a somar!");
		do {
			System.out.print("Digite um número: ");
			entrada = ent.nextDouble();
			soma += entrada;
			System.out.println("Total " + soma);
		}while(entrada >= 0);
		ent.close();
	}
}
