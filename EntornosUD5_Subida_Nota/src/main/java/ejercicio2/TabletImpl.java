package ejercicio2;

public class TabletImpl extends ProductoInformatico implements Tablet {
    private String tamanoPantalla;
    private boolean wifi;

    public TabletImpl(String nombre, double precio, String tamanoPantalla, boolean wifi) {
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
        this.wifi = wifi;
    }

    @Override
    public String Descripcion() {
        return "Tablet " + nombre + " con pantalla de " + tamanoPantalla + "Tiene wifi: " + wifi;
    }

    @Override
    public String tamanoPantalla() {
        return tamanoPantalla;
    }

    @Override
    public boolean tieneWifi() {
        return wifi;
    }

    @Override
    public void comprarProducto() {
        super.comprarProducto();
        System.out.println("¡De regalo recibe un estuche de cuero gratis con la compra de la tablet!");
    }
}
