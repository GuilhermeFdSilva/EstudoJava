package oo.heranca.desafio;

public class Ferrari extends Carro{
	public Ferrari(){
		super(280);
	}
	public Ferrari(int x){
		super(x);
	}
	public void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
	public void frear() {
		super.frear();
		super.frear();
	}
}
