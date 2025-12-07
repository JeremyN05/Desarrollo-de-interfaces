package DatosUsuarios;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GuardarPreferencias {

    private static final String CARPETA = "src/Data";
    private static final String ARCHIVO = CARPETA + File.separator + "preferencias.txt";

    public static void guardarPreferencias(Usuarios usuario, List<String> preferencias) {

        File carpeta = new File(CARPETA);
        if (!carpeta.exists()) carpeta.mkdir();

        File fichero = new File(ARCHIVO);
        List<String> lineas = new ArrayList<>();

        if (fichero.exists()) {
          
        	try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                
            	String linea;
               
                while ((linea = br.readLine()) != null) {
                    
                	linea = linea.trim();
                   
                    if (linea.isEmpty()) {
                    
                    	 continue;
                    	
                    }
                    
                    if (!linea.startsWith("id:" + usuario.getId() + "-")) {
                     
                    	lineas.add(linea);
                   
                    }
                
                }
           
            } catch (IOException e) {
            
            	e.printStackTrace();
            
            }
        
        }

        StringBuilder sb = new StringBuilder();
        
        sb.append("id:").append(usuario.getId()).append("-");
        
        for (int i = 0; i < preferencias.size(); i++) {

        	sb.append(preferencias.get(i));
            
            if (i != preferencias.size() - 1) {
            
            	sb.append(",");
            	
            }

        }
       
        lineas.add(sb.toString());

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
           
        	for (String l : lineas) {
             
            	bw.write(l);
                bw.newLine();
            
            }
        
        } catch (IOException e) {
          
        	e.printStackTrace();
        
        }
    
    }

}

