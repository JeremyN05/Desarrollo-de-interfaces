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
		if (usuario == null) {
			
			JOptionPane.showMessageDialog(null, "No hay usuario activo.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		
		}
		
		List<String> prefs = CargarPreferencias.cargarPreferencias(usuario.getId());
		
		File fichero = new File(GuardadoNoticias_txt);
		
		if(!fichero.exists()) {
			
			try {
				
				fichero.createNewFile();
			
			} catch (IOException e) {

				JOptionPane.showMessageDialog(null, "No hay usuario activo.", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		}
		
		StringBuilder body = new StringBuilder();
        body.append("FECHA: ").append(LocalDateTime.now()).append("\n");
        body.append("USUARIO: ").append(usuario.getNombre()).append("\n\n");

        for(String abrev : prefs) {
            
        	List<String> titulares = new ArrayList<>();
            String categoria = "";

            switch(abrev) {
            
            	case "E1": categoria = "Economía1"; break;
            	case "E2": categoria = "Economía2"; break;
            	case "E3": categoria = "Economía3"; break;
            
            	case "D1": categoria = "Deportes1"; break;
            	case "D2": categoria = "Deportes2"; break;
            	case "D3": categoria = "Deportes3"; break;
            
            	case "N1": categoria = "Nacional1"; break;
            	case "N2": categoria = "Nacional2"; break;
            	case "N3": categoria = "Nacional3"; break;
            
            	case "I1": categoria = "Internacional1"; break;
            	case "I2": categoria = "Internacional2"; break;
            	case "I3": categoria = "Internacional3"; break;
            
            	case "V1": categoria = "Videojuegos1"; break;
           		case "V2": categoria = "Videojuegos2"; break;
           		case "V3": categoria = "Videojuegos3"; break;
            
           		case "A1": categoria = "Anime1"; break;
           		case "A2": categoria = "Anime2"; break;
           		case "A3": categoria = "Anime3"; break;
            
            }

            if(!categoria.isEmpty()) {
                
            	body.append("CATEGORÍA: ").append(categoria).append("\n");

                try {
                   
                	if (categoria.startsWith("Economía")) {
                	    if (categoria.equals("Economía1")) titulares.add(TituEconomia.cargarTitulares());
                	    if (categoria.equals("Economía2")) titulares.add(TituEconomia.cargarTitulares2());
                	    if (categoria.equals("Economía3")) titulares.add(TituEconomia.cargarTitulares3());
                	}

                	else if (categoria.startsWith("Deportes")) {
                	    if (categoria.equals("Deportes1")) titulares.add(TituDeporte.cargarTitulares());
                	    if (categoria.equals("Deportes2")) titulares.add(TituDeporte.cargarTitulares2());
                	    if (categoria.equals("Deportes3")) titulares.add(TituDeporte.cargarTitulares3());
                	}

                	else if (categoria.startsWith("Nacional")) {
                	    if (categoria.equals("Nacional1")) titulares.add(TituNacional.cargarTitulares());
                	    if (categoria.equals("Nacional2")) titulares.add(TituNacional.cargarTitulares2());
                	    if (categoria.equals("Nacional3")) titulares.add(TituNacional.cargarTitulares3());
                	}

                	else if (categoria.startsWith("Internacional")) {
                	    if (categoria.equals("Internacional1")) titulares.add(TituInternacional.cargarTitulares());
                	    if (categoria.equals("Internacional2")) titulares.add(TituInternacional.cargarTitulares2());
                	    if (categoria.equals("Internacional3")) titulares.add(TituInternacional.cargarTitulares3());
                	}

                	else if (categoria.startsWith("Videojuegos")) {
                	    if (categoria.equals("Videojuegos1")) titulares.add(TituVideojuegos.cargarTitulares());
                	    if (categoria.equals("Videojuegos2")) titulares.add(TituVideojuegos.cargarTitulares2());
                	    if (categoria.equals("Videojuegos3")) titulares.add(TituVideojuegos.cargarTitulares3());
                	}

                	else if (categoria.startsWith("Anime")) {
                	    if (categoria.equals("Anime1")) titulares.add(TituAnime.cargarTitulares());
                	    if (categoria.equals("Anime2")) titulares.add(TituAnime.cargarTitulares2());
                	    if (categoria.equals("Anime3")) titulares.add(TituAnime.cargarTitulares3());
                	}
                	
                } catch(Exception e){
                    
                	JOptionPane.showMessageDialog(null,"Error al cargar titulares de " + categoria + ":\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                
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
        
        	JOptionPane.showMessageDialog(null, "Error al guardar las noticias en el archivo:\n" + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
       
        }
		
	}
	
}
