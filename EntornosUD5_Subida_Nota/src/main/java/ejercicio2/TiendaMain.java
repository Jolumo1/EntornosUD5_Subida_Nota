package ejercicio2;

import java.util.ArrayList;

public class TiendaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Como dice el ejercicio, creamos una instancia de cada clase

		PortatilImpl portatil = new PortatilImpl("Lenovo ThinkPad X1 Carbon", 1400, "16 pulgadas");
		MovilImp movil = new MovilImp("Iphone 15", 990.90, "6 pulgadas", "Garrafone");
		TabletImpl tablet = new TabletImpl("Ipad Air", 599.90, "10 pulgadas", true);

		// Creamos una lista de productos y los agregamos

		ArrayList<ProductoInformatico> listaProductos = new ArrayList();

		listaProductos.add(portatil);
		listaProductos.add(movil);
		listaProductos.add(tablet);

		// Recorremos la lista y ejecutamos los metodos que nos idnican
		for (ProductoInformatico producto : listaProductos) {

			mensajeBienvenida();
			System.out.println(producto.Descripcion());
			producto.comprarProducto();

		}

	}

	// He creado un metodo para dar la bienvenida en el main por lo que dice en el
	// word, no queda muy claro si hay que hacerlo en otra parte.
	public static void mensajeBienvenida() {
		System.out.println();
		System.out.println("----------------DIGITECH SHOP 2023-----------------");
	}

}
