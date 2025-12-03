package App;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Noticia.Noticia;
import Preferencias.Preferencia;
import Sesion.InicioSesion;

public class GestionNoticias extends JFrame{

	private JPanel miPantallaCarga;
	private JPanel miPanel;
	private JPanel preferencia;
	private JPanel noticia;
	
	public GestionNoticias() {
		
		setTitle("Enviar email");
		setSize(700, 600);
		setResizable(false);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/noticias.png"));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,700,600);
		getContentPane().add(layeredPane);
		
		miPantallaCarga = new PantallaCarga(this);
		miPanel = new InicioSesion(this);
		preferencia = new Preferencia(this);
		noticia = new Noticia(this);
		
		miPantallaCarga.setBounds(0,0,700,600);
		miPanel.setBounds(0,0,700,600);
		preferencia.setBounds(0,0,700,600);
		noticia.setBounds(0, 0, 700, 600);
		
		miPantallaCarga.setVisible(true);
		layeredPane.add(miPantallaCarga);
		
		miPanel.setVisible(false);
		layeredPane.add(miPanel);
		
		preferencia.setVisible(false);
		layeredPane.add(preferencia);
		
		noticia.setVisible(false);
		layeredPane.add(noticia);
	}
	
	public void mostrarInicioSesion() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miPantallaCarga.setVisible(false);
		miPanel.setVisible(true);
		preferencia.setVisible(false);
		noticia.setVisible(false);
		
	}
	
	public void mostrarPreferencia() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miPantallaCarga.setVisible(false);
		miPanel.setVisible(false);
		preferencia.setVisible(true);
		noticia.setVisible(false);
		
	}
	
	public void mostrarNoticia() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miPantallaCarga.setVisible(false);
		miPanel.setVisible(false);
		preferencia.setVisible(false);
		noticia.setVisible(true);
		
	}
	
}
