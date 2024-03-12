package ejercicio2;

public abstract class ProductoInformatico {
    String nombre;
    double precio;

    public ProductoInformatico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    abstract String Descripcion();

    void comprarProducto() {
    	//la frase no es igual que la del word pero me parece que tiene mas sentido.
        System.out.println("¡Gracias por añadir " + nombre + " a su carrito!");
    }
}
