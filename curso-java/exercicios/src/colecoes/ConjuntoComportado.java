package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
//		Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Evelin");
		listaAprovados.add("Guilherme");
		listaAprovados.add("André");
		listaAprovados.add("João");
		for(String candidatos: listaAprovados) {
			System.out.println(candidatos);
		}
		Set<Integer> nums = new HashSet<>();
		nums.add(18);
		nums.add(13);
		nums.add(23);
		nums.add(7);
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
