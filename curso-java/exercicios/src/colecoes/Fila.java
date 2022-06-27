package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		fila.add("Guilherme"); // retorna Exception caso n�o caiba na fila
		fila.offer("Evelin"); // retorna false/true caso n�o caiba na fila
		fila.add("Andr�");
		fila.offer("Graziele");
		fila.add("Jo�o");
		fila.offer("Leonardo");
		System.out.println(fila.peek()); // retorna null caso n�o tenha ningu�m na fila
		System.out.println(fila.peek());
		System.out.println(fila.element()); // retorna Exception caso n�o tenha ningu�m na fila
		System.out.println(fila.element());
		
		System.out.println(fila.poll()); // retorna null caso n�o tenha ningu�m na fila
		System.out.println(fila.remove()); // retorna Exception caso n�o tenha ningu�m na fila
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
	}
}
