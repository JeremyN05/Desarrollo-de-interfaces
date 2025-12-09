package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextArea;

import App.GestionNoticias;
import Titulares.TituVideojuegos;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Videojuegos extends JPanel{
	
	private GestionNoticias gestion;
	
	public Videojuegos(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
		
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblNoticiasVideojuegos = new JLabel("Noticias Videojuegos");
		lblNoticiasVideojuegos.setFont(new Font("Arial", Font.BOLD, 30));
		lblNoticiasVideojuegos.setBounds(202, 62, 313, 36);
		add(lblNoticiasVideojuegos);
		
		JLabel lblAs = new JLabel("As:");
		lblAs.setFont(new Font("Arial", Font.BOLD, 24));
		lblAs.setBounds(41, 130, 52, 28);
		add(lblAs);
		
		JTextArea noticiaVid = new JTextArea();
		noticiaVid.setWrapStyleWord(true);
		noticiaVid.setText("LA QUALY DECISIVA: NORRIS TÍMIDO... ALONSO CUARTO EN Q1");
		noticiaVid.setLineWrap(true);
		noticiaVid.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaVid.setEditable(false);
		noticiaVid.setBackground(new Color(255, 160, 122));
		noticiaVid.setBounds(41, 164, 617, 75);
		
		try {
			
			noticiaVid.setText(TituVideojuegos.cargarTitulares());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaVid);
		
		JLabel lblTheObjetive = new JLabel("The Objetive:");
		lblTheObjetive.setFont(new Font("Arial", Font.BOLD, 24));
		lblTheObjetive.setBounds(41, 251, 196, 28);
		add(lblTheObjetive);
		
		JTextArea noticiaVid_2 = new JTextArea();
		noticiaVid_2.setWrapStyleWord(true);
		noticiaVid_2.setText("LA QUALY DECISIVA: NORRIS TÍMIDO... ALONSO CUARTO EN Q1");
		noticiaVid_2.setLineWrap(true);
		noticiaVid_2.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaVid_2.setEditable(false);
		noticiaVid_2.setBackground(new Color(255, 160, 122));
		noticiaVid_2.setBounds(41, 285, 617, 75);
		
		try {
			
			noticiaVid_2.setText(TituVideojuegos.cargarTitulares2());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaVid_2);
		
		JTextArea noticiaVid_3 = new JTextArea();
		noticiaVid_3.setWrapStyleWord(true);
		noticiaVid_3.setText("LA QUALY DECISIVA: NORRIS TÍMIDO... ALONSO CUARTO EN Q1");
		noticiaVid_3.setLineWrap(true);
		noticiaVid_3.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaVid_3.setEditable(false);
		noticiaVid_3.setBackground(new Color(255, 160, 122));
		noticiaVid_3.setBounds(41, 404, 617, 75);
		add(noticiaVid_3);
		
		JLabel lblMarcaGamer = new JLabel("Marca Videojuegos:");
		lblMarcaGamer.setFont(new Font("Arial", Font.BOLD, 24));
		lblMarcaGamer.setBounds(41, 370, 238, 28);
		
		try {
			
			noticiaVid_3.setText(TituVideojuegos.cargarTitulares3());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(lblMarcaGamer);
		
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
                        
                		Videojuegos.this,
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
