package Admin;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import App.GestionNoticias;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgregarUsuario extends JPanel{
	
	private GestionNoticias gestion;
	private JTextField nombreUsu;
	private JTextField gmailUsu;
	private JTextField admin;
	private JPasswordField passwordField;
	
	public AgregarUsuario(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
		
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblAadirUsuario = new JLabel("Añadir Usuario");
		lblAadirUsuario.setBackground(new Color(255, 127, 80));
		lblAadirUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblAadirUsuario.setFont(new Font("Arial", Font.BOLD, 30));
		lblAadirUsuario.setBounds(172, 53, 340, 48);
		add(lblAadirUsuario);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(38, 114, 104, 34);
		add(lblNewLabel);
		
		nombreUsu = new JTextField();
		nombreUsu.setFont(new Font("Arial", Font.PLAIN, 14));
		nombreUsu.setBounds(38, 155, 626, 31);
		add(nombreUsu);
		nombreUsu.setColumns(10);
		
		JLabel lblNewLabel1 = new JLabel("Contraseña:");
		lblNewLabel1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel1.setBounds(38, 210, 128, 33);
		add(lblNewLabel1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(38, 251, 625, 30);
		add(passwordField);
		
		JLabel lblNewLabel2 = new JLabel("Gmail:");
		lblNewLabel2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel2.setBounds(38, 306, 82, 32);
		add(lblNewLabel2);
		
		gmailUsu = new JTextField();
		gmailUsu.setFont(new Font("Arial", Font.PLAIN, 14));
		gmailUsu.setColumns(10);
		gmailUsu.setBounds(38, 347, 624, 29);
		add(gmailUsu);
		
		JLabel lblNewLabel3 = new JLabel("Es admin, indique si o no:");
		lblNewLabel3.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel3.setBounds(38, 402, 256, 32);
		add(lblNewLabel3);
		
		admin = new JTextField();
		admin.setFont(new Font("Arial", Font.PLAIN, 14));
		admin.setColumns(10);
		admin.setBounds(38, 443, 624, 28);
		add(admin);
		
		JButton btnNewButton = new JButton("Crear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    String nombre = nombreUsu.getText().trim();
			    String correo = gmailUsu.getText().trim();
			    String contrasena = new String(passwordField.getPassword()).trim();
			    
			    String adminText = admin.getText().trim().toLowerCase();
			    boolean isAdmin = adminText.equalsIgnoreCase("Si");

			    if(nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
			        
			    	System.out.println("Por favor, complete todos los campos");
			        return;
			    
			    }

			    CrearUsuario.crearUsuario(nombre, contrasena, correo, isAdmin);

			    System.out.println("Usuario creado correctamente: " + nombre);

			    nombreUsu.setText("");
			    gmailUsu.setText("");
			    passwordField.setText("");
			    admin.setText("");
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(566, 502, 98, 42);
		add(btnNewButton);
		
		JButton atras = new JButton("Atrás");
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestionNoticias.mostrarMenuAdmin();
				
			}
		});
		atras.setFont(new Font("Arial", Font.BOLD, 14));
		atras.setBounds(38, 503, 97, 41);
		add(atras);
		
		JButton cerrarSesion = new JButton("Cerrar Sesión");
		cerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestionNoticias.mostrarInicioSesion();
				
			}
		});
		cerrarSesion.setForeground(Color.BLACK);
		cerrarSesion.setFont(new Font("Arial", Font.BOLD, 10));
		cerrarSesion.setBorder(null);
		cerrarSesion.setBackground(new Color(255, 160, 122));
		cerrarSesion.setBounds(566, 36, 101, 20);
		add(cerrarSesion);
		
	}
}
