package br.com.residencia;

import java.util.Scanner;

public class exercicio2lista1 {

	public static void main(String[] args) {
	//2.	O programa “Tempo de vida” irá imprimir a soma das idades de todos os colegas da sua equipe 
	//(6 pessoas). Pergunte a cada um a idade e não esqueça a sua! Depois faça a atribuição direta da 
	//expressão em uma variável inteira.

		int idade;
		int amigo1; 
		int amigo2; 
		int amigo3; 
		int amigo4; 
		int amigo5; 
		int idadeTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Digite a idade do amigo 1: ");
		amigo1 = leia.nextInt();
		
		System.out.println("Digite a idade do amigo 2: ");
		amigo2 = leia.nextInt();
		
		System.out.println("Digite a idade do amigo 3: ");
		amigo3 = leia.nextInt();
		
		System.out.println("Digite a idade do amigo 4: ");
		amigo4 = leia.nextInt();
		
		System.out.println("Digite a idade do amigo 5: ");
		amigo5 = leia.nextInt();

		 idadeTotal = idade + amigo1 + amigo2 + amigo3 + amigo4 + amigo5;
			
			System.out.println(" A soma de todas as idade é : " + " " + idadeTotal);
			
		leia.close();
	}

}
