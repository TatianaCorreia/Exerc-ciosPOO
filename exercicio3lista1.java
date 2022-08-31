package br.com.residencia;

import java.util.Scanner;

public class exercicio3lista1 {

	public static void main(String[] args) {
//	3.	Crie o programa “mini calculadora”, que após ler dois números inteiros apresenta as
//	operações de soma, subtração, multiplicação e divisão com eles.
//	Obs.: Trate o maior número possível de erros (ex: operações com números negativos, divisão por zero,
//	uso de letras, etc).
		
		float numero1;
		float numero2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-->Mini Calculadora<--");
		
		System.out.println("Digite o primeiro número : ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo número : ");
		numero2 = leia.nextFloat();
	
		float soma = numero1 + numero2;
		float subtracao = numero1 - numero2;
		float multiplicacao = numero1 * numero2;
		float divisao = numero1 / numero2; 
		
		System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " +  divisao);
        
		
		
		leia.close();

	}

}
