package vetor;

import java.util.Scanner;

public class ExemploVetorUsuario {

	public static void main(String[] args) {
		
		   int numero[] = new int[5];
	        Scanner leia = new Scanner(System.in);
	        
	        for(int indice = 0; indice < 5; indice ++) {
	            System.out.println("Digite o " + (indice + 1)  +"º Número: ");
	            numero[indice] = leia.nextInt();
	        }
	        
	        System.out.println("\nOs números digitados foram: \n");
	        
	        for(int indice = 0; indice < 5; indice++) {
	            System.out.println((indice + 1) + "º número: " + numero[indice]);
	        }

	}

}
