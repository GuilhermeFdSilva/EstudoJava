package streams.desafio;

public class Cliente {
	final String nome;
	final boolean carteiraAssinada;
	final double UltimosSalarios;
	final double fgts;
	final double pedidoDeCredito;
	public Cliente(String nome, boolean carteiraAssinada, double salario, double fgts, double pedidoDeCredito) {
		this.nome = nome;
		this.carteiraAssinada = carteiraAssinada;
		this.UltimosSalarios = salario;
		this.fgts = fgts;
		this.pedidoDeCredito = pedidoDeCredito;
	}
}
