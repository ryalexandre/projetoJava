package vetor;

import java.util.Scanner;

public class ExVetor2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] vetor = new int[10];

		System.out.println("Digite 10 números inteiros:");
		for (int i = 0; i < 10; i++) {
			vetor[i] = scanner.nextInt();
		}

		System.out.print("Elementos nos índices ímpares: ");
		for (int i = 1; i < 10; i += 2) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();

		System.out.print("Elementos pares: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println();

		int soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += vetor[i];
		}
		System.out.println("Soma: " + soma);

		double media = soma / 10.0;
		System.out.println("Média: " + media);

		scanner.close();
	}
}
