import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Ejemplo6 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo6 window = new Ejemplo6();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo6() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\DAM\\Documents\\icono.jpg"));
		frame.setBounds(100, 100, 830, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(buscarImagen()); //Se añade un panel con una imagen
	}
	
	private Component buscarImagen() {
		
		//Cargar imagen
		
		BufferedImage fondo = null;
		try {
			
			fondo = ImageIO.read(getClass().getResource("/fondo.jpg"));
			
		}catch(IOException e) {
			
			e.printStackTrace();
			
		}
		
		//Asignar la imagen a un panel
		
		Image foto = fondo;
		JPanel panelConFondo = new JPanel() {
			
			private static final long serialVersionUID = 1L;
			
			@Override
			protected void paintComponent(Graphics g) {
				
				super.paintComponent(g);
				g.drawImage(foto, 0, 0, 814, 600,null);
				
			}
			
		};
		
		return panelConFondo;
	}

}
