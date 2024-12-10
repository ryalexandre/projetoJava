package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Queue<String> filaDeClientes = new LinkedList<>();

		while (true) {

			System.out.println("\nMenu:");
			System.out.println("1: Adicionar um novo Cliente na fila.");
			System.out.println("2: Listar todos os Clientes na fila.");
			System.out.println("3: Chamar (retirar) uma pessoa da fila.");
			System.out.println("0: Finalizar o programa.");
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:

				System.out.print("Digite o nome do cliente: ");
				String nome = scanner.nextLine();
				filaDeClientes.add(nome);
				System.out.println("Cliente " + nome + " adicionado à fila.");
				break;

			case 2:

				if (filaDeClientes.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					System.out.println("Clientes na fila:");
					for (String cliente : filaDeClientes) {
						System.out.println(cliente);
					}
				}
				break;

			case 3:

				if (filaDeClientes.isEmpty()) {
					System.out.println("A fila está vazia, não há clientes para chamar.");
				} else {
					String cliente = filaDeClientes.poll();
					System.out.println("Cliente " + cliente + " chamado para o atendimento.");
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