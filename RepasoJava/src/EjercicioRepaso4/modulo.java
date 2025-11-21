package EjercicioRepaso4;

public class modulo {

	String nombre;
	int nHoras;
	Profesor profesor;
	boolean convalidable;
	
	public modulo(String nombre, int nHoras, Profesor profesor, boolean convalidable) {
		super();
		this.nombre = nombre;
		this.nHoras = nHoras;
		this.profesor = profesor;
		this.convalidable = convalidable;
	}

	@Override
	public String toString() {
		return "modulo [nombre=" + nombre + ", nHoras=" + nHoras + ", profesor=" + profesor + ", convalidable="
				+ convalidable + "]";
	}

}
