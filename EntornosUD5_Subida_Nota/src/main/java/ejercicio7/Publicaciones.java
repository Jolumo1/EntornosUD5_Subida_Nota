package ejercicio7;

public abstract class Publicaciones {

	protected String titulo;
	
	Publicaciones(String titulo){
		this.titulo=titulo;
	}

	abstract void imprimir();
}

//Creamos una clase publicaciones que engloba a las clases especificadas en el ejercicio.