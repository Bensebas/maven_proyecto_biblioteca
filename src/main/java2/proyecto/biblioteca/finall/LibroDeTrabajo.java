package proyecto.biblioteca.finall;

public class LibroDeTrabajo extends Libro {

	int codigoDeAutorizacion;

	@Override
	public String toString() {
		return "LibroDeTrabajo [codigoDeAutorizacion=" + codigoDeAutorizacion + "]";
	}

	public int getCodigoDeAutorizacion() {
		return codigoDeAutorizacion;
	}

	public void setCodigoDeAutorizacion(int codigoDeAutorizacion) {
		this.codigoDeAutorizacion = codigoDeAutorizacion;
	}

}
