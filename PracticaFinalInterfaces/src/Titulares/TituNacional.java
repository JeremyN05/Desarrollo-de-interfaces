package Titulares;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TituNacional {
	
	public static String cargarTitulares() throws IOException {
		
		String web = "https://www.publico.es";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("h2.title a").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares2() throws IOException {
		
		String web = "https://www.eldiario.es";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("h2.ni-title a").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares3() throws IOException {
		
		String web = "https://www.larazon.es";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("h2.article__title a").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}

}
