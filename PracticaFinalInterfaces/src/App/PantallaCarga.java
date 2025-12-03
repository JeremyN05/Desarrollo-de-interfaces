package App;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.imageio.ImageIO;
import javax.swing.JLabel;

import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Color;

public class PantallaCarga extends JPanel{
	
	private GestionNoticias gestion;
	private JPanel fondo;
	Timer tiempo;
	int i = 0;
	
	public PantallaCarga(GestionNoticias gestion) {
		
		this.gestion = gestion;
		
	    setLayout(null);
	    

	    fondo = (JPanel) buscarImagen();
	    fondo.setLayout(null);
	    fondo.setBounds(0, 0, 700, 600);
	    add(fondo);


	    JProgressBar progressBar = new JProgressBar();
	    progressBar.setBackground(new Color(255, 255, 255));
	    progressBar.setFont(new Font("Arial", Font.BOLD, 14));
	    progressBar.setForeground(new Color(204, 51, 51));
	    progressBar.setBounds(10, 499, 662, 34);
	    fondo.add(progressBar);

	    JLabel lblNewLabel = new JLabel("Cargando...");
	    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    lblNewLabel.setBounds(272, 454, 146, 32);
	    fondo.add(lblNewLabel);
	    
	    tiempo = new Timer(60, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				i++;
				progressBar.setValue(i);
				progressBar.setString(i + "%");
				
				if(i >= 100) {
					
					tiempo.stop();
					gestion.mostrarInicioSesion();
					
				}
				
			}
			
		});
		
	    tiempo.start();
	    
	}
	
	private Component buscarImagen() {
		
		//Cargar imagen
		
		BufferedImage fondo = null;
		try {
			
			fondo = ImageIO.read(getClass().getResource("/NoticiaFondo.jpg"));
			
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
				g.drawImage(foto, 0, 0, 700, 600,null);
				
			}
			
		};
		
		return panelConFondo;
	}
	
}
