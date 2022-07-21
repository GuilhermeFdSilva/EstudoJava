package excecao;

public class Basico {
	public static void main(String[] args) {
		Aluno a1 = null;
		try {
			imprimirNomeDoAluno(a1);
		}catch(Exception e) {
			System.out.println("Ocorreu um erro, ao tentar imprimir o nome do aluno");
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e1) {
			e1.printStackTrace();
		}
		System.out.println("Fim!");
		}
	}
	public static void imprimirNomeDoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
}
