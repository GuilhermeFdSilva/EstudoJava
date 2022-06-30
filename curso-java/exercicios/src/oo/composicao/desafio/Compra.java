package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	final ArrayList<Item> itens = new ArrayList<>();
	final Cliente cliente;
	Compra(Cliente cliente){
		this.cliente = cliente;
	}
	void adicionarItem(int quantidade, Produto p) {
		this.itens.add(new Item(quantidade, p));
	}
	double obterValorTtal() {
		double total = 0;
		for(Item item: itens) {
			total += item.produto.preco * item.quantidade;
		}
		return total;
	}
}