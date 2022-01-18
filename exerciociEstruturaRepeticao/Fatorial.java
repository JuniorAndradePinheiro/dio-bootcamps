package exerciociEstruturaRepeticao;

import java.util.Scanner;

public class Fatorial {
	
	public static void main(String[] args) {		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número que desaja calcular o Fatorial:");
		
		int numero = teclado.nextInt();

		int resultado = numero;
		int numeroI = numero - 1;
		
		for(int i = numeroI; i > 0; i--) {

			int fatorial = resultado * i;
			
			System.out.println(resultado + " X " + i + " = " + fatorial);
			
			resultado = fatorial;
					
		}
	}

}
