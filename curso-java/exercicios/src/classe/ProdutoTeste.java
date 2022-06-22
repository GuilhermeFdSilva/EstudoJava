package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1999.99;
		
		double total = p1.precoComDesconto() + p2.precoComDesconto();
		
		System.out.println(Produto.desconto);
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.printf("%.2f\n", p1.precoComDesconto());
		System.out.printf("Total do carrinho = R$%.2f\n", total);
	}
}
