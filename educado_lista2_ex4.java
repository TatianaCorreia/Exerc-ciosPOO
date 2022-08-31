package br.com.residencia;

import java.util.Scanner;

public class educado_lista2_ex4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		char nome, n1;

		System.out.println(" Qual o seu nome? ");
		nome = leia.nextchar();

		System.out.println(" Como você gostaria de ser chamado? ");
		n1 = leia.nextchar();

		System.out.println("Olá,", n1, " Seja bem-vindo(a)! ");
		
		leia.close();

	}

}
