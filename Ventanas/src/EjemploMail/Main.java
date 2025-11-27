package EjemploMail;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					EnviarMail window = new EnviarMail();
					window.setVisible(true);
				
				} catch (Exception e) {
					
					e.printStackTrace();
				
				}
			
			}
		
		});

	}

}
