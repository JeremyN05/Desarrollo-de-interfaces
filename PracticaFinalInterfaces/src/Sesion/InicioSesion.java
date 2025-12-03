package Sesion;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import App.GestionNoticias;
import DatosUsuarios.LeerUsuario;
import DatosUsuarios.Usuarios;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class InicioSesion extends JPanel{
	
	private GestionNoticias gestion;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;
	private JButton btnNewButton_1;
	
	public InicioSesion(GestionNoticias gestion) {
		
		this.gestion = gestion;
		
		setBackground(new Color(204, 51, 51));
		setLayout(null);
		
		
		textField = new JTextField();
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
		passwordField.setBounds(172, 318, 340, 33);
		add(passwordField);
		
		JButton btnNewButton = new JButton("Pulsa");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nombre = textField.getText();
				String contraseña = new String(passwordField.getPassword());
				
				 ArrayList<Usuarios> listaUsuarios = LeerUsuario.leerUsuarios("src/usuarios.txt");
				
				Usuarios usuarioLogueado = null;

				for (Usuarios u : listaUsuarios) {
				    if (u.getNombre().equals(nombre) && u.getContraseña().equals(contraseña)) {
				        usuarioLogueado = u;
				        break;
				    }
				}
				
				if (usuarioLogueado != null) {
		           
					System.out.println("Usuario válido: " + usuarioLogueado.getNombre());
		           
		            if (usuarioLogueado.isAdmin()) {
		           
		            	System.out.println("Es ADMIN");
		           
		            } else {
		            
		            	gestion.mostrarPreferencia();
		            
		            }

		        } else {
		          
		        	System.out.println("Usuario o contraseña incorrectos");
		        
		        }
				
			}
		});
		
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(280, 406, 133, 48);
		add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(546, 318, 41, 33);
		btnNewButton_1.setIcon(new ImageIcon("src/esconder.png"));
		add(btnNewButton_1);
		
	}

}
