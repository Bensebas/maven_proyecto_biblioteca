package proyecto.biblioteca.finall;

public class Libro {

	private String codigo;
	protected String nombre;
	protected String autor;
	protected int a�oDePublicaci�n;
	protected String editorial;
	protected int cantidadDePaginas;
	protected int precio;

	@Override
	public String toString() {
		return "Libro [codigo=" + codigo + ", nombre=" + nombre + ", autor=" + autor + ", a�oDePublicaci�n="
				+ a�oDePublicaci�n + ", editorial=" + editorial + ", cantidadDePaginas=" + cantidadDePaginas
				+ ", precio=" + precio + "]";
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getA�oDePublicaci�n() {
		return a�oDePublicaci�n;
	}

	public void setA�oDePublicaci�n(int a�oDePublicaci�n) {
		this.a�oDePublicaci�n = a�oDePublicaci�n;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		editorial = editorial;
	}

	public int getCantidadDePaginas() {
		return cantidadDePaginas;
	}

	public void setCantidadDePaginas(int cantidadDePaginas) {
		this.cantidadDePaginas = cantidadDePaginas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
