package ejercicio1;

public class Empleados extends Sueldos {

	public Empleados(String nombre, String puesto, double salario, String mes) {
		super(nombre, puesto, salario, mes);
	}

	@Override
	public double calcularSalario() {
		return salario;
	}

	@Override
	public double Irpf() {
		return salario * 0.15;
	}

	@Override
	public void vacaciones() {
		super.vacaciones();
	}

	@Override
	void MostrarDividendo() {
		// TODO Auto-generated method stub
		//Se hereda pero en esta clase no se desarrolla

	}

	@Override
	public String toString() {
		return "El Salario del empleado " + nombre + " es: " + calcularSalario() + " " + mes + " el irpf es " + Irpf();
	}

}