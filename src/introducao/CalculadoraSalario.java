package introducao;

	import java.util.Scanner;
	
public class CalculadoraSalario {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        // Declaração das variáveis
	        float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
	        
	        // Valores de entrada
	        System.out.print("Salário Bruto: ");
	        salarioBruto = scanner.nextFloat();
	        
	        System.out.print("Adicional Noturno: ");
	        adicionalNoturno = scanner.nextFloat();
	        
	        System.out.print("Horas Extras: ");
	        horasExtras = scanner.nextFloat();
	        
	        System.out.print("Descontos: ");
	        descontos = scanner.nextFloat();
	        
	        // Salário líquido
	        salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
	        
	        // Exibição do resultado
	        System.out.printf("Salário Líquido: %.2f\n", salarioLiquido);
	        
	        
	    }
	
		

	}


