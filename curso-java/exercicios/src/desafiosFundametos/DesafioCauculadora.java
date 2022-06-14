package desafiosFundametos;

import java.util.Scanner;

public class DesafioCauculadora {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double n1 = Double.parseDouble(ent.next().replace(",", "."));
		
		System.out.print("Digite outro número: ");
		double n2 = Double.parseDouble(ent.next().replace(",", "."));
		
		System.out.print("Qual operação? ");
		String op = ent.next();
		
		double resultado = "+".equals(op) ? n1 + n2 : 0;
		resultado = "-".equals(op) ? n1 - n2 : resultado;
		resultado = "*".equals(op) ? n1 * n2 : resultado;
		resultado = "/".equals(op) ? n1 / n2 : resultado;
		resultado = "%".equals(op) ? n1 % n2 : resultado;
		
		System.out.printf("%f %s %f = %f", n1, op, n2, resultado);
		
		ent.close();
		
	}

}
