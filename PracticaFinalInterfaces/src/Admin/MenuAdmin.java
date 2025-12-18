package Admin;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;

import App.GestionNoticias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.Usuarios;
import Mail.EnviarCorreo;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuAdmin extends JPanel{
	
	private GestionNoticias gestion;
	
	public MenuAdmin(GestionNoticias gestionNoticias) {
		
		this.gestion = gestionNoticias;
		
		setBackground(new Color(255, 160, 122));
		setLayout(null);
		
		JLabel lblMenAdmin = new JLabel("Menú Admin");
		lblMenAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenAdmin.setForeground(Color.BLACK);
		lblMenAdmin.setFont(new Font("Arial", Font.BOLD, 30));
		lblMenAdmin.setBackground(Color.WHITE);
		lblMenAdmin.setBounds(192, 44, 298, 48);
		add(lblMenAdmin);
		
		JLabel test = new JLabel("test");
		test.setHorizontalAlignment(SwingConstants.CENTER);
		test.setForeground(Color.BLACK);
		test.setFont(new Font("Arial", Font.BOLD, 20));
		test.setBounds(34, 117, 144, 38);
		add(test);
		
		JButton btNoticias = new JButton("");
		btNoticias.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestionNoticias.mostrarNoticia();
				
			}
		});
		btNoticias.setIcon(new ImageIcon(MenuAdmin.class.getResource("/Imagenes/noticiasAdmin.png")));
		btNoticias.setBorder(null);
		btNoticias.setBackground(new Color(255, 160, 122));
		btNoticias.setBounds(34, 162, 144, 144);
		add(btNoticias);
		
		JLabel agregarUsu = new JLabel("Agregar Usuario");
		agregarUsu.setHorizontalAlignment(SwingConstants.CENTER);
		agregarUsu.setForeground(Color.BLACK);
		agregarUsu.setFont(new Font("Arial", Font.BOLD, 20));
		agregarUsu.setBounds(274, 117, 167, 37);
		add(agregarUsu);
		
		JButton btAgregarUsu = new JButton("");
		btAgregarUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestionNoticias.AgregarUsuario();
				
			}
		});
		btAgregarUsu.setIcon(new ImageIcon(MenuAdmin.class.getResource("/Imagenes/agregarUsu.png")));
		btAgregarUsu.setBorder(null);
		btAgregarUsu.setBackground(new Color(255, 160, 122));
		btAgregarUsu.setBounds(274, 162, 144, 144);
		add(btAgregarUsu);
		
		JLabel eliminarUsu = new JLabel("Eliminar Usuario");
		eliminarUsu.setHorizontalAlignment(SwingConstants.CENTER);
		eliminarUsu.setForeground(Color.BLACK);
		eliminarUsu.setFont(new Font("Arial", Font.BOLD, 20));
		eliminarUsu.setBounds(504, 117, 166, 36);
		add(eliminarUsu);
		
		JButton btEliminarUsu = new JButton("");
		btEliminarUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestionNoticias.EliminarUsuario();
				
			}
		});
		btEliminarUsu.setIcon(new ImageIcon(MenuAdmin.class.getResource("/Imagenes/eliminarUsu.png")));
		btEliminarUsu.setBorder(null);
		btEliminarUsu.setBackground(new Color(255, 160, 122));
		btEliminarUsu.setBounds(504, 162, 144, 144);
		add(btEliminarUsu);
		
		JButton cerrarSesion = new JButton("Cerrar Sesión");
		cerrarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				gestionNoticias.mostrarInicioSesion();
				
			}
		});
		cerrarSesion.setForeground(Color.BLACK);
		cerrarSesion.setFont(new Font("Arial", Font.BOLD, 10));
		cerrarSesion.setBorder(null);
		cerrarSesion.setBackground(new Color(255, 160, 122));
		cerrarSesion.setBounds(569, 24, 101, 20);
		add(cerrarSesion);
		
		JButton cerrarPrograma = new JButton("");
		cerrarPrograma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int opcion = JOptionPane.showConfirmDialog(
                        
                		MenuAdmin.this,
                        "¿Está usted seguro de cerrar el programa?",
                        "Confirmar salida",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.WARNING_MESSAGE
                );

                if (opcion == javax.swing.JOptionPane.YES_OPTION) {
                    System.exit(0);
                
                }
				
				System.exit(0);
				
			}
		});
		cerrarPrograma.setIcon(new ImageIcon("src/Imagenes/apagar.png"));
		cerrarPrograma.setBorder(null);
		cerrarPrograma.setBackground(new Color(255, 160, 122));
		cerrarPrograma.setBounds(531, 24, 28, 21);
		add(cerrarPrograma);
		
		JButton btEnviarCorreo = new JButton("Enviar correo");
		btEnviarCorreo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Usuarios usuario = GuardarUsuario.getUsuarioActual();
		        
		        if (usuario == null) {
		           
		        	System.out.println("No hay usuario logueado");
		            return;
		        
		        }
				
				EnviarCorreo.crearEMAIL(usuario);
				
			}
		});
		btEnviarCorreo.setFont(new Font("Arial", Font.BOLD, 10));
		btEnviarCorreo.setBorder(null);
		btEnviarCorreo.setBackground(new Color(255, 160, 122));
		btEnviarCorreo.setBounds(34, 24, 101, 20);
		add(btEnviarCorreo);
	}
}
