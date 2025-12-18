package App;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Admin.AgregarUsuario;
import Admin.EliminacionUsuario;
import Admin.MenuAdmin;
import Noticia.Anime;
import Noticia.Deporte;
import Noticia.Economia;
import Noticia.Internacional;
import Noticia.Nacional;
import Noticia.Noticia;
import Noticia.SeleccionFuentes;
import Noticia.Videojuegos;
import Sesion.InicioSesion;

public class GestionNoticias extends JFrame{

	private JPanel miPantallaCarga;
	private JPanel miPanel;
	private JPanel eleccionFuentes;
	public Noticia noticia;
	public Economia economia;
	public Deporte deporte;
	public Nacional nacional;
	public Internacional internacional;
	public Videojuegos videojuegos;
	public Anime anime;
	private JPanel menuAdmin;
	private JPanel agregarUsuario;
	private JPanel eliminarUsuario;
	
	public GestionNoticias() {

        setTitle("Enviar email");
        setSize(700, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/Imagenes/noticias.png"));
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        AcercaDe acercaDe = new AcercaDe();
        setJMenuBar(acercaDe.getMenuBar());
        
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                if (miPantallaCarga.isVisible()) {
                   
                	return;
                
                }

                int opcion = JOptionPane.showConfirmDialog(
                        
                		GestionNoticias.this,
                        "¿Está usted seguro de cerrar el programa?",
                        "Confirmar salida",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );

                if (opcion == JOptionPane.YES_OPTION) {
                    System.exit(0);
                
                }

            }
       
        });

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0, 0, 700, 600);
        getContentPane().add(layeredPane);

        miPantallaCarga = new PantallaCarga(this);
        miPanel = new InicioSesion(this);
        eleccionFuentes = new SeleccionFuentes(this);
        noticia = new Noticia(this);
        economia = new Economia(this);
        deporte = new Deporte(this);
        nacional = new Nacional(this);
        internacional = new Internacional(this);
        videojuegos = new Videojuegos(this);
        anime = new Anime(this);
        menuAdmin = new MenuAdmin(this);
        agregarUsuario = new AgregarUsuario(this);
        eliminarUsuario = new EliminacionUsuario(this);

        JPanel[] paneles = { miPantallaCarga, miPanel, eleccionFuentes, noticia, economia, deporte, nacional, internacional, videojuegos, anime, menuAdmin, agregarUsuario, eliminarUsuario };

        for (JPanel panel : paneles) {
         
        	panel.setBounds(0, 0, 700, 600);
            panel.setVisible(false);
            layeredPane.add(panel);
        
        }
        
        setUndecorated(true);
        miPantallaCarga.setVisible(true);
   
	}

    private void mostrarPanel(JPanel panel) {
        
    	JPanel[] todos = { miPantallaCarga, miPanel, eleccionFuentes, noticia, economia, deporte, nacional, internacional, videojuegos, anime, menuAdmin, agregarUsuario, eliminarUsuario };
        
        for (JPanel p : todos) {
           
        	p.setVisible(p == panel);
      
        }
    
    }


    public void mostrarInicioSesion() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
    }

    public void mostrarSeleccionFuentes() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(eleccionFuentes);
    }

    public void mostrarNoticia() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(noticia);
    }

    public void mostrarEconomia() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(economia);
    }

    public void mostrarDeportes() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(deporte);
    }

    public void mostrarNacional() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(nacional);
    }

    public void mostrarInternacional() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(internacional);
    }

    public void mostrarVideojuegos() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(videojuegos);
    }

    public void mostrarAnime() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(anime);
    }

    public void mostrarMenuAdmin() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(menuAdmin);
    }
    
    public void AgregarUsuario() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(agregarUsuario);
    }
    
    public void EliminarUsuario() {
        dispose();
        setUndecorated(false);
        setVisible(true);
        mostrarPanel(miPanel);
        mostrarPanel(eliminarUsuario);
    }
    
}
