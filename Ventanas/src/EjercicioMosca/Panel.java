package EjercicioMosca;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Panel extends JPanel{
	
	private JLabel mosca;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JFrame frame;
	
	public Panel() {
		
		setLayout(null);
		
		mosca = new JLabel("");
		mosca.setHorizontalAlignment(SwingConstants.CENTER);
		mosca.setBounds(204, 168, 96, 87);
		
		ImageIcon icono = new ImageIcon(Panel.class.getResource("/mosca.png"));
		
		mosca.setIcon(icono);
		
		add(mosca);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(204, 11, 96, 22);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(204, 44, 96, 22);
		add(lblNewLabel_1);
		
		frame.addMouseMotionListener(new EventoMosca(mosca, lblNewLabel, lblNewLabel_1, frame));
		
	}
}
