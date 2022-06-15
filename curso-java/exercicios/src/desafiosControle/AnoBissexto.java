package desafiosControle;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.print("Digite o ano: ");
		int ano = ent.nextInt();
		if (ano % 4 == 0) {
			System.out.println("Esse ano é bissexto!");
		}else {
			System.out.println("Esse ano não é bissexto!!");
		}
		ent.close();
	}
}
