package classeDesafios;

public class pesoPessoa {
	String nome;
	double pesoInicial;
	double pesoAtual;

	pesoPessoa() {
	}

	pesoPessoa(String nome, double pesoInicial) {
		this.nome = nome;
		this.pesoInicial = pesoInicial;
		pesoAtual = pesoInicial;
	}

	double comer(pesoComida p1) {
		if (pesoAtual != 0) {
			return pesoAtual += p1.pesoDoPrato;
		}else {
			pesoAtual = pesoInicial;
			return pesoAtual += p1.pesoDoPrato;
		}
	}
}
