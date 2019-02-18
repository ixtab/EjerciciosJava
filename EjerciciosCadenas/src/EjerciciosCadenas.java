import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjerciciosCadenas {

	public static void main(String[] args) throws FileNotFoundException {
		
		Fichero();
		CuentaNumeros();
		AlReves();
		Triangulo();
	}
	
	private static void Fichero() throws FileNotFoundException {
		File fichero = new File("pelis.txt");
		Scanner lector = new Scanner (fichero);
		while (lector.hasNextInt()) {
			int linea = lector.nextInt();
			System.out.println(linea);
		}
		lector.close();
		System.out.println("--------------------------------");
	}



	private static void CuentaNumeros() {
		String cadena = "Madrid, 5 de enero de 1987";
		Scanner lector = new Scanner(System.in);
		int contador = 0;
		System.out.println("Introduce una frase con números:");
		cadena = lector.nextLine();
		lector.close();

		for (int i= 0; i < cadena.length(); i++) {
			if ((int)cadena.charAt(i) >= 48 && (int)cadena.charAt(i)<= 57 ) {	
				contador++;
			}
		}
		if (contador > 0) {
			System.out.println("En \"" + cadena + "\" hay " + contador + " números");
		} else {
			System.out.println("En \"" + cadena + "\" no hay hay números");
		}
		System.out.println("--------------------------------");
	}

	private static void AlReves() {
		String cadena = "Del salón en el ángulo oscuro"
				+ "\nde su dueña tal vez olvidada"
				+ "\nsilenciosa y cubierta de polvo"
				+ "\nveíase un arpa";
		String cadenaInvertida = "";
		for (int i=cadena.length()-1;i>=0;i--) {
			cadenaInvertida = cadenaInvertida + cadena.charAt(i);
		}
		System.out.println(cadenaInvertida);
		System.out.println("-------------------------");
	}

	private static void Triangulo() {
		String cadena = "    En un lugar de la mancha de cuyo nombre no quiero acordarme       ";
		// cadena = cadena.replaceAll(" ", "");
		cadena = cadena.trim();
		do {
			if (cadena.equals(cadena.trim())) {
				System.out.println(cadena);
			}
			cadena = cadena.substring(0, cadena.length() - 1);
		} while (cadena.length() > 0);
		System.out.println("-------------------------");
	}

}
