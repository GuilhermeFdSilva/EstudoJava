package controleDesafios;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		
		for (int i = 1; i <=5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//Vers�o do desafio
		//N�o pode usar valor n�merico pra controlar o la�o!
		
		for(String i = "#"; !i.equals("######"); i += "#") {
			System.out.println(i);
		}
	}
}
