package EjemploMail;

import javax.swing.JFrame;

public class EnviarMail extends JFrame{

	public EnviarMail() {
		
		setTitle("Enviar email");
		setSize(450, 350);
		setResizable(false);
		setLocationRelativeTo(null);
		
		Panel miPanel = new Panel();
		
		add(miPanel);
		
	}
	
}
