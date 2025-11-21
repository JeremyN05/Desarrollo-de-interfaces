package EjerciciosRepaso2;

public class Profesor {

	String dni;
	String nombre;
	String apellidos;
	int salario;
	int nAsignaturas;
	boolean tutor;
	

	public Profesor(String dni, String nombre, String apellidos, int salario, int nAsignaturas, boolean tutor) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.nAsignaturas = nAsignaturas;
		this.tutor = tutor;
	}
	
	@Override
	public String toString() {
		return "Administracion [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", nAsignaturas=" + nAsignaturas + ", tutor=" + tutor + "]";
	}

	
}
