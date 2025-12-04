package DatosUsuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerUsuario {
	
	private static final String USUARIOS_TXT  = "src" + File.separator + "Usuarios.txt";
	
	public static Usuarios comprobarUsuario(String nombre, String contraseña, ArrayList<Usuarios> listaUsuarios) {
	   
		for (Usuarios u : listaUsuarios) {
	       
	    	if (u.getNombre().equals(nombre) && u.getContrasena().equals(contraseña)) {
	           
	    		return u;
	       
	        }
	   
	    }
	    
	    return null;
	
	}
	
	public static ArrayList<Usuarios> leerUsuarios(String rutaArchivo) {
		
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(USUARIOS_TXT))) {
            
        	String linea;
            
        	while ((linea = br.readLine()) != null) {
                
        		linea = linea.trim();
                
                if (linea.isEmpty()) {
                
                	 continue;
                
                }

                boolean esAdmin = false;

                if (linea.startsWith("##")) {
                 
                	esAdmin = true;
                    linea = linea.substring(2).trim();
                
                } else if (linea.startsWith("**")) {
                
                	esAdmin = false;
                    linea = linea.substring(2).trim();
              
                }

                String[] partes = linea.split(",");

                for (int i = 0; i < partes.length; i++) {
                   
                	partes[i] = partes[i];
                
                }

                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String contraseña = partes[2];
                String gmail = partes[3];

                List<String> preferencias = new ArrayList<>();

                Usuarios u = new Usuarios(id,nombre, contraseña, gmail, esAdmin, preferencias);
                
                listaUsuarios.add(u);
                
                u.setPreferencias(preferencias);
            
        	}
        
        } catch (IOException e) {
           
        	e.printStackTrace();
        
        }

        return listaUsuarios;
    }
	
}
