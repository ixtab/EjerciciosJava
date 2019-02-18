import java.util.ArrayList;
import java.util.Scanner;

import venta_localidades.Cliente;


public class Inicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
		Cliente c;
		/************************************************************	
		* for (int i = 0; i <5; i++) {
		* 		System.out.println("Nombre: ");
		*		String nombre = scn.nextLine();
		*		System.out.println("Edad: ");
		*		int edad = Integer.parseInt(scn.nextLine());
		*		System.out.println("Teléfono: ");
		*		String telefono = scn.nextLine();
		*		c = new Cliente(nombre, edad, telefono);
		*		clientes.add(c); // clientes.add(new Cliente(nombre, edad, telefono)) también vale
		*	}
		*
		*	for (int i = 0; i < clientes.size();i++) {
		*		System.out.println(i + "- " + clientes.get(i) + ": " + clientes.get(i).tipoCliente()) ;
		*
		*	}
		**********************************************************/
		System.out.println();
		scn.close();
	}

}
