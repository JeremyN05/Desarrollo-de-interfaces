package DatosUsuarios;

import java.io.*;
import java.util.List;

import javax.swing.JOptionPane;

public class GuardarPreferencias {

    private static final String CARPETA = "src/Data";
    private static final String ARCHIVO = CARPETA + File.separator + "Configuracion.txt";

    public static void guardarPreferencias(int idUsuario, List<String> preferencias) {
        File archivo = new File(ARCHIVO);

        try {

            StringBuilder sb = new StringBuilder();
            sb.append("id:").append(idUsuario).append("-");
            for (int i = 0; i < preferencias.size(); i++) {
                sb.append(preferencias.get(i));
                if (i != preferencias.size() - 1) sb.append(",");
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo, true))) {
                bw.newLine();
                bw.write(sb.toString());
            }

        } catch (IOException e) {
        	JOptionPane.showMessageDialog(null, "Error al enviar correo a " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        	
        }
    }
}


