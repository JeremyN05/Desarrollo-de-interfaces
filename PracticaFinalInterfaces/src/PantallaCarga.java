import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.SwingConstants;

public class PantallaCarga extends JPanel{
	
	private JPanel fondo;
	
	public PantallaCarga() {
		
	    setLayout(null);

	    // Crear el panel de fondo
	    fondo = (JPanel) buscarImagen();
	    fondo.setLayout(null);
	    fondo.setBounds(0, 0, 700, 600);
	    add(fondo);

	    // Crear y añadir componentes dentro del fondo (NO al panel principal)
	    JProgressBar progressBar = new JProgressBar();
	    progressBar.setBounds(10, 499, 662, 34);
	    fondo.add(progressBar);

	    JLabel lblNewLabel = new JLabel("Cargando...");
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    lblNewLabel.setBounds(272, 454, 146, 32);
	    fondo.add(lblNewLabel);
		
	}
	
	private Component buscarImagen() {
		
		//Cargar imagen
		
		BufferedImage fondo = null;
		try {
			
			fondo = ImageIO.read(getClass().getResource("/fondo_noticias.png"));
			
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
