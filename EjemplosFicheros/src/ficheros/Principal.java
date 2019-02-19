package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
	public static void main(String args[]) throws IOException {
		
		// mostrar();
		
				
				
		File fich = new File("C:\\Users\\admin\\Desktop\\java\\zzz_ficheros_EjemplosFicheros\\pelis2.jcc");
		boolean ok = fich.createNewFile();
		if (ok)
			System.out.println("El fichero se ha creado con éxito");
		else
			System.out.println("El fichero no ha podido crearse");
		
		// Abrir fichero para escritura
				FileWriter file; // Iniciador
				try {
					file = new FileWriter("C:\\Users\\admin\\Desktop\\java\\zzz_ficheros_EjemplosFicheros\\pelis2.jcc", true); // Con true añade las lineas
				} catch (IOException e) {
					System.out.println("No se puede abrir el fichero");
					System.out.println(e.getMessage());
					return;
				}
				
				// Abrir buffer y escribir tres líneas
				BufferedWriter buffer = new BufferedWriter(file); // Filtro
				try {
					Scanner scn = new Scanner(System.in);
					String texto = scn.nextLine();
					buffer.write(texto);
					buffer.newLine();
					scn.close();
				} catch (IOException e) {
					System.out.println("Error al escribir en el fichero");
					System.out.println(e.getMessage());
				}
				
				// Cerrar el buffer y el fichero
				try {
					buffer.close();
					file.close();
				} catch (IOException e) {
					System.out.println("Error al cerrar el fichero");
					System.out.println(e.getMessage());
				}


			}

		/*
		 * 
		fich = new File("C:\\Users\\admin\\Desktop\\java\\zzz_ficheros_EjemplosFicheros\\pelis2.txt");
		ok = fich.delete();
		if (ok)
			System.out.println("El fichero se ha borrado con éxito");
		else
			System.out.println("El fichero no ha podido borrarse");
		
		File carp = new File("C:\\Users\\admin\\Desktop\\java\\zzz_ficheros_EjemplosFicheros\\prueba");
		ok = carp.mkdir();
		if (ok)
			System.out.println("La carpeta se ha creado con éxito");
		else
			System.out.println("La carpeta no ha podido crearse");
		
		carp = new File("C:\\Users\\admin\\Desktop\\java\\zzz_ficheros_EjemplosFicheros\\prueba");
		ok = carp.delete();
		if (ok)
			System.out.println("La carpeta se ha borrado con éxito");
		else
			System.out.println("La carpeta no ha podido borrarse");
		*
		*/
		
	
	/*
	 * 
	public static void mostrar() {
		File carp = new File("C:\\Users\\admin\\Desktop\\java\\zzz_ficheros_EjemplosFicheros");
		if (carp.exists()) {
			System.out.println("Existe la carpeta");
			System.out.println("¿Tiene permisos de escritura? " + carp.canWrite());
			String[] contenido = carp.list();
			System.out.println("Archivos o carpetas que contiene: " + 
				contenido.length);
			int contador = 0;
			for (String nombre : contenido) {
				System.out.print(contador + ": ");
				File f = new File(carp.getPath(), nombre);
				if (f.isDirectory()) {
					System.out.println(nombre + ", " + " carpeta");
				} else {
					System.out.println(nombre + ", " + " fichero, " + 
					f.length() + " bytes");
				}
			}
		} else
			System.out.println("No existe la carpeta");
	}
	*
	*/

}
