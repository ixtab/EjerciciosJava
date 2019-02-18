import java.util.Scanner;
import matematicas.Matematicas;

public class Inicio {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Pon un n�mero: ");
		int n = scn.nextInt();

		System.out.println("");
		System.out.println(Matematicas.generarTablaMultiplicar(n));
		System.out.println(Matematicas.comprobarSigno(n));
		System.out.println("");
		System.out.println(Matematicas.trianguloNumerico(n));
		scn.close();
	}

}
