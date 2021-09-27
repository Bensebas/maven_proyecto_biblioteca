package proyecto.biblioteca.finall;

public class Libro {
    private String codigo;
	protected String nombre=null;
	protected String autor=null;
	protected int añoDePublicacionV;
	protected String editorial=null;
	protected int cantidadDePaginas;
	protected int precio;
        protected String estado=null;
        protected String estudiante=null;
    @Override
    public String toString() {
        return "Libro{" + "codigo=" + codigo + ", nombre=" + nombre + ", autor=" + autor + ", añoDePublicacionV" +añoDePublicacionV + ", editorial=" + editorial + ", cantidadDePaginas=" + cantidadDePaginas + ", precio=" + precio + ", estado=" + estado + '}';
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoDePublicacionV() {
        return añoDePublicacionV;
    }

    public String getEditorial() {
        return editorial;
    }

    public int getCantidadDePaginas() {
        return cantidadDePaginas;
    }

    public int getPrecio() {
        return precio;
    }

    public String getEstado() {
        return estado;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAñoDePublicacionV(int añoDePublicacionV) {
        this.añoDePublicacionV = añoDePublicacionV;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setCantidadDePaginas(int cantidadDePaginas) {
        this.cantidadDePaginas = cantidadDePaginas;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

	
	

	
        
}
