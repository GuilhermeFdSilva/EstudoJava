package desafiosControle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String dia = ent.next();
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}else if (dia.equalsIgnoreCase("terça")
				   || dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		}else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		}else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}else if (dia.equalsIgnoreCase("sábado")
				   || dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		}else {
			System.out.println("Dia invalido");
		}
		
		ent.close();
		
	}

}
