package DatosUsuarios;

import java.util.List;

public class Usuarios {

	int id;
	String nombre;
	String contrasena;
	String gmail;
	boolean admin;
	List <String> preferencias;
	
	public Usuarios(int id, String nombre, String contrasena, String gmail, boolean admin, List<String> preferencias) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contrasena = contrasena;
		this.gmail = gmail;
		this.admin = admin;
		this.preferencias = preferencias;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContraseña(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

	public List<String> getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(List<String> preferencias) {
		this.preferencias = preferencias;
	}

	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nombre=" + nombre + ", contraseña=" + contrasena + ", gmail=" + gmail
				+ ", admin=" + admin + ", preferencias=" + preferencias + ", getId()=" + getId() + ", getNombre()="
				+ getNombre() + ", getContraseña()=" + getContrasena() + ", getGmail()=" + getGmail() + ", isAdmin()="
				+ isAdmin() + ", getPreferencias()=" + getPreferencias() + "]";
	}
	
}
