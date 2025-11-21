package EjercicioRepaso4;

import java.util.Arrays;

enum Sexo {MASCULINO,FEMENINO};

public class alumno {

	String dni;
	String nombre;
	String apellidos;
	String fechaNac;
	Sexo unSexo;
	boolean repetidor;
	modulo [] unModulo;
	
	public alumno(String dni, String nombre, String apellidos, String fechaNac, Sexo unSexo, boolean repetidor,
			modulo[] unModulo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.unSexo = unSexo;
		this.repetidor = repetidor;
		this.unModulo = unModulo;
	}

	@Override
	public String toString() {
		return "alumno [DNI=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", fechaNac=" + fechaNac
				+ ", unSexo=" + unSexo + ", repetidor=" + repetidor + ", unModulo=" + Arrays.toString(unModulo) + "]";
	}
	
	
	
}
