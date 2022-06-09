package nivel1;

import java.util.Scanner;

public class Equação2ºGrau {
	
	public static void main(String[] args) {
		//-b +- ² b² -4ac
		//       2a
		Scanner ent = new Scanner(System.in);
		
		final int C1 = 4;
		final int C2 = 2;
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("Qual valor de 'A'?");
		int a = ent.nextInt();
		
		System.out.println("Qual valor de'B'?");
		int b = ent.nextInt();
		
		System.out.println("Qual valor de'C'?");
		int c = ent.nextInt();
		
		Integer d = (int) Math.pow(b, 2) - C1 * a * c;
		
		System.out.printf("Sua equação é: %dx² + %dx + %d = 0\n", a, b, c);
		System.out.println("O delta é: " + d);
		
		int x1 = Double.toString(Math.sqrt(d)).contains(".") ? (-b + (int) Math.sqrt(d)) / C2 * a : 0;
		int x2 = Double.toString(Math.sqrt(d)).contains(".") ? (-b - (int) Math.sqrt(d)) / C2 * a : 0;
		
		System.out.println(d > 0 ? "O valor de X1 é " + x1 + "e o valor de X2 é " + x2 : d == 0 ? "O valor de X é " + x1 : "Nao ha valores reais");
		
		ent.close();
			
	}

}
