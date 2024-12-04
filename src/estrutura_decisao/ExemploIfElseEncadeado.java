package estrutura_decisao;

import java.util.Scanner;

public class ExemploIfElseEncadeado {

	public static void main(String[] args) {
		// variaveis
		float media;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a sua média");
		media = leia.nextFloat();

		if (media >= 6) {
			System.out.println("Aprovado");
		}

		else if (media >=5) {

			System.out.println("exame");
		}
		else {
			System.out.println("reprovado");
		}

	}
	

}
