package Sesion;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import App.GestionNoticias;
import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.LeerUsuario;
import DatosUsuarios.Usuarios;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class InicioSesion extends JPanel{
	
	private GestionNoticias gestion;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JToggleButton btnNewButton_1;
	
	public InicioSesion(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
		
		setBackground(new Color(255, 127, 80));
		setLayout(null);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setBounds(172, 208, 340, 33);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("INICIO SESIÓN");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(172, 53, 340, 48);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("NOMBRE USUARIO:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(172, 173, 218, 24);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("CONTRASEÑA:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(172, 283, 204, 24);
		add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Arial", Font.PLAIN, 14));
		passwordField.setBounds(172, 318, 340, 33);
		add(passwordField);
		
		JButton btnNewButton = new JButton("Pulsa");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = textField.getText();
				String contrasena = new String(passwordField.getPassword());
				
				ArrayList<Usuarios> listaUsuarios = LeerUsuario.leerUsuarios("src/Usuarios.txt");


				Usuarios usuarioLogueado = LeerUsuario.comprobarUsuario(nombre, contrasena, listaUsuarios);
				
				if (usuarioLogueado != null) {

				    GuardarUsuario.setUsuarioActual(usuarioLogueado);
				    System.out.println("Usuario válido: " + usuarioLogueado.getNombre());

				    gestionNoticias.economia.actualizarNoticias();
				    gestionNoticias.deporte.actualizarNoticias();
				    gestionNoticias.nacional.actualizarNoticias();
				    gestionNoticias.internacional.actualizarNoticias();
				    gestionNoticias.videojuegos.actualizarNoticias();
                    gestionNoticias.anime.actualizarNoticias();
				    
				    if (usuarioLogueado.isAdmin()) {

				    	gestionNoticias.mostrarMenuAdmin();

				    } else {

				    	List<String> cargarPreferencias = CargarPreferencias.cargarPreferencias(usuarioLogueado.getId());

				        if (cargarPreferencias != null && !cargarPreferencias.isEmpty()) {
				         
				        	gestionNoticias.mostrarNoticia();
				        
				        } else {
				        
				        	gestionNoticias.mostrarSeleccionFuentes();
				       
				        }
				   
				    }

				} else {
				  
					System.out.println("Usuario o contraseña incorrectos");
				
				}
				
			}
		});
		
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(280, 406, 133, 48);
		add(btnNewButton);
		
		btnNewButton_1 = new JToggleButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			char i = passwordField.getEchoChar();
			
			public void actionPerformed(ActionEvent e) {
			    
				if (btnNewButton_1.isSelected()) {
			      
			    	passwordField.setEchoChar((char) 0);
			    
			    } else {

			        passwordField.setEchoChar(i);
			    
			    }
				
			}
		});
		btnNewButton_1.setBounds(528, 317, 34, 34);
		btnNewButton_1.setIcon(new ImageIcon("src/esconder.png"));
		add(btnNewButton_1);
		
	}

}
