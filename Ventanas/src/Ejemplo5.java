import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo5 {

	private JFrame frame;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JButton btnNewButton;
	private JButton btnMarron;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo5 window = new Ejemplo5();
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
	public Ejemplo5() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 362);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 484, 323);
		frame.getContentPane().add(layeredPane);
		layeredPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 255, 127));
		panel.setBounds(0, 0, 486, 323);
		layeredPane.add(panel);
		panel.setLayout(null);
		
		btnNewButton = new JButton("Azul");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setVisible(false);
				panel_2.setVisible(false);
				panel_1.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(62, 126, 113, 23);
		panel.add(btnNewButton);
		
		btnMarron = new JButton("Marron");
		btnMarron.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.setVisible(false);
				panel_1.setVisible(false);
				panel_2.setVisible(true);
				
			}
		});
		btnMarron.setFont(new Font("Arial", Font.BOLD, 14));
		btnMarron.setBounds(316, 126, 113, 23);
		panel.add(btnMarron);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBounds(0, 0, 484, 323);
		layeredPane.add(panel_1);
		panel_1.setLayout(null);
		
		btnNewButton_1 = new JButton("Verde");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.setVisible(false);
				panel_2.setVisible(false);
				panel.setVisible(true);
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(60, 126, 113, 23);
		panel_1.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Marron");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_1.setVisible(false);
				panel.setVisible(false);
				panel_2.setVisible(true);
				
			}
		});
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_2.setBounds(315, 126, 113, 23);
		panel_1.add(btnNewButton_2);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(184, 134, 11));
		panel_2.setBounds(0, 0, 484, 323);
		layeredPane.add(panel_2);
		panel_2.setLayout(null);
		
		btnNewButton_3 = new JButton("Azul");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.setVisible(false);
				panel.setVisible(false);
				panel_1.setVisible(true);
				
			}
		});
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_3.setBounds(60, 126, 113, 23);
		panel_2.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Verde");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_2.setVisible(false);
				panel_1.setVisible(false);
				panel.setVisible(true);
				
			}
		});
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_4.setBounds(312, 127, 113, 23);
		panel_2.add(btnNewButton_4);
	}
}
