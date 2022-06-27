package colecoes;

import java.util.Objects;

public class Usuario {
	String nome;
	Usuario(String nome){
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Meu nome é " + nome + ".";
	}
	public int hashCode() {
		return this.nome.length();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nome, other.nome);
	}
}
