package Biblioteca;

public class Libros extends Biblioteca implements InterfazPrestamo{

	boolean prestado = false;

	public Libros(int codigo, String titulo, String añoPublicacion, boolean prestado) {
		super(codigo, titulo, añoPublicacion);
		this.prestado = prestado;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return "Libros [prestado=" + prestado + ", codigo=" + codigo + ", titulo=" + titulo + ", añoPublicacion="
				+ añoPublicacion + "]";
	}

	@Override
	public void Prestado() {		
		prestado = true;
	}

	@Override
	public void Devolver() {	
		prestado = false;
	}

	@Override
	public boolean EstadoPrestamo() {
		return prestado;
	}
	
}
