package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner ent = new Scanner(System.in);
		
		String s2 = ent.nextLine();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));

		ent.close();
		
	}

}
