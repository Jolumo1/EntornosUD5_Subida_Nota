package ejercicio5;

public class Alumnos extends Notas {

	public Alumnos(String nombre, String asignatura, int nota) {
		super(nombre, asignatura, nota);
	}

	@Override
	String resultado() {
		if (nota >= 5) {
			return "Aprobado";
		} else {
			return "Suspendido pringao";
		}
	}

	@Override
	void mostrar() {
		System.out.println("El alumno " + nombre + " " + asignatura + " con un " + nota + " está " + resultado());
	}
}
