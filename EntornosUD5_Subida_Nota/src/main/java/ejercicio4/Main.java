package ejercicio4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("¡Bienvenido a la tienda de Albertronic!");
		 System.out.println();

	        // Creamos instancias de un libro, un electrodoméstico y una prenda de ropa como indica el ejercicoi.
	        Libro libro = new Libro("El señor de los anillos", "Tolkien", 30.0, "Novela de aventura");
	        Electrodomestico electrodomestico = new Electrodomestico("Refrigerador de marca LG", "LG", 500.0, "Refrigerador");
	        Ropa ropa = new Ropa(39, "Negro", "marca");

	        // Mostramos la información de cada objeto usando el metodo mostrarInformacion
	        libro.mostrarInformacion();
	        System.out.println();
	        electrodomestico.mostrarInformacion();
	        System.out.println();
	        ropa.mostrarInformacion();
	    }
	}