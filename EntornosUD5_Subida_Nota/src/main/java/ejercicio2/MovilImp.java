package ejercicio2;

public class MovilImp extends ProductoInformatico implements Movil {
    private String tamanoPantalla;
    private String operador;

    public MovilImp(String nombre, double precio, String tamanoPantalla, String operador) {
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.operador = operador;
    }

    @Override
    public String Descripcion() {
        return "Teléfono móvil " + nombre + " con pantalla de " + tamanoPantalla + " Operador: " + operador;
    }

    @Override
    public String tamanoPantalla() {
        return tamanoPantalla;
    }

    @Override
    public String operador() {
        return operador;
    }

    @Override
    public void comprarProducto() {
        super.comprarProducto();
        System.out.println("¡De regalo un protector de pantalla con la compra del móvil!");
    }
}
