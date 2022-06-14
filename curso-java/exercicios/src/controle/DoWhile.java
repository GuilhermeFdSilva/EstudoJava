package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Você precisa falar as palavras mágicas...");
			System.out.print("Quer sair? ");
			texto = ent.nextLine();
			}while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Até logo!!");
		
		ent.close();
		
	}

}
