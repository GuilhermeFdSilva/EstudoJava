package generics;

public class CaixaObjetoTeste {
	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);
		Double coisaA = (Double)caixaA.abrir();
		System.out.println(coisaA);
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Ol�");
		String coisaB = (String)caixaA.abrir();
		System.out.println(coisaB);
	}
}
