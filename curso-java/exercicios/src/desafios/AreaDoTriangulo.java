package desafios;

import java.util.Scanner;

public class AreaDoTriangulo {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Qual a base do triangulo?");
		double b = ent.nextDouble();
		
		System.out.println("Qual a altura do triangulo?");
		double h = ent.nextDouble();
		
		double a = (b * h) / 2;
		
		System.out.println("A area do triangulo é " + a);
		
		ent.close();
		
	}

}
