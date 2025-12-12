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
import Titulares.TituNacional;

public class Nacional extends JPanel {

    private GestionNoticias gestion;
    private JTextArea noticiaNac;
    private JTextArea noticiaNac_2;
    private JTextArea noticiaNac_3;
    private JLabel lblPublico;
    private JLabel lblElDiario;
    private JLabel lblLaRazon;

    public Nacional(GestionNoticias gestionNoticias) {
        this.gestion = gestionNoticias;

        setBackground(new Color(255, 160, 122));
        setLayout(null);

        JLabel lblTitulo = new JLabel("Noticias Nacional");
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 30));
        lblTitulo.setBounds(216, 62, 262, 36);
        add(lblTitulo);

        lblPublico = new JLabel("Público:");
        lblPublico.setFont(new Font("Arial", Font.BOLD, 24));
        lblPublico.setBounds(41, 130, 107, 24);
        add(lblPublico);

        noticiaNac = new JTextArea();
        noticiaNac.setWrapStyleWord(true);
        noticiaNac.setLineWrap(true);
        noticiaNac.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaNac.setEditable(false);
        noticiaNac.setBackground(new Color(255, 160, 122));
        noticiaNac.setBounds(41, 164, 617, 75);
        add(noticiaNac);

        lblElDiario = new JLabel("elDiario:");
        lblElDiario.setFont(new Font("Arial", Font.BOLD, 24));
        lblElDiario.setBounds(41, 251, 107, 24);
        add(lblElDiario);

        noticiaNac_2 = new JTextArea();
        noticiaNac_2.setWrapStyleWord(true);
        noticiaNac_2.setLineWrap(true);
        noticiaNac_2.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaNac_2.setEditable(false);
        noticiaNac_2.setBackground(new Color(255, 160, 122));
        noticiaNac_2.setBounds(41, 285, 616, 75);
        add(noticiaNac_2);

        lblLaRazon = new JLabel("La Razón:");
        lblLaRazon.setFont(new Font("Arial", Font.BOLD, 24));
        lblLaRazon.setBounds(41, 370, 122, 24);
        add(lblLaRazon);

        noticiaNac_3 = new JTextArea();
        noticiaNac_3.setWrapStyleWord(true);
        noticiaNac_3.setLineWrap(true);
        noticiaNac_3.setFont(new Font("Arial", Font.PLAIN, 18));
        noticiaNac_3.setEditable(false);
        noticiaNac_3.setBackground(new Color(255, 160, 122));
        noticiaNac_3.setBounds(42, 404, 616, 75);
        add(noticiaNac_3);

        JButton btnAtras = new JButton("Atrás");
        btnAtras.addActionListener(e -> gestion.mostrarNoticia());
        btnAtras.setFont(new Font("Arial", Font.BOLD, 14));
        btnAtras.setBounds(41, 490, 102, 36);
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
                    Nacional.this,
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

        noticiaNac.setVisible(false);
        noticiaNac_2.setVisible(false);
        noticiaNac_3.setVisible(false);
        lblPublico.setVisible(false);
        lblElDiario.setVisible(false);
        lblLaRazon.setVisible(false);

        try {
            if (usuario.isAdmin() || prefs.contains("N1")) {
                noticiaNac.setText(TituNacional.cargarTitulares());
                noticiaNac.setVisible(true);
                lblPublico.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("N2")) {
                noticiaNac_2.setText(TituNacional.cargarTitulares2());
                noticiaNac_2.setVisible(true);
                lblElDiario.setVisible(true);
            }

            if (usuario.isAdmin() || prefs.contains("N3")) {
                noticiaNac_3.setText(TituNacional.cargarTitulares3());
                noticiaNac_3.setVisible(true);
                lblLaRazon.setVisible(true);
            }
        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error al cargar titulares nacionales: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );

        }
   
    }

}
