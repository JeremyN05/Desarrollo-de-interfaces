package Preferencias;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import App.GestionNoticias;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Preferencia extends JPanel{
	
	private GestionNoticias gestion;
	
	public Preferencia(GestionNoticias gestion) {
		
		this.gestion = gestion;
		
		setBackground(new Color(204, 51, 51));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Preferencias");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(57, 70, 580, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione:");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(77, 150, 118, 31);
		add(lblNewLabel_1);
		
		JCheckBox Economia = new JCheckBox("Economía");
		Economia.setHorizontalAlignment(SwingConstants.CENTER);
		Economia.setBackground(new Color(204, 51, 51));
		Economia.setFont(new Font("Arial", Font.BOLD, 18));
		Economia.setBounds(57, 230, 138, 35);
		add(Economia);
		
		JCheckBox Deportes = new JCheckBox("Deportes");
		Deportes.setHorizontalAlignment(SwingConstants.CENTER);
		Deportes.setFont(new Font("Arial", Font.BOLD, 18));
		Deportes.setBackground(new Color(204, 51, 51));
		Deportes.setBounds(290, 230, 130, 35);
		add(Deportes);
		
		JCheckBox Nacional = new JCheckBox("Nacional");
		Nacional.setHorizontalAlignment(SwingConstants.CENTER);
		Nacional.setFont(new Font("Arial", Font.BOLD, 18));
		Nacional.setBackground(new Color(204, 51, 51));
		Nacional.setBounds(507, 230, 130, 35);
		add(Nacional);
		
		JCheckBox Internacional = new JCheckBox("Internacional");
		Internacional.setHorizontalAlignment(SwingConstants.CENTER);
		Internacional.setFont(new Font("Arial", Font.BOLD, 18));
		Internacional.setBackground(new Color(204, 51, 51));
		Internacional.setBounds(60, 358, 156, 35);
		add(Internacional);
		
		JCheckBox Videojuegos = new JCheckBox("Videojuegos");
		Videojuegos.setHorizontalAlignment(SwingConstants.CENTER);
		Videojuegos.setFont(new Font("Arial", Font.BOLD, 18));
		Videojuegos.setBackground(new Color(204, 51, 51));
		Videojuegos.setBounds(301, 358, 138, 35);
		add(Videojuegos);
		
		JCheckBox Anime = new JCheckBox("Anime");
		Anime.setHorizontalAlignment(SwingConstants.CENTER);
		Anime.setFont(new Font("Arial", Font.BOLD, 18));
		Anime.setBackground(new Color(204, 51, 51));
		Anime.setBounds(503, 358, 124, 35);
		add(Anime);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton.setBounds(530, 464, 97, 35);
		add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Atrás");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestion.mostrarInicioSesion();
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 16));
		btnNewButton_1.setBounds(57, 464, 97, 35);
		add(btnNewButton_1);
	}
}
