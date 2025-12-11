package Mail;

import java.io.BufferedReader;
import java.io.File;
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

import javax.swing.JOptionPane;


import DatosUsuarios.CargarPreferencias;
import DatosUsuarios.Usuarios;
import Titulares.TituAnime;
import Titulares.TituEconomia;
import Titulares.TituInternacional;
import Titulares.TituDeporte;
import Titulares.TituNacional;
import Titulares.TituVideojuegos;

public class EnviarCorreo{
	
	private static final String USUARIOS_TXT  = "src" + File.separator + "Usuarios.txt";
	
    public static void sendEmail(Session session, String toEmail, String subject, String body){
       
    	try{
           
    		MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress("no_reply@example.com"));
            msg.setReplyTo(InternetAddress.parse("no_reply_DOSA@DAM.com", false));
            msg.setSubject(subject, "UTF-8");
            msg.setText(body, "UTF-8");
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            Transport.send(msg);
            
            JOptionPane.showMessageDialog(null, "Correo electrónico enviado correctamente."); //Ventana emergente indicando el envío del correo
        
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
        
        List<Usuarios> usuarios = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(USUARIOS_TXT))) {
            
        	String linea;
            
            while ((linea = br.readLine()) != null) {
               
            	if (linea.trim().isEmpty()) continue;
               
                String[] partes = linea.split(",");
               
                if (partes.length >= 5) {
                	
                	String idStr = partes[0].replaceAll("[^0-9]", "");
                	int id = Integer.parseInt(idStr);
               
                	boolean isAdmin = partes[4].equalsIgnoreCase("true");
                	
                    usuarios.add(new Usuarios(id, partes[1], partes[2], partes[3], isAdmin, null));
                
                }
           
            }
       
        } catch (IOException e) {
        
        	e.printStackTrace();
        
        }
        
        StringBuilder resumen = new StringBuilder();
        
        resumen.append("Resumen de envío de correos:\n");

        for (Usuarios u : usuarios) {
            
        	if (u.isAdmin()) continue;

            if (u.getGmail() == null || u.getGmail().isBlank()) {
              
            	resumen.append(u.getNombre()).append(": no tiene correo válido.\n");
                continue;
            
            }

            List<String> prefs = CargarPreferencias.cargarPreferencias(u.getId());
           
            if (prefs == null || prefs.isEmpty()) {
                
            	resumen.append(u.getNombre()).append(": no tiene preferencias configuradas.\n");
                continue;
           
            }

            StringBuilder body = new StringBuilder();
            body.append("ASUNTO: NOTICIAS DAM\n");
            body.append("FECHA/HORA: ").append(LocalDateTime.now()).append("\n\n");

            for (String abrev : prefs) {
                
            	List<String> titulares = new ArrayList<>();
                String categoria = "";

                switch (abrev) {
                    
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

                if (!categoria.isEmpty()) {
                   
                	body.append("CATEGORÍA: ").append(categoria).append("\n");

                    try {
                        
                    	if (categoria.startsWith("Economía")) {
                            if (categoria.equals("Economía1")) titulares.add(TituEconomia.cargarTitulares());
                            if (categoria.equals("Economía2")) titulares.add(TituEconomia.cargarTitulares2());
                            if (categoria.equals("Economía3")) titulares.add(TituEconomia.cargarTitulares3());
                        
                    	} else if (categoria.startsWith("Deportes")) {
                            if (categoria.equals("Deportes1")) titulares.add(TituDeporte.cargarTitulares());
                            if (categoria.equals("Deportes2")) titulares.add(TituDeporte.cargarTitulares2());
                            if (categoria.equals("Deportes3")) titulares.add(TituDeporte.cargarTitulares3());
                        
                    	} else if (categoria.startsWith("Nacional")) {
                            if (categoria.equals("Nacional1")) titulares.add(TituNacional.cargarTitulares());
                            if (categoria.equals("Nacional2")) titulares.add(TituNacional.cargarTitulares2());
                            if (categoria.equals("Nacional3")) titulares.add(TituNacional.cargarTitulares3());
                       
                    	} else if (categoria.startsWith("Internacional")) {
                            if (categoria.equals("Internacional1")) titulares.add(TituInternacional.cargarTitulares());
                            if (categoria.equals("Internacional2")) titulares.add(TituInternacional.cargarTitulares2());
                            if (categoria.equals("Internacional3")) titulares.add(TituInternacional.cargarTitulares3());
                        
                    	} else if (categoria.startsWith("Videojuegos")) {
                            if (categoria.equals("Videojuegos1")) titulares.add(TituVideojuegos.cargarTitulares());
                            if (categoria.equals("Videojuegos2")) titulares.add(TituVideojuegos.cargarTitulares2());
                            if (categoria.equals("Videojuegos3")) titulares.add(TituVideojuegos.cargarTitulares3());
                       
                    	} else if (categoria.startsWith("Anime")) {
                            if (categoria.equals("Anime1")) titulares.add(TituAnime.cargarTitulares());
                            if (categoria.equals("Anime2")) titulares.add(TituAnime.cargarTitulares2());
                            if (categoria.equals("Anime3")) titulares.add(TituAnime.cargarTitulares3());
                        
                        }
                   
                    } catch (Exception e) {
                     
                    	e.printStackTrace();
                   
                    }

                    for (String t : titulares) {
                     
                    	body.append("  - ").append(t).append("\n");
                   
                    }

                    body.append("\n");
               
                }
            
            }

            try {
              
            	sendEmail(session, u.getGmail(), "NOTICIAS DAM", body.toString());
                resumen.append(u.getNombre()).append(": correo enviado correctamente.\n");
            
            } catch (Exception e) {

            	resumen.append(u.getNombre()).append(": no se pudo enviar el correo (" + e.getMessage() + ")\n");
           
            }
        
        }

        JOptionPane.showMessageDialog(null, resumen.toString(), "Resumen envío", JOptionPane.INFORMATION_MESSAGE);
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
