package nivel1;

import java.util.Scanner;

public class Equa��o2�Grau {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		final int C1 = 4;
		final int C2 = 2;
		
		System.out.println("Equa��o: ax� + bx + c = 0");
		
		System.out.println("Qual valor de 'A'?");
		int a = ent.nextInt();
		
		System.out.println("Qual valor de'B'?");
		int b = ent.nextInt();
		
		System.out.println("Qual valor de'C'?");
		int c = ent.nextInt();
		
		Integer d = (int) Math.pow(b, 2) - C1 * a * c;
		
		System.out.printf("Sua equa��o �: %dx� + %dx + %d = 0\n", a, b, c);
		System.out.println("O delta �: " + d);
		
		int x1 = Double.toString(Math.sqrt(d)).contains(".") ? (-b + (int) Math.sqrt(d)) / C2 * a : 0;
		int x2 = Double.toString(Math.sqrt(d)).contains(".") ? (-b - (int) Math.sqrt(d)) / C2 * a : 0;
		
		System.out.println(d > 0 ? "O valor de X1 � " + x1 + " e o valor de X2 � " + x2 : d == 0 ? "O valor de X � " + x1 : "N�o h� valores reais");
		
		ent.close();
			
	}

}
