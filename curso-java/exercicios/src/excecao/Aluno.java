package excecao;

import java.util.Objects;

public class Aluno {
	final String nome;
	final double nota;
	final boolean bomComportamento;
	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}
	public Aluno(String nome, double nota, boolean bomComportamento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportamento = bomComportamento;
	}
	public String toString() {
		return nome + " tem nota " + nota;
	}
	public int hashCode() {
		return Objects.hash(bomComportamento, nome, nota);
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return bomComportamento == other.bomComportamento && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
}
