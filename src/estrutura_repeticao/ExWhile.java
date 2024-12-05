package estrutura_repeticao;

import java.util.Scanner;

public class ExWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int menorQue21 = 0;
		int maiorQue50 = 0;
		int idade;

		while (true) {
			System.out.print("Digite uma idade: ");
			idade = scanner.nextInt();

			if (idade < 0) {
				break;
			}

			if (idade < 21) {
				menorQue21++;
			} else if (idade > 50) {
				maiorQue50++;
			}
		}

		System.out.println("Total de pessoas menores de 21 anos: " + menorQue21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorQue50);

	}

}
