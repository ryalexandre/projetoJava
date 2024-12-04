package exercicios_hoje;

import java.util.Scanner;

public class ExIf {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o Nome do doador: ");
		String nome = scanner.nextLine();


		System.out.print("Digite a Idade do doador: ");
		int idade = scanner.nextInt();

		
		System.out.print("Primeira doação de sangue? ");
		boolean primeiraDoacao = scanner.nextBoolean();

		
			if (idade >= 18) {
			if (idade <= 69) {
			if (idade >= 60) {
			if (primeiraDoacao) {
				
				System.out.println(nome + " não está apto para doar sangue!");
				} else {
				System.out.println(nome + " está apto para doar sangue!");
					}
			
				} else {
					
				System.out.println(nome + " está apto para doar sangue!");
				}
			
			} 
			
			else {
				System.out.println(nome + " não está apto para doar sangue!");
			}
			
				} 
			else {
				System.out.println(nome + " não está apto para doar sangue!");
		}

		scanner.close();
	}

}
