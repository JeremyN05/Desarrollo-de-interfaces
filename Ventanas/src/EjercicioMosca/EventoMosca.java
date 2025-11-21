package EjercicioMosca;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventoMosca implements MouseMotionListener{

	JLabel mosca;
	JLabel lblNewLabel;
	JLabel lblNewLabel_1;
	JFrame frame;
	
	Random random = new Random();
	
	public EventoMosca(JLabel mosca, JLabel lblNewLabel, JLabel lblNewLabel_1, JFrame frame) {

		this.mosca = mosca;
		this.lblNewLabel = lblNewLabel;
		this.lblNewLabel_1 = mosca;
		this.frame = frame;
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
		int xM = 0;
		int yM = 0;
		
		int labelX = 0;
		int labelY = 0;
		int labelW = 0;
		int labelH = 0;
		
		xM = e.getX();
		yM = e.getY();
		
		lblNewLabel.setText("Xm " + xM + "Ym " + yM);
		
		labelX = mosca.getX();
		labelY = mosca.getY();
		labelW = mosca.getWidth();
		labelH = mosca.getHeight();
		
		lblNewLabel_1.setText("Mx " + labelX + "Yx " + labelY);
		
		int distanEnx = Math.abs(xM-labelX);
		int distanEnY = Math.abs(yM-labelY);
		int limite = 75;
		
		if(distanEnx < limite || distanEnY < limite) {
			
			int moverX = random.nextInt(201) - 50;
			int moverY = random.nextInt(201) - 50;
			
			int nuevoX = Math.max(0, Math.min(labelX + moverX, frame.getWidth() - 2 * labelW));
			int nuevoY = Math.max(0, Math.min(labelY + moverY, frame.getHeight() - 2 * labelH));
			
			mosca.setLocation(nuevoX, nuevoY);
		}
		
	}

}
