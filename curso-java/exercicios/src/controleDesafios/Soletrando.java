package controleDesafios;

import java.util.Scanner;

public class Soletrando {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String palavra;
		int size;
		int contador = 0;
		System.out.print("Digite a palavra: ");
		palavra = ent.next();
		ent.close();
		size = palavra.length();
		for (;contador < size; contador++) {
			System.out.println(palavra.charAt(contador));
		}
	}
}
