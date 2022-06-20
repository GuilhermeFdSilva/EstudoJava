package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Celular";
		p2.preco = 1999.99;
		p2.desconto = 0.3;
		
		double total = p1.precoComDesconto() + p2.precoComDesconto(0.1);
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.printf("%.2f\n", p1.precoComDesconto());
		System.out.printf("Total do carrinho = R$%.2f\n", total);
	}
}
