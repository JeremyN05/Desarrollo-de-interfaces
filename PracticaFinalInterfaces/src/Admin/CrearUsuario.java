package Admin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DatosUsuarios.LeerUsuario;
import DatosUsuarios.Usuarios;

public class CrearUsuario {
	
	private static final String USUARIOS_TXT  = "src" + File.separator + "Usuarios.txt";

	public static void crearUsuario(String nombre, String contrasena, String correo) {
		
	    if (nombre.contains(",") || contrasena.contains(",") || correo.contains(",")) {
	        JOptionPane.showMessageDialog(null, "No se permite el uso de comas en los campos.");
	        return;
	    }
        
        ArrayList<Usuarios> listaUsuarios = LeerUsuario.leerUsuarios(USUARIOS_TXT);
        
        int nuevoId = 1;
        if (!listaUsuarios.isEmpty()) {
            nuevoId = listaUsuarios.get(listaUsuarios.size() - 1).getId() + 1;
        }

        Usuarios nuevoUsuario = new Usuarios(nuevoId, nombre, contrasena, correo, false, null);

        try (FileWriter fw = new FileWriter(new File(USUARIOS_TXT), true)) {
            
            String linea;
            
            linea = "**" + nuevoUsuario.getId() + "," + nuevoUsuario.getNombre() + "," + nuevoUsuario.getContrasena() + "," + nuevoUsuario.getGmail() + "," + "false,null**";

            fw.write(linea + System.lineSeparator());
            
            JOptionPane.showMessageDialog(null, "Usuario creado correctamente."); //Ventana emergente indicando que el usuario se creo correctamente
            
        } catch (IOException e) {
         
        	e.printStackTrace();
        
        }
   
	}
	
}
