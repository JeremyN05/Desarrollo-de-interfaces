package Noticia;

import javax.swing.JPanel;

import App.GestionNoticias;
import Titulares.TituAnime;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Anime extends JPanel{
	
	private GestionNoticias gestion;
	
	public Anime(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
		
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblNoticiasAnime = new JLabel("Noticias Anime");
		lblNoticiasAnime.setFont(new Font("Arial", Font.BOLD, 30));
		lblNoticiasAnime.setBounds(240, 62, 230, 36);
		add(lblNoticiasAnime);
		
		JLabel kudasai = new JLabel("Kudasai:");
		kudasai.setFont(new Font("Arial", Font.BOLD, 24));
		kudasai.setBounds(41, 130, 110, 24);
		add(kudasai);
		
		JTextArea noticiaAn = new JTextArea();
		noticiaAn.setWrapStyleWord(true);
		noticiaAn.setText("¡ALONSO ENTRA CUARTO EN Q3!");
		noticiaAn.setLineWrap(true);
		noticiaAn.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaAn.setEditable(false);
		noticiaAn.setBackground(new Color(255, 160, 122));
		noticiaAn.setBounds(41, 164, 617, 75);
		
		try {
			
			noticiaAn.setText(TituAnime.cargarTitulares());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaAn);
		
		JLabel elPais = new JLabel("ElPais:");
		elPais.setFont(new Font("Arial", Font.BOLD, 24));
		elPais.setBounds(41, 251, 90, 24);
		add(elPais);
		
		JTextArea noticiaAn_2 = new JTextArea();
		noticiaAn_2.setWrapStyleWord(true);
		noticiaAn_2.setText("¡ALONSO ENTRA CUARTO EN Q3!");
		noticiaAn_2.setLineWrap(true);
		noticiaAn_2.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaAn_2.setEditable(false);
		noticiaAn_2.setBackground(new Color(255, 160, 122));
		noticiaAn_2.setBounds(41, 285, 617, 75);
		
		try {
			
			noticiaAn_2.setText(TituAnime.cargarTitulares2());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaAn_2);
		
		JLabel milenio = new JLabel("Milenio:");
		milenio.setFont(new Font("Arial", Font.BOLD, 24));
		milenio.setBounds(41, 370, 101, 24);
		add(milenio);
		
		JTextArea noticiaAn_3 = new JTextArea();
		noticiaAn_3.setWrapStyleWord(true);
		noticiaAn_3.setText("¡ALONSO ENTRA CUARTO EN Q3!");
		noticiaAn_3.setLineWrap(true);
		noticiaAn_3.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaAn_3.setEditable(false);
		noticiaAn_3.setBackground(new Color(255, 160, 122));
		noticiaAn_3.setBounds(41, 404, 617, 75);
		
		try {
			
			noticiaAn_3.setText(TituAnime.cargarTitulares3());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaAn_3);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestionNoticias.mostrarNoticia();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(41, 505, 101, 36);
		add(btnNewButton);
		
		JButton cerrarSesion = new JButton("Cerrar Sesión");
		cerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestionNoticias.mostrarInicioSesion();
				
			}
		});
		cerrarSesion.setBackground(new Color(255, 160, 122));
		cerrarSesion.setFont(new Font("Arial", Font.BOLD, 10));
		cerrarSesion.setBorder(null);
		cerrarSesion.setForeground(new Color(0, 0, 0));
		cerrarSesion.setBounds(557, 28, 101, 20);
		add(cerrarSesion);
		
		JButton cerrarPrograma = new JButton("");
		cerrarPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int opcion = javax.swing.JOptionPane.showConfirmDialog(
                        
                		Anime.this,
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
		cerrarPrograma.setBorder(null);
		cerrarPrograma.setBackground(new Color(255, 160, 122));
		cerrarPrograma.setBounds(519, 28, 28, 22);
		cerrarPrograma.setIcon(new ImageIcon("src/Imagenes/apagar.png"));
		add(cerrarPrograma);
	}
}
