package nivel1;

import java.util.Scanner;

public class SegundosEmHoras {
	
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Quantos segundos?");
		int seg = ent.nextInt();
		
		Integer horas = seg / 3600;
		Integer minutos = (seg % 3600) / 60;
		Integer segundos = (seg % 3600) % 60;
		
		System.out.printf("%d horas %d minutos %d segundos", horas, minutos, segundos);
		
		ent.close();
	}
}
