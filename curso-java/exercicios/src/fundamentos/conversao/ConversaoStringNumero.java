package fundamentos.conversao;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog
				("Digite o primeiro n�mero:");

		String valor2 = JOptionPane.showInputDialog
				("Digite o srgundo n�mero:");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		
		System.out.println("A soma � " + soma);
		System.out.println("A m�dia � " + soma /2);
		
	}

}
