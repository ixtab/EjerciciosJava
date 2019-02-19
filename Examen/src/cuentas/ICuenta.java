package cuentas;

public interface ICuenta {
	public String retirar(double dinero);
	public String ingresar(double dinero);
	public double consultarSaldo();
	public String getMovimientos();
}
