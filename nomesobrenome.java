package br.com.residencia;

import java.util.Scanner;

public class nomesobrenome {

	public static void main(String[] args) {
		String nome, sobrenome;
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		System.out.println("Digite o seu sobrenome: ");
		sobrenome = leia.next();

		System.out.println("Olá " + nome + " " + sobrenome + ", seja-bem vinda ao universo da programação!");
		leia.close();

	}

}
