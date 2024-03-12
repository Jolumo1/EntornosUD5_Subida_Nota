package ejercicio3;

public class Coche extends Vehiculo {
	private int cilindrada;

	
	public Coche(String color, int ruedas, String modelo, int cilindrada) {
		super(color, ruedas, modelo);
		this.cilindrada = cilindrada;
	}

	@Override
	public void acelerar() {
		System.out.println("El coche está acelerando");
	}

	@Override
	public void frenar() {
		System.out.println("El coche está frenando, ojo cuidao!");
	}

	@Override
	public String toString() {
		return "Coche [cilindrada=" + cilindrada + "," + super.toString() + "]";
	}

	
		
	
	
}
