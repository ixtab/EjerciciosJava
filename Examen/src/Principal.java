
import java.util.InputMismatchException;
import java.util.Scanner;

import cuentas.Cuenta;

public class Principal {
	static Scanner lector;
	
	public static void main(String[] args) {
		
		Cuenta cuentaUno = new Cuenta("Juan Perez García", "2808 3413 78 3274494324");
		
		lector = new Scanner(System.in);
		String opc = "";
		double dinero;
		do { 
				System.out.println("Cuenta numero: " + cuentaUno.getNumeroCuenta()+ ". Titular: " + cuentaUno.getNombreCliente());
				System.out.println("-------------------------");
				System.out.println(" R - Retirar");
				System.out.println(" I - Ingresar");
				System.out.println(" S - Consultar Saldo");
				System.out.println(" M - Consultar movimientos");
				System.out.println(" F - Fin del programa");
				System.out.println("-------------------------");
				System.out.println("¿Qué operación deseas realizar? ");
				opc = lector.nextLine();
				opc = opc.toUpperCase();
				
				switch (opc) {
				
				case "R":
					System.out.println("Importe para Retirar: ");
					try {
						dinero  = lector.nextDouble();
						System.out.println(cuentaUno.retirar(dinero));
					} catch (InputMismatchException e) {
						System.out.println("Importe tecleado no valido");
					}
					lector.nextLine();
					System.out.println("-------------------------");
					break;
					
				case "I":
					System.out.println("Importe para Ingresar: ");
					try {
						dinero = lector.nextDouble();
						System.out.println(cuentaUno.ingresar(dinero));
					} catch (InputMismatchException e) {
						System.out.println("Importe tecleado no valido");
					}
					lector.nextLine();
					System.out.println("-------------------------");
					break;
					
				case "S":
					System.out.println("Saldo actual: " + cuentaUno.consultarSaldo());
					System.out.println("-------------------------");
					break;
					
				case "M":
					System.out.println(cuentaUno.getMovimientos());
					break;
					
				case "F":
					System.out.println("Gracias por utilizar nuestros servicios.\nHasta pronto");
					break;
					
				default:
					System.out.println("Opción no valida");
					System.out.println("-------------------------");
					break;
				}
				
		} while (!opc.equals("F"));
		lector.close(); 
		
	} 
}