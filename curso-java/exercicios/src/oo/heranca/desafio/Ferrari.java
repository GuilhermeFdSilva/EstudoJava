package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo{
	public Ferrari(){
		super(280);
	}
	public Ferrari(int x){
		super(x);
		setDelta(15);
	}
	public void ligarTurbo() {
		setDelta(35);
	}
	public void desligarTurbo() {
		setDelta(15);
	}
}
