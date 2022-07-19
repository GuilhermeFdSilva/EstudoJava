package streams.desafio;

public class Produto {
	final String nome;
	final double preco;
	final double desconto;
	final boolean frete;
	public Produto(String nome, double preco, double desconto, boolean frete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
	}
}
