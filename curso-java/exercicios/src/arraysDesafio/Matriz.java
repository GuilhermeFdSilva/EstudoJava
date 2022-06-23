package arraysDesafio;

import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double total = 0;
		int qtdeAlunos;
		int qtdeNotas;
		System.out.println("Quntos alunos na tura?");
		qtdeAlunos = ent.nextInt();
		System.out.println("Quantas notas por aluno?");
		qtdeNotas = ent.nextInt();
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas];
		for (int i = 0; i < notasDaTurma.length; i++) {
			for (int j = 0; j < notasDaTurma[i].length; j++) {
				System.out.printf("%d° nota do aluno %d: ", (j + 1), (i + 1));
				double entrada = Double.parseDouble(ent.next().replace(",", "."));
				if (entrada >= 0 && entrada <= 10) {
					notasDaTurma[i][j] = entrada;
					total += notasDaTurma[i][j];
				} else {
					System.out.println("Nota invalida!!");
					j--;
				}
			}
		}
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.printf("A média da turma é: %.1f", media);
		ent.close();
	}
}