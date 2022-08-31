package br.com.residencia;

import java.util.Calendar;

public class idade_alterdata_lista2_ex2 {

	public static void main(String[] args) {

		int ano_fundacao = 1989;
		int qnt_anos;
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
		
		qnt_anos = anoAtual - ano_fundacao;
		
		
		System.out.println(" A Alterdata tem " + qnt_anos + " " + "anos." );
		
		
	}

}
