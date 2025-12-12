package Admin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.Usuarios;

public class EliminarUsuario {

    private static final String USUARIOS_TXT = "src" + File.separator + "Usuarios.txt";

    public static boolean eliminarUsuarioPorCorreo(String correo) {

        Usuarios usuarioActual = GuardarUsuario.getUsuarioActual();
        
        if (usuarioActual != null && usuarioActual.getGmail().equals(correo) && usuarioActual.isAdmin()) {
        	
            JOptionPane.showMessageDialog(null, "No puedes eliminar tu propia cuenta de administrador.");
            return false;
        }
    	
        File archivo = new File(USUARIOS_TXT);
        
        if (!archivo.exists()) {
           
            JOptionPane.showMessageDialog(null, "El archivo de usuarios no existe.");
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
           
            JOptionPane.showMessageDialog(null, "Error al leer el archivo de usuarios:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE); 
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
           
            JOptionPane.showMessageDialog(null, "Error al actualizar el archivo de usuarios:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
       
        }
        JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
        return true;
    }
	
}
