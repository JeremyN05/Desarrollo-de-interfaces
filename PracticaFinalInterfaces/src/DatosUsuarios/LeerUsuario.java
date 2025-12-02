package DatosUsuarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerUsuario {
	
	private static final String USUARIOS_TXT  = "src" + File.separator + "Usuarios.txt";
	
	public static Usuarios comprobarUsuario(String nombre, String contraseña, ArrayList<Usuarios> listaUsuarios) {
	   
		for (Usuarios u : listaUsuarios) {
	       
	    	if (u.getNombre().equals(nombre) && u.getContraseña().equals(contraseña)) {
	           
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
                if (linea.isEmpty()) continue;

                boolean esAdmin = false;

                if (linea.startsWith("##")) {
                    esAdmin = true;
                    linea = linea.substring(2).trim();
                } else if (linea.startsWith("**")) {
                    esAdmin = false;
                    linea = linea.substring(2).trim();
                }

                String[] partes = linea.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");

                for (int i = 0; i < partes.length; i++) {
                    partes[i] = partes[i].trim().replaceAll("^\"|\"$", "");
                }

                String nombre = partes[0];
                String contraseña = partes[1];
                String gmail = partes[2];

                ArrayList<Preferencias> preferencias = new ArrayList<>();

                Usuarios u = new Usuarios(nombre, contraseña, gmail, esAdmin, preferencias);
                listaUsuarios.add(u);
            }
        
        } catch (IOException e) {
           
        	e.printStackTrace();
        
        }

        return listaUsuarios;
    }
	
}
