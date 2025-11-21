package EjerciciosRepaso3;

public class Administracion extends personas{

	String estudio;
	int antiguedad;
	
	
	public Administracion(String dni, String nombre, String apellidos, int salario, String estudio, int antiguedad) {
		super(dni, nombre, apellidos, salario);
		this.estudio = estudio;
		this.antiguedad = antiguedad;
	}


	@Override
	public String toString() {
		return "Administracion [estudio=" + estudio + ", antiguedad=" + antiguedad + ", dni=" + dni + ", nombre="
				+ nombre + ", apellidos=" + apellidos + ", salario=" + salario + "]";
	}

	
}
