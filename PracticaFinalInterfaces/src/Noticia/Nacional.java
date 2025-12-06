package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextArea;

import App.GestionNoticias;
import Titulares.TituNacional;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nacional extends JPanel{

	private GestionNoticias gestion;
	private JTextArea noticiaNac_2;


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
		
		JTextArea noticiaNac = new JTextArea();
		noticiaNac.setWrapStyleWord(true);
		noticiaNac.setText("URUGUAY Y ARABIA, CON ESPAÑA... Y EL CRUCE ¡CON EL GRUPO DE ARGENTINA!");
		noticiaNac.setLineWrap(true);
		noticiaNac.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaNac.setEditable(false);
		noticiaNac.setBackground(new Color(255, 160, 122));
		noticiaNac.setBounds(41, 164, 617, 75);
		
		try {
			
			noticiaNac.setText(TituNacional.cargarTitulares());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaNac);
		
		JLabel elDiario = new JLabel("elDiario:");
		elDiario.setFont(new Font("Arial", Font.BOLD, 24));
		elDiario.setBounds(41, 251, 107, 24);
		add(elDiario);
		
		JTextArea noticiaNac_1 = new JTextArea();
		noticiaNac_1.setWrapStyleWord(true);
		noticiaNac_1.setText("URUGUAY Y ARABIA, CON ESPAÑA... Y EL CRUCE ¡CON EL GRUPO DE ARGENTINA!");
		noticiaNac_1.setLineWrap(true);
		noticiaNac_1.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaNac_1.setEditable(false);
		noticiaNac_1.setBackground(new Color(255, 160, 122));
		noticiaNac_1.setBounds(41, 285, 616, 75);
		
		try {
			
			noticiaNac_1.setText(TituNacional.cargarTitulares2());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaNac_1);
		
		JLabel laRazon = new JLabel("La Razón:");
		laRazon.setFont(new Font("Arial", Font.BOLD, 24));
		laRazon.setBounds(41, 370, 122, 24);
		add(laRazon);
		
		noticiaNac_2 = new JTextArea();
		noticiaNac_2.setWrapStyleWord(true);
		noticiaNac_2.setText("URUGUAY Y ARABIA, CON ESPAÑA... Y EL CRUCE ¡CON EL GRUPO DE ARGENTINA!");
		noticiaNac_2.setLineWrap(true);
		noticiaNac_2.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaNac_2.setEditable(false);
		noticiaNac_2.setBackground(new Color(255, 160, 122));
		noticiaNac_2.setBounds(42, 404, 616, 75);
		
		try {
			
			noticiaNac_2.setText(TituNacional.cargarTitulares3());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaNac_2);
		
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
