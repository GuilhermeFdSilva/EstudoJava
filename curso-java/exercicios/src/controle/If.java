package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = ent.nextDouble();
		
		if(media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		
		if(media < 4.5) {
			System.out.println("Reprovado");
		}
		
		ent.close();
		
	}

}
