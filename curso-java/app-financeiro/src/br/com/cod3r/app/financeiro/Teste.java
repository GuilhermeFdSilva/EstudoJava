package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.calculo.Calculadora;

public class Teste {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		System.out.println(calc.soma(2, 3, 4));
	}
}