package br.com.residencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeituraEscrita {

	final static String PATH_BASICO = ".\\Temp\\";
	final static String EXTENSAO = ".txt";

	public static void escritor(String path) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Escreva o nome do arquivo: ");
		String nome = sc.next();
		
		FileWriter fileArquivo = new FileWriter("C:\\Windows\\Temp\\beto.txt");
		
		BufferedWriter buffWrite = new BufferedWriter(fileArquivo);
		String linha = "";
		
		System.out.println("Escreva algo: ");
		linha = sc.next(); 
		
		buffWrite.write(linha);
		buffWrite.close();
		sc.close();
	}
	
	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(PATH_BASICO + path));
		String linha = "";
		
		try { //Vamos falar do try/catch quando entrarmos nas exce��es
			while (true) {
				linha = buffRead.readLine();
				if (linha != null) {
					System.out.println(linha);
				} else {
					break;
				}
			}
			buffRead.close();
		}
		catch (FileNotFoundException e) { //Vamos falar do try/catch quando entrarmos nas exce��es
			System.out.println("Arquivo n�o encontrado no caminho " + PATH_BASICO + EXTENSAO); //Vamos falar do try/catch quando entrarmos nas exce��es
		} //Vamos falar do try/catch quando entrarmos nas exce��es
	}
}