package fundametosDesafios;

import java.util.Scanner;

public class AreaDoTriangulo {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Qual a base do tri�ngulo?");
		double b = ent.nextDouble();
		
		System.out.println("Qual a altura do tri�ngulo?");
		double h = ent.nextDouble();
		
		double a = (b * h) / 2;
		
		System.out.println("A area do tri�ngulo � " + a);
		
		ent.close();
		
	}

}
