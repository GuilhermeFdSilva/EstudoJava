package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		Usuario u1 = new Usuario("Evelin");
		lista.add(u1);
		lista.add(new Usuario("Guilherme"));
		lista.add(new Usuario("André"));
		lista.add(new Usuario("João"));
		System.out.println(lista.get(3));
		System.out.println(" >>>>>>> " + lista.remove(2));
		System.out.println(lista.remove(new Usuario("Guilherme")));
		System.out.println(lista.contains(new Usuario("Guilherme")));
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
