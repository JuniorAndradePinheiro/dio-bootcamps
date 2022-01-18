package exerciociEstruturaRepeticao;

import java.util.Scanner;

public class Tabuada {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o número da Tabuada:");
		
		int numero = teclado.nextInt();
		
		int par = 0, impar = 0;
		
		for(int i = 1; i <= 10; i++) {
			
			int resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
			
			if(resultado % 2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		
		System.out.println("A quantidade de números pares é: " + par);
		System.out.println("A quantidade de números impares é: " + impar);
	}

}
