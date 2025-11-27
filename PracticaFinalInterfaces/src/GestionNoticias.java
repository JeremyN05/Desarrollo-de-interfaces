
import javax.swing.JFrame;

import Sesion.InicioSesion;

public class GestionNoticias extends JFrame{

	public GestionNoticias() {
		
		setTitle("Enviar email");
		setSize(450, 350);
		setResizable(false);
		setLocationRelativeTo(null);
		
		InicioSesion miPanel = new InicioSesion();
		
		add(miPanel);
		
	}
	
}
