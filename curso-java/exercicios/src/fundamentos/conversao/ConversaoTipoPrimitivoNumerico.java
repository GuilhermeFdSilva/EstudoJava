package fundamentos.conversao;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //Impl�cita
		System.out.println(a);
		
		float b = (float) 1.123456789999; //Expl�cita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //Expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; //Expl�cita (CAST)
		System.out.println(f);
		
	}
	
}
