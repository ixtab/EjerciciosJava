package procesos;

import objetos.Restaurante;
import objetos.Direccion;

import java.util.ArrayList;
import java.util.Scanner;

public class ProcesosRestaurante {
	static ArrayList<Restaurante> lista = new ArrayList<Restaurante>();
	
	@SuppressWarnings("resource") //Para evitar warning por no cerrar Scanner. Si lo cerramos no se puede leer la opcion en principal.
	public static String AddRestaurante() {
		Restaurante res = new Restaurante();
		Direccion dir = new Direccion();
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Nombre del restaurante: ");
		res.setNombre(scn.nextLine());
		
		System.out.println("Calle y numero: ");
		dir.setDireccion(scn.nextLine());
		
		System.out.println("Zona: ");
		dir.setZona(scn.nextLine());
		
		System.out.println("Código postal: ");
		dir.setCp(scn.nextLine());
		
		System.out.println("Ciudad: ");
		dir.setCiudad(scn.nextLine());
		
		res.setDireccion(dir);
		
		lista.add(res);
		
		return "Restaurante creado";
	}
	
	public static void listadoRestaurantes() {
		System.out.println("------------------\nListado de Restaurantes:");
		for (Restaurante res : lista) {
			System.out.println(res.getIdRestaurante() + ": " + res.getNombre());
		}
		System.out.println("------------------\n");
	}
}
