import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import Biblioteca.Libro;

public class Principal {
	
	static ArrayList<Libro> lista = new ArrayList<Libro>();
	static File file = new File("libros.lib");
	static FileInputStream archivoInput;
	static ObjectInputStream bufferInput;
	static FileOutputStream archivoOutput;
	static ObjectOutputStream bufferOutput;
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		comprobarSiExiste();
		abrirEntradaSalida();
		
		String op;		
		do {
			System.out.println("Biblioteca");
			System.out.println("-------------------");
			System.out.println("1 - Añadir libro");
			System.out.println("2 - Listado de Libros");
			System.out.println("3 - Consulta por autor");
			System.out.println("Salir");
		
			op = scn.nextLine();
			switch (op) {
			case "1":
				agregarLibro();
				break;

			case "2":
				System.out.println(lista);
				break;

			case "3":
			
				break;

			case "4":
				cerrarEntradaSalida();
				System.out.println("Adios");
				break;

			default:
				break;
			}
		} while (op != "4");
		scn.close();
	}
	
		
	private static void cerrarEntradaSalida() {
		try {
			bufferInput.close();
			archivoInput.close();
			bufferOutput.close();
			archivoOutput.close();
		} catch (IOException e) {
			System.out.println("Error al cerrar el fichero");
			System.out.println(e.getMessage());
		}
		
	}


	private static void abrirEntradaSalida() {
		try {
			archivoInput = new FileInputStream("libros.lib");
			bufferInput = new ObjectInputStream(archivoInput);
			archivoOutput = new FileOutputStream("libros.lib", true);
			bufferOutput = new ObjectOutputStream(archivoOutput);
		} catch (IOException e) {
			System.out.println("No se ha podido abrir el fichero");
			System.out.println(e.getMessage());
			return;
		}	
		
	}



	private static void agregarLibro() {
		System.out.println("ISBN: ");
		String isbn = scn.nextLine();
		System.out.println("Título");
		String titulo = scn.nextLine();
		System.out.println("Autor");
		String autor = scn.nextLine();	
		Libro l = new Libro(isbn, titulo, autor);
		lista.add(l);
		try {
			bufferOutput.writeObject(l);
			System.out.println("El libro se ha guardado con éxito");
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero");
			System.out.println(e.getMessage());
		}

	}

	private static void comprobarSiExiste() {
		if (file.exists()) {
			boolean eof = false;
			while (!eof) {
				try {
					lista.add((Libro) bufferInput.readObject());
				} catch (EOFException e1) {
					eof = true;
				} catch (IOException e2) {
					System.out.println ("Error al leer los libros de la biblioteca");
					System.out.println(e2.getMessage());
				} catch (ClassNotFoundException e3) {
					System.out.println("La clase Libro no está cargada en memoria");
					System.out.println(e3.getMessage());
				}
			}

		} else {
			System.out.println("No existe el fichero");
		}
		
	}
		
}
