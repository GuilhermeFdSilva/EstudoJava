package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<>();
		usuarios.add(new Usuario("Guilherme"));
		usuarios.add(new Usuario("Evelin"));
		usuarios.add(new Usuario("André"));
		boolean resultado = usuarios.contains(new Usuario("Guilherme"));
		System.out.println(resultado);
	}
}
