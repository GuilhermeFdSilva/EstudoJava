package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Guilherme");
		Aluno aluno2 = new Aluno("Evelin");
		Aluno aluno3 = new Aluno("André");
		Curso curso1 = new Curso("Java completo");
		Curso curso2 = new Curso("Web 2025");
		Curso curso3 = new Curso("React Native");
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno1);
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso " + curso1);
			System.out.println(" E meu nome é " + aluno);
			System.out.println();
		}
		System.out.println(aluno1.cursos.get(2).alunos);
	}
}
