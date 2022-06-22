package controleDesafios;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		
		for (int i = 1; i <=5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Versão do desafio
		//Não pode usar valor númerico pra controlar o laço!
		
		for(String i = "#"; !i.equals("######"); i += "#") {
			System.out.println(i);
		}
	}
}
