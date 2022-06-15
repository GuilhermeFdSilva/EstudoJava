package nivel2;

import java.util.Scanner;

public class MaiorNúmero {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double n1 = Double.parseDouble(ent.next().replace(",", "."));
		
		System.out.print("Digite o segundo número: ");
		double n2 = Double.parseDouble(ent.next().replace(",", "."));
		
		System.out.print("Digite o terceiro número: ");
		double n3 = Double.parseDouble(ent.next().replace(",", "."));
		
		if(n1 > n2 && n1 > n3) {
			System.out.println("O maior valor é: " + n1);
		}else if (n2 > n1 && n2 > n3) {
			System.out.println("O maior valor é: " + n2);			
		}else {
			System.out.println("O maior valor é: " + n3);						
		}
		
		ent.close();
		
	}
}
