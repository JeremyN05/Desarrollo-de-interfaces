package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import App.GestionNoticias;
import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.GuardarPreferencias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.Usuarios;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class SeleccionFuentes extends JPanel{
	
	private GestionNoticias gestion;
	
	public SeleccionFuentes(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
		
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elección fuentes");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(228, 50, 250, 36);
		add(lblNewLabel);
		
		JLabel fuentes = new JLabel("Fuentes:");
		fuentes.setHorizontalAlignment(SwingConstants.CENTER);
		fuentes.setFont(new Font("Arial", Font.BOLD, 20));
		fuentes.setBounds(42, 104, 104, 24);
		add(fuentes);
		
		JLabel economia = new JLabel("Economía");
		economia.setHorizontalAlignment(SwingConstants.CENTER);
		economia.setFont(new Font("Arial", Font.BOLD, 16));
		economia.setBounds(42, 168, 104, 19);
		add(economia);
		
		JCheckBox expasion = new JCheckBox(" Expansión");
		expasion.setBackground(new Color(255, 160, 122));
		expasion.setFont(new Font("Arial", Font.PLAIN, 12));
		expasion.setBounds(52, 198, 97, 23);
		add(expasion);
		
		JCheckBox libertadDigi = new JCheckBox(" Libertad Digital");
		libertadDigi.setFont(new Font("Arial", Font.PLAIN, 12));
		libertadDigi.setBackground(new Color(255, 160, 122));
		libertadDigi.setBounds(52, 230, 118, 23);
		add(libertadDigi);
		
		JCheckBox economiaDigi = new JCheckBox(" Economía Digital");
		economiaDigi.setFont(new Font("Arial", Font.PLAIN, 12));
		economiaDigi.setBackground(new Color(255, 160, 122));
		economiaDigi.setBounds(52, 262, 129, 23);
		add(economiaDigi);
		
		JLabel deporte = new JLabel("Deporte");
		deporte.setHorizontalAlignment(SwingConstants.CENTER);
		deporte.setFont(new Font("Arial", Font.BOLD, 16));
		deporte.setBounds(316, 168, 80, 19);
		add(deporte);
		
		JCheckBox marca = new JCheckBox(" Marca");
		marca.setFont(new Font("Arial", Font.PLAIN, 12));
		marca.setBackground(new Color(255, 160, 122));
		marca.setBounds(322, 198, 80, 23);
		add(marca);
		
		JCheckBox as = new JCheckBox(" AS");
		as.setFont(new Font("Arial", Font.PLAIN, 12));
		as.setBackground(new Color(255, 160, 122));
		as.setBounds(322, 230, 80, 23);
		add(as);
		
		JCheckBox sport = new JCheckBox(" Sport");
		sport.setFont(new Font("Arial", Font.PLAIN, 12));
		sport.setBackground(new Color(255, 160, 122));
		sport.setBounds(322, 262, 80, 23);
		add(sport);
		
		JLabel nacional = new JLabel("Nacional");
		nacional.setHorizontalAlignment(SwingConstants.CENTER);
		nacional.setFont(new Font("Arial", Font.BOLD, 16));
		nacional.setBounds(532, 168, 80, 19);
		add(nacional);	
		
		JCheckBox diarioPublico = new JCheckBox(" Diario Público");
		diarioPublico.setFont(new Font("Arial", Font.PLAIN, 12));
		diarioPublico.setBackground(new Color(255, 160, 122));
		diarioPublico.setBounds(534, 198, 110, 23);
		add(diarioPublico);
		
		JCheckBox elDiario = new JCheckBox(" 20Minutos");
		elDiario.setFont(new Font("Arial", Font.PLAIN, 12));
		elDiario.setBackground(new Color(255, 160, 122));
		elDiario.setBounds(534, 230, 110, 23);
		add(elDiario);
		
		JCheckBox laRazon = new JCheckBox("La Razón");
		laRazon.setFont(new Font("Arial", Font.PLAIN, 12));
		laRazon.setBackground(new Color(255, 160, 122));
		laRazon.setBounds(534, 262, 110, 23);
		add(laRazon);
		
		JLabel internacional = new JLabel("Internacional");
		internacional.setHorizontalAlignment(SwingConstants.CENTER);
		internacional.setFont(new Font("Arial", Font.BOLD, 16));
		internacional.setBounds(54, 306, 108, 20);
		add(internacional);
		
		JCheckBox ccn = new JCheckBox(" CNN Español");
		ccn.setFont(new Font("Arial", Font.PLAIN, 12));
		ccn.setBackground(new Color(255, 160, 122));
		ccn.setBounds(54, 336, 116, 23);
		add(ccn);
		
		JCheckBox laRazonInternacional = new JCheckBox(" La Razón");
		laRazonInternacional.setFont(new Font("Arial", Font.PLAIN, 12));
		laRazonInternacional.setBackground(new Color(255, 160, 122));
		laRazonInternacional.setBounds(54, 368, 92, 23);
		add(laRazonInternacional);
		
		JCheckBox telemundo = new JCheckBox(" Telemundo");
		telemundo.setFont(new Font("Arial", Font.PLAIN, 12));
		telemundo.setBackground(new Color(255, 160, 122));
		telemundo.setBounds(54, 400, 92, 23);
		add(telemundo);
		
		JLabel videojuegos = new JLabel("Videojuegos");
		videojuegos.setHorizontalAlignment(SwingConstants.CENTER);
		videojuegos.setFont(new Font("Arial", Font.BOLD, 16));
		videojuegos.setBounds(322, 306, 108, 20);
		add(videojuegos);
		
		JCheckBox gamerReactor = new JCheckBox(" CNN Español");
		gamerReactor.setFont(new Font("Arial", Font.PLAIN, 12));
		gamerReactor.setBackground(new Color(255, 160, 122));
		gamerReactor.setBounds(324, 336, 106, 23);
		add(gamerReactor);
		
		JCheckBox theobjetive = new JCheckBox(" The Objetive");
		theobjetive.setFont(new Font("Arial", Font.PLAIN, 12));
		theobjetive.setBackground(new Color(255, 160, 122));
		theobjetive.setBounds(324, 368, 106, 23);
		add(theobjetive);
		
		JCheckBox marcaVideojuegos = new JCheckBox(" Marca");
		marcaVideojuegos.setFont(new Font("Arial", Font.PLAIN, 12));
		marcaVideojuegos.setBackground(new Color(255, 160, 122));
		marcaVideojuegos.setBounds(324, 400, 70, 23);
		add(marcaVideojuegos);
		
		JLabel anime = new JLabel("Anime");
		anime.setHorizontalAlignment(SwingConstants.CENTER);
		anime.setFont(new Font("Arial", Font.BOLD, 16));
		anime.setBounds(528, 306, 70, 20);
		add(anime);
		
		JCheckBox somoskudasai = new JCheckBox(" Somos Kudasai");
		somoskudasai.setFont(new Font("Arial", Font.PLAIN, 12));
		somoskudasai.setBackground(new Color(255, 160, 122));
		somoskudasai.setBounds(534, 336, 129, 23);
		add(somoskudasai);
		
		JCheckBox elPaisAnime = new JCheckBox(" El País");
		elPaisAnime.setFont(new Font("Arial", Font.PLAIN, 12));
		elPaisAnime.setBackground(new Color(255, 160, 122));
		elPaisAnime.setBounds(534, 368, 80, 23);
		add(elPaisAnime);
		
		JCheckBox milenio = new JCheckBox(" Milenio");
		milenio.setFont(new Font("Arial", Font.PLAIN, 12));
		milenio.setBackground(new Color(255, 160, 122));
		milenio.setBounds(534, 400, 80, 23);
		add(milenio);
		
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
				    
			    	gestionNoticias.mostrarMenuAdmin();
			    
			    }else {
			    	
			    	gestionNoticias.mostrarInicioSesion();
			    	
			    }
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(42, 488, 102, 36);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    Usuarios usuario = GuardarUsuario.getUsuarioActual();

			    List<String> prefs = new ArrayList<>();
				
			    if (expasion.isSelected()) {
			    	
			    	prefs.add("E1");
			    	
			    }
			    
			    if (libertadDigi.isSelected()) {
			    	
			    	prefs.add("E2");
			    	
			    }

			    if (economiaDigi.isSelected()) {
	
			    	prefs.add("E3");
	
			    }
			    
			    if (marca.isSelected()) {
			    	
			    	prefs.add("D1");
	
			    }
			    
			    if (as.isSelected()) {
			    	
			    	prefs.add("D2");
	
			    }
			    
			    if (sport.isSelected()) {
			    	
			    	prefs.add("D3");
	
			    }
			    
			    if (diarioPublico.isSelected()) {
			    	
			    	prefs.add("N1");
	
			    }
			    
			    if (elDiario.isSelected()) {
			    	
			    	prefs.add("N2");
	
			    }
			    
			    if (laRazon.isSelected()) {
			    	
			    	prefs.add("N3");
	
			    }
			    
			    if (ccn.isSelected()) {
			    	
			    	prefs.add("I1");
	
			    }
			    
			    if (laRazonInternacional.isSelected()) {
			    	
			    	prefs.add("I2");
	
			    }
			    
			    if (telemundo.isSelected()) {
			    	
			    	prefs.add("I3");
	
			    }
			    
			    if (gamerReactor.isSelected()) {
			    	
			    	prefs.add("V1");
	
			    }
			    
			    if (theobjetive.isSelected()) {
			    	
			    	prefs.add("V2");
	
			    }
			    
			    if (marcaVideojuegos.isSelected()) {
			    	
			    	prefs.add("V3");
	
			    }
			    
			    if (somoskudasai.isSelected()) {
			    	
			    	prefs.add("A1");
	
			    }
			    
			    if (elPaisAnime.isSelected()) {
			    	
			    	prefs.add("A2");
	
			    }
			    
			    if (milenio.isSelected()) {
			    	
			    	prefs.add("A3");
	
			    }
			    
			    GuardarPreferencias.guardarPreferencias(usuario.getId(), prefs);
			    
			    JOptionPane.showMessageDialog(null, "Preferencias guardadas correctamente, cargando titulares.");
			    
			    gestionNoticias.economia.actualizarNoticias();
			    gestionNoticias.deporte.actualizarNoticias();
			    gestionNoticias.nacional.actualizarNoticias();
			    gestionNoticias.internacional.actualizarNoticias();
			    gestionNoticias.videojuego.actualizarNoticias();
                gestionNoticias.anime.actualizarNoticias();
                
                gestion.mostrarNoticia();
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_1.setBounds(558, 488, 97, 35);
		add(btnNewButton_1);
		
	}
}
