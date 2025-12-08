package Admin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EliminarUsuario {

    private static final String USUARIOS_TXT = "src" + File.separator + "Usuarios.txt";

    public static boolean eliminarUsuarioPorCorreo(String correo) {

        File archivo = new File(USUARIOS_TXT);
        
        if (!archivo.exists()) {
           
        	System.out.println("El archivo de usuarios no existe.");
            return false;
       
        }

        List<String> lineas = new ArrayList<>();
        boolean eliminado = false;

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
           
        	String linea;

            while ((linea = br.readLine()) != null) {
                
                if (linea.contains("," + correo + ",")) {
                  
                	eliminado = true;
                    continue;
               
                }

                lineas.add(linea);
           
            }

        } catch (IOException e) {
           
        	e.printStackTrace();
            return false;
        
        }

        if (!eliminado) {
           
        	return false;
        
        }

        try (FileWriter fw = new FileWriter(archivo)) {
          
        	for (String l : lineas) {
               
        		fw.write(l + System.lineSeparator());
            
        	}
        
        } catch (IOException e) {
           
        	e.printStackTrace();
            return false;
       
        }

        return true;
    }
	
}
