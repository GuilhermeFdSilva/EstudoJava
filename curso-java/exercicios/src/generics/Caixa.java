package generics;

public class Caixa <A> {
	private A coisa;
	public void guardar(A coisa) {
		this.coisa = coisa;
	}
	public A abrir() {
		return coisa;
	}
}
