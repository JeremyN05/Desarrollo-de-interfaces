package DatosUsuarios;

public class GuardarUsuario {
	
	private static Usuarios usuarioActual;
	
	public static void setUsuarioActual(Usuarios usuario) {
        
		usuarioActual = usuario;
	   
	}

	public static Usuarios getUsuarioActual() {
	        
		return usuarioActual;
	    
	}
	
}
