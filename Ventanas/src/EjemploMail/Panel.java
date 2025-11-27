package EjemploMail;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Panel extends JPanel{
	public Panel() {
		setBackground(new Color(0, 204, 255));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enviar E-MAIL");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setBounds(138, 49, 184, 30);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Pulsa");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Operaciones.crearEMAIL();
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(175, 125, 104, 33);
		add(btnNewButton);
		
		
		
	}
}
