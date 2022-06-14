package desafiosFundametos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Sal�rio do m�s retrasado: ");
		String s1 = ent.nextLine();
		
		System.out.print("Sal�rio de m�s passado: ");
		String s2 = ent.nextLine();
		
		System.out.print("Sal�rio desse m�s: ");
		String s3 = ent.nextLine();
		
		double ss1 = Double.parseDouble(s1.replace("," , "."));
		double ss2 = Double.parseDouble(s2.replace("," , "."));
		double ss3 = Double.parseDouble(s3.replace("," , "."));
		
		double media = (ss1 + ss2 + ss3) / 3; 
		
		System.out.printf("A m�dia salarial � de: R$%.2f", media);
		
		ent.close();
		
	}

}
