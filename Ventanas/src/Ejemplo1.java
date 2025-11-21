import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JPanel;

public class Ejemplo1 {

	private JFrame frame;
	
	private final JLabel lblNewLabel = new JLabel("Boton");
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1 window = new Ejemplo1();
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
	public Ejemplo1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(149, 95, 105, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(149, 137, 105, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(159, 171, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("GAY?????");
		chckbxNewCheckBox.setToolTipText("");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxNewCheckBox.setBounds(149, 211, 105, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JTextArea txtrDdfdfdf = new JTextArea();
		txtrDdfdfdf.setText("ddfdfdf");
		txtrDdfdfdf.setWrapStyleWord(true);
		txtrDdfdfdf.setToolTipText("");
		txtrDdfdfdf.setLineWrap(true);
		txtrDdfdfdf.setColumns(2);
		txtrDdfdfdf.setForeground(new Color(0, 0, 0));
		txtrDdfdfdf.setRows(2);
		txtrDdfdfdf.setBounds(10, 11, 150, 87);
		frame.getContentPane().add(txtrDdfdfdf);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(149, 254, 105, 20);
		frame.getContentPane().add(passwordField);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(191, 46, 17, 48);
		frame.getContentPane().add(scrollBar);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(170, 13, 54, 20);
		frame.getContentPane().add(spinner);
		frame.setBounds(100, 100, 420, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
