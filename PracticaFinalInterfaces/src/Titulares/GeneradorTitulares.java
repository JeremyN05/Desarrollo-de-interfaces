package Titulares;

import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import DatosUsuarios.CargarPreferencias;

public class GeneradorTitulares {

    public static String obtenerTitularesUsuario(int idUsuario) {
        StringBuilder sb = new StringBuilder();


        List<String> prefs = CargarPreferencias.cargarPreferencias(idUsuario);

        if (prefs == null || prefs.isEmpty()) {
            return "No hay preferencias guardadas para este usuario.";
        }


        for (String codigo : prefs) {
            try {
                switch(codigo) {
                    // Economía
                    case "E1": sb.append(TituEconomia.cargarTitulares()).append("\n\n"); break;
                    case "E2": sb.append(TituEconomia.cargarTitulares2()).append("\n\n"); break;
                    case "E3": sb.append(TituEconomia.cargarTitulares3()).append("\n\n"); break;

                    // Deporte
                    case "D1": sb.append(TituDeporte.cargarTitulares()).append("\n\n"); break;
                    case "D2": sb.append(TituDeporte.cargarTitulares2()).append("\n\n"); break;
                    case "D3": sb.append(TituDeporte.cargarTitulares3()).append("\n\n"); break;

                    // Nacional
                    case "N1": sb.append(TituNacional.cargarTitulares()).append("\n\n"); break;
                    case "N2": sb.append(TituNacional.cargarTitulares2()).append("\n\n"); break;
                    case "N3": sb.append(TituNacional.cargarTitulares3()).append("\n\n"); break;

                    // Internacional
                    case "I1": sb.append(TituInternacional.cargarTitulares()).append("\n\n"); break;
                    case "I2": sb.append(TituInternacional.cargarTitulares2()).append("\n\n"); break;
                    case "I3": sb.append(TituInternacional.cargarTitulares3()).append("\n\n"); break;

                    // Videojuegos
                    case "V1": sb.append(TituVideojuegos.cargarTitulares()).append("\n\n"); break;
                    case "V2": sb.append(TituVideojuegos.cargarTitulares2()).append("\n\n"); break;
                    case "V3": sb.append(TituVideojuegos.cargarTitulares3()).append("\n\n"); break;

                    // Anime
                    case "A1": sb.append(TituAnime.cargarTitulares()).append("\n\n"); break;
                    case "A2": sb.append(TituAnime.cargarTitulares2()).append("\n\n"); break;
                    case "A3": sb.append(TituAnime.cargarTitulares3()).append("\n\n"); break;

                    default: break; 
                }
            } catch (IOException e) {
            	
            	JOptionPane.showMessageDialog(null, "Error cargando titulares de " + codigo + ": " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            
            }
        
        }

        return sb.toString().trim();
    }
}
