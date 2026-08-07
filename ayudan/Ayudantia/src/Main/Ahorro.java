package Main;

public class Ahorro extends Cuenta {

	private String name;
	private String rut;
	private int estadoSocial;
	private int numeroCuenta;
	private int cantidadCuenta;

	private final double interesAcumulado = 3.1;
	private final int MAXIMO_AHORRO = 1000000;

	private final String nombreCuentaBancaria = "Cuenta Remunerada de Inversiones de Bajo Riesgo - BancoFinanciero";
	private final String identificadorCuentaBancaria = "AHORRO";

	public Ahorro(String name, String rut, int estadoSocial, int numeroCuenta, int cantidadCuenta) {
		super();
		this.name = name;
		this.rut = rut;
		this.estadoSocial = estadoSocial;
		this.numeroCuenta = numeroCuenta;
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

	public double getInteresAcumulado() {
		return interesAcumulado;
	}

	public int getMAXIMO_AHORRO() {
		return MAXIMO_AHORRO;
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
	double maximaCuenta() {
		return MAXIMO_AHORRO;
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
		System.out.println("Depositando $"+cantidadDeposito+" ...");
		
	}

	@Override
	protected String nombreCuenta() {
		// TODO Auto-generated method stub
		return null;
	}

}
