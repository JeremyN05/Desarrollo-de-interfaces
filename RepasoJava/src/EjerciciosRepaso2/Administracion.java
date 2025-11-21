package EjerciciosRepaso2;

public class Administracion {

	String dni;
	String nombre;
	String apellidos;
	int salario;
	String estudio;
	int antiguedad;
	
	
	public Administracion(String dni, String nombre, String apellidos, int salario, String estudio, int antiguedad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.estudio = estudio;
		this.antiguedad = antiguedad;
	}


	@Override
	public String toString() {
		return "Administracion [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", estudio=" + estudio + ", antiguedad=" + antiguedad + " año/s" + "]";
	}
	
}
