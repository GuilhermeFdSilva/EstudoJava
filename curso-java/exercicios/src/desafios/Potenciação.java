package desafios;

import java.util.Scanner;

public class Potenciação {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		double base = Double.parseDouble(ent.next().replace(",", "."));
		
		System.out.println("Seu valor elevado a 2 é " + Math.pow(base, 2));
		System.out.println("Seu valor elevado a 3 é " + Math.pow(base, 3));
		
		ent.close();
	}

}
