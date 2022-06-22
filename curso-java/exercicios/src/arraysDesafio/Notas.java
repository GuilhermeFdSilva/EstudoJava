package arraysDesafio;

import java.util.Scanner;

public class Notas {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double total = 0;
		int quantidade;
		System.out.println("Quantas notas você deseja informar?");
		quantidade = ent.nextInt();
		double[] notas = new double[quantidade];
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a %d° nota: ", (i + 1));
			double entrada = Double.parseDouble(ent.next().replace(",", "."));
			if(entrada >= 0 && entrada <= 10) {
				notas[i] = entrada;
			}else {
				System.out.println("Nota invalida!!");
				i--;
			}
		}
		for(double nota: notas) {
			total += nota;
		}
		double media = total / notas.length;
		System.out.printf("A média final é: %.1f", media);
		ent.close();
	}
}
