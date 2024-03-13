package ejercicio3;

public abstract class Vehiculo {
	protected String color;
	protected int ruedas;
	protected String modelo;

	public Vehiculo(String color, int ruedas, String modelo) {
		this.color = color;
		this.ruedas = ruedas;
		this.modelo = modelo;
	}

	public abstract void acelerar();

	public abstract void frenar();


	public String toString() {
		return "color=" + color + ", ruedas=" + ruedas + ", modelo=" + modelo;
	}

	
	
}
