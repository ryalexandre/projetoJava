package exercicios_hoje;

import java.util.Scanner;

public class ExSwitchCase {
	  public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Código do Produto: ");
	        int codigoProduto = scanner.nextInt();

	        System.out.print("Quantidade: ");
	        int quantidade = scanner.nextInt();

	        String nomeProduto = "";
	        double precoUnitario = 0;

	        switch (codigoProduto) {
	            case 1:
	                nomeProduto = "Cachorro Quente";
	                precoUnitario = 10.00;
	                break;
	            case 2:
	                nomeProduto = "X-Salada";
	                precoUnitario = 15.00;
	                break;
	            case 3:
	                nomeProduto = "X-Bacon";
	                precoUnitario = 18.00;
	                break;
	            case 4:
	                nomeProduto = "Bauru";
	                precoUnitario = 12.00;
	                break;
	            case 5:
	                nomeProduto = "Refrigerante";
	                precoUnitario = 8.00;
	                break;
	            case 6:
	                nomeProduto = "Suco de laranja";
	                precoUnitario = 13.00;
	                break;
	            default:
	                System.out.println("Código de produto inválido.");
	                	                
	        }

	        double valorTotal = quantidade * precoUnitario;
	        System.out.println("\nProduto: " + nomeProduto);
	        System.out.printf("Valor total: R$ %.2f\n", valorTotal);


	    }
	}

