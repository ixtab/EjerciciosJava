
public class principal {

	public static void main(String[] args) {
		
		Cuenta ahorros= new Cuenta("2131 1341 85 1234567890", "Ana S�nchez");
	
		ahorros.ingresarDinero(27.5f);
		ahorros.ingresarDinero(120000000f);
		ahorros.retirararDinero(120006.56f);
		ahorros.setNombreCliente("Ana S�nchez Garc�a");
		System.out.println("Saldo: " + ahorros.getSaldo());
	}

}
