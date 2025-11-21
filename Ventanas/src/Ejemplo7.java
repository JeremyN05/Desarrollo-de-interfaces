import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

public class Ejemplo7 {

	private JFrame frame;
	private JProgressBar progressBar;
	private JLabel lblNewLabel_2;
	Timer tiempo;
	int i = 10;
	int j = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo7 window = new Ejemplo7();
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
	public Ejemplo7() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(135, 206, 250));
		frame.setBounds(100, 100, 450, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("START");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tiempo.start();
				progressBar.setVisible(true);
				lblNewLabel_2.setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(26, 95, 96, 71);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(221, 95, 71, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FELIZ PUENTE!!!");
		lblNewLabel_1.setVisible(false);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(0, 255, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(132, 11, 224, 61);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("SALIR");
		btnNewButton_1.setVisible(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				System.exit(0);
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setBounds(26, 177, 96, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		progressBar = new JProgressBar(0, i);
		progressBar.setVisible(false);
		progressBar.setToolTipText("");
		progressBar.setForeground(new Color(0, 255, 127));
		progressBar.setFont(new Font("Arial", Font.BOLD, 14));
		progressBar.setBounds(132, 183, 240, 28);
		progressBar.setStringPainted(true);
		frame.getContentPane().add(progressBar);
		
		
		lblNewLabel_2 = new JLabel("Preparando cafe...");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 10));
		lblNewLabel_2.setBounds(132, 217, 96, 14);
		lblNewLabel_2.setVisible(false);
		frame.getContentPane().add(lblNewLabel_2);
		
		tiempo = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				i--;
				j++;
				progressBar.setValue(j);
				
				lblNewLabel.setText(String.valueOf(i));
				progressBar.setString(j + "0%");
				
				int x = 132 + (progressBar.getWidth() * j / 10) - 30; 
		        lblNewLabel_2.setLocation(x, lblNewLabel_2.getY());
				
				if(i == 0) {
					
					tiempo.stop();
					lblNewLabel_1.setVisible(true);
					btnNewButton.setEnabled(false);
					btnNewButton_1.setVisible(true);
					lblNewLabel_2.setText("Conseguido");
					JOptionPane.showMessageDialog(null, "ENHORABUENA!!!", "AL RECREO", i);
					
				}
				
			}
			
		});
	}
}
