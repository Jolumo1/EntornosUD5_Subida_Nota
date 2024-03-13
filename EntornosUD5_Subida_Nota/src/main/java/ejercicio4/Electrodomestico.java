package ejercicio4;

public class Electrodomestico implements ProductoInterfaz {
	
	String marca;
	String nombre;
	double precio;
	String descripcion;

	public Electrodomestico(String marca, String nombre, double precio, String descripcion) {
		this.marca = marca;
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Descripción: " + descripcion);
		System.out.println("Precio: " + precio);
		System.out.println("Marca: " + marca);
	}
}
