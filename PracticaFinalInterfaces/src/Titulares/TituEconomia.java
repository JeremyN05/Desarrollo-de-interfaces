package Titulares;

import javax.swing.text.Document;
import javax.swing.text.Element;

public class TituEconomia {

	public static void cargarTitulares() {
		
		String web = "https://www.spanishdict.com/translate/";
		
		Document document = Jsoup.connect(web).get();
		
		Element element = document.select("div#quickdef1-es a.tCur1iYh").get(0);
		
		String palabra = element.html().toUpperCase();
		
		System.out.println(palabra);
		
	}
	
}
