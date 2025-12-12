package Noticia;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.io.IOException;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;

import App.GestionNoticias;
import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.Usuarios;
import Titulares.TituEconomia;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Economia extends JPanel {

    private GestionNoticias gestion;
    private JTextArea noticiaEc;
    private JTextArea noticiaEc_2;
    private JTextArea noticiaEc_3;
    private JLabel lblExpansion;
    private JLabel lblLibertad;
    private JLabel lblEconomiaDigital;

    public Economia(GestionNoticias gestionNoticias) {
        this.gestion = gestionNoticias;

        setBackground(new Color(255, 160, 122));
        setLayout(null);

        JLabel lblTitulo = new JLabel("Economía");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setBounds(216, 72, 262, 36);
        add(lblTitulo);

        lblExpansion = new JLabel("Expansión:");
        lblExpansion.setFont(new Font("Arial", Font.BOLD, 24));
        lblExpansion.setBounds(41, 130, 143, 24);
        add(lblExpansion);

        noticiaEc = new JTextArea();
        noticiaEc.setEditable(false);
        noticiaEc.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaEc.setBackground(new Color(255, 160, 122));
        noticiaEc.setWrapStyleWord(true);
        noticiaEc.setLineWrap(true);
        noticiaEc.setBounds(41, 164, 617, 75);
        add(noticiaEc);

        lblLibertad = new JLabel("Libertad Digital:");
        lblLibertad.setFont(new Font("Arial", Font.BOLD, 24));
        lblLibertad.setBounds(41, 251, 190, 24);
        add(lblLibertad);

        noticiaEc_2 = new JTextArea();
        noticiaEc_2.setEditable(false);
        noticiaEc_2.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaEc_2.setWrapStyleWord(true);
        noticiaEc_2.setLineWrap(true);
        noticiaEc_2.setBackground(new Color(255, 160, 122));
        noticiaEc_2.setBounds(41, 285, 617, 75);
        add(noticiaEc_2);

        lblEconomiaDigital = new JLabel("Economía Digital:");
        lblEconomiaDigital.setFont(new Font("Arial", Font.BOLD, 24));
        lblEconomiaDigital.setBounds(41, 370, 220, 24);
        add(lblEconomiaDigital);

        noticiaEc_3 = new JTextArea();
        noticiaEc_3.setEditable(false);
        noticiaEc_3.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaEc_3.setWrapStyleWord(true);
        noticiaEc_3.setLineWrap(true);
        noticiaEc_3.setBackground(new Color(255, 160, 122));
        noticiaEc_3.setBounds(41, 404, 617, 75);
        add(noticiaEc_3);

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
                    Economia.this,
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

        noticiaEc.setVisible(false);
        noticiaEc_2.setVisible(false);
        noticiaEc_3.setVisible(false);
        lblExpansion.setVisible(false);
        lblLibertad.setVisible(false);
        lblEconomiaDigital.setVisible(false);

        try {

            if (usuario.isAdmin() || prefs.contains("E1")) {
                noticiaEc.setText(TituEconomia.cargarTitulares());
                noticiaEc.setVisible(true);
                lblExpansion.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("E2")) {
                noticiaEc_2.setText(TituEconomia.cargarTitulares2());
                noticiaEc_2.setVisible(true);
                lblLibertad.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("E3")) {
                noticiaEc_3.setText(TituEconomia.cargarTitulares3());
                noticiaEc_3.setVisible(true);
                lblEconomiaDigital.setVisible(true);
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar titulares de Economía: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
                    );
        
        }
   
    }

}

