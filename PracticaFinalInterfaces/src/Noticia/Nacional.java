package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import java.util.List;

import javax.swing.JTextArea;

import App.GestionNoticias;
import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.Usuarios;
import Titulares.TituAnime;
import Titulares.TituNacional;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nacional extends JPanel{

	private GestionNoticias gestion;
	private JTextArea noticiaNac;
	private JTextArea noticiaNac_2;
	private JTextArea noticiaNac_3;


	public Nacional(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
		
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblNoticiasNacional = new JLabel("Noticias Nacional");
		lblNoticiasNacional.setFont(new Font("Arial", Font.BOLD, 30));
		lblNoticiasNacional.setBounds(216, 62, 262, 36);
		add(lblNoticiasNacional);
		
		JLabel publico = new JLabel("Público:");
		publico.setFont(new Font("Arial", Font.BOLD, 24));
		publico.setBounds(41, 130, 107, 24);
		add(publico);
		
		noticiaNac = new JTextArea();
		noticiaNac.setWrapStyleWord(true);
		noticiaNac.setText("");
		noticiaNac.setLineWrap(true);
		noticiaNac.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaNac.setEditable(false);
		noticiaNac.setBackground(new Color(255, 160, 122));
		noticiaNac.setBounds(41, 164, 617, 75);		
		add(noticiaNac);
		
		JLabel elDiario = new JLabel("elDiario:");
		elDiario.setFont(new Font("Arial", Font.BOLD, 24));
		elDiario.setBounds(41, 251, 107, 24);
		add(elDiario);
		
		noticiaNac_2 = new JTextArea();
		noticiaNac_2.setWrapStyleWord(true);
		noticiaNac_2.setText("");
		noticiaNac_2.setLineWrap(true);
		noticiaNac_2.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaNac_2.setEditable(false);
		noticiaNac_2.setBackground(new Color(255, 160, 122));
		noticiaNac_2.setBounds(41, 285, 616, 75);
		add(noticiaNac_2);
		
		JLabel laRazon = new JLabel("La Razón:");
		laRazon.setFont(new Font("Arial", Font.BOLD, 24));
		laRazon.setBounds(41, 370, 122, 24);
		add(laRazon);
		
		noticiaNac_3 = new JTextArea();
		noticiaNac_3.setWrapStyleWord(true);
		noticiaNac_3.setText("");
		noticiaNac_3.setLineWrap(true);
		noticiaNac_3.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaNac_3.setEditable(false);
		noticiaNac_3.setBackground(new Color(255, 160, 122));
		noticiaNac_3.setBounds(42, 404, 616, 75);
		
		try {
			
			noticiaNac_3.setText(TituNacional.cargarTitulares3());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaNac_3);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestion.mostrarNoticia();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(41, 490, 102, 36);
		add(btnNewButton);
		
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
		cerrarSesion.setBounds(557, 28, 101, 20);
		add(cerrarSesion);
		
		JButton cerrarPrograma = new JButton("");
		cerrarPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int opcion = javax.swing.JOptionPane.showConfirmDialog(
                        
                		Nacional.this,
                        "¿Está usted seguro de cerrar el programa?",
                        "Confirmar salida",
                        javax.swing.JOptionPane.YES_NO_OPTION,
                        javax.swing.JOptionPane.WARNING_MESSAGE
                );

                if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                    System.exit(0);
                
                }

			}
		});
		cerrarPrograma.setBorder(null);
		cerrarPrograma.setBackground(new Color(255, 160, 122));
		cerrarPrograma.setBounds(519, 28, 28, 22);
		cerrarPrograma.setIcon(new ImageIcon("src/Imagenes/apagar.png"));
		add(cerrarPrograma);
	}
	
	public void actualizarNoticias() {

	    Usuarios usuario = GuardarUsuario.getUsuarioActual();
	    if (usuario == null) return;

	    List<String> prefs = CargarPreferencias.cargarPreferencias(usuario.getId());

	    noticiaNac.setVisible(false);
	    noticiaNac_2.setVisible(false);
	    noticiaNac_3.setVisible(false);

	    try {
	        if (usuario.isAdmin() || prefs.contains("A1")) {
	        	noticiaNac.setText(TituNacional.cargarTitulares());
	        	noticiaNac.setVisible(true);
	        }

	        if (usuario.isAdmin() || prefs.contains("A2")) {
	        	noticiaNac_2.setText(TituNacional.cargarTitulares2());
	        	noticiaNac_2.setVisible(true);
	        }

	        if (usuario.isAdmin() || prefs.contains("A3")) {
	        	noticiaNac_3.setText(TituNacional.cargarTitulares3());
	        	noticiaNac_3.setVisible(true);
	        }

	    } catch (IOException e) {
	    
	    	e.printStackTrace();
	   
	    }

	}
	
}
