package horadosistema;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;


public class HoraDoSistema {

	public static void main(String[] args) {
	
		Date relogio = new Date();
		System.out.println("A hora do sistema �");
		System.out.println(relogio.toString());
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();
		System.out.println("A resolu��o da sua m�quina �: " +d.width + " x " +d.height);
	
		Locale idioma = Locale.getDefault();
		System.out.print("O idioma do seu sistema est� configurado para: ");
		System.out.println(idioma.getDisplayLanguage());
	}
}
