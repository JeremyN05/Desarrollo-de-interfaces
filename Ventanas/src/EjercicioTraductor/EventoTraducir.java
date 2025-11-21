package EjercicioTraductor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventoTraducir implements ActionListener {

	JTextField textField;
	JLabel lblNewLabel_1;
	
	public EventoTraducir(JTextField textField, JLabel  lblNewLabel_1) {

		this.textField = textField;
		this.lblNewLabel_1 = lblNewLabel_1;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		//1. Control de errores
		
		if(textField.getText().isBlank() != true) {
			
			try {
				
				lblNewLabel_1.setText(Operaciones.traducir(textField.getText()));
			
			} catch (IOException e1) {

				e1.printStackTrace();
			
			}
			
		}else {
			
			JOptionPane.showMessageDialog(null, "No se ha introducido un texto correcto,", "Error", 0);
			
		}
	
	}
	
}
