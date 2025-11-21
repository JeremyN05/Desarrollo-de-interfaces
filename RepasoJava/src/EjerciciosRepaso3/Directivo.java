package EjerciciosRepaso3;

enum Turno {MAÑANA, TARDE}

public class Directivo extends personas {

	boolean salesiano;
	Turno unTurno;
	
	public Directivo(String dni, String nombre, String apellidos, int salario, boolean salesiano, Turno unTurno) {
		super(dni, nombre, apellidos, salario);
		this.salesiano = salesiano;
		this.unTurno = unTurno;
	}

	@Override
	public String toString() {
		return "Directivo [salesiano=" + salesiano + ", unTurno=" + unTurno + ", dni=" + dni + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}
	
	
	
}
