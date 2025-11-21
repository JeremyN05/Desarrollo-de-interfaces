package EjercicioTraductor;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Traductor_Ventana {

	private JFrame frame;
	private JTextField textField;
	private String palabra;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Traductor_Ventana window = new Traductor_Ventana();
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
	public Traductor_Ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("PULSA");
		btnNewButton.setVisible(false);
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					palabra = textField.getText();
					
					String web = "https://www.spanishdict.com/translate/" + palabra;
					
					Document document = Jsoup.connect(web).get();
					
					Element element = document.select("div#quickdef1-es a.tCur1iYh").get(0);
					
					String a = element.html().toUpperCase();
					
					lblNewLabel_1.setText(a);
				
				} catch (IOException e1) {

					e1.printStackTrace();
				
				}
				
			}
		});
		btnNewButton.setBounds(50, 150, 98, 38);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Introduzca la palabra a traducir");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(151, 70, 225, 31);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(171, 112, 182, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField.addCaretListener(e -> Errores());
		
		Errores();
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(168, 156, 185, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnNewButton_1 = new JButton("Salir");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				
			}
		});
		btnNewButton_1.setBounds(50, 210, 98, 31);
		frame.getContentPane().add(btnNewButton_1);
	}
	
	private void Errores() {
		
	    btnNewButton.setVisible(!textField.getText().trim().isEmpty());
		
	}
	
}
