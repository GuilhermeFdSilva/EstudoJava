package fundametosDesafios;

import java.util.Scanner;

public class AreaDoTriangulo {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Qual a base do triángulo?");
		double b = ent.nextDouble();
		
		System.out.println("Qual a altura do triángulo?");
		double h = ent.nextDouble();
		
		double a = (b * h) / 2;
		
		System.out.println("A area do triángulo é " + a);
		
		ent.close();
		
	}

}
