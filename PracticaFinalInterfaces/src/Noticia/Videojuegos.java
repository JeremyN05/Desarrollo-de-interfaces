package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.IOException;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import App.GestionNoticias;
import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.Usuarios;
import Titulares.TituVideojuegos;

public class Videojuegos extends JPanel {

    private GestionNoticias gestion;
    private JTextArea noticiaVid;
    private JTextArea noticiaVid_2;
    private JTextArea noticiaVid_3;
    private JLabel lblGamerReactor;
    private JLabel lblTheObjetive;
    private JLabel lblMarca;

    public Videojuegos(GestionNoticias gestionNoticias) {
        this.gestion = gestionNoticias;

        setBackground(new Color(255, 160, 122));
        setLayout(null);

        JLabel lblTitulo = new JLabel("Noticias Videojuegos");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setBounds(202, 62, 313, 36);
        add(lblTitulo);

        lblGamerReactor = new JLabel("GamerReactor:");
        lblGamerReactor.setFont(new Font("Arial", Font.BOLD, 24));
        lblGamerReactor.setBounds(41, 130, 185, 28);
        add(lblGamerReactor);

        noticiaVid = new JTextArea();
        noticiaVid.setWrapStyleWord(true);
        noticiaVid.setLineWrap(true);
        noticiaVid.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaVid.setEditable(false);
        noticiaVid.setBackground(new Color(255, 160, 122));
        noticiaVid.setBounds(41, 164, 617, 75);
        add(noticiaVid);

        lblTheObjetive = new JLabel("The Objetive:");
        lblTheObjetive.setFont(new Font("Arial", Font.BOLD, 24));
        lblTheObjetive.setBounds(41, 251, 196, 28);
        add(lblTheObjetive);

        noticiaVid_2 = new JTextArea();
        noticiaVid_2.setWrapStyleWord(true);
        noticiaVid_2.setLineWrap(true);
        noticiaVid_2.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaVid_2.setEditable(false);
        noticiaVid_2.setBackground(new Color(255, 160, 122));
        noticiaVid_2.setBounds(41, 285, 617, 75);
        add(noticiaVid_2);

        lblMarca = new JLabel("Marca:");
        lblMarca.setFont(new Font("Arial", Font.BOLD, 24));
        lblMarca.setBounds(41, 370, 101, 28);
        add(lblMarca);

        noticiaVid_3 = new JTextArea();
        noticiaVid_3.setWrapStyleWord(true);
        noticiaVid_3.setLineWrap(true);
        noticiaVid_3.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaVid_3.setEditable(false);
        noticiaVid_3.setBackground(new Color(255, 160, 122));
        noticiaVid_3.setBounds(41, 404, 617, 75);
        add(noticiaVid_3);

        JButton btnAtras = new JButton("Atrás");
        btnAtras.addActionListener(e -> gestion.mostrarNoticia());
        btnAtras.setFont(new Font("Arial", Font.BOLD, 14));
        btnAtras.setBounds(41, 490, 101, 36);
        add(btnAtras);

        JButton cerrarSesion = new JButton("Cerrar Sesión");
        cerrarSesion.addActionListener(e -> gestion.mostrarInicioSesion());
        cerrarSesion.setForeground(Color.BLACK);
        cerrarSesion.setFont(new Font("Arial", Font.BOLD, 10));
        cerrarSesion.setBorder(null);
        cerrarSesion.setBackground(new Color(255, 160, 122));
        cerrarSesion.setBounds(557, 28, 101, 20);
        add(cerrarSesion);

        JButton cerrarPrograma = new JButton("");
        cerrarPrograma.addActionListener(e -> {
            int opcion = javax.swing.JOptionPane.showConfirmDialog(
                    Videojuegos.this,
                    "¿Está usted seguro de cerrar el programa?",
                    "Confirmar salida",
                    javax.swing.JOptionPane.YES_NO_OPTION,
                    javax.swing.JOptionPane.WARNING_MESSAGE
            );
            if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
        cerrarPrograma.setBorder(null);
        cerrarPrograma.setBackground(new Color(255, 160, 122));
        cerrarPrograma.setBounds(519, 28, 28, 22);
        cerrarPrograma.setIcon(new ImageIcon("src/Imagenes/apagar.png"));
        add(cerrarPrograma);

        actualizarNoticias();
    }

    public void actualizarNoticias() {
        Usuarios usuario = GuardarUsuario.getUsuarioActual();
        if (usuario == null) return;

        List<String> prefs = CargarPreferencias.cargarPreferencias(usuario.getId());

        noticiaVid.setVisible(false);
        noticiaVid_2.setVisible(false);
        noticiaVid_3.setVisible(false);
        lblGamerReactor.setVisible(false);
        lblTheObjetive.setVisible(false);
        lblMarca.setVisible(false);

        try {
            if (usuario.isAdmin() || prefs.contains("V1")) {
                noticiaVid.setText(TituVideojuegos.cargarTitulares());
                noticiaVid.setVisible(true);
                lblGamerReactor.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("V2")) {
                noticiaVid_2.setText(TituVideojuegos.cargarTitulares2());
                noticiaVid_2.setVisible(true);
                lblTheObjetive.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("V3")) {
                noticiaVid_3.setText(TituVideojuegos.cargarTitulares3());
                noticiaVid_3.setVisible(true);
                lblMarca.setVisible(true);
            }
        } catch (IOException e) {
            
            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar titulares de videojuegos: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
        
        }
    
    }

}
