package Admin;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import App.GestionNoticias;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EliminacionUsuario extends JPanel{
	
	private JTextField textField;
	private GestionNoticias gestion;
	
	public EliminacionUsuario(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
	
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblEliminarUsuario = new JLabel("Eliminar Usuario");
		lblEliminarUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblEliminarUsuario.setFont(new Font("Arial", Font.BOLD, 30));
		lblEliminarUsuario.setBackground(new Color(255, 127, 80));
		lblEliminarUsuario.setBounds(172, 70, 340, 48);
		add(lblEliminarUsuario);
		
		JLabel lblIntroCorreo = new JLabel("Introduzca el correo del usuario a eliminar:");
		lblIntroCorreo.setFont(new Font("Arial", Font.BOLD, 20));
		lblIntroCorreo.setBounds(44, 158, 428, 33);
		add(lblIntroCorreo);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(44, 208, 608, 30);
		add(textField);
		
		JButton btnNewButton = new JButton("Atrás");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestionNoticias.mostrarMenuAdmin();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(44, 360, 100, 36);
		add(btnNewButton);
		
		JLabel lblEstado = new JLabel("");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Arial", Font.BOLD, 14));
		lblEstado.setBounds(44, 267, 608, 30);
		add(lblEstado);
		
		JButton btnNewButton2 = new JButton("Eliminar");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String correo = textField.getText();

				EliminarUsuario.eliminarUsuarioPorCorreo(correo);
				
			}
		});
		btnNewButton2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton2.setBounds(555, 360, 100, 36);
		add(btnNewButton2);
		
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
		cerrarSesion.setBounds(551, 33, 101, 20);
		add(cerrarSesion);
		
	}
}
