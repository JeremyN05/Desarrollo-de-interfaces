package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;

import javax.swing.JTextArea;

import App.GestionNoticias;
import Titulares.TituInternacional;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Internacional extends JPanel{
	
	private GestionNoticias gestion;
	
	public Internacional(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
		
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblInternacional = new JLabel("Noticias Internacionales");
		lblInternacional.setFont(new Font("Arial", Font.BOLD, 30));
		lblInternacional.setBounds(170, 62, 358, 36);
		add(lblInternacional);
		
		JLabel cnn = new JLabel("CNN:");
		cnn.setFont(new Font("Arial", Font.BOLD, 24));
		cnn.setBounds(41, 130, 85, 24);
		add(cnn);
		
		JTextArea noticiaInt = new JTextArea();
		noticiaInt.setWrapStyleWord(true);
		noticiaInt.setText("ALONSO EL INVITADO SORPRESA EN LA PELEA POR EL TÍTULO");
		noticiaInt.setLineWrap(true);
		noticiaInt.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaInt.setEditable(false);
		noticiaInt.setBackground(new Color(255, 160, 122));
		noticiaInt.setBounds(41, 164, 617, 75);
		
		try {
			
			noticiaInt.setText(TituInternacional.cargarTitulares());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaInt);
		
		JLabel laRazon = new JLabel("La Razón:");
		laRazon.setFont(new Font("Arial", Font.BOLD, 24));
		laRazon.setBounds(41, 251, 137, 24);
		add(laRazon);
		
		JTextArea noticiaInt_2 = new JTextArea();
		noticiaInt_2.setWrapStyleWord(true);
		noticiaInt_2.setText("UN SORTEO CONDICIONADO Y CON TRAMPAS");
		noticiaInt_2.setLineWrap(true);
		noticiaInt_2.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaInt_2.setEditable(false);
		noticiaInt_2.setBackground(new Color(255, 160, 122));
		noticiaInt_2.setBounds(41, 285, 617, 75);
		
		try {
			
			noticiaInt_2.setText(TituInternacional.cargarTitulares2());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaInt_2);
		
		JLabel telemundo = new JLabel("Telemundo: ");
		telemundo.setFont(new Font("Arial", Font.BOLD, 24));
		telemundo.setBounds(41, 370, 141, 24);
		add(telemundo);
		
		JTextArea noticiaInt_3 = new JTextArea();
		noticiaInt_3.setWrapStyleWord(true);
		noticiaInt_3.setText("UN SORTEO CONDICIONADO Y CON TRAMPAS");
		noticiaInt_3.setLineWrap(true);
		noticiaInt_3.setFont(new Font("Arial", Font.PLAIN, 18));
		noticiaInt_3.setEditable(false);
		noticiaInt_3.setBackground(new Color(255, 160, 122));
		noticiaInt_3.setBounds(41, 404, 617, 75);
		
		try {
			
			noticiaInt_3.setText(TituInternacional.cargarTitulares3());
		
		} catch (IOException e) {
			
			e.printStackTrace();
		
		}
		
		add(noticiaInt_3);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestion.mostrarNoticia();
				
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
                        
                		Internacional.this,
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
