package cuentas;

import java.util.ArrayList;

public class Cuenta implements ICuenta {
	
	private String nombreCliente;
	private String numeroCuenta;
	private ArrayList<Movimiento> movimientos;
	private double saldo;
	
	public Cuenta(String nombreCliente, String numeroCuenta) {
		this.nombreCliente = nombreCliente;
		this.numeroCuenta = numeroCuenta;
		this.saldo = 0;
		movimientos = new ArrayList<Movimiento>();
	}

	@Override
	public String retirar(double dinero) {
		if (this.saldo - dinero < 0) {
			return "No hay dinero suficiente en la cuenta. Saldo: " + consultarSaldo();
		} else {
			this.saldo = this.saldo - dinero;
			movimientos.add( new Movimiento("Sacado  por cajero", -dinero, saldo));
			return "Retirado: " + dinero + ". Saldo actual: " + consultarSaldo();
 		}
	}

	@Override
	public double consultarSaldo() {
		return this.saldo;
	}

	@Override
	public String getMovimientos() {
		String movis = "";
		for (Movimiento movi : movimientos) {
			movis = movis +
					movi.getFechaHora() + " -" +
					"Concepto: " + movi.getConcepto() +
					" -\tImporte: " + movi.getImporte() +
					" -\tSaldo: " + movi.getSaldo() + "\n";		
		}
		return movis;
	}

	@Override
	public String ingresar(double dinero) {
		
		this.saldo = saldo + dinero;
		movimientos.add(new Movimiento("Ingreso por cajero", dinero, saldo));
		return "Ingresado: " + dinero + ". Saldo actual: " + consultarSaldo();		
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

}
