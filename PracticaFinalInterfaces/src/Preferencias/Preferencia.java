package Preferencias;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Preferencia extends JPanel{
	public Preferencia() {
		setBackground(new Color(204, 51, 51));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Preferencias");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(57, 56, 580, 35);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seleccione las preferencias que usted desea ver:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel_1.setBounds(36, 112, 496, 31);
		add(lblNewLabel_1);
	}
}
