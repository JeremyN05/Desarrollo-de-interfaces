package Titulares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TituDeporte {

	public static String cargarTitulares() throws IOException {
		
		Properties config = leerConfig("src/Titulares/URLDeporte.txt");
		
		String web = config.getProperty("url1");
		
        Document document = Jsoup.connect(web).get();
		
		Element element = document.select(config.getProperty("class1")).get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares2() throws IOException {
		
		Properties config = leerConfig("src/Titulares/URLDeporte.txt");
		
		String web = config.getProperty("url2");
		
        Document document = Jsoup.connect(web).get();
		
		Element element = document.select(config.getProperty("class2")).get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static String cargarTitulares3() throws IOException {
		
		Properties config = leerConfig("src/Titulares/URLDeporte.txt");
		
		String web = config.getProperty("url3");
		
        Document document = Jsoup.connect(web).get();
		
		Element element = document.select(config.getProperty("class3")).get(0);
		
		String elementos = element.html().toUpperCase();
        
        return elementos;
    
	}
	
	public static Properties leerConfig(String rutaArchivo) {
		
        Properties props = new Properties();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
           
        	String linea;
           
            while ((linea = br.readLine()) != null) {
                
            	linea = linea.trim();
                
                if (linea.isEmpty() || linea.startsWith("#")) {
                	
                	 continue;
                	
                }
               
                String[] partes = linea.split("=", 2);
               
                if (partes.length == 2) {
                  
                	props.setProperty(partes[0].trim(), partes[1].trim());
                
                }
            
            }
       
        } catch (IOException e) {
       
        	e.printStackTrace();
        
        }

        return props;
    }
	
}
