package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voc� precisa falar as palavras m�gicas...");
			System.out.print("Quer sair? ");
			texto = ent.nextLine();
			}while (!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("At� logo!!");
		
		ent.close();
		
	}

}
