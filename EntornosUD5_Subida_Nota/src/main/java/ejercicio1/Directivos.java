package ejercicio1;

public class Directivos extends Sueldos{

	 double dividendos;

	    public Directivos(String nombre, String puesto, double salario, String mes, double dividendos) {
	        super(nombre, puesto, salario, mes);
	        this.dividendos = dividendos;
	    }

	    
	    
	    
	    @Override
		public String toString() {
			return "El Salario del directivo " + nombre + " es: " + calcularSalario() + " " + mes
					+ " el irpf es " + Irpf();
		}




		@Override
	    double calcularSalario() {
	        return salario + dividendos;
	    }

	    @Override
	    double Irpf() {
	        return salario * 0.20; 
	    }

	    @Override
	    void MostrarDividendo() {
	        System.out.println("el incremento es " + dividendos);
	    }

	    @Override
	    public void vacaciones() {
	        System.out.println("los directivos pueden tomarse las vacaciones cuando quieran");
	    }

	    @Override
	    public void reuniones() {
	        System.out.println("las reuniones de los directivos será en una piscina, champagne y caviar, el día que quieran");
	    }
	
}
