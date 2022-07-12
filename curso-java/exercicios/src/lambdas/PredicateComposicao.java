package lambdas;

import java.util.function.Predicate;

public class PredicateComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = n -> n % 2 == 0;
		Predicate<Integer> isTresDigitos = n -> n >= 100 && n <= 999;
		System.out.println(isPar.and(isTresDigitos).negate().test(113));
		System.out.println(isPar.or(isTresDigitos).test(113));
	}
}
