
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import Sesion.InicioSesion;

public class GestionNoticias extends JFrame{

	public GestionNoticias() {
		
		setTitle("Enviar email");
		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/noticias.png"));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,700,600);
		getContentPane().add(layeredPane);
		
		PantallaCarga miPantallaCarga = new PantallaCarga();
		InicioSesion miPanel = new InicioSesion();
		
		miPantallaCarga.setBounds(0,0,700,600);
		miPanel.setBounds(0,0,700,600);
		
		layeredPane.add(miPantallaCarga);
		layeredPane.add(miPanel);
		
		miPanel.setVisible(false);
		
	}
	
}
