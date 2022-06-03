package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 100000L;
		
		System.out.println(b / 15);
		System.out.println(s.toString());
		System.out.println(i.intValue());
		System.out.println(l * 3);
		
		Float f = 123.4F;
		Double d = 12345.6789;
		
		System.out.println(f * f);
		System.out.println(d + d);
		
		Boolean bo = Boolean.parseBoolean("false");
		Character c = '#';
		
		System.out.println(bo.toString().toUpperCase());
		System.out.println(c + "azul");
	}
}
