package DatosUsuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CargarPreferencias {

	public static List<String> cargarPreferencias(int idUsuario) {

	    List<String> prefs = new ArrayList<>();

	    File archivo = new File("src/Data/preferencias.txt");

	    if (!archivo.exists()) {
	      
	    	return prefs;
	   
	    }

	    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

	        String linea;
	        
	        while ((linea = br.readLine()) != null) {
	            
	            if (linea.startsWith("id: " + idUsuario + "-")) {

	                String datos = linea.substring(linea.indexOf('-') + 1);

	                String[] lista = datos.split(",");

	                for (String s : lista) {
	                   
	                	if (!s.trim().isEmpty()) {
	                   
	                    	prefs.add(s.trim());
	                   
	                    }
	             
	                }
	          
	            }
	       
	        }

	    } catch (IOException e) {
	    
	    	e.printStackTrace();
	    
	    }

	    return prefs;
	}

	
}
