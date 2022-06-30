package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Guilherme França";
		compra1.adicionarItem("Caneta", 20, 1.49);
		compra1.adicionarItem(new Item("Borracha", 10, 1.99));
		compra1.adicionarItem(new Item("Caderno", 3, 23.99));	
		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());
	}
}
