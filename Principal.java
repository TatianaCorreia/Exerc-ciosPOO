package br.com.residencia;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// System.out.println("Ol� mundo");
		// System.out.println("\ttodo");
		// System.out.println("\nOl� mund�o");
		// System.out.println("\\Ol� mundinho");
		// System.out.println('\'');
		// System.out.println("ent�o ele disse, "+"\"oi mundo\"");

		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite o seu sobrenome");
		sobrenome = leia.next();

		System.out.println("Meu nome �:" + nome + " " + sobrenome);
		leia.close();

		// exercicio 2

		// int num1, num2;
		// Scanner

	}

}
