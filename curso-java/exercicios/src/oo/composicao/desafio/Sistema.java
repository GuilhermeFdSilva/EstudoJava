package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Guilherme");
		c1.compras.add(new Compra(c1));
		c1.compras.add(new Compra(c1));
		c1.compras.get(0).itens.add(new Item(25, new Produto("Açucar", 2.75)));
		c1.compras.get(1).itens.add(new Item(40, new Produto("Batata", 3.75)));
		System.out.println(c1.totalGasto());
	}
}
