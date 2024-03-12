package ejercicio1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados juan = new Empleados("Juan", "Empleado", 5500.0, "enero");

		Empleados alberto = new Empleados("Alberto", "Empleado", 8250.0, "febrero");

		Directivos eva = new Directivos("Eva", "Directivo", 14400.0, "febrero", 12300.0);

		Becario jose = new Becario("Jose", "Becario", 220.0, "enero", "enero", "marzo");

		
		System.out.println(alberto.toString());
		System.out.println(eva.toString());
		System.out.println(jose.toString());

		juan.vacaciones();
		alberto.vacaciones();
		eva.vacaciones();
		jose.vacaciones();

		
		alberto.reuniones();
		eva.reuniones();
		jose.reuniones();

	}

}
