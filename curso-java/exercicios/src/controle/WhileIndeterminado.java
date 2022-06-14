package controle;

import java.util.Scanner;

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		String valor = "";
		
		while(!valor.equalsIgnoreCase("Sair")) {
			System.out.print("Digite algo: ");
			valor = ent.next();
		}
		
		ent.close();
		
	}
}
