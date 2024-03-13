package ejercicio1;

public abstract class Sueldos implements Vacaciones, Reuniones {

    protected String nombre;
    protected String puesto;
    protected double salario;
    protected String mes;

    public Sueldos(String nombre, String puesto, double salario, String mes) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.mes = mes;
    }

    abstract double calcularSalario();

    abstract double Irpf();

    abstract void MostrarDividendo();

    public void vacaciones() {
        System.out.println("las vacaciones de todos los empleados es cuando quieran");
    }

    public void reuniones() {
        System.out.println("las reuniones de los empleados no directivos serán los lunes y viernes");
    }
	
}
