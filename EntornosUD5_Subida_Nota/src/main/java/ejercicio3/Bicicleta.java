package ejercicio3;

public class Bicicleta extends Vehiculo {
	private String tipo;

	public Bicicleta(String color, int ruedas, String modelo, String tipo) {
		super(color, ruedas, modelo);
		this.tipo = tipo;
	}

	@Override
	public void acelerar() {
		System.out.println("La bici está acelerando");
	}

	@Override
	public void frenar() {
		System.out.println("Frenando Bicicleta, cuidado con los dientes.");
	}

	@Override
	public String toString() {
		return "Bicicleta [tipo=" + tipo + ", " + super.toString() + "]";
	}



}
