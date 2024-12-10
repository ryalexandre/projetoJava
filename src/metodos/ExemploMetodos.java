package metodos;

public class ExemploMetodos {

	public static void main(String[] args) {
		
		int resultado = somar(2,5);
		
		System.out.println("\nO primeiro resultado é " + resultado);
		
		System.out.println("\nO segundo resultado é " + somar (8,3));
		
		falar("\nBom dia");
		
		falar("\nGato amarelo");
		
		ExemploMetodoExterno.mensagem();
	}
	
	public static int somar(int x, int y) {
		return x + y;
		
	}
	
	public static void falar(String mensagem ) {
		
		System.out.println(mensagem);
		
	}
	
	

}
