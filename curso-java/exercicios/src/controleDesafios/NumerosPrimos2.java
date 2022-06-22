package controleDesafios;

import java.util.Scanner;

public class NumerosPrimos2 {

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
		switch (contadorDeDivisores) {
		case 0:
			System.out.printf("O n�mero %d � primo!", numero);
			break;
		default:
			System.out.printf("O n�mero %d n�o � primo!", numero);
		}
		ent.close();
	}
}