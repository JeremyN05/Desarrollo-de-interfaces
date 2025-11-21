package Biblioteca;

public class Revistas extends Biblioteca{

	int numeroRevista;

	public Revistas(int codigo, String titulo, String añoPublicacion, int numeroRevista) {
		super(codigo, titulo, añoPublicacion);
		this.numeroRevista = numeroRevista;
	}

	public int getNumeroRevista() {
		return numeroRevista;
	}

	public void setNumeroRevista(int numeroRevista) {
		this.numeroRevista = numeroRevista;
	}

	@Override
	public String toString() {
		return "Revistas [numeroRevista=" + numeroRevista + ", codigo=" + codigo + ", titulo=" + titulo
				+ ", añoPublicacion=" + añoPublicacion + "]";
	}
	
}
