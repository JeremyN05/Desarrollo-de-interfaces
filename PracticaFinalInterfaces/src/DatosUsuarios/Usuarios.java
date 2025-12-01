package DatosUsuarios;

import java.util.ArrayList;

public class Usuarios {

	String nombre;
	String contraseña;
	String gmail;
	boolean admin;
	ArrayList <Preferencias> preferencias = new ArrayList<>();
	
	public Usuarios(String nombre, String contraseña, String gmail, boolean admin,
			ArrayList<Preferencias> preferencias) {
		super();
		this.nombre = nombre;
		this.contraseña = contraseña;
		this.gmail = gmail;
		this.admin = admin;
		this.preferencias = preferencias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
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

	public ArrayList<Preferencias> getPreferencias() {
		return preferencias;
	}

	public void setPreferencias(ArrayList<Preferencias> preferencias) {
		this.preferencias = preferencias;
	}

	@Override
	public String toString() {
		return "Usuarios [nombre=" + nombre + ", contraseña=" + contraseña + ", gmail=" + gmail + ", admin=" + admin
				+ ", preferencias=" + preferencias + ", getNombre()=" + getNombre() + ", getContraseña()="
				+ getContraseña() + ", getGmail()=" + getGmail() + ", isAdmin()=" + isAdmin() + ", getPreferencias()="
				+ getPreferencias() + "]";
	}
	
}
