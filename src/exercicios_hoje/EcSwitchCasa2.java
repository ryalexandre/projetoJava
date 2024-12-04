package exercicios_hoje;

import java.util.Scanner;

public class EcSwitchCasa2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nome do colaborador: ");
		String nome = scanner.nextLine();

		System.out.print("Cargo: ");
		int codigoCargo = scanner.nextInt();

		System.out.print("Salário: ");
		float salario = scanner.nextFloat();

		String cargo = "";
		float reajuste = 0;

		switch (codigoCargo) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.10f;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			break;
		default:
			System.out.println("Cargo inválido!");
			scanner.close();
			return;
		}

		float novoSalario = salario + (reajuste * salario);

		System.out.printf("\nNome do colaborador: %s\n", nome);
		System.out.printf("Cargo: %s\n", cargo);
		System.out.printf("Salário: R$ %.2f\n", novoSalario);

		scanner.close();
	}

}
