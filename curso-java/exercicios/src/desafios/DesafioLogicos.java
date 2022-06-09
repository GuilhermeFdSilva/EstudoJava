package desafios;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;

		boolean tv50 = trabalho1 && trabalho2;
		boolean tv32 = trabalho1 ^ trabalho2;
		
		boolean sorvete = tv32 || tv50;
		
		boolean saudavel = !sorvete;
		
		System.out.println("Compramos a televisão de 50\"? " + tv50);
		System.out.println("Compramos a televisão de 32\"? " + tv32);
		System.out.println("Tomamos sorvete? " + sorvete);
		System.out.println("Estamos mais saudaveis? " + saudavel);
		
	}
	
}
