package nivel2;

import java.util.Scanner;

public class MaiorN�mero {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double n1 = Double.parseDouble(ent.next().replace(",", "."));
		
		System.out.print("Digite o segundo n�mero: ");
		double n2 = Double.parseDouble(ent.next().replace(",", "."));
		
		System.out.print("Digite o terceiro n�mero: ");
		double n3 = Double.parseDouble(ent.next().replace(",", "."));
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior valor �: " + n1);
		}else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior valor �: " + n2);			
		}else {
			System.out.println("O maior valor �: " + n3);						
		}
		
		ent.close();
		
	}
}
