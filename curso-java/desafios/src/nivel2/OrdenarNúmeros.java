package nivel2;

import java.util.Scanner;

public class OrdenarNúmeros {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("1° número: ");
		double n1 = Double.parseDouble(ent.next().replace(",", "."));
		
		System.out.print("2° número: ");
		double n2 = Double.parseDouble(ent.next().replace(",", "."));
			
		System.out.print("3° número: ");
		double n3 = Double.parseDouble(ent.next().replace(",", "."));
		
		if (n1 < n2 && n2 < n3) {
			System.out.printf("Ordem crescente %.1f, %.1f, %.1f", n1, n2, n3);
			System.out.printf("\nOrdem decrescente %.1f, %.1f, %.1f", n3, n2, n1);
		}else if (n1 < n2 && n2 > n3) {
			System.out.printf("Ordem crescente %.1f, %.1f, %.1f", n1, n3, n2);
			System.out.printf("\nOrdem decrescente %.1f, %.1f, %.1f", n2, n3, n1);
		}else if (n2 < n1 && n1 < n3) {
			System.out.printf("Ordem crescente %.1f, %.1f, %.1f", n2, n1, n3);
			System.out.printf("\nOrdem decrescente %.1f, %.1f, %.1f", n3, n1, n2);
		}else if (n2 < n1 && n1 > n3) {
			System.out.printf("Ordem crescente %.1f, %.1f, %.1f", n2, n3, n1);
			System.out.printf("\nOrdem decrescente %.1f, %.1f, %.1f", n1, n3, n2);
		}else if (n3 < n2 && n2 < n1) {
			System.out.printf("Ordem crescente %.1f, %.1f, %.1f", n3, n2, n1);
			System.out.printf("\nOrdem decrescente %.1f, %.1f, %.1f", n1, n2, n3);
		}else {
			System.out.printf("Ordem crescente %.1f, %.1f, %.1f", n3, n1, n2);
			System.out.printf("\nOrdem decrescente %.1f, %.1f, %.1f", n2, n1, n3);
		}
		
		ent.close();
		
	}

}
