package br.com.residencia;

import java.util.Scanner;

public class exercicio3lista1 {

	public static void main(String[] args) {
//	3.	Crie o programa �mini calculadora�, que ap�s ler dois n�meros inteiros apresenta as
//	opera��es de soma, subtra��o, multiplica��o e divis�o com eles.
//	Obs.: Trate o maior n�mero poss�vel de erros (ex: opera��es com n�meros negativos, divis�o por zero,
//	uso de letras, etc).
		
		float numero1;
		float numero2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("-->Mini Calculadora<--");
		
		System.out.println("Digite o primeiro n�mero : ");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o segundo n�mero : ");
		numero2 = leia.nextFloat();
	
		float soma = numero1 + numero2;
		float subtracao = numero1 - numero2;
		float multiplicacao = numero1 * numero2;
		float divisao = numero1 / numero2; 
		
		System.out.println("Soma = " + soma);
        System.out.println("Subtra��o = " + subtracao);
        System.out.println("Multiplica��o = " + multiplicacao);
        System.out.println("Divis�o = " +  divisao);
        
		
		
		leia.close();

	}

}
