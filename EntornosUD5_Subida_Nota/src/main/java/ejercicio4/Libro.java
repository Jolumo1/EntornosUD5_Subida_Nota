package ejercicio4;

public class Libro implements ProductoInterfaz {

	String nombre;
	String autor;
	double precio;
	String descripcion;

	public Libro(String nombre, String autor, double precio, String descripcion) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Precio: " + precio);
		System.out.println("Autor: " + autor);
	}
}
