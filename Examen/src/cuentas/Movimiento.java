package cuentas;

import java.time.LocalDateTime;

public class Movimiento {
	private LocalDateTime fechaHora;
	private String concepto;
	private double importe;
	private double saldo;
	public Movimiento(String concepto, double importe, double saldo) {
		this.fechaHora = LocalDateTime.now();
		this.concepto = concepto;
		this.importe = importe;
		this.saldo = saldo;
	}
	

	
	public String getFechaHora() {
		
		return 	fechaHora.getDayOfMonth() + "/" +
				fechaHora.getMonthValue() + "/" +
				fechaHora.getYear() + " " +
				fechaHora.getHour() + ":" +
				fechaHora.getMinute();
		
	}
	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
