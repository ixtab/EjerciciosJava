package matematicas;

public class Matematicas {
	
	public static String  generarTablaMultiplicar(int numero) {
		String tabla = "";
		for (int i = 1; i<= 10; i++) {
			tabla = tabla + numero + " x " + i + " = " + (numero *i) + "\n";
		}
		return tabla;
	}
	
	public static String comprobarSigno(int numero) {
		String signo = numero > 0 ? "positivo": numero < 0 ? "negativo": "nulo";
		return signo;
	}
	
	public static String  trianguloNumerico(int numero) {
		String triangulo = "";
		if (numero > 0) {
			for(int i = numero; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					triangulo = triangulo + j;
				}
				triangulo = triangulo + "\n";
			}
		} else {
			for(int i = numero; i < 0; i++) {
				for(int j = i; j < 0; j++) {
					triangulo = triangulo + j;
				}
				triangulo = triangulo + "\n";
			}
		}
		
		return triangulo;
		
	}
	
}
