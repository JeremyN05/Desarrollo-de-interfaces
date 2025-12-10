package Noticia;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.GuardarUsuario;
import DatosUsuarios.Usuarios;
import Titulares.TituAnime;
import Titulares.TituDeporte;
import Titulares.TituEconomia;
import Titulares.TituInternacional;
import Titulares.TituNacional;
import Titulares.TituVideojuegos;

public class GuardarNoticias {
	
	private static final String GuardadoNoticias_txt  = "src" + File.separator + "Data" + File.separator + "NoticiasGuardadas.txt";
	
	public static void guardarNoticias() {
		
		Usuarios usuario = GuardarUsuario.getUsuarioActual();
		List<String> prefs = CargarPreferencias.cargarPreferencias(usuario.getId());
		
		File fichero = new File(GuardadoNoticias_txt);
		
		if(!fichero.exists()) {
			
			try {
				
				fichero.createNewFile();
			
			} catch (IOException e) {

				System.err.println("Error no se pudo crear el archivo (NoticiasGuardadas.txt)");
			}
			
		}
		
		StringBuilder body = new StringBuilder();
        body.append("FECHA: ").append(LocalDateTime.now()).append("\n");
        body.append("USUARIO: ").append(usuario.getNombre()).append("\n\n");

        for(String abrev : prefs) {
            List<String> titulares = new ArrayList<>();
            String categoria = "";

            switch(abrev) {
                case "E": categoria = "Economía"; break;
                case "D": categoria = "Deportes"; break;
                case "N": categoria = "Nacional"; break;
                case "I": categoria = "Internacional"; break;
                case "V": categoria = "Videojuegos"; break;
                case "A": categoria = "Anime"; break;
            }

            if(!categoria.isEmpty()) {
                body.append("CATEGORÍA: ").append(categoria).append("\n");

                try {
                    if(categoria.equals("Anime")) {
                        titulares.add(TituAnime.cargarTitulares());
                        titulares.add(TituAnime.cargarTitulares2());
                        titulares.add(TituAnime.cargarTitulares3());
                    } else if(categoria.equals("Videojuegos")) {
                        titulares.add(TituVideojuegos.cargarTitulares());
                        titulares.add(TituVideojuegos.cargarTitulares2());
                        titulares.add(TituVideojuegos.cargarTitulares3());
                    } else if(categoria.equals("Economía")) {
                        titulares.add(TituEconomia.cargarTitulares());
                        titulares.add(TituEconomia.cargarTitulares2());
                        titulares.add(TituEconomia.cargarTitulares3());
                    } else if(categoria.equals("Deportes")) {
                        titulares.add(TituDeporte.cargarTitulares());
                        titulares.add(TituDeporte.cargarTitulares2());
                        titulares.add(TituDeporte.cargarTitulares3());
                    } else if(categoria.equals("Nacional")) {
                        titulares.add(TituNacional.cargarTitulares());
                        titulares.add(TituNacional.cargarTitulares2());
                        titulares.add(TituNacional.cargarTitulares3());
                    } else if(categoria.equals("Internacional")) {
                        titulares.add(TituInternacional.cargarTitulares());
                        titulares.add(TituInternacional.cargarTitulares2());
                        titulares.add(TituInternacional.cargarTitulares3());
                    }
                } catch(Exception e){
                    e.printStackTrace();
                }

                for(String t : titulares) {
                    body.append("  - ").append(t).append("\n");
                }

                body.append("\n");
            }
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero, true))) {  
          
        	bw.write(body.toString());
            bw.write("\n----------------------------------------------\n\n");
            
            JOptionPane.showMessageDialog(null, "Noticias guardadas correctamente."); //Ventana emergente indicando que las noticias se guardaron correctamente
        
        } catch(IOException e) {
        
        	System.err.println("Error al guardar las noticias en el archivo.");
       
        }
		
	}
	
}
