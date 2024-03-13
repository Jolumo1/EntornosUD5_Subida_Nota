package ejercicio7;

public class Libros extends Publicaciones implements Titulo {

	private String autor;
	private int numeroPaginas;

	public Libros(String titulo, String autor, int numeroPaginas) {
		super(titulo);
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	void imprimir() {
		System.out.println("Libro: " + imprimirTitulo() + ", Autor: " + autor + ", Páginas: " + numeroPaginas);
	}

	@Override
	public String imprimirTitulo() {
		return titulo;
	}
}
