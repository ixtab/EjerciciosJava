
public class principal {

	public static void main(String[] args) {
		
		Cuenta ahorros= new Cuenta("2131 1341 85 1234567890", "Ana Sánchez");
	
		ahorros.ingresarDinero(27.5f);
		ahorros.ingresarDinero(120000000f);
		ahorros.retirararDinero(120006.56f);
		ahorros.setNombreCliente("Ana Sánchez García");
		System.out.println("Saldo: " + ahorros.getSaldo());
	}

}
