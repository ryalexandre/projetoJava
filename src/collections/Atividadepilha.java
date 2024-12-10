package collections;

import java.util.Scanner;
import java.util.Stack;

public class Atividadepilha {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Stack<String> pilhaDeLivros = new Stack<>();

		while (true) {

			System.out.println("\nMenu:");
			System.out.println("1: Adicionar um novo livro na pilha.");
			System.out.println("2: Listar todos os livros na pilha.");
			System.out.println("3: Retirar um livro da pilha.");
			System.out.println("0: Finalizar o programa.");
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:

				System.out.print("Digite o nome do livro: ");
				String nomeLivro = scanner.nextLine();
				pilhaDeLivros.push(nomeLivro);
				System.out.println("Livro '" + nomeLivro + "' adicionado à pilha.");
				break;

			case 2:

				if (pilhaDeLivros.isEmpty()) {
					System.out.println("A pilha está vazia.");
				} else {
					System.out.println("Livros na pilha:");

					for (String livro : pilhaDeLivros) {
						System.out.println(livro);
					}
				}
				break;

			case 3:

				if (pilhaDeLivros.isEmpty()) {
					System.out.println("A pilha está vazia, não há livros para retirar.");
				} else {
					String livroRemovido = pilhaDeLivros.pop();
					System.out.println("Livro '" + livroRemovido + "' retirado da pilha.");
				}
				break;

			case 0:

				System.out.println("Programa finalizado.");
				scanner.close();
				return;

			default:

				System.out.println("Opção inválida. Tente novamente.");
			}
		}
	}

}
