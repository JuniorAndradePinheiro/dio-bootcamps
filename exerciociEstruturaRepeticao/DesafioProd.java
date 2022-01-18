package exerciociEstruturaRepeticao;

import java.util.Scanner;

public class DesafioProd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o 1º valor:");
		int a = sc.nextInt();
		
		System.out.println("Entre com o 2º valor:");
		int b = sc.nextInt();
		
		int prod = a * b;
		
		System.out.println("O valor de PROD é: " + prod);
		
		sc.close();
	}

}
