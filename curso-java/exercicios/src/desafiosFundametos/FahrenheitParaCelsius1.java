package desafiosFundametos;

import java.util.Scanner;

public class FahrenheitParaCelsius1 {

	public static void main(String[] args) {
		//°C = (ºF - 32) x 5/9
		Scanner ent = new Scanner (System.in);

		final double DIFERENC‡A = 32;
		final double MULTIPLICADOR = 5.0 / 9.0;
		
		System.out.print("Digite a temperatura em fahrenheit: ");
		double f = ent.nextDouble();
		
		double c = (f - DIFERENC‡A) * MULTIPLICADOR;
		
		System.out.println(f + "F é igual a " + c + "°C");
		
		ent.close();
		
	}
}
