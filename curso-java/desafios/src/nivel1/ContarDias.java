package nivel1;

import java.util.Scanner;

public class ContarDias {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		
		System.out.println("Quantos anos você tem?");
		int a = x.nextInt() * 365;
	
		System.out.println("Quantos meses se passaram desde seu aniversario?");
		int m = x.nextInt() * 30;
		
		System.out.println("Quantos dias depois do ultimo mês?");
		int d = x.nextInt();
		
		int dv = (a + m + d);
		
		System.out.printf("\nVocê tem %d dias de vida", dv);
	
		x.close();
		
	}
}
