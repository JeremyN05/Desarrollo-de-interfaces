package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.IOException;
import java.util.List;

import javax.swing.JTextArea;

import App.GestionNoticias;
import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.Usuarios;
import Titulares.TituDeporte;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Deporte extends JPanel {

    private GestionNoticias gestion;
    private JTextArea noticiaDep;
    private JTextArea noticiaDep_2;
    private JTextArea noticiaDep_3;
    private JLabel lblMarca;
    private JLabel lblAs;
    private JLabel lblSport;

    public Deporte(GestionNoticias gestionNoticias) {
        this.gestion = gestionNoticias;

        setBackground(new Color(255, 160, 122));
        setLayout(null);

        JLabel lblTitulo = new JLabel("Noticias Deportes");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setBounds(216, 62, 262, 36);
        add(lblTitulo);

        lblMarca = new JLabel("Marca:");
        lblMarca.setFont(new Font("Arial", Font.BOLD, 24));
        lblMarca.setBounds(41, 130, 86, 24);
        add(lblMarca);

        noticiaDep = new JTextArea();
        noticiaDep.setWrapStyleWord(true);
        noticiaDep.setLineWrap(true);
        noticiaDep.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaDep.setEditable(false);
        noticiaDep.setBackground(new Color(255, 160, 122));
        noticiaDep.setBounds(41, 164, 617, 75);
        add(noticiaDep);

        lblAs = new JLabel("As:");
        lblAs.setFont(new Font("Arial", Font.BOLD, 24));
        lblAs.setBounds(41, 251, 86, 24);
        add(lblAs);

        noticiaDep_2 = new JTextArea();
        noticiaDep_2.setLineWrap(true);
        noticiaDep_2.setWrapStyleWord(true);
        noticiaDep_2.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaDep_2.setEditable(false);
        noticiaDep_2.setBackground(new Color(255, 160, 122));
        noticiaDep_2.setBounds(41, 285, 617, 75);
        add(noticiaDep_2);

        lblSport = new JLabel("Sport:");
        lblSport.setFont(new Font("Arial", Font.BOLD, 24));
        lblSport.setBounds(41, 370, 86, 24);
        add(lblSport);

        noticiaDep_3 = new JTextArea();
        noticiaDep_3.setWrapStyleWord(true);
        noticiaDep_3.setLineWrap(true);
        noticiaDep_3.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaDep_3.setEditable(false);
        noticiaDep_3.setBackground(new Color(255, 160, 122));
        noticiaDep_3.setBounds(41, 404, 617, 75);
        add(noticiaDep_3);

        JButton btnAtras = new JButton("Atrás");
        btnAtras.addActionListener(e -> gestionNoticias.mostrarNoticia());
        btnAtras.setFont(new Font("Arial", Font.BOLD, 14));
        btnAtras.setBounds(41, 490, 102, 36);
        add(btnAtras);

        JButton cerrarSesion = new JButton("Cerrar Sesión");
        cerrarSesion.addActionListener(e -> gestionNoticias.mostrarInicioSesion());
        cerrarSesion.setForeground(Color.BLACK);
        cerrarSesion.setFont(new Font("Arial", Font.BOLD, 10));
        cerrarSesion.setBorder(null);
        cerrarSesion.setBackground(new Color(255, 160, 122));
        cerrarSesion.setBounds(557, 28, 101, 20);
        add(cerrarSesion);

        JButton cerrarPrograma = new JButton("");
        cerrarPrograma.addActionListener(e -> {
            int opcion = javax.swing.JOptionPane.showConfirmDialog(
                    Deporte.this,
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

        noticiaDep.setVisible(false);
        noticiaDep_2.setVisible(false);
        noticiaDep_3.setVisible(false);
        lblMarca.setVisible(false);
        lblAs.setVisible(false);
        lblSport.setVisible(false);

        try {

            if (usuario.isAdmin() || prefs.contains("D1")) {
                noticiaDep.setText(TituDeporte.cargarTitulares());
                noticiaDep.setVisible(true);
                lblMarca.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("D2")) {
                noticiaDep_2.setText(TituDeporte.cargarTitulares2());
                noticiaDep_2.setVisible(true);
                lblAs.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("D3")) {
                noticiaDep_3.setText(TituDeporte.cargarTitulares3());
                noticiaDep_3.setVisible(true);
                lblSport.setVisible(true);
            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Error al cargar titulares de Deportes: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

        }
    }
}

