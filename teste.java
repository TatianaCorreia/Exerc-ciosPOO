package br.com.residencia;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {

		int num1;
        int num2;
        double div = 0;

        System.out.println("-->Mini Calculadora<--");
        System.out.println("Digite o primeiro n�mero: ");
        Scanner leia = new Scanner (System.in);
        num1 = leia.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = leia.nextInt();

        System.out.println("Soma " + (num1 + num2));
        System.out.println("Subtra��o " + (num1 - num2));
        System.out.println("Multiplica��o " + (num1 * num2));
        System.out.println("Divis�o " +  ((div) + num1 / num2));
        
        

	}

}
