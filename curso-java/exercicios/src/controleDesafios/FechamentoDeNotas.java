package controleDesafios;

import java.util.Scanner;

public class FechamentoDeNotas {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		System.out.println("Qual a 1° nota parcial?");
		double nota1 = ent.nextDouble();
		System.out.println("Qual a 2° nota parcial?");
		double nota2 = ent.nextDouble();
		double mediaFinal = (nota1 + nota2) / 2;
		if(mediaFinal >= 7) {
			System.out.println("Aprovado!!");
		}else if(mediaFinal < 7 && mediaFinal > 4) {
			System.out.println("Recuperação!");
		}else {
			System.out.println("Reprovado");
		}
		ent.close();
	}
}
