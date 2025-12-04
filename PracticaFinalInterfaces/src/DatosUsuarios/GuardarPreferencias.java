package DatosUsuarios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GuardarPreferencias {
	
	private static final String CARPETA = "src/Data";
    private static final String ARCHIVO = CARPETA + File.separator + "preferencias.txt";

    public static void guardarPreferencias(Usuarios usuario, List<String> preferencias) {

        File carpeta = new File(CARPETA);
        if (!carpeta.exists()) carpeta.mkdir();

        File fichero = new File(ARCHIVO);

        try (FileWriter fw = new FileWriter(fichero)) {

            fw.write("id: "+ usuario.getId() + "-");

            for (String pref : preferencias) {
             
            	fw.write(pref + ",");
            
            }

        } catch (IOException e) {
         
        	e.printStackTrace();
       
        }
   
    }
	
}
