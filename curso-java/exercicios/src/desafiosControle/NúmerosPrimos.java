package desafiosControle;

import java.util.Scanner;

public class NúmerosPrimos {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = ent.nextInt();
		int contadorDeDivisores = 0;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		if (contadorDeDivisores == 0) {
			System.out.printf("O número %d é primo!", numero);
		} else {
			System.out.printf("O número %d não é primo!", numero);
		}
		ent.close();
	}
}
