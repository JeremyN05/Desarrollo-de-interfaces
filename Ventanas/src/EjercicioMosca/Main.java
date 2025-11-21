package EjercicioMosca;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					VentanaMosca window = new VentanaMosca();
					window.setVisible(true);
				
				} catch (Exception e) {
					
					e.printStackTrace();
				
				}
			
			}
		
		});
		
	}

}
