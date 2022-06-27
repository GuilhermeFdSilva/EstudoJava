package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		fila.add("Guilherme"); // retorna Exception caso não caiba na fila
		fila.offer("Evelin"); // retorna false/true caso não caiba na fila
		fila.add("André");
		fila.offer("Graziele");
		fila.add("João");
		fila.offer("Leonardo");
		System.out.println(fila.peek()); // retorna null caso não tenha ninguém na fila
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna Exception caso não tenha ninguém na fila
		System.out.println(fila.element());
		
		System.out.println(fila.poll()); // retorna null caso não tenha ninguém na fila
		System.out.println(fila.remove()); // retorna Exception caso não tenha ninguém na fila
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}
}
