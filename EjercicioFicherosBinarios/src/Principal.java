import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		escribir();
		leer();
	}
	
	public static void escribir() {
		// Creación de 3 objetos producto
				Producto p1 = new Producto("Manzanas Royal Gala",2.50f,7f);
				Producto p2 = new Producto("Dátiles de la tía Julita",3.25f,12f);
				Producto p3 = new Producto("Mandarinas Clementinas",2.20f,25f);
				
				FileOutputStream fichero;
				DataOutputStream  escritor;
				
				// Apertura del fichero almacen.dat
				try {
					fichero = new FileOutputStream("almacen.dat", true);
					escritor = new DataOutputStream (fichero);
				} catch (Exception e) {
					System.out.println("No se ha podido abrir el fichero almacen.dat");
					System.out.println(e.getMessage());
					return;
				}
				
				// Escribir datos en el fichero almacen.dat
				try {
					escritor.writeUTF(p1.getNombre());
					escritor.writeFloat(p1.getPrecio());
					escritor.writeFloat(p1.getUnidadesEnExistencia());
							
					escritor.writeUTF(p2.getNombre());
					escritor.writeFloat(p2.getPrecio());
					escritor.writeFloat(p2.getUnidadesEnExistencia());
							
					escritor.writeUTF(p3.getNombre());
					escritor.writeFloat(p3.getPrecio()); 
					escritor.writeFloat(p3.getUnidadesEnExistencia());
					
					System.out.println("artículos añadidios");
				} catch (IOException e) {
					System.out.println
		("Ha ocurrido un error al escribir datos en el fichero");
					System.out.println(e.getMessage());
				}
				
				try {
					escritor.close();
					fichero.close();
				} catch (IOException e) {
					System.out.println("Ha ocurrido un error al cerrar el fichero");
					System.out.println(e.getMessage());			
				}
	}
	public static void leer() {
		FileInputStream fichero;
		DataInputStream  lector;
		try {
			fichero = new FileInputStream("almacen.dat");
			lector = new DataInputStream (fichero);
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error al abrir el fichero");
			System.out.println(e.getMessage());
			return;
		}
		
		boolean eof = false;
		while (!eof) {
			try {
				String pro = lector.readUTF();
				float pre = lector.readFloat();
				float uni = lector.readFloat();
				Producto p = new Producto(pro, pre, uni);
				System.out.println(p);
			} catch (EOFException e1) {
				eof = true;
			} catch (IOException e2) {
				System.out.println
("Ha ocurrido un error al leer los registros");
				System.out.println(e2.getMessage());
				break; // sale del bucle while                                                                                                                                                                                                              
			}
		}
		
		try {
			lector.close();
			fichero.close(); 
		} catch (IOException e) {
			System.out.println("Ha ocurrido un error al cerrar el fichero");
			System.out.println(e.getMessage());			
		}

	}
}
