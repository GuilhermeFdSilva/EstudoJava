package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	public static void main(String[] args) {
		Function<Produto, Double> precoReal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor * 1.085 : valor;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("R$" + preco).replace(".", ",");
		Produto produto = new Produto("iPad", 3235.89, 0.13);
		String preco = precoReal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto);
		System.out.println("O preço final é " + preco);
	}
}
