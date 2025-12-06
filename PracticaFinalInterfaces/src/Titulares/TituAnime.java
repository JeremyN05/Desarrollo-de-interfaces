package Titulares;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TituAnime {

	public static String cargarTitulares() throws IOException {
		
		String web = "https://somoskudasai.com";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("a.py-1").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares2() throws IOException {
		
		String web = "https://elpais.com/noticias/anime/";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("h2.c_t a").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares3() throws IOException {
		
		String web = "https://www.milenio.com/temas/anime";
		
        Document document = Jsoup.connect(web).get();
		
        Element element = document.select("a.board-module__a").get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
}
