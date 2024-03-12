package ejercicio2;

public class PortatilImpl extends ProductoInformatico implements Portatil {
    private String tamanoPantalla;

    public PortatilImpl(String nombre, double precio, String tamanoPantalla) {
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
    }

    @Override
    public String Descripcion() {
        return "Portátil " + nombre + " con pantalla de " + tamanoPantalla;
    }

    @Override
    public String tamanoPantalla() {
        return tamanoPantalla;
    }

    @Override
    public void comprarProducto() {
        super.comprarProducto();
        System.out.println("¡Recibe un descuento del 5% en tu próxima compra de portátil!");
    }
}
