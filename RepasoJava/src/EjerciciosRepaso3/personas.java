package EjerciciosRepaso3;

public class personas {

	String dni;
	String nombre;
	String apellidos;
	int salario;
	
	
	public personas(String dni, String nombre, String apellidos, int salario) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
	}


	@Override
	public String toString() {
		return "personas [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ "]";
	}
	
	
	
}
