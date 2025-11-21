import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Ejemplo2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2 window = new Ejemplo2();
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
	public Ejemplo2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 288, 283);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(119, 136, 153));
		panel_1.setBounds(136, 124, 136, 119);
		frame.getContentPane().add(panel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(210, 180, 140));
		panel.setBounds(136, 0, 135, 124);
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(25, 25, 112));
		panel_2.setBounds(0, 123, 136, 120);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(139, 0, 0));
		panel_3.setBounds(0, 0, 136, 125);
		frame.getContentPane().add(panel_3);
	}

}
