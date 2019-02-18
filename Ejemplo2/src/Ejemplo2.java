import java.text.Collator;

public class Ejemplo2 {
	
	public static void main(String[] args) {
		aleatorio(10);
		cadena();
	}

	private static void cadena() {
		String cadena = "La cripta m�gica";
		System.out.println(cadena);

		// Extraemos un caracter de la cadena.
		System.out.println(cadena.charAt(3));
		
		// Comparaci�n de dos cadenas. IMPORTANTE!!!!!!!!!!!!!!!!!!!
		// P�gina con un mont�n de datos sobre esto : 
		//http://chuwiki.chuidiang.org/index.php?title=Comparar_cadenas_de_texto
		System.out.println("Comparaci�n de dos cadenas se hace con equals, no con == o ===" + cadena.equals
             ("La cripta m�gica"));

		// Devuelvo el n�mero de caracteres de la cadena.
		System.out.println("N�mero de caracteres: = " 
             + cadena.length());
		
		// Compruebo si una porci�n de la cadena 
           // es igual a otra porci�n
		// de la cadena especificada como argumento.
		System.out.println("regionMatches: " + cadena.regionMatches
              (3, " cripta", 1, 2));
		
		// Reemplazando caracteres.
		System.out.println(cadena.replace('a', 'e'));
		
		// Comprobar inicio de la cadena.
		System.out.println(cadena.startsWith("La"));
		
		// Comprobar inicio de la subcadena.
		System.out.println(cadena.startsWith("cr", 3));
		
		// Extracci�n de subcadenas.
		String cadena2 = cadena.substring(3);
		System.out.println(cadena2);
		
		cadena2 = cadena.substring(3, 9);
		System.out.println(cadena2);
		
		// Conversi�n de distintos tipos de datos a String.
		int num = 2354;
		String cad = String.valueOf(num);
		System.out.println(cad);
		
		Collator comparador = Collator.getInstance();
		comparador.setStrength(Collator.PRIMARY);
		// Estas dos cadenas son iguales
		System.out.println(comparador.compare("H�la", "hola"));

		comparador.setStrength(Collator.SECONDARY);
		// Ahora son distitnas por el acento
		System.out.println(comparador.compare("H�la", "hola"));
		// pero estas otras dos son iguales
		System.out.println(comparador.compare("Hola", "hola"));

		comparador.setStrength(Collator.TERTIARY);
		// Ahora son distintas por la may�scula
		System.out.println(comparador.compare("Hola", "hola"));
		// pero estas s� son iguales
		System.out.println(comparador.compare("hola", "hola"));
		
		String frase ="La clase String tiene varios "
				+ "m�todos muy �tiles como saber su "
				+ "longitud, trocear la cadena, etc. "
				+ "Recuerda que para invocar un m�todo"
				+ " debemos escribir el nombre del String,"
				+ " un punto y el nombre del m�todo, "
				+ "m�s sus par�metros. Es importante "
				+ "que si necesitas almacenar el valor "
				+ "devuelto, uses una variable para ello" ;
		System.out.println(frase);
		frase = frase.replaceAll("a", "i");
		frase = frase.replaceAll("e", "i");
		frase = frase.replaceAll("o", "i");
		frase = frase.replaceAll("u", "i");
		frase = frase.replaceAll("�", "�");
		frase = frase.replaceAll("�", "�");
		frase = frase.replaceAll("�", "�");
		frase = frase.replaceAll("�", "�");
		System.out.println(frase);
	}
		

	private static void aleatorio(int x) {
		System.out.print("|");
		for(int i = 0; i < 20; i++) {
			double num = Math.random() * x + 1;
			int a =  (int)num;
			System.out.print(a + " | ");
			
		}
		System.out.println();
	}
	
}
