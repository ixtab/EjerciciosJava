import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		int cero = 0;
		int resultado;
		
		try {
			resultado = 16 / cero;
			System.out.println("Hola excepci�n" + resultado);
		} catch (ArithmeticException e) {
			System.out.println("Se ha producido una excepci�n");
			System.out.println(e + ". " + e.getMessage() + ". " + e.getCause());
		} finally {
			try {
				ejecutarTarea1();
			} catch (Exception e) {
				System.out.println("fichero no encontrado. " + e.getMessage());
			}
			System.out.println("Y el programa sigue...");
		}
		
	}
	
	public static void ejecutarTarea1() throws FileNotFoundException {
		ejecutarTarea2();
		System.out.println("No puedo resolver el problema");
	}
	
	public static void ejecutarTarea2() throws FileNotFoundException{
		FileReader fichero = new FileReader("c:/datos.txt");
		System.out.println("El fichero ha sido abierto");
		try {
			fichero.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}