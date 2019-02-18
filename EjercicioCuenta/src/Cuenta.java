public class Cuenta {
	private String numeroCuenta;
	private String nombreCliente;
	private Float saldo = new Float(0);
		
	public Cuenta(String numeroCuenta, String nombreCliente) {
		this.numeroCuenta = numeroCuenta;
		this.nombreCliente = nombreCliente;
	}

	public void ingresarDinero(float dinero){
		this.saldo = this.saldo + dinero;
		System.out.println("Se han ingresado: " + dinero + "€ en la cuenta: "+ numeroCuenta +". El saldo actual es de: " + saldo + "€.");
	}
	
	public void retirararDinero(float d){
		saldo = saldo - d;
		System.out.println("Se han retirado: " + d + "€ de la cuenta: "+ numeroCuenta +". El saldo actual es de: " + saldo + "€.");
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public float getSaldo() {
		return saldo;
	}	
}
