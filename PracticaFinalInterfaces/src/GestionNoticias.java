
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Preferencias.Preferencia;
import Sesion.InicioSesion;

public class GestionNoticias extends JFrame{

	private static JFrame miPantallaCarga;
	private static JPanel miPanel;
	private static JPanel preferencia;
	
	public GestionNoticias() {
		
		setTitle("Enviar email");
		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/noticias.png"));
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,700,600);
		getContentPane().add(layeredPane);
		
		miPantallaCarga = new PantallaCarga();
		miPanel = new InicioSesion();
		preferencia = new Preferencia();
		
		miPantallaCarga.setBounds(0,0,700,600);
		miPanel.setBounds(0,0,700,600);
		preferencia.setBounds(0,0,700,600);
		
		miPantallaCarga.setVisible(true);
		
		miPanel.setVisible(false);
		layeredPane.add(miPanel);
		
		preferencia.setVisible(false);
		layeredPane.add(preferencia);
		
	}
	
	public static void mostrarInicioSesion() {
		
		miPantallaCarga.setVisible(false);
		miPanel.setVisible(true);
		preferencia.setVisible(false);
		
	}
	
	public static void mostrarPreferencia() {
		
		miPantallaCarga.setVisible(false);
		miPanel.setVisible(false);
		preferencia.setVisible(true);
		
	}
	
}
