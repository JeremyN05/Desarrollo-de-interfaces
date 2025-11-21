package EjercicioRepaso4;

public class Profesor extends personas {

	int nAsignaturas;
	boolean tutor;
	
	
	public Profesor(String dni, String nombre, String apellidos, int salario, int nAsignaturas, boolean tutor) {
		super(dni, nombre, apellidos, salario);
		this.nAsignaturas = nAsignaturas;
		this.tutor = tutor;
	}


	@Override
	public String toString() {
		return "Profesor [nAsignaturas=" + nAsignaturas + ", tutor=" + tutor + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}

}
