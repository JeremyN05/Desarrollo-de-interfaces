package EjercicioTraductor;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class Panel extends JPanel{
	
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	
	public Panel() {
		
		setLayout(null);
		
		btnNewButton = new JButton("Pulsa");
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(46, 148, 101, 36);
		add(btnNewButton);
		
		lblNewLabel = new JLabel("Traductor");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(183, 72, 145, 25);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(164, 108, 186, 28);
		add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(161, 148, 184, 30);
		add(lblNewLabel_1);
		
		btnNewButton.addActionListener(new EventoTraducir(textField, lblNewLabel_1));
	
	}

}
