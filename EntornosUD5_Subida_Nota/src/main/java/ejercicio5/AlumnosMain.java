package ejercicio5;

public class AlumnosMain {
	public static void main(String[] args) {
		// Datos de los alumnos y sus notas en diferentes asignaturas de acuerdo al
		// enunciado del problema
		// como no sabemos bien usar arrays bidimensionales, lo he hecho con un array
		// normal

		String[] alumnos = { "Alberto", "Base de Datos", "8", "Alberto", "Programación", "10", "Alberto", "Entorno",
				"9", "Alberto", "Sistemas", "4", "Alberto", "Lenguaje de Marcas", "10", "Juan", "Base de Datos", "4",
				"Juan", "Programación", "4", "Juan", "Entorno", "8", "Juan", "Sistemas", "10", "Juan",
				"Lenguaje de Marcas", "7" };

		// Aqui usamos los datos del array con un for para ir usando cada posicion para
		// ir creando instancias de alumnos e ir imprimiendolas cada vez.
		// como el array es del string, parseamos el dato 3 de cada ronda a un entero,
		// asi cuadra con los atributos de la clase.
		for (int i = 0; i < alumnos.length; i += 3) {
			Alumnos a = new Alumnos(alumnos[i], alumnos[i + 1], Integer.parseInt(alumnos[i + 2]));
			a.mostrar();
		}
	}
}
