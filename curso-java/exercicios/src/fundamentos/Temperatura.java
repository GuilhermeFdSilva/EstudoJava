package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		final double DIFERENÇA = 32;
		final double MULTIPLICADOR = 5.0/9.0;
		double f = 86;
		double c = (f - DIFERENÇA) * MULTIPLICADOR;
		
		System.out.println(f + "F em ºC é igual a " + c);
	}
}
