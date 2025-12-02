package DatosUsuarios;

import java.util.ArrayList;

public class LeerUsuario {
	
	public static void comprobarUsuario() {
		
		
		
	}

	public static void crearUsuarios() {
		
		ArrayList<Usuarios> usuarios = new ArrayList<>();
		
		Usuarios usuario1 = new Usuarios("Pedro", "2123Pedro", "Pedrogomez@gmail.com", false, null);
		Usuarios usuario2 = new Usuarios("Kaneki", "RyzeSan", "Ilikecofee@gmail.com", false, null);
		Usuarios usuario3 = new Usuarios("Miku", "6tim", "Merecíaganar@gmail.com", false, null);
		Usuarios usuario4 = new Usuarios("Kaouri", "20150218", "1primaverasinti@gmail.com", true, null);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		usuarios.add(usuario4);
		
	}
	
}
