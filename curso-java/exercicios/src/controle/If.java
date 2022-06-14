package controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner (System.in);
		
		System.out.println("Informe a média: ");
		double media = ent.nextDouble();
		
		if(media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parabéns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recuperação");
		}
		
		if(media < 4.5) {
			System.out.println("Reprovado");
		}
		
		ent.close();
		
	}

}
