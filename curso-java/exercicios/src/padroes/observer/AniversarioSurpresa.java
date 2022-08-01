package padroes.observer;

public class AniversarioSurpresa {
	public static void main(String[] args) {
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		porteiro.registrarObservado(namorada);
		porteiro.monitorar();
	}
}
