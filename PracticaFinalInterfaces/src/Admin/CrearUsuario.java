package Admin;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import DatosUsuarios.LeerUsuario;
import DatosUsuarios.Usuarios;

public class CrearUsuario {
	
	private static final String USUARIOS_TXT  = "src" + File.separator + "Usuarios.txt";

	public static void crearUsuario(String nombre, String contrasena, String correo, boolean isAdmin) {
        
        ArrayList<Usuarios> listaUsuarios = LeerUsuario.leerUsuarios(USUARIOS_TXT);
        
        int nuevoId = 1;
        if (!listaUsuarios.isEmpty()) {
            nuevoId = listaUsuarios.get(listaUsuarios.size() - 1).getId() + 1;
        }

        Usuarios nuevoUsuario = new Usuarios(nuevoId, nombre, contrasena, correo, isAdmin, null);

        try (FileWriter fw = new FileWriter(new File(USUARIOS_TXT), true)) {
            
            String linea;
           
            if (isAdmin) {

                linea = "##" + nuevoUsuario.getId() + "," +
                        nuevoUsuario.getNombre() + "," +
                        nuevoUsuario.getContrasena() + "," +
                        nuevoUsuario.getGmail() + "," +
                        "true,null**";
            } else {

                linea = "**" + nuevoUsuario.getId() + "," +
                        nuevoUsuario.getNombre() + "," +
                        nuevoUsuario.getContrasena() + "," +
                        nuevoUsuario.getGmail() + "," +
                        "false,null**";
            }


            fw.write(linea + System.lineSeparator());
            
        } catch (IOException e) {
         
        	e.printStackTrace();
        
        }
   
	}
	
}
