package introducao;

	import java.util.Scanner;
public class CalculadoraMedia {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Declaração das variáveis
	        float nota1, nota2, nota3, nota4, mediaFinal;
	        
	        // Leitura das notas
	        System.out.print("Nota 1: ");
	        nota1 = scanner.nextFloat();
	        
	        System.out.print("Nota 2: ");
	        nota2 = scanner.nextFloat();
	        
	        System.out.print("Nota 3: ");
	        nota3 = scanner.nextFloat();
	        
	        System.out.print("Nota 4: ");
	        nota4 = scanner.nextFloat();
	        
	        //média final
	        mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
	        
	        // Exibição do resultado
	        System.out.printf("Média final: %.1f\n", mediaFinal);
	        
	     
	    }

	}

