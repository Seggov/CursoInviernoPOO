package Main;

public class Vista extends Cuenta {
	
	private String name;
	private String rut;
	private int estadoSocial;
	private int numeroCuenta;
	private int cantidadCuenta;

	private final int MAXIMO_CORRIENTE = 10000;
	private final String nombreCuentaBancaria = "Cuenta Bancaria Tradicional Vista - BancoFinanciero";
	private final String identificadorCuentaBancaria = "VISTA";

	public Vista(String name, String rut, int estadoSocial, int numeroCuenta, int cantidadCuenta) {
		super();
		this.name = name;
		this.rut = rut;
		this.estadoSocial = estadoSocial;
		this.numeroCuenta = numeroCuenta;
		this.cantidadCuenta = cantidadCuenta;
	}

	public void setCantidadCuenta(int cantidadCuenta) {
		this.cantidadCuenta = cantidadCuenta;
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

	@Override
	double maximaNegativo() {
		return 0.20 * cantidadCuenta; // maximo negativo
	}

	@Override
	double maximaCuenta() {
		return 200000;
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
		System.out.println("Depositando $"+cantidadDeposito+" ...");
	}

	@Override
	protected String nombreCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
