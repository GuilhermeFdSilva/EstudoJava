package desafiosControle;

import java.util.Scanner;

public class Verifica��oN�merica {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite um N�mero: ");
		double numero = ent.nextDouble();
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("Este n�mero pertence ao grupo e � par!");
			} else {
				System.out.println("Este n�mero pertence ao grupo e � impar!");
			}
		} else {
			System.out.println("N�mero n�o pertence ao grupo!!");
		}
		ent.close();
	}
}
