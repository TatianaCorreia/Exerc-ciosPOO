package br.com.residencia;
 
import java.util.Scanner;

public class exercicio4lista1 {
	
	public static void main(String[] args) {
//		4.	O programa �term�metro� l� uma temperatura em graus celsius, e devolve sua equival�ncia na escala
//		fahrenheit. 
//		(Use: F = C * 1, 8 + 32)
		
		double celsius;
		System.out.println("-->Conversor de temperatura:<--");
		
		System.out.println("Digite a temperatura em Celsius: ");
		Scanner leia = new Scanner(System.in);
		
		 celsius = leia.nextDouble();
		 System.out.println(" A temperatura em Fahrenheit �: " + ( celsius * 1.8 + 32));
		 leia.close();	
		
	}

}
