package ejercicio6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("BIENVENIDO A BANCO ROBOPERPETUO,SU BANCO DE CONFIANZA");
		
		System.out.println();
		System.out.println("Operaciones sobre su cuenta corriente: ");
		System.out.println();
		
		CuentaCorriente cuentaCorriente = new CuentaCorriente(0);
        cuentaCorriente.depositar(500);
        cuentaCorriente.retirar(1200);
        System.out.println("Saldo actual en cuenta corriente: " + cuentaCorriente.consultarSaldo());
        cuentaCorriente.retirar(1000); //esto se no hace segun el main del ejercicio, pero lo añado para verificar que funciona lo del limite negativo

        System.out.println();
		System.out.println("Operaciones sobre su cuenta de ahorro: ");
		System.out.println();
		
		CuentaAhorro cuentaAhorro = new CuentaAhorro(1000, 0.03);
        cuentaAhorro.depositar(1000);
        cuentaAhorro.calcularIntereses();
        cuentaAhorro.retirar(500);
        System.out.println("Saldo actual en cuenta de ahorro: " + cuentaAhorro.consultarSaldo());
	}

}
