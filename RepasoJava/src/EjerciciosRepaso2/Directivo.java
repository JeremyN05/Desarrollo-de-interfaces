package EjerciciosRepaso2;

enum Turno {MAÑANA, TARDE}

public class Directivo {

	String dni;
	String nombre;
	String apellidos;
	int salario;
	boolean salesiano;
	Turno unTurno;
	
	
	public Directivo(String dni, String nombre, String apellidos, int salario, boolean salesiano, Turno unTurno) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.salesiano = salesiano;
		this.unTurno = unTurno;
	}


	@Override
	public String toString() {
		return "Directivo [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ ", salesiano=" + salesiano + ", unTurno=" + unTurno + "]";
	}
	
	
	
}
