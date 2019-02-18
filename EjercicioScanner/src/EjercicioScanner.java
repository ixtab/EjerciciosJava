import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioScanner {

	public static void main(String[] args) throws FileNotFoundException {
		int totalArticulos = 0;
		double totalPrecios = 0;
		File productos = new File("productos.txt"); 
		Scanner lector = new Scanner(productos);
		while (lector.hasNextLine()) {
			totalArticulos++;
			String linea = lector.nextLine();
			Scanner palabra = new Scanner(linea);
			
			int posicion = 0;
			String producto="";
			String categoria="";
			double precio=0;
			int cantidad=0;
			palabra.useDelimiter(";");
			while (palabra.hasNext()) {
				String dato = palabra.next();
				if (posicion == 0) {
					categoria = dato;
					posicion++;
				}else if (posicion == 1) {
					producto = dato;
					posicion++;
				} else if (posicion == 2) {
					precio = Double.parseDouble(dato);
					totalPrecios = totalPrecios + Double.parseDouble(dato);
					posicion++;
				} else {
					cantidad = Integer.parseInt(dato);
				}
			}
			System.out.println(producto + " (" + categoria + ") -- Precio: " + precio + " € -- Stock: " + cantidad );
			palabra.close();
			
		}
		lector.close();
		System.out.println("Total tipos de artículos: " + totalArticulos);
		System.out.println("Precio medio :" + (totalPrecios/totalArticulos));
	}
}