package DatosUsuarios;

public class Preferencias {

	String tipo;

	public Preferencias(String tipo) {
		super();
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Preferencias [tipo=" + tipo + "]";
	}
	
}
