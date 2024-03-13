package ejercicio1;

public class Becario extends Sueldos {

	private String inicio;
	private String fin;

	public Becario(String nombre, String puesto, double salario, String mes, String inicio, String fin) {
		super(nombre, puesto, salario, mes);
		this.inicio = inicio;
		this.fin = fin;
	}

	
	
	@Override
	public String toString() {
		return "El Salario del becario " + nombre + " es: " + calcularSalario() + " " + mes
				+ " inicio de practica " + inicio + " la fecha de fin " + fin;
	}



	@Override
	double calcularSalario() {
		return salario;
	}

	@Override
	double Irpf() {
		return 0; 
	//Lo dejo a 0 porque parece que los becarios no pagan impuestos segun se entiende del Main
	}

	@Override
	void MostrarDividendo() {
		System.out.println("No hay dividendos para los becarios");
	}

	@Override
	public void vacaciones() {
		System.out.println("Los becarios no tienen vacaciones"); 
	}

	@Override
	public void reuniones() {
		System.out.println("Los becarios no tienen reuniones, son esclavos");
	}

}
