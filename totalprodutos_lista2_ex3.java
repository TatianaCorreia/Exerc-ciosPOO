package br.com.residencia;

import java.util.Scanner;

public class totalprodutos_lista2_ex3 {
	
	Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int qntdeprodutos;
		
		System.out.println("----Total de produtos---- ","\n");
		
		System.out.println(" Digite quantos produtos ir� comprar? ");
		
		qntdeprodutos = leia.nextint();

		System.out.println(" Parab�ns por comprar ", qntdeprodutos, " produtos! ");

	}

}
