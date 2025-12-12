package App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class AcercaDe{
	
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem item;
	
	public AcercaDe() {
		
		menuBar = new JMenuBar();
		
		menu = new JMenu("Acerca de");
		menuBar.add(menu);

		item = new JMenuItem("Desarrollador y versión");
		item.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   
				JOptionPane.showMessageDialog(null, "Versión: 20.0.1 \n" + "Desarrollador: Jeremy Narváez Lobato");
				
			}
		});
		
		menu.add(item);
		
	}
	
    public JMenuBar getMenuBar() {
        return menuBar;
    }
	
}
