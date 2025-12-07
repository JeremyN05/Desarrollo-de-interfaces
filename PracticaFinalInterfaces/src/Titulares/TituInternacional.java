package Titulares;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TituInternacional {

	public static String cargarTitulares() throws IOException {
		
		String web = "https://cnnespanol.cnn.com";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("a.container__title-url h2").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares2() throws IOException {
		
		String web = "https://www.larazon.es/internacional/";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("h2.article__title a").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares3() throws IOException {
		
		String web = "https://www.telemundo.com";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("span.tease-card__headline").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
}
