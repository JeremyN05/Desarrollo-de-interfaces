package EjercicioRepaso4;

public  class personas implements Comparable<personas> {

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
 
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "personas [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", salario=" + salario
				+ "]";
	}

	@Override
	public int compareTo(personas o) {
		if(salario>o.getSalario())
		return 1;

		if (salario<o.getSalario())
		return -1;
		
		return 0;
	}
	
	
	
}
