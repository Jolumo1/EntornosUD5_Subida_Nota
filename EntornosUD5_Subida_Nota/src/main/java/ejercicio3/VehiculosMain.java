package ejercicio3;

public class VehiculosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Como pide el ejercicio, creamos una instancia de cada tipo, damos la
		// bienvenida, mostramos los datos y ejecutamos los metodos frenar y acelerar
		// para mostrar la ifnormación he usado los metodos toString modificandolos para
		// que herede ciertas cosas del padre y se ajusten a cada instancia con los
		// atributos adicionales.

		System.out.println("¡Bienvenido al sistema de gestión de vehículos definitivo!");

		Coche coche = new Coche("rojo", 4, "Renault", 1600);
		Bicicleta bicicleta = new Bicicleta("verde", 2, "Mountain Bike", "montaña");

		System.out.println(coche.toString());
		coche.acelerar();
		coche.frenar();

		System.out.println();
		System.out.println(bicicleta.toString());
		bicicleta.acelerar();
		bicicleta.frenar();

	}
}
