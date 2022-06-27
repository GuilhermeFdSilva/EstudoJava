package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Josoé");
		usuarios.put(1, "Guilherme");
		usuarios.put(2, "Evelin");
		usuarios.put(3, "André");
		usuarios.put(4, "Graziele");
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Evelin"));
		System.out.println(usuarios.get(1));
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		for(Entry<Integer, String> usuario: usuarios.entrySet()) {
			System.out.println(usuario.getKey() + " " + usuario.getValue());
		}
	}
}
