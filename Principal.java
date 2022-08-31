package br.com.residencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// System.out.println("Olá mundo");
		// System.out.println("\ttodo");
		// System.out.println("\nOlá mundão");
		// System.out.println("\\Olá mundinho");
		// System.out.println('\'');
		// System.out.println("então ele disse, "+"\"oi mundo\"");

		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite o seu sobrenome");
		sobrenome = leia.next();

		System.out.println("Meu nome é:" + nome + " " + sobrenome);
		leia.close();

		// exercicio 2

		// int num1, num2;
		// Scanner

	}

}
