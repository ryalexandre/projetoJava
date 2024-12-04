package exercicios_hoje;

import java.util.Scanner;

public class ExIf2 {
	 
	public static void main(String[] args) {
	       
	    Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        
	        	if (numero % 2 == 0) { // Na faculdade usamos o % para indicar se o resto dele é par ou impar ( Aprendi em C )
	  
	            if (numero >= 0) {
	               
	                System.out.println("O Número " + numero + " é par e positivo!");
	                
	            }else {
	               
	                System.out.println("O Número " + numero + " é par e negativo!");
	            }
	        } 	else {
	         
	            if (numero >= 0) {
	                
	                System.out.println("O Número " + numero + " é ímpar e positivo!");
	            }else {
	             
	                System.out.println("O Número " + numero + " é ímpar e negativo!");
	            }
	        }

	       
	    }
	}


