package App;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
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
        
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {

                if (miPantallaCarga.isVisible()) {
                   
                	return;
                
                }

                int opcion = javax.swing.JOptionPane.showConfirmDialog(
                        
                		GestionNoticias.this,
                        "¿Está usted seguro de cerrar el programa?",
                        "Confirmar salida",
                        javax.swing.JOptionPane.YES_NO_OPTION,
                        javax.swing.JOptionPane.WARNING_MESSAGE
                );

                if (opcion == javax.swing.JOptionPane.YES_OPTION) {
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

        miPantallaCarga.setVisible(true);
   
	}

    private void mostrarPanel(JPanel panel) {
        
    	JPanel[] todos = { miPantallaCarga, miPanel, eleccionFuentes, noticia, economia, deporte, nacional, internacional, videojuegos, anime, menuAdmin, agregarUsuario, eliminarUsuario };
        
        for (JPanel p : todos) {
           
        	p.setVisible(p == panel);
      
        }
    
    }


    public void mostrarInicioSesion() {
        mostrarPanel(miPanel);
    }

    public void mostrarSeleccionFuentes() {
        mostrarPanel(eleccionFuentes);
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

    public void mostrarMenuAdmin() {
        mostrarPanel(menuAdmin);
    }
    
    public void AgregarUsuario() {
        mostrarPanel(agregarUsuario);
    }
    
    public void EliminarUsuario() {
        mostrarPanel(eliminarUsuario);
    }
    
}
