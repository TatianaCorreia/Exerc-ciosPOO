package br.com.residencia;

import java.util.Scanner;

public class monitoria {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("informe o número inteiro entre 1 e 1000: ");
		Integer numero = scan.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

}
