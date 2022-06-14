package desafiosFundametos;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		//IMC = Peso / Altura²
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite seu peso: ");
		double peso = Double.parseDouble(ent.next().replace(",", "."));
;
		
		System.out.print("Digite sua altura: ");
		double altura = Double.parseDouble(ent.next().replace(",", "."));
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Seu IMC equivale a %.2fKg/m²", imc);
		
		ent.close();
		
	}

}
