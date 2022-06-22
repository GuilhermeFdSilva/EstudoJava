package classeDesafios;

public class pesoJantar {
	public static void main(String[] args) {
		pesoPessoa pessoa1 = new pesoPessoa("Guilherme", 60.55);
		pesoComida prato1 = new pesoComida("Arroz", 0.338);
		pesoComida prato2 = new pesoComida("Feijão", 0.225);
		pesoComida prato3 = new pesoComida("Filé de Frango", 0.359);
		pessoa1.comer(prato1);
		pessoa1.comer(prato2);
		pessoa1.comer(prato3);
		System.out.printf("%s tinha: %.2fKg\n", pessoa1.nome, pessoa1.pesoInicial);
		System.out.printf("Após comer %s, %s e %s\n", prato1.nomeDoPrato, prato2.nomeDoPrato, prato3.nomeDoPrato);
		System.out.printf("Ficou com: %.2fKg\n", pessoa1.pesoAtual);
		
		pesoPessoa pessoa2 = new pesoPessoa();
		pessoa2.nome = "Evelin";
		pessoa2.pesoInicial = 53.23;
		pessoa2.comer(prato1);
		pessoa2.comer(prato2);
		pessoa2.comer(prato3);
		System.out.printf("%s tinha: %.2fKg\n", pessoa2.nome, pessoa2.pesoInicial);
		System.out.printf("Após comer %s, %s e %s\n", prato1.nomeDoPrato, prato2.nomeDoPrato, prato3.nomeDoPrato);
		System.out.printf("Ficou com: %.2fKg\n", pessoa2.pesoAtual);
	}
	
}
