package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextArea;

import Titulares.TituDeporte;
import javax.swing.JButton;

public class Deporte extends JPanel{
	
	JTextArea noticiaDep;
	JTextArea noticiaDep_2;
	
	public Deporte() {
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Noticias Deportes");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(216, 62, 262, 36);
		add(lblNewLabel);
		
		JLabel Marca = new JLabel("Marca:");
		Marca.setFont(new Font("Arial", Font.BOLD, 24));
		Marca.setBounds(41, 136, 86, 24);
		add(Marca);
		
		noticiaDep = new JTextArea();
		noticiaDep.setWrapStyleWord(true);
		noticiaDep.setLineWrap(true);
		noticiaDep.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaDep.setEditable(false);
		noticiaDep.setBackground(new Color(255, 160, 122));
		noticiaDep.setBounds(41, 174, 618, 52);
		
		try {
			
			noticiaDep.setText(TituDeporte.cargarTitulares());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaDep);
		
		JLabel As = new JLabel("As:");
		As.setFont(new Font("Arial", Font.BOLD, 24));
		As.setBounds(41, 234, 86, 24);
		add(As);
		
		noticiaDep_2 = new JTextArea();
		noticiaDep_2.setLineWrap(true);
		noticiaDep_2.setWrapStyleWord(true);
		noticiaDep_2.setText("UN SORTEO CONDICIONADO Y CON TRAMPAS");
		noticiaDep_2.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaDep_2.setEditable(false);
		noticiaDep_2.setBackground(new Color(255, 160, 122));
		noticiaDep_2.setBounds(41, 269, 618, 52);
		
		try {
			
			noticiaDep_2.setText(TituDeporte.cargarTitulares2());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaDep_2);
		
		JLabel Sport = new JLabel("Sport:");
		Sport.setFont(new Font("Arial", Font.BOLD, 24));
		Sport.setBounds(41, 332, 86, 24);
		add(Sport);
		
		JTextArea noticiaDep_3 = new JTextArea();
		noticiaDep_3.setWrapStyleWord(true);
		noticiaDep_3.setLineWrap(true);
		noticiaDep_3.setText("UN SORTEO CONDICIONADO Y CON TRAMPAS");
		noticiaDep_3.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaDep_3.setEditable(false);
		noticiaDep_3.setBackground(new Color(255, 160, 122));
		noticiaDep_3.setBounds(41, 367, 618, 52);
		
		try {
			
			noticiaDep_3.setText(TituDeporte.cargarTitulares3());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaDep_3);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(41, 505, 102, 36);
		add(btnNewButton);
	
	}
}
