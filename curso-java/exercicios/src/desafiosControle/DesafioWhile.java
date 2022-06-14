package desafiosControle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		int alunos = 0;
		double nota = 0;
		double total = 0;

		System.out.println("Boa tarde!");

		while (nota != -1) {
			System.out.print("Insira a nota ou digite \"-1\" para ver a média: ");
			nota = Double.parseDouble(ent.next().replace(",", "."));

			if (nota <= 10 && nota >= 0) {
				total += nota;
				alunos++;
			}else if(nota != -1) {
				System.out.println("Nota inválida!");
			}
		}

		double media = total / alunos;
		System.out.println("A média é: " + media);

	}
}
