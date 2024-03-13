package ejercicio7;

public class Revistas extends Publicaciones implements Titulo {

	private int edicion;
	private String fechaPublicacion;

	public Revistas(String titulo, int edicion, String fechaPublicacion) {
		super(titulo);
		this.edicion = edicion;
		this.fechaPublicacion = fechaPublicacion;
	}

	@Override
	void imprimir() {
		System.out.println("Revista: " + imprimirTitulo() + ", Edición: " + edicion + ", Fecha de Publicación: "
				+ fechaPublicacion);
	}

	@Override
	public String imprimirTitulo() {
		return titulo;
	}
}
