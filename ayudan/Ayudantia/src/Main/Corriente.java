package Main;

public class Corriente extends Cuenta {

	private String name;
	private String rut;
	private int estadoSocial;
	private int numeroCuenta;
	private int cantidadCuenta;

	private final int MAXIMO_CORRIENTE = 10000000;
	private final String nombreCuentaBancaria = "Cuenta Corriente Bancaria Oficial - BancoFinanciero";
	private final String identificadorCuentaBancaria = "CORRIENTE";

	public Corriente(String name, String rut, int estadoSocial, int numeroCuenta) {
		super();
		this.name = name;
		this.rut = rut;
		this.estadoSocial = estadoSocial;
		this.numeroCuenta = numeroCuenta;
	}

	public String getName() {
		return name;
	}

	public String getRut() {
		return rut;
	}

	public int getEstadoSocial() {
		return estadoSocial;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public int getCantidadCuenta() {
		return cantidadCuenta;
	}

	public int getMAXIMO_CORRIENTE() {
		return MAXIMO_CORRIENTE;
	}

	public String getNombreCuentaBancaria() {
		return nombreCuentaBancaria;
	}

	public String getIdentificadorCuentaBancaria() {
		return identificadorCuentaBancaria;
	}

	public void setCantidadCuenta(int cantidadCuenta) {
		this.cantidadCuenta = cantidadCuenta;
	}

	@Override
	public double maximaCuenta() {
		return MAXIMO_CORRIENTE;
	}

	@Override
	double maximaNegativo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected boolean getTipoCuenta() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected boolean sePuedeDepositar(int cantidadDeposito) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void depositoCuenta(int cantidadDeposito) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected String nombreCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
