package controleDesafios;

import java.util.Scanner;

public class JogoDaAdivinha��o {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int senha = 23;
		int vidas = 0;
		int resposta;
		int restart = 0;
		System.out.println("O jogo come�ou!\nVoc� tem 10 tentativas!!");
		System.out.print("Adivinhe o n�mero de 0-100...\n");
		while (restart == 0) {
			vidas =0;
			do {
				if (vidas < 10) {
					vidas++;
					System.out.printf("%d� tentativa: ", vidas);
					resposta = ent.nextInt();
				} else {
					System.out.println("GAME OVER!");
					System.out.printf("A senha era: %d\n", senha);
					System.out.println("Digite 0 para jogar novamente");
					restart = ent.nextInt();
					break;
				}
				if (resposta > senha) {
					System.out.printf("%d � maior que a senha\n", resposta);
				} else if (resposta < senha) {
					System.out.printf("%d � menor que a senha\n", resposta);
				} else {
					System.out.println("Parab�ns! Voc� acertou!!");
					System.out.println("Digite 0 para jogar novamente");
					restart = ent.nextInt();
					break;
				}
			} while (vidas <= 10);
		}ent.close();
	}
}
