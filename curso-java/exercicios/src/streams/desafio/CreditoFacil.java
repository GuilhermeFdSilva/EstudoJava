package streams.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class CreditoFacil {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Guilherme França", false, 0, 3596.45, 2000);
		Cliente c2 = new Cliente("Evelin Mejia", true, 1856.35, 325, 3500);
		Cliente c3 = new Cliente("André Henrrique", true, 3045.45, 2406.35, 1000);
		Cliente c4 = new Cliente("João Gabriel", false, 0, 0, 4000);
		Cliente c5 = new Cliente("Alan Ferreira", false, 8965.45, 0, 10000);
		Cliente c6 = new Cliente("Julia Carvalho", true, 1765.74, 1548.77, 2500);
		List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6);
		Predicate<Cliente> garantia = a -> a.carteiraAssinada || a.fgts > 0 || a.UltimosSalarios > 0;		
		Predicate<Cliente> comFinanceiro = a -> (a.pedidoDeCredito - a.fgts) / 6 < a.UltimosSalarios * 0.2;
		Function<Cliente, String> preAprovado = a -> a.nome + " seu pedido de credito está pré aprovado!";
		clientes.stream()
		.filter(garantia)
		.filter(comFinanceiro)
		.map(preAprovado)
		.forEach(System.out::println);
	}
}
