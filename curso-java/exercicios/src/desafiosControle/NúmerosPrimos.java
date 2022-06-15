package desafiosControle;

import java.util.Scanner;

public class N�merosPrimos {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite um n�mero: ");
		int numero = ent.nextInt();
		int contadorDeDivisores = 0;
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}
		if (contadorDeDivisores == 0) {
			System.out.printf("O n�mero %d � primo!", numero);
		} else {
			System.out.printf("O n�mero %d n�o � primo!", numero);
		}
		ent.close();
	}
}
