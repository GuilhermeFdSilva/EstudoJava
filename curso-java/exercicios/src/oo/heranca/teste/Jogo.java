package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		Heroi heroi = new Heroi(10, 11);
		System.out.println("Monstro HP: " + monstro.vida);
		System.out.println("Heroi HP: " + heroi.vida);
		heroi.atacar(monstro);
		System.out.println("Monstro HP: " + monstro.vida);
		System.out.println("Heroi HP: " + heroi.vida);
		System.out.println(heroi.vida);
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.NORTE);
		monstro.andar(Direcao.LESTE);
		monstro.andar(Direcao.NORTE);
		System.out.println(monstro.x);
		System.out.println(monstro.y);
	}
}
