package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Loja {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 3599.99, 0.33, true);
		Produto p2 = new Produto("Geladeira", 2399.99, 0.25, true);
		Produto p3 = new Produto("Fogão", 1699.99, 0.35, false);
		Produto p4 = new Produto("Mesa com cadeiras", 1649.99, 0.35, true);
		Produto p5 = new Produto("Air Fryer", 699.99, 0.3, true);
		Produto p6 = new Produto("Smart TV 32'", 1999.99, 0.15, true);
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Predicate<Produto> desconto = a -> a.desconto >= 0.3;
		Predicate<Produto> frete = a -> a.frete;
		Function<Produto, String> apresentacao = a -> String.format("%s de %.2f por %.2f e com frete GRÁTIS!!", a.nome, a.preco, (a.preco * (1 - a.desconto)));
		produtos.stream()
		.filter(desconto)
		.filter(frete)
		.map(apresentacao)
		.forEach(System.out::println);
	}
}
