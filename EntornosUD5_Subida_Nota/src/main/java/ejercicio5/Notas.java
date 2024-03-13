package ejercicio5;

public abstract class Notas {

	protected String nombre;
	protected String asignatura;
	protected int nota;

	public Notas(String nombre, String asignatura, int nota) {
		this.nombre = nombre;
		this.asignatura = asignatura;
		this.nota = nota;
	}

	abstract String resultado();

	abstract void mostrar();
}
