package Noticia;

import javax.swing.JPanel;

import App.GestionNoticias;
import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.Usuarios;
import Mail.EnviarCorreo;

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
	private static JButton btGuardarNoticias;
	
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
		
		btGuardarNoticias = new JButton("Guardar noticias");
		btGuardarNoticias.setVisible(false);
		btGuardarNoticias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				GuardarNoticias.guardarNoticias();
				
			}
		});
		btGuardarNoticias.setFont(new Font("Arial", Font.BOLD, 10));
		btGuardarNoticias.setBorder(null);
		btGuardarNoticias.setBackground(new Color(255, 160, 122));
		btGuardarNoticias.setBounds(34, 28, 100, 20);
		add(btGuardarNoticias);
		
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

			    if (usuario.isAdmin() || cargarPreferencias.contains("E1")) {
			    
			    	gestion.mostrarEconomia();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("E2")) {
				    
			    	gestion.mostrarEconomia();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("E3")) {
				    
			    	gestion.mostrarEconomia();
			    
			    }
				
			}
		});
		btEconomia.setBackground(new Color(255, 160, 122));
		btEconomia.setBorder(null);
		btEconomia.setBounds(48, 167, 112, 112);
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
				
			    if (usuario.isAdmin() || cargarPreferencias.contains("D1")) {
				    
			    	gestion.mostrarDeportes();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("D2")) {
				    
			    	gestion.mostrarDeportes();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("D3")) {
				    
			    	gestion.mostrarDeportes();
			    
			    }
			
			}
		});
		btDeportes.setBorder(null);
		btDeportes.setBackground(new Color(255, 160, 122));
		btDeportes.setBounds(288, 167, 112, 112);
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
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("N1")) {
				    
			    	gestion.mostrarNacional();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("N2")) {
				    
			    	gestion.mostrarNacional();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("N3")) {
				    
			    	gestion.mostrarNacional();
			    
			    }
				
			}
		});
		btNacional.setBackground(new Color(255, 160, 122));
		btNacional.setBorder(null);
		btNacional.setBounds(520, 162, 112, 112);
		btNacional.setIcon(new ImageIcon("src/Imagenes/iconoNacional.png"));
		add(btNacional);
		
		JLabel Internacional = new JLabel("Internacional");
		Internacional.setForeground(new Color(0, 0, 0));
		Internacional.setHorizontalAlignment(SwingConstants.CENTER);
		Internacional.setFont(new Font("Arial", Font.BOLD, 20));
		Internacional.setBounds(34, 318, 144, 39);
		add(Internacional);
		
		JLabel Videojuegos = new JLabel("VideoJuegos");
		Videojuegos.setForeground(new Color(0, 0, 0));
		Videojuegos.setHorizontalAlignment(SwingConstants.CENTER);
		Videojuegos.setFont(new Font("Arial", Font.BOLD, 20));
		Videojuegos.setBounds(274, 318, 144, 39);
		add(Videojuegos);
		
		JLabel Anime = new JLabel("Anime");
		Anime.setForeground(new Color(0, 0, 0));
		Anime.setHorizontalAlignment(SwingConstants.CENTER);
		Anime.setFont(new Font("Arial", Font.BOLD, 20));
		Anime.setBounds(504, 318, 144, 39);
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
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("I1")) {
				    
			    	gestion.mostrarInternacional();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("I2")) {
				    
			    	gestion.mostrarInternacional();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("I3")) {
				    
			    	gestion.mostrarInternacional();
			    
			    }
				
			}
		});
		btInternacional.setBorder(null);
		btInternacional.setBackground(new Color(255, 160, 122));
		btInternacional.setBounds(48, 368, 112, 112);
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
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("V1")) {
				    
			    	gestion.mostrarVideojuegos();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("V2")) {
				    
			    	gestion.mostrarVideojuegos();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("V3")) {
				    
			    	gestion.mostrarVideojuegos();
			    
			    }
				
			}
		});
		btVideojuegos.setBorder(null);
		btVideojuegos.setBackground(new Color(255, 160, 122));
		btVideojuegos.setBounds(288, 368, 112, 112);
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
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("A1")) {
				    
			    	gestion.mostrarAnime();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("A2")) {
				    
			    	gestion.mostrarAnime();
			    
			    }
			    
			    if (usuario.isAdmin() || cargarPreferencias.contains("A3")) {
				    
			    	gestion.mostrarAnime();
			    
			    }
				
			}
		});
		btAnime.setBackground(new Color(255, 160, 122));
		btAnime.setBorder(null);
		btAnime.setBounds(520, 368, 112, 112);
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
		cerrarSesion.setBounds(582, 28, 101, 20);
		add(cerrarSesion);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuarios usuario = GuardarUsuario.getUsuarioActual();

			    if (usuario == null) {
			     
			    	System.out.println("No hay usuario logueado");
			        return;
			    
			    }

			    int id = usuario.getId();
			    
			    if (usuario.isAdmin() ) {
				    
			    	gestion.mostrarMenuAdmin();
			    
			    }else {
			    	
			    	gestion.mostrarInicioSesion();
			    	
			    }
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(34, 510, 102, 36);
		add(btnNewButton);
		
		JButton cerrarPrograma = new JButton("");
		cerrarPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int opcion = javax.swing.JOptionPane.showConfirmDialog(
                        
                		Noticia.this,
                        "¿Está usted seguro de cerrar el programa?",
                        "Confirmar salida",
                        javax.swing.JOptionPane.YES_NO_OPTION,
                        javax.swing.JOptionPane.WARNING_MESSAGE
                );

                if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                    System.exit(0);
                
                }
				
				System.exit(0);
				
			}
		});
		cerrarPrograma.setIcon(new ImageIcon("src/Imagenes/apagar.png"));
		cerrarPrograma.setBorder(null);
		cerrarPrograma.setBackground(new Color(255, 160, 122));
		cerrarPrograma.setBounds(544, 28, 28, 22);
		add(cerrarPrograma);
	
	}
	
    public void actualizarBotonGuardar() {
        
    	Usuarios usuario = GuardarUsuario.getUsuarioActual();
       
        if (usuario != null && !usuario.isAdmin()) {
        
        	btGuardarNoticias.setVisible(true);
        
        } else {
        
        	btGuardarNoticias.setVisible(false);
        
        }
        
        btGuardarNoticias.revalidate();
        btGuardarNoticias.repaint();
    
    }
	
}
