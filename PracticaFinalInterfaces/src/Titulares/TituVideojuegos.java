package Titulares;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TituVideojuegos {

	public static String cargarTitulares() throws IOException {
		
		String web = "https://www.hobbyconsolas.com";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("a.size-m").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares2() throws IOException {
		
		String web = "https://www.gamereactor.es";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("h2.font-weight-bold").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares3() throws IOException {
		
		String web = "https://www.marca.com/videojuegos.html";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("h2.ue-c-cover-content__headline").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
}
