package App;
import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				
				try {
					
					GestionNoticias window = new GestionNoticias();
					window.setVisible(true);
				
				} catch (Exception e) {
					
					e.printStackTrace();
				
				}
			
			}
		
		});

	}

}
