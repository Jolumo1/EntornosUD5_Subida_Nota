package ejercicio6;

public class CuentaAhorro implements CuentaBancaria {
    private double saldo;
    private double interesMensual;

    public CuentaAhorro(double saldoInicial, double interesMensual) {
        this.saldo = saldoInicial;
        this.interesMensual = interesMensual;
    }

    @Override
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito realizado: se ha ingresado " + cantidad + " eurillos");
    }

    @Override
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Retiro realizado: " + cantidad + " euros");
        } else {
            System.out.println("No queda saldo para retirar esa cantidad y no se permite el saldo negativo.");
        }
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }

    public void calcularIntereses() {
        double intereses = saldo * interesMensual;
        saldo += intereses;
        System.out.println("Intereses calculados: " + intereses);
    }
}