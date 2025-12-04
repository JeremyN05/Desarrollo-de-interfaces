package App;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

import Noticia.Anime;
import Noticia.Deporte;
import Noticia.Economia;
import Noticia.Internacional;
import Noticia.Nacional;
import Noticia.Noticia;
import Noticia.Videojuegos;
import Preferencias.Preferencia;
import Sesion.InicioSesion;

public class GestionNoticias extends JFrame{

	private JPanel miPantallaCarga;
	private JPanel miPanel;
	private JPanel preferencia;
	private JPanel noticia;
	private JPanel economia;
	private JPanel deporte;
	private JPanel nacional;
	private JPanel internacional;
	private JPanel videojuegos;
	private JPanel anime;
	
	public GestionNoticias() {

        setTitle("Enviar email");
        setSize(700, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/Imagenes/noticias.png"));
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 700, 600);
        getContentPane().add(layeredPane);

        miPantallaCarga = new PantallaCarga(this);
        miPanel = new InicioSesion(this);
        preferencia = new Preferencia(this);
        noticia = new Noticia(this);
        economia = new Economia();
        deporte = new Deporte();
        nacional = new Nacional();
        internacional = new Internacional();
        videojuegos = new Videojuegos();
        anime = new Anime();

        JPanel[] paneles = { miPantallaCarga, miPanel, preferencia, noticia, economia, deporte, nacional, internacional, videojuegos, anime };

        for (JPanel panel : paneles) {
         
        	panel.setBounds(0, 0, 700, 600);
            panel.setVisible(false);
            layeredPane.add(panel);
        
        }

        miPantallaCarga.setVisible(true);
   
	}

    private void mostrarPanel(JPanel panel) {
        
    	JPanel[] todos = { miPantallaCarga, miPanel, preferencia, noticia, economia, deporte, nacional, internacional, videojuegos, anime };
        
        for (JPanel p : todos) {
           
        	p.setVisible(p == panel);
      
        }
      
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }


    public void mostrarInicioSesion() {
        mostrarPanel(miPanel);
    }

    public void mostrarPreferencia() {
        mostrarPanel(preferencia);
    }

    public void mostrarNoticia() {
        mostrarPanel(noticia);
    }

    public void mostrarEconomia() {
        mostrarPanel(economia);
    }

    public void mostrarDeportes() {
        mostrarPanel(deporte);
    }

    public void mostrarNacional() {
        mostrarPanel(nacional);
    }

    public void mostrarInternacional() {
        mostrarPanel(internacional);
    }

    public void mostrarVideojuegos() {
        mostrarPanel(videojuegos);
    }

    public void mostrarAnime() {
        mostrarPanel(anime);
    }

	
}
