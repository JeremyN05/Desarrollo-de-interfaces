package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Economia extends JPanel{
	
	public Economia() {
		
		setBackground(new Color(255, 51, 51));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Economía");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 30));
		lblNewLabel.setBounds(208, 72, 259, 43);
		add(lblNewLabel);
	}

	
	
}
