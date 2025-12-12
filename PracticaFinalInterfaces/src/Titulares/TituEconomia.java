package Titulares;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TituEconomia {

    public static String cargarTitulares() throws IOException {
        return cargarTitular("E1");
    }

    public static String cargarTitulares2() throws IOException {
        return cargarTitular("E2");
    }

    public static String cargarTitulares3() throws IOException {
        return cargarTitular("E3");
    }

    private static String cargarTitular(String codigo) throws IOException {
        String[] datos = leerConfig(codigo);
        if (datos == null) return "Titular no disponible";

        Document document = Jsoup.connect(datos[0]).get();
        Element element = document.select(datos[1]).first();

        return element != null ? element.text().toUpperCase() : "Titular no disponible";
    }

    private static String[] leerConfig(String codigo) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Data/Configuracion.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.startsWith("##" + codigo)) {
                    String[] partes = linea.split("-", 3);
                    return new String[]{partes[1], partes[2]};
                }
            }
        }
        return null;
    }
}
