import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo3 {

	private JFrame frame;
	private JTextField textField;
	private int contador = 0;
	private JPanel panel_1;
	private JPanel panel_2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo3 window = new Ejemplo3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ejemplo3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.CYAN);
		frame.getContentPane().add(panel, "name_12619190493500");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Click");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				contador++;
				textField.setText(Integer.toString(contador));
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(109, 118, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Número de clicks");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setBounds(209, 93, 142, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Arial", Font.BOLD, 14));
		textField.setBounds(219, 118, 120, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Siguiente");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setVisible(false);
				panel_1.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(312, 215, 112, 23);
		panel.add(btnNewButton_1);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 127));
		frame.getContentPane().add(panel_1, "name_12627572118200");
		panel_1.setLayout(null);
		
		JButton btnNewButton_1_1 = new JButton("Siguiente");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				
			}
		});
		btnNewButton_1_1.setBounds(312, 209, 112, 25);
		btnNewButton_1_1.setForeground(Color.BLACK);
		btnNewButton_1_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1_1.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Anterior");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.setVisible(false);
				panel.setVisible(true);
				
			}
		});
		btnNewButton_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(10, 210, 112, 23);
		panel_1.add(btnNewButton_1_2);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(34, 139, 34));
		frame.getContentPane().add(panel_2, "name_12630338429200");
		panel_2.setLayout(null);
		
		JButton btnNewButton_1_2_1 = new JButton("Anterior");
		btnNewButton_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.setVisible(false);
				panel_1.setVisible(true);
				
			}
		});
		btnNewButton_1_2_1.setBounds(10, 213, 99, 25);
		btnNewButton_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_2_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1_2_1.setBackground(Color.WHITE);
		panel_2.add(btnNewButton_1_2_1);
		
		JButton btnNewButton_2 = new JButton("Cerrar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setBounds(335, 214, 89, 23);
		panel_2.add(btnNewButton_2);
	}
}
