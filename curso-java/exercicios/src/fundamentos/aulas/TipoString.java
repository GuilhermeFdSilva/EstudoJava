package fundamentos.aulas;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá Pessoal");
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("BOA TARDE"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE"));
		
	var nome = "André";
	var sobrenome = "Henrrique";
	var idade = 33;
	var salario = 2948.87;
	
	System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
	
	System.out.printf("Nome: %s %s\nIdade: %s\nSalario: %s", nome, sobrenome, idade, salario);
	
	System.out.println("\n\n");
	
	System.out.printf("O senhor %s %s, tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);

	String frase = String.format("\nO senhor %s %s, tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario);
	System.out.println(frase);
	
	}
}
