package Sesion;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class InicioSesion extends JPanel{
	
	private JTextField textField;
	private JTextField textField_1;
	
	public InicioSesion() {
		
		setBackground(new Color(153, 255, 255));
		setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(172, 208, 340, 33);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(172, 318, 340, 33);
		add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("INICIO SESIÓN");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(172, 53, 340, 48);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE USUARIO:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(172, 173, 218, 24);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CONTRASEÑA:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_2.setBounds(172, 283, 204, 24);
		add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Pulsa");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 20));
		btnNewButton.setBounds(280, 406, 133, 48);
		add(btnNewButton);
	}
}
