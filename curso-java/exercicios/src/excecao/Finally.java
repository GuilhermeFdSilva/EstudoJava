package excecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		try {
			System.out.println(7 / ent.nextInt());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalmente #01...");
		}
		try {
			System.out.println(7 / ent.nextInt());
		} finally {
			System.out.println("Finalmente #02...");
			ent.close();
		}
		System.out.println("Fim!");
	}
}
