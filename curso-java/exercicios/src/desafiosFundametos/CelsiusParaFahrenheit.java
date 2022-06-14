package desafiosFundametos;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	
	public static void main(String[] args) {
		//F = (°C * 9/5) - 32
		Scanner ent = new Scanner(System.in);
		
		final double MULTIPLICADOR = 9.0 / 5.0;
		final double DIFERENCA = 32;
		
		System.out.print("Digite a temperatura em ceusius: ");
		double c = ent.nextDouble();
		
		double f = (c * MULTIPLICADOR) + DIFERENCA;
		
		System.out.println(c + "°C é igual a " + f + "F");
		
		ent.close();
		
	}

}
