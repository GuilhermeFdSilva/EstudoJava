package oo.heranca.teste;

import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class Teste {
	public static void main(String[] args) {
		Ferrari f1 = new Ferrari();
		Fusca c1 = new Fusca();
		System.out.println("Ferrari " + f1);
		System.out.println("Fusca " + c1);
		System.out.println();
		f1.acelerar();
		f1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Ferrari " + f1);
		System.out.println("Fusca " + c1);
		System.out.println();
		f1.frear();
		f1.frear();
		f1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		System.out.println("Ferrari " + f1);
		System.out.println("Fusca " + c1);
	}
}
