package EjercicioMosca;

import javax.swing.JFrame;

public class VentanaMosca extends JFrame{

	public VentanaMosca() {
		
		setTitle("Atrapa La Mosca");
		setSize(520, 450);
		setLocationRelativeTo(null);
		
		Panel miPanel = new Panel();
		
		add(miPanel);
		
	}
	
}
