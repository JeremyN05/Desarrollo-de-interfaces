package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;

import javax.swing.SwingConstants;

import App.GestionNoticias;
import Titulares.TituDeporte;
import Titulares.TituEconomia;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Economia extends JPanel{
	
	private GestionNoticias gestion;
	
	public Economia(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
		
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Economía");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(216, 72, 262, 36);
		add(lblNewLabel);
		
		JLabel expansion = new JLabel("Expansión:");
		expansion.setFont(new Font("Arial", Font.BOLD, 24));
		expansion.setBounds(41, 130, 143, 24);
		add(expansion);
		
		JTextArea noticiaEc = new JTextArea();
		noticiaEc.setEditable(false);
		noticiaEc.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaEc.setBackground(new Color(255, 160, 122));
		noticiaEc.setWrapStyleWord(true);
		noticiaEc.setLineWrap(true);
		noticiaEc.setBounds(41, 164, 617, 75);
		
		try {
			
			noticiaEc.setText(TituEconomia.cargarTitulares());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaEc);
		
		JLabel cincoDias = new JLabel("CincoDías:");
		cincoDias.setFont(new Font("Arial", Font.BOLD, 24));
		cincoDias.setBounds(41, 251, 143, 24);
		add(cincoDias);
		
		JTextArea noticiaEc_2 = new JTextArea();
		noticiaEc_2.setEditable(false);
		noticiaEc_2.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaEc_2.setWrapStyleWord(true);
		noticiaEc_2.setLineWrap(true);
		noticiaEc_2.setBackground(new Color(255, 160, 122));
		noticiaEc_2.setBounds(41, 285, 617, 75);
		
		try {
			
			noticiaEc_2.setText(TituEconomia.cargarTitulares2());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaEc_2);
		
		JLabel ecDig = new JLabel("Economía Digital:");
		ecDig.setFont(new Font("Arial", Font.BOLD, 24));
		ecDig.setBounds(41, 370, 220, 24);
		add(ecDig);
		
		JTextArea noticiaEc_3 = new JTextArea();
		noticiaEc_3.setEditable(false);
		noticiaEc_3.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaEc_3.setWrapStyleWord(true);
		noticiaEc_3.setLineWrap(true);
		noticiaEc_3.setBackground(new Color(255, 160, 122));
		noticiaEc_3.setBounds(41, 404, 617, 75);
		
		try {
			
			noticiaEc_3.setText(TituEconomia.cargarTitulares3());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaEc_3);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestion.mostrarNoticia();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(41, 505, 102, 36);
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
	}

	
	
}
