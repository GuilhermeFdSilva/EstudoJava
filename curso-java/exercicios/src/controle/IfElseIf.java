package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		
		double nota = ent.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Inv�lida");
		}else {
			System.out.println("Nota v�lida!");
		}
		
		
		
		ent.close();
		
	}

}
