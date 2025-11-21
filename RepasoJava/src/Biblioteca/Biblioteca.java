package Biblioteca;

public class Biblioteca implements Comparable<Biblioteca>{

	int codigo;
	String titulo;
	String añoPublicacion;
	
	public Biblioteca(int codigo, String titulo, String añoPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(String añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	@Override
	public String toString() {
		return "Biblioteca [codigo=" + codigo + ", titulo=" + titulo + ", añoPublicacion=" + añoPublicacion + "]";
	}

	@Override
	public int compareTo(Biblioteca o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
