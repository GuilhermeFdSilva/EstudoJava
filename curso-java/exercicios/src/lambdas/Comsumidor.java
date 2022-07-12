package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Comsumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		Produto p1 = new Produto("Caneta", 12.35, 0.09);
		imprimirNome.accept(p1);
		Produto p2 = new Produto("Lapis", 8.75, 0.09);
		Produto p3 = new Produto("Boracha", 9.15, 0.09);
		Produto p4 = new Produto("Apontador", 10.40, 0.09);
		Produto p5 = new Produto("Branquinho", 18.35, 0.09);
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}
