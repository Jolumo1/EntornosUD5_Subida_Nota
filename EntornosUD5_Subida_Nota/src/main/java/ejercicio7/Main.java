package ejercicio7;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos una lista de publicaciones
		ArrayList<Publicaciones> biblioteca1 = new ArrayList<>();

        // Agregar libros y revistas a la lista
        biblioteca1.add(new Libros("El Hobbit", "J.R.R. Tolkien", 300));
        biblioteca1.add(new Libros("Cien años de soledad", "Gabriel García Márquez", 500));
        biblioteca1.add(new Revistas("National Geographic", 100, "01/2023"));
        biblioteca1.add(new Revistas("Time", 200, "02/2023"));

        // Imprimir los elementos haciendo uso de los metodos
        System.out.println("Estas son las publicaciones disponibles: ");
        for (Publicaciones publicacion : biblioteca1) {
            publicacion.imprimir();
        }
    }
}
