package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double [4];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 8.4;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 10;
		System.out.println(Arrays.toString(notasAlunoA));
		double totalAlunoA = 0;
		for(double nota: notasAlunoA) {
			totalAlunoA += nota;
		}
		System.out.println(totalAlunoA / notasAlunoA.length);
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 7.6, 4.4, notaArmazenada, 9.2 };
		double totalAlunoB = 0;
		for(double nota: notasAlunoB) {
			totalAlunoB += nota;
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
