package controle;

import java.util.Scanner;

public class IfElseIf {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite a nota: ");
		
		double nota = Double.parseDouble(ent.next().replace(",", "."));
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota Inválida");
		}else if(nota >= 7) {
			System.out.println("Aprovado");
		}else if (nota < 7 && nota >= 5) {			
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
		
		ent.close();
		
	}

}
