package DatosUsuarios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CargarPreferencias {

    private static final String CONFIG = "src/Data/Configuracion.txt";

    public static List<String> cargarPreferencias(int idUsuario) {
        List<String> prefs = new ArrayList<>();
        String prefix = "id:" + idUsuario + "-";

        try (BufferedReader br = new BufferedReader(new FileReader(CONFIG))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                if (linea.startsWith(prefix)) {
                    String datos = linea.substring(prefix.length());
                    String[] lista = datos.split(",");

                    for (String s : lista) {
                        s = s.trim().toUpperCase();
                        if (!s.isEmpty()) prefs.add(s);
                    }

                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prefs;
    }
}

