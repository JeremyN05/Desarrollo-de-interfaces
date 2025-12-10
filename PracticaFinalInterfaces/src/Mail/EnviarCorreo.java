package Mail;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.Usuarios;
import Titulares.TituAnime;
import Titulares.TituEconomia;
import Titulares.TituInternacional;
import Titulares.TituDeporte;
import Titulares.TituNacional;
import Titulares.TituVideojuegos;

public class EnviarCorreo{
	
    public static void sendEmail(Session session, String toEmail, String subject, String body){
       
    	try{
           
    		MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress("no_reply@example.com", "NO BIZUM NO RESPONDER"));
            msg.setReplyTo(InternetAddress.parse("no_reply_DOSA@DAM.com", false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            System.out.println("MENSAJE CREADO");
            Transport.send(msg);
            System.out.println("¡EMAIL ENVIADO!");
        
    	} catch (Exception e) {
            
    		e.printStackTrace();
        
        }
    
    }
    
    public static void crearEMAIL(Usuarios usuario) {

        Properties config = leerConfig("src/Mail/DatosSalida.txt");
        final String fromEmail = config.getProperty("email_salida");
        final String password = config.getProperty("email_pass");
        final String host = config.getProperty("smtp");
        final String puerto = config.getProperty("puerto_ssl");
        final boolean tls = Boolean.parseBoolean(config.getProperty("tls"));

        System.out.println("Configurando datos conexión SSL");

        Properties props = new Properties();
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.port", puerto);
        props.put("mail.smtp.auth", "true");

        if (!tls) {
            props.put("mail.smtp.socketFactory.port", puerto);
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        }

        Authenticator auth = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(fromEmail, password);
            }
        };     

        Session session = Session.getDefaultInstance(props, auth);
        System.out.println("Sesión Creada");

        StringBuilder body = new StringBuilder();
        body.append("ASUNTO: NOTICIAS DAM\n");
        body.append("FECHA/HORA: ").append(LocalDateTime.now()).append("\n\n");

        List<String> prefs = CargarPreferencias.cargarPreferencias(usuario.getId());

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

        // Enviar correo
        sendEmail(session, usuario.getGmail(), "NOTICIAS DAM", body.toString());
    }
    
    public static Properties leerConfig(String rutaArchivo) {
        Properties props = new Properties();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            
        	String linea;
           
            while ((linea = br.readLine()) != null) {
                
            	linea = linea.trim();
                
                if (linea.isEmpty() || linea.startsWith("#")) {
                	
                	continue;
                	
                }
                
                String[] partes = linea.split("=", 2);
                
                if (partes.length == 2) {
                    props.setProperty(partes[0].trim(), partes[1].trim());
               
                }
          
            }
        
        } catch (IOException e) {
        
        	e.printStackTrace();
        
        }

        return props;
    }
	
}
