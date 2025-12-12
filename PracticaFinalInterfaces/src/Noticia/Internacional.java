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
import Titulares.TituInternacional;

public class Internacional extends JPanel {

    private GestionNoticias gestion;
    private JTextArea noticiaInt;
    private JTextArea noticiaInt_2;
    private JTextArea noticiaInt_3;
    private JLabel lblCNN;
    private JLabel lblLaRazon;
    private JLabel lblTelemundo;

    public Internacional(GestionNoticias gestionNoticias) {
        this.gestion = gestionNoticias;

        setBackground(new Color(255, 160, 122));
        setLayout(null);

        JLabel lblTitulo = new JLabel("Noticias Internacionales");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setBounds(170, 62, 358, 36);
        add(lblTitulo);

        lblCNN = new JLabel("CNN:");
        lblCNN.setFont(new Font("Arial", Font.BOLD, 24));
        lblCNN.setBounds(41, 130, 85, 24);
        add(lblCNN);

        noticiaInt = new JTextArea();
        noticiaInt.setWrapStyleWord(true);
        noticiaInt.setLineWrap(true);
        noticiaInt.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaInt.setEditable(false);
        noticiaInt.setBackground(new Color(255, 160, 122));
        noticiaInt.setBounds(41, 164, 617, 75);
        add(noticiaInt);

        lblLaRazon = new JLabel("La Razón:");
        lblLaRazon.setFont(new Font("Arial", Font.BOLD, 24));
        lblLaRazon.setBounds(41, 251, 137, 24);
        add(lblLaRazon);

        noticiaInt_2 = new JTextArea();
        noticiaInt_2.setWrapStyleWord(true);
        noticiaInt_2.setLineWrap(true);
        noticiaInt_2.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaInt_2.setEditable(false);
        noticiaInt_2.setBackground(new Color(255, 160, 122));
        noticiaInt_2.setBounds(41, 285, 617, 75);
        add(noticiaInt_2);

        lblTelemundo = new JLabel("Telemundo:");
        lblTelemundo.setFont(new Font("Arial", Font.BOLD, 24));
        lblTelemundo.setBounds(41, 370, 152, 24);
        add(lblTelemundo);

        noticiaInt_3 = new JTextArea();
        noticiaInt_3.setWrapStyleWord(true);
        noticiaInt_3.setLineWrap(true);
        noticiaInt_3.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaInt_3.setEditable(false);
        noticiaInt_3.setBackground(new Color(255, 160, 122));
        noticiaInt_3.setBounds(41, 404, 617, 75);
        add(noticiaInt_3);

        JButton btnAtras = new JButton("Atrás");
        btnAtras.addActionListener(e -> gestionNoticias.mostrarNoticia());
        btnAtras.setFont(new Font("Arial", Font.BOLD, 14));
        btnAtras.setBounds(41, 490, 101, 36);
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
                    Internacional.this,
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

        noticiaInt.setVisible(false);
        noticiaInt_2.setVisible(false);
        noticiaInt_3.setVisible(false);
        lblCNN.setVisible(false);
        lblLaRazon.setVisible(false);
        lblTelemundo.setVisible(false);

        try {

            if (usuario.isAdmin() || prefs.contains("I1")) {
                noticiaInt.setText(TituInternacional.cargarTitulares());
                noticiaInt.setVisible(true);
                lblCNN.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("I2")) {
                noticiaInt_2.setText(TituInternacional.cargarTitulares2());
                noticiaInt_2.setVisible(true);
                lblLaRazon.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("I3")) {
                noticiaInt_3.setText(TituInternacional.cargarTitulares3());
                noticiaInt_3.setVisible(true);
                lblTelemundo.setVisible(true);
            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar titulares internacionales: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
       
        }
   
    }

}
