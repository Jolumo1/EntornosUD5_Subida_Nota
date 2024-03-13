package ejercicio6;

public class CuentaCorriente implements CuentaBancaria {
    private double saldo;

    // Constructor
    public CuentaCorriente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado: se han ingresado " + cantidad + " eurillos");
    }

    
    //En este metodo añado el limite negativo maximo de este tipo de cuenta, en este caso -1000
    @Override
    public void retirar(double cantidad) {
        if (saldo - cantidad >= -1000) {
            saldo -= cantidad;
            System.out.println("Retiro realizado: has sacado " + cantidad + " euros");
        } else {
            System.out.println("No queda saldo para llegar a esa cantidad, ni quedándote en negativo.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }
}