package Main;

public abstract class Cuenta {

	abstract double maximaCuenta(); // Maxima positiva de la cuenta

	abstract double maximaNegativo(); // siempre obligara a sus hijos a implementarlo

	protected abstract boolean getTipoCuenta(); // nose

	protected abstract boolean sePuedeDepositar(int cantidadDeposito);
	
	protected abstract void depositoCuenta(int cantidadDeposito);

	protected abstract String nombreCuenta(); // Nombre de la cuenta, ahorro corriente vista


}
