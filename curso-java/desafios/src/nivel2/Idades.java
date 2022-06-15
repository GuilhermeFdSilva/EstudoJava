package nivel2;

import java.util.Scanner;

public class Idades {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Qual sua idade?");
		int idade = ent.nextInt();
		
		if (idade >= 0 && idade <=14) {
			System.out.println("Você é uma criança!");
		}else if(idade >= 15 && idade <= 18) {
			System.out.println("Você é m adolescente!");
		}else if(idade >=19 && idade <= 59) {
			System.out.println("Você é um adulto!");
		}else if(idade >= 60) {
			System.out.println("Você é um idoso!");
		}else if(idade < 0) {
			System.out.println("Idade invalida!! :P");
		}
		
		ent.close();
		
	}

}
