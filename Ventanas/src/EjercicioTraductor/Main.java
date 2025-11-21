package EjercicioTraductor;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					Traductor_Ventana2 window = new Traductor_Ventana2();
					window.setVisible(true);
				
				} catch (Exception e) {
					
					e.printStackTrace();
				
				}
			
			}
		
		});
	
	}

}
