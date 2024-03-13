package ejercicio4;

public class Ropa implements ProductoInterfaz {

	int talla;
	String color;
	String marca;

	public Ropa(int talla, String color, String marca) {
		this.talla = talla;
		this.color = color;
		this.marca = marca;
	}

	@Override
	public void mostrarInformacion() {
		System.out.println("Talla: " + talla);
		System.out.println("Color: " + color);
		System.out.println("Marca: " + marca);
	}
}