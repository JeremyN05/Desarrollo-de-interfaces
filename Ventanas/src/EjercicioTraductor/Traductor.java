package EjercicioTraductor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class Traductor {
	
	private static String cortarHTML(String html) {
		
		int inicio, puntofinal1, puntofinal2;
		
		inicio = html.indexOf("?langFrom=en\" class=\"tCur1iYh\">");
		
		//Opcion 1
			//Crear una subcadema y buscar desde ahi
		
		String trozo = html.substring(inicio);
		puntofinal1 = trozo.indexOf("</a>");
		
		//Opcion 2
			//Buscar en la misma cadena pero desde el punto anteriormente calculado
		
		puntofinal2 = html.indexOf("</a>", inicio);
		
		String resultado1 = html.substring(inicio + 31, inicio + puntofinal1);
		String resultado2 = html.substring(inicio + 31, puntofinal2);
		
		return resultado1;
	
	}
	
	
	private static String obtenerHTML(URL direccion) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(direccion.openStream()));
		
		String inputLine, codigo = "";
		
		while((inputLine = in.readLine()) != null) {
			
			codigo += inputLine;
		
		}
		
		in.close();
		
		return codigo;
	}

	public static void main(String[] args) throws IOException{
		
		URL direccion = new URL("https://www.spanishdict.com/translate/perro");
		
		
		//String html = obtenerHTML(direccion); 
		
		//String palabraTraducida =cortarHTML(html) ;
		
		//System.out.println(palabraTraducida);
		
		String web = "https://www.spanishdict.com/translate/";
		
		Document document = Jsoup.connect(web).get();
		
		Element element = document.select("div#quickdef1-es a.tCur1iYh").get(0);
		
		String palabra = element.html().toUpperCase();
		
		System.out.println(palabra);
		
	}

}
