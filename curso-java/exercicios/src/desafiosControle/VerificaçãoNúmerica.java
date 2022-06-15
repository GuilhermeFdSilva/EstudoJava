package desafiosControle;

import java.util.Scanner;

public class VerificaçãoNúmerica {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite um Número: ");
		double numero = ent.nextDouble();
		if (numero >= 0 && numero <= 10) {
			if (numero % 2 == 0) {
				System.out.println("Este número pertence ao grupo e é par!");
			} else {
				System.out.println("Este número pertence ao grupo e é impar!");
			}
		} else {
			System.out.println("Número não pertence ao grupo!!");
		}
		ent.close();
	}
}
