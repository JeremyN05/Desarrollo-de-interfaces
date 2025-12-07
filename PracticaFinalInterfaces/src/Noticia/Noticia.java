package Noticia;

import javax.swing.JPanel;

import App.GestionNoticias;
import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.LeerUsuario;
import DatosUsuarios.Usuarios;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class Noticia extends JPanel{

	private GestionNoticias gestion;
	
	public Noticia(GestionNoticias gestion) {
		setBackground(new Color(255, 160, 122));
		
		this.gestion = gestion;
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menú Noticias");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(202, 44, 299, 48);
		add(lblNewLabel);
		
		JLabel Economia = new JLabel("Economía");
		Economia.setForeground(new Color(0, 0, 0));
		Economia.setHorizontalAlignment(SwingConstants.CENTER);
		Economia.setFont(new Font("Arial", Font.BOLD, 20));
		Economia.setBounds(34, 117, 144, 39);
		add(Economia);
		
		JLabel Deportes = new JLabel("Deportes");
		Deportes.setForeground(new Color(0, 0, 0));
		Deportes.setHorizontalAlignment(SwingConstants.CENTER);
		Deportes.setFont(new Font("Arial", Font.BOLD, 20));
		Deportes.setBounds(274, 117, 144, 39);
		add(Deportes);
		
		JLabel Nacional = new JLabel("Nacional");
		Nacional.setForeground(new Color(0, 0, 0));
		Nacional.setHorizontalAlignment(SwingConstants.CENTER);
		Nacional.setFont(new Font("Arial", Font.BOLD, 20));
		Nacional.setBounds(504, 117, 144, 39);
		add(Nacional);
		
		JButton btEconomia = new JButton("");
		btEconomia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   
				Usuarios usuario = GuardarUsuario.getUsuarioActual();

			    if (usuario == null) {
			     
			    	System.out.println("No hay usuario logueado");
			        return;
			    
			    }

			    int id = usuario.getId();

			    List<String> cargarPreferencias = CargarPreferencias.cargarPreferencias(id);

			    if (usuario.isAdmin() || cargarPreferencias.contains("E")) {
			    
			    	gestion.mostrarEconomia();
			    
			    }
				
			}
		});
		btEconomia.setBackground(new Color(255, 160, 122));
		btEconomia.setBorder(null);
		btEconomia.setBounds(34, 162, 144, 144);
		btEconomia.setIcon(new ImageIcon("src/Imagenes/iconoEconomia.png"));
		add(btEconomia);
		
		JButton btDeportes = new JButton("");
		btDeportes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuarios usuario = GuardarUsuario.getUsuarioActual();

			    if (usuario == null) {
			     
			    	System.out.println("No hay usuario logueado");
			        return;
			    
			    }

			    int id = usuario.getId();

			    List<String> cargarPreferencias = CargarPreferencias.cargarPreferencias(id);
				
			    if (usuario.isAdmin() || cargarPreferencias.contains("D")) {
				    
			    	gestion.mostrarDeportes();
			    
			    }
			
			}
		});
		btDeportes.setBorder(null);
		btDeportes.setBackground(new Color(255, 160, 122));
		btDeportes.setBounds(274, 162, 144, 144);
		btDeportes.setIcon(new ImageIcon("src/Imagenes/iconoDeportes.png"));
		add(btDeportes);
		
		JButton btNacional = new JButton("");
		btNacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuarios usuario = GuardarUsuario.getUsuarioActual();

			    if (usuario == null) {
			     
			    	System.out.println("No hay usuario logueado");
			        return;
			    
			    }

			    int id = usuario.getId();

			    List<String> cargarPreferencias = CargarPreferencias.cargarPreferencias(id);
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("N")) {
				    
			    	gestion.mostrarNacional();
			    
			    }
				
			}
		});
		btNacional.setBackground(new Color(255, 160, 122));
		btNacional.setBorder(null);
		btNacional.setBounds(504, 162, 144, 144);
		btNacional.setIcon(new ImageIcon("src/Imagenes/iconoNacional.png"));
		add(btNacional);
		
		JLabel Internacional = new JLabel("Internacional");
		Internacional.setForeground(new Color(0, 0, 0));
		Internacional.setHorizontalAlignment(SwingConstants.CENTER);
		Internacional.setFont(new Font("Arial", Font.BOLD, 20));
		Internacional.setBounds(34, 344, 144, 39);
		add(Internacional);
		
		JLabel Videojuegos = new JLabel("VideoJuegos");
		Videojuegos.setForeground(new Color(0, 0, 0));
		Videojuegos.setHorizontalAlignment(SwingConstants.CENTER);
		Videojuegos.setFont(new Font("Arial", Font.BOLD, 20));
		Videojuegos.setBounds(274, 344, 144, 39);
		add(Videojuegos);
		
		JLabel Anime = new JLabel("Anime");
		Anime.setForeground(new Color(0, 0, 0));
		Anime.setHorizontalAlignment(SwingConstants.CENTER);
		Anime.setFont(new Font("Arial", Font.BOLD, 20));
		Anime.setBounds(504, 344, 144, 39);
		add(Anime);
		
		JButton btInternacional = new JButton("");
		btInternacional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuarios usuario = GuardarUsuario.getUsuarioActual();

			    if (usuario == null) {
			     
			    	System.out.println("No hay usuario logueado");
			        return;
			    
			    }

			    int id = usuario.getId();

			    List<String> cargarPreferencias = CargarPreferencias.cargarPreferencias(id);
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("I")) {
				    
			    	gestion.mostrarInternacional();
			    
			    }
				
			}
		});
		btInternacional.setBorder(null);
		btInternacional.setBackground(new Color(255, 160, 122));
		btInternacional.setBounds(34, 394, 144, 144);
		btInternacional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoInternacional.png")));
		add(btInternacional);
		
		JButton btVideojuegos = new JButton("");
		btVideojuegos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuarios usuario = GuardarUsuario.getUsuarioActual();

			    if (usuario == null) {
			     
			    	System.out.println("No hay usuario logueado");
			        return;
			    
			    }

			    int id = usuario.getId();

			    List<String> cargarPreferencias = CargarPreferencias.cargarPreferencias(id);
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("V")) {
				    
			    	gestion.mostrarVideojuegos();
			    
			    }
				
			}
		});
		btVideojuegos.setBorder(null);
		btVideojuegos.setBackground(new Color(255, 160, 122));
		btVideojuegos.setBounds(274, 394, 144, 144);
		btVideojuegos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoVideojuegos.png")));
		add(btVideojuegos);
		
		JButton btAnime = new JButton("");
		btAnime.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuarios usuario = GuardarUsuario.getUsuarioActual();

			    if (usuario == null) {
			     
			    	System.out.println("No hay usuario logueado");
			        return;
			    
			    }

			    int id = usuario.getId();

			    List<String> cargarPreferencias = CargarPreferencias.cargarPreferencias(id);
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("A")) {
				    
			    	gestion.mostrarAnime();
			    
			    }
				
			}
		});
		btAnime.setBackground(new Color(255, 160, 122));
		btAnime.setBorder(null);
		btAnime.setBounds(504, 394, 144, 144);
		btAnime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoAnime.png")));
		add(btAnime);
		
		JButton cerrarSesion = new JButton("Cerrar Sesión");
		cerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestion.mostrarInicioSesion();
				
			}
		});
		cerrarSesion.setForeground(Color.BLACK);
		cerrarSesion.setFont(new Font("Arial", Font.BOLD, 10));
		cerrarSesion.setBorder(null);
		cerrarSesion.setBackground(new Color(255, 160, 122));
		cerrarSesion.setBounds(547, 28, 101, 20);
		add(cerrarSesion);
		
	}
}
